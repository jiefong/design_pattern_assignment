/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jiefo
 */
public interface AcquaintancesSystem {
    public void addAcquaintances(AcquaintancesSystem acquaintances);
    public void removeAcquaintances(int position);
    public AcquaintancesSystem getAcquaintances(int position);
    public ArrayList<AcquaintancesSystem> getChild();
    public HashMap<String, String> getInformation();
    public HashMap<String, String> getOtherInformation();
}
