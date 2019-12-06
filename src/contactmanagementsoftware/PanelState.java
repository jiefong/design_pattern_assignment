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

    public abstract void setDescription();

    public void setState(PanelState state) {
        mui.setPanelState(state);
    }
    
    public PanelState getState(){
        return mui.getPanelState();
    }
}
