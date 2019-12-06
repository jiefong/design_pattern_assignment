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
public class VoidState extends PanelState {

    public VoidState(MUI mui) {
        super(mui);
    }

    @Override
    public void setDescription() {
        mui.getNameField().setEditable(false);
        mui.getMobileField().setEditable(false);
        mui.getEmailField().setEditable(false);
        mui.getOtherInformationField1().setEditable(false);
        mui.getOtherInformationField2().setEditable(false);
        mui.getOtherInformationField3().setEditable(false);

        mui.getNameField().setText("");
        mui.getMobileField().setText("");
        mui.getEmailField().setText("");
        mui.getOtherInformationField1().setText("");
        mui.getOtherInformationField2().setText("");
        mui.getOtherInformationField3().setText("");
        
        mui.getJButtonConfirmDetails().setText("");
        mui.getJButtonConfirmDetails().setVisible(false);

        mui.getJButtonCancleDetails().setVisible(true);

        mui.getJLabelOtherInformation1().setText("");
        mui.getJLabel8OtherInformation2().setText("");
        mui.getJLabelOtherInformation3().setText("");

        mui.getJLabelOtherInformation1().setVisible(false);
        mui.getJLabel8OtherInformation2().setVisible(false);
        mui.getJLabelOtherInformation3().setVisible(false);
    }

}
