/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Leanne
 */
public class PFOtherInformations implements OtherInformations{
    private String specificEvent, firstAcquaintanceContext, firstAcquaintanceDate;
    
    public PFOtherInformations() {
    }
    
    public PFOtherInformations(String specificEvent, String firstAcquaintanceContext, String firstAcquaintanceDate) {
        this.specificEvent = specificEvent;
        this.firstAcquaintanceContext = firstAcquaintanceContext;
        this.firstAcquaintanceDate = firstAcquaintanceDate;
    }
    
    public String getSpecificEvent() {
        return specificEvent;
    }

    public void setSpecificEvent(String specificEvent) {
        this.specificEvent = specificEvent;
    }

    public String getFirstAcquaintanceContext() {
        return firstAcquaintanceContext;
    }

    public void setFirstAcquaintanceContext(String firstAcquaintanceContext) {
        this.firstAcquaintanceContext = firstAcquaintanceContext;
    }

    public String getFirstAcquaintanceDate() {
        return firstAcquaintanceDate;
    }

    public void setFirstAcquaintanceDate(String firstAcquaintanceDate) {
        this.firstAcquaintanceDate = firstAcquaintanceDate;
    }           

    @Override
    public HashMap<String, String> getOtherInformations() {
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("SpecificEvent", getSpecificEvent());
        otherInformationsHashMap.put("FirstAcquaintanceContext", getFirstAcquaintanceContext());
        otherInformationsHashMap.put("FirstAcquaintanceDate", getFirstAcquaintanceDate());
        return otherInformationsHashMap;
    }
    
    @Override
    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
        specificEvent = newOtherInformations.get("SpecificEvent");
        firstAcquaintanceContext = newOtherInformations.get("FirstAcquaintanceContext");
        firstAcquaintanceDate = newOtherInformations.get("FirstAcquaintanceDate");
    }
}
