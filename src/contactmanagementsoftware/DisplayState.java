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
public class DisplayState extends PanelState {

    public DisplayState(MUI mui) {
        super(mui);
    }

    @Override
    void getAcquaintancesDetails() {
        Acquaintances e = (Acquaintances) mui.getAc().getAcquaintances(mui.getX()).getAcquaintances(mui.getNum());
        mui.getNameField().setText(e.getName());
        mui.getMobileField().setText(e.getMobileNo());
        mui.getEmailField().setText(e.getEmail());
        switch (mui.getX()) {
            case 0:
                PersonalFriends perF = (PersonalFriends) e;
                mui.getOtherInformationField1().setText(perF.getEvents());
                mui.getOtherInformationField2().setText(perF.getAContext());
                mui.getOtherInformationField3().setText(perF.getADate());
                break;
            case 1:
                Relatives rel = (Relatives) e;
                mui.getOtherInformationField1().setText(rel.getBDate());
                mui.getOtherInformationField2().setText(rel.getLDate());
                break;
            case 2:
                ProfessionalFriends proF = (ProfessionalFriends) e;
                mui.getOtherInformationField1().setText(proF.getCommonInterests());
                break;
            case 3:
                CasualAcquaintances ca = (CasualAcquaintances) e;
                mui.getOtherInformationField1().setText(ca.getWhenWhere());
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getOtherInformationField2().setText(ca.getCircumstances());
                mui.getOtherInformationField3().setText(ca.getOtherInfo());
                break;
            default:
                break;
        }
    }

    @Override
    void setFormFieldEditable() {
        setFormFieldEditable(false);
    }

    @Override
    public void setPanelTitle() {
        setPanelTitle("Display Details");
    }

    @Override
    void setConfirmButton() {
         mui.getJButtonConfirmDetails().setText("Back to main menu");
        mui.getJButtonConfirmDetails().setVisible(true);
    }

    @Override
    void setCancelButton() {
        mui.getJButtonCancleDetails().setVisible(false);
    }
}
