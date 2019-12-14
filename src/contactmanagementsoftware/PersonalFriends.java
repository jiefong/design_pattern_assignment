package contactmanagementsoftware;

import java.util.HashMap;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances {

    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends() {
        super();
        numberPerF++;
        otherInformations = new PFOtherInformations();
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

    public String getAContext() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstAcquaintanceContext");
    }

    public String getADate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstAcquaintanceDate");
    }

    public String getEvents() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("SpecificEvent");
    }
    
    
    @Override
    public void setOtherInformations(String[] othersInfoArray){
        String specificEvent = othersInfoArray[0];
        String firstAcquaintanceContext = othersInfoArray[1];
        String firstAcquaintanceDate = othersInfoArray[2];
        if (!specificEvent.isEmpty() && !firstAcquaintanceContext.isEmpty()) {
            HashMap<String, String> otherInformationsHashMap = new HashMap();
            otherInformationsHashMap.put("SpecificEvent", specificEvent);
            otherInformationsHashMap.put("FirstAcquaintanceContext", firstAcquaintanceContext);
            otherInformationsHashMap.put("FirstAcquaintanceDate", firstAcquaintanceDate);
            otherInformations.setOtherInformations(otherInformationsHashMap);
        } else {
            System.out.println("Enter at least one character");
        }
    }
}
