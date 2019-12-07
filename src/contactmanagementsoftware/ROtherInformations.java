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
public class ROtherInformations implements OtherInformations{
    private String relativesBirthday, lastDateMet;
    
    public ROtherInformations() {
    }
    
    public ROtherInformations(String relativesBirthday, String lastDateMet) {
        this.relativesBirthday = relativesBirthday;
        this.lastDateMet = lastDateMet;
    }

    public String getRelativesBirthday() {
        return relativesBirthday;
    }

    public void setRelativesBirthday(String relativesBirthday) {
        this.relativesBirthday = relativesBirthday;
    }

    public String getLastDateMet() {
        return lastDateMet;
    }

    public void setLastDateMet(String lastDateMet) {
        this.lastDateMet = lastDateMet;
    }
    
    @Override
    public HashMap<String, String> getOtherInformations() {
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("RelativesBirthday", getRelativesBirthday());
        otherInformationsHashMap.put("LastDateMet", getLastDateMet());
        return otherInformationsHashMap;
    }
    
    @Override
    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
        relativesBirthday = newOtherInformations.get("RelativesBirthday");
        lastDateMet = newOtherInformations.get("LastDateMet");
    }
}
