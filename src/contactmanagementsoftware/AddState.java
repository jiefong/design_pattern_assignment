/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import javax.swing.JTextField;

/**
 *
 * @author jiefo
 */
public class AddState extends PanelState {

    public AddState(MUI mui) {
        super(mui);
    }

    @Override
    public void setDescription() {
        mui.getNameField().setEditable(true);
        mui.getMobileField().setEditable(true);
        mui.getEmailField().setEditable(true);
        mui.getOtherInformationField1().setEditable(true);
        mui.getOtherInformationField2().setEditable(true);
        mui.getOtherInformationField3().setEditable(true);

        mui.getJButtonConfirmDetails().setText("Add");
        mui.getJButtonConfirmDetails().setVisible(true);
        mui.getJButtonCancleDetails().setVisible(true);

        switch (mui.getX()) {
            case 0:
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Personal Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("Specific Events:");
                mui.getJLabel8OtherInformation2().setText("First Acquaintance Context:");
                mui.getJLabelOtherInformation3().setVisible(true);
                mui.getJLabelDetailsTableTitle().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJScrollPane5().setVisible(true);
                mui.getJScrollPane4().setVisible(true);
                mui.getJLabelOtherInformation3().setText("<html>First Acquaintance Date:<br>(dd/mm/yyyy)</html>");
                break;
            case 1:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Relatives Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("<html>Relatives Birthday:<br> (dd/mm/yyyy)</html>");
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getOtherInformationField2().setVisible(true);
                mui.getJLabel8OtherInformation2().setText("<html>Last Date met:<br> (dd/mm/yyyy)</html>");
                mui.getJLabelOtherInformation3().setVisible(false);
                mui.getOtherInformationField3().setVisible(false);
                mui.getJScrollPane4().setVisible(true);
                mui.getJScrollPane5().setVisible(false);
                break;
            case 2:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Professional Friends Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJLabelOtherInformation1().setText("Common Interests: ");
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(false);
                mui.getOtherInformationField2().setVisible(false);
                mui.getJScrollPane4().setVisible(false);
                mui.getJLabelOtherInformation3().setVisible(false);
                mui.getOtherInformationField3().setVisible(false);
                mui.getJScrollPane5().setVisible(false);
                break;
            case 3:
                mui.getJPanelDetailsForm().setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Casual Acquaintances Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 16)));
                mui.getJScrollPane5().setVisible(true);
                mui.getJScrollPane4().setVisible(true);
                mui.getOtherInformationField2().setVisible(true);
                mui.getOtherInformationField3().setVisible(true);
                mui.getJLabelOtherInformation1().setVisible(true);
                mui.getJLabel8OtherInformation2().setVisible(true);
                mui.getJLabelOtherInformation3().setVisible(true);
                mui.getJLabelOtherInformation1().setText("First meeting time & location:");
                mui.getJLabel8OtherInformation2().setText("First meeting CIrcumstances:");
                mui.getJLabelOtherInformation3().setText("Other useful information:");
                break;
            default:
                break;
        }
    }

}
