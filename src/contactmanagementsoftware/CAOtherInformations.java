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
public class CAOtherInformations implements OtherInformations{
    private String firstMeetingTimeAndLocation, firstMeetingCircumstances, otherUsefulInformation;
    
    public CAOtherInformations() {
    }
    
    public CAOtherInformations(String firstMeetingTimeAndLocation, String firstMeetingCircumstances, String otherUsefulInformation) {
        this.firstMeetingTimeAndLocation = firstMeetingTimeAndLocation;
        this.firstMeetingCircumstances = firstMeetingCircumstances;
        this.otherUsefulInformation = otherUsefulInformation;
    }

    public String getFirstMeetingTimeAndLocation() {
        return firstMeetingTimeAndLocation;
    }

    public void setFirstMeetingTimeAndLocation(String firstMeetingTimeAndLocation) {
        this.firstMeetingTimeAndLocation = firstMeetingTimeAndLocation;
    }

    public String getFirstMeetingCircumstances() {
        return firstMeetingCircumstances;
    }

    public void setFirstMeetingCircumstances(String firstMeetingCircumstances) {
        this.firstMeetingCircumstances = firstMeetingCircumstances;
    }

    public String getOtherUsefulInformation() {
        return otherUsefulInformation;
    }

    public void setOtherUsefulInformation(String OtherUsefulInformation) {
        this.otherUsefulInformation = OtherUsefulInformation;
    }

    @Override
    public HashMap<String,String> getOtherInformations() {
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("FirstMeetingTimeAndLocation", getFirstMeetingTimeAndLocation());
        otherInformationsHashMap.put("FirstMeetingCircumstances", getFirstMeetingCircumstances());
        otherInformationsHashMap.put("OtherUsefulInformation", getOtherUsefulInformation());
        return otherInformationsHashMap;
    }

    @Override
    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
        firstMeetingTimeAndLocation = newOtherInformations.get("FirstMeetingTimeAndLocation");
        firstMeetingCircumstances = newOtherInformations.get("FirstMeetingCircumstances");
        otherUsefulInformation = newOtherInformations.get("OtherUsefulInformation");
    }
}
