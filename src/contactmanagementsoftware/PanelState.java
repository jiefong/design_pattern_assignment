/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author jiefo
 */
public abstract class PanelState {

    MUI mui;

    public PanelState(MUI mui) {
        this.mui = mui;
    }

    public final void setDescription() {
        getAcquaintancesDetails();
        setPanelTitle();
        setFormFieldEditable();
        setOtherInformationVisibility();
        setOtherInformationLableText();
        setConfirmButton();
        setCancelButton();
    }

    public void setState(PanelState state) {
        mui.setPanelState(state);
    }

    public PanelState getState() {
        return mui.getPanelState();
    }

    abstract void setFormFieldEditable();
    
    void setOtherInformationVisibility() {
        switch (mui.getX()) {
            case 0:
                setOtherInformationVisibility(true,true,true);
                break;
            case 1:
                setOtherInformationVisibility(true,true,false);
                break;
            case 2:
                setOtherInformationVisibility(true,false,false);
                break;
            case 3:
                setOtherInformationVisibility(true,true,true);
                break;
            default:
                break;
        }
    }
    

    void setOtherInformationLableText() {
        switch (mui.getX()) {
            case 0:
                setOtherInformationLableText("Specific Events:","First Acquaintance Context:","<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
                break;
            case 1:
                setOtherInformationLableText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>", "<html>Last Date met:<br> (dd/mm/yyyy)</html>","");
                break;
            case 2:
                setOtherInformationLableText("Common Interests: ","","");
                break;
            case 3:
                setOtherInformationLableText("First meeting time & location:","First meeting Circumstances:","Other useful information:");
                break;
            default:
                break;
        }
    }

    abstract void setPanelTitle();

    abstract void setConfirmButton();

    abstract void setCancelButton();
    
    //Hook
    
    
    void getAcquaintancesDetails(){
        mui.getNameField().setText("");
        mui.getMobileField().setText("");
        mui.getEmailField().setText("");
        mui.getOtherInformationField1().setText("");
        mui.getOtherInformationField2().setText("");
        mui.getOtherInformationField3().setText("");
    }
    
    // Helper Method
    void setFormFieldEditable(boolean b) {
        mui.getNameField().setEditable(b);
        mui.getMobileField().setEditable(b);
        mui.getEmailField().setEditable(b);
        mui.getOtherInformationField1().setEditable(b);
        mui.getOtherInformationField2().setEditable(b);
        mui.getOtherInformationField3().setEditable(b);
    }

    private void setOtherInformationVisibility(boolean bOtherInformationField1, boolean bOtherInformationField2, boolean bOtherInformationField3) {
        mui.getJScrollPane6().setVisible(bOtherInformationField1);
        mui.getJLabelOtherInformation1().setVisible(bOtherInformationField1);
        mui.getOtherInformationField1().setVisible(bOtherInformationField1);

        mui.getJScrollPane4().setVisible(bOtherInformationField2);
        mui.getJLabelOtherInformation2().setVisible(bOtherInformationField2);
        mui.getOtherInformationField2().setVisible(bOtherInformationField2);

        mui.getJScrollPane5().setVisible(bOtherInformationField3);
        mui.getJLabelOtherInformation3().setVisible(bOtherInformationField3);
        mui.getOtherInformationField3().setVisible(bOtherInformationField3);
    }

    void setOtherInformationLableText(String strOtherInformationField1, String strOtherInformationField2, String strOtherInformationField3) {
        mui.getJLabelOtherInformation1().setText(strOtherInformationField1);
        mui.getJLabelOtherInformation2().setText(strOtherInformationField2);
        mui.getJLabelOtherInformation3().setText(strOtherInformationField3);
    }

    void setPanelTitle(String title) {
        mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, title, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
    }
}
