package contactmanagementsoftware;

import java.util.HashMap;
import java.util.Scanner;

public class CasualAcquaintances extends Acquaintances{
    public static int numberCA = 0;

    CasualAcquaintances() {
        super();
        numberCA++;
        otherInformations = new CAOtherInformations();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String Name) {
        super.setName(Name);
    }

    @Override
    public String getMobileNo() {
        return super.getMobileNo();
    }

    @Override
    public void setMobileNo(String MobileNo) {
        super.setMobileNo(MobileNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String Email) {
        super.setEmail(Email);
    }

    public String getWhenWhere() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstMeetingTimeAndLocation");
    }

    public String getCircumstances() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstMeetingCircumstances");
    }

    public String getOtherInfo() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("OtherUsefulInformation");
    }

    @Override
    public void setOtherInformations(String[] othersInfoArray) {
        String firstMeetingTimeAndLocation = othersInfoArray[0];
        String firstMeetingCircumstances = othersInfoArray[1];
        String otherUsefulInformation = othersInfoArray[2];
        if (!firstMeetingTimeAndLocation.isEmpty() && !firstMeetingCircumstances.isEmpty() && !otherUsefulInformation.isEmpty()) {
            HashMap<String, String> otherInformationsHashMap = new HashMap();
            otherInformationsHashMap.put("FirstMeetingTimeAndLocation", firstMeetingTimeAndLocation);
            otherInformationsHashMap.put("FirstMeetingCircumstances", firstMeetingCircumstances);
            otherInformationsHashMap.put("OtherUsefulInformation", otherUsefulInformation);
            otherInformations.setOtherInformations(otherInformationsHashMap);
        } else {
            System.out.println("Enter at least one character");
        }
    }
}
