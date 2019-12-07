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
    void setFormFieldEditable() {
        setFormFieldEditable(false);
    }

    @Override
    void setPanelTitle() {
        setPanelTitle("");
    }

    @Override
    void setConfirmButton() {
        mui.getJButtonConfirmDetails().setVisible(false);
    }

    @Override
    void setCancelButton() {
        mui.getJButtonCancleDetails().setVisible(false);
    }

}
