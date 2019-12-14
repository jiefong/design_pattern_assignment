/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.ArrayList;
import javax.swing.JApplet;

/**
 *
 * @author ritz619
 */
public class CLJApplet extends JApplet {
    
    private static AcquaintancesSystem ac = new AcquaintancesList("master");
    private static AcquaintancesSystem perF1 = new AcquaintancesList("Personal Friends");
    private static AcquaintancesSystem rel1 = new AcquaintancesList("Relatives");
    private static AcquaintancesSystem proF1 = new AcquaintancesList("Professional Friends");
    private static AcquaintancesSystem ca1 = new AcquaintancesList("Casual Acquaintance");

    @Override
    public void init() {
        MUI mg = new MUI();
        ac.addAcquaintances(perF1);
        ac.addAcquaintances(rel1);
        ac.addAcquaintances(proF1);
        ac.addAcquaintances(ca1);

        this.add(mg.getContentPane());
        this.setSize(mg.getContentPane().getSize());
        this.setMinimumSize(mg.getContentPane().getSize());
        mg.setMg(mg);
        mg.setAc(ac);
    }
}
