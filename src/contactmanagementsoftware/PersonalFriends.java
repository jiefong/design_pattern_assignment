package contactmanagementsoftware;

import java.util.HashMap;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances {
//    private String AContext;
//    private String ADate;
//    private String Events;

    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends() {
        super();
        numberPerF++;
        otherInformations = new PFOtherInformations();
    }
    
//    PersonalFriends(String name, String mobileNo, String email, String specificEvents, String firstAcqContext, String firstAcqDate) {
//        super(name, mobileNo, email);
//        numberPerF++;
//        otherInformations = new PFOtherInformations(specificEvents, firstAcqContext, firstAcqDate);
//    }

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
    
//    public void setAContext(String AContext) {
    //        Scanner reader = new Scanner(System.in);
    //        if(!AContext.isEmpty())
    //            this.AContext = AContext;
    //        else{
    //            System.out.println("Enter at least one character");
    //            setAContext(reader.nextLine());
    //        }
//      }

    public String getADate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstAcquaintanceDate");
    }

//    public void setADate(String ADate) {
//        this.ADate = ADate;
//    }
    
    public String getEvents() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("SpecificEvent");
    }

//    public void setEvents(String Events) {
//        Scanner reader = new Scanner(System.in);
//        if(!Events.isEmpty())
//            this.Events = Events;
//        else{
//            System.out.println("Enter at least one character");
//            setEvents(reader.nextLine());
//        }
//    }
    
    
    @Override
    public void setOtherInformations(String[] othersInfoArray){
        String specificEvent = othersInfoArray[0];
        String firstAcquaintanceContext = othersInfoArray[1];
        String firstAcquaintanceDate = othersInfoArray[2];
//        Scanner reader = new Scanner(System.in);
        if (!specificEvent.isEmpty() && !firstAcquaintanceContext.isEmpty()) {
            HashMap<String, String> otherInformationsHashMap = new HashMap();
            otherInformationsHashMap.put("SpecificEvent", specificEvent);
            otherInformationsHashMap.put("FirstAcquaintanceContext", firstAcquaintanceContext);
            otherInformationsHashMap.put("FirstAcquaintanceDate", firstAcquaintanceDate);
            otherInformations.setOtherInformations(otherInformationsHashMap);
        } else {
            System.out.println("Enter at least one character");
//            setOtherInformations(reader.nextLine());
        }
    }
}
