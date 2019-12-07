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
public class AddState extends PanelState {

    public AddState(MUI mui) {
        super(mui);
    }

    @Override
    public void setFormFieldEditable() {
       setFormFieldEditable(true);
    }

    @Override
    public void setPanelTitle() {
        switch (mui.getX()) {
            case 0:
                setPanelTitle("Add Personal Friends Details");
                break;
            case 1:
                setPanelTitle("Add Relatives Details");
                break;
            case 2:
                setPanelTitle("Add Professional Friends Details");
                break;
            case 3:
                setPanelTitle("Add Casual Acquaintances Details");
                break;
            default:
                break;
        }
    }

    @Override
    void setConfirmButton() {
        mui.getJButtonConfirmDetails().setText("Add");
        mui.getJButtonConfirmDetails().setVisible(true);
    }

    @Override
    void setCancelButton() {
        mui.getJButtonCancleDetails().setVisible(true);
    }
}
