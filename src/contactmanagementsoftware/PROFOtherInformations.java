/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.HashMap;

/**
 *
 * @author Leanne
 */
public class PROFOtherInformations implements OtherInformations{
    private String commonInterests;
    
    public PROFOtherInformations() {
    }
    
    public PROFOtherInformations(String commonInterest) {
        this.commonInterests = commonInterest;
    }

    public String getCommonInterest() {
        return commonInterests;
    }

    public void setCommonInterest(String commonInterest) {
        this.commonInterests = commonInterest;
    }
    
    @Override
    public HashMap<String, String> getOtherInformations() {
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("CommonInterests", getCommonInterest());
        return otherInformationsHashMap;
    }
    
    @Override
    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
        commonInterests = newOtherInformations.get("CommonInterests");
    }
}

