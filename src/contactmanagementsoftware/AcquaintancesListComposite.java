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
public class AcquaintancesListComposite implements AcquaintancesSystem {

    ArrayList<AcquaintancesSystem> acquaintanceList;
    String name;

    public AcquaintancesListComposite(String name) {
        this.name = name;
        acquaintanceList = new ArrayList();
        String[] arr = {"abc", "123"};
    }
    
    public String getName(){
        return name;
    }

    @Override
    public void addAcquaintances(AcquaintancesSystem acquaintances) {
        acquaintanceList.add(acquaintances);
    }

    @Override
    public void removeAcquaintances(int position) {
        try {
            acquaintanceList.remove(position);
        }catch(Exception e){
            // not found
        }
    }

    @Override
    public AcquaintancesSystem getAcquaintances(int position) {
        try{
            return acquaintanceList.get(position);
        }catch(Exception e){
            return null;
        }
    }
    
    @Override
    public ArrayList<AcquaintancesSystem> getChild(){
        return acquaintanceList;
    }

    @Override
    public HashMap<String, String> getInformation() {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("Name", getName());
        return hash;
    }
    
    @Override
    public HashMap<String, String> getOtherInformation(){
        throw new UnsupportedOperationException("Not implemented");
    }
}
