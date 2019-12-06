package contactmanagementsoftware;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class CasualAcquaintances extends Acquaintances implements Serializable {
//    private String WhenWhere;
//    private String Circumstances;
//    private String OtherInfo;

    public static int numberCA = 0;

    CasualAcquaintances() {
        super();
        numberCA++;
        otherInformations = new CAOtherInformations();
    }

//    CasualAcquaintances(String name, String mobileNo, String email, String firstTimeAndLoc, String firstMeetingCir, String otherUsefulInfo) {
//        super(name, mobileNo, email);
//        numberCA++;
//        otherInformations = new CAOtherInformations(firstTimeAndLoc, firstMeetingCir, otherUsefulInfo);
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

    public String getWhenWhere() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstMeetingTimeAndLocation");
    }

//    public void setWhenWhere(String WhenWhere) {
//        Scanner reader = new Scanner(System.in);
//        if(!WhenWhere.isEmpty())
//            this.WhenWhere = WhenWhere;
//        else{
//            System.out.println("Enter atleast one character");
//            setWhenWhere(reader.nextLine());
//        }
//    }
    public String getCircumstances() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("FirstMeetingCircumstances");
    }

//    public void setCircumstances(String Circumstances) {
//        Scanner reader = new Scanner(System.in);
//        if(!Circumstances.isEmpty())
//            this.Circumstances = Circumstances;
//        else{
//            System.out.println("Enter atleast one character");
//            setCircumstances(reader.nextLine());
//        }
//    }
    public String getOtherInfo() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("OtherUsefulInformation");
    }

//    public void setOtherInfo(String OtherInfo) {
//        Scanner reader = new Scanner(System.in);
//        if(!OtherInfo.isEmpty())
//            this.OtherInfo = OtherInfo;
//        else{
//            System.out.println("Enter atleast one character");
//            setOtherInfo(reader.nextLine());
//        }
//    }
    @Override
    public void setOtherInformations(String[] othersInfoArray) {
        String firstMeetingTimeAndLocation = othersInfoArray[0];
        String firstMeetingCircumstances = othersInfoArray[1];
        String otherUsefulInformation = othersInfoArray[2];
//        Scanner reader = new Scanner(System.in);
        if (!firstMeetingTimeAndLocation.isEmpty() && !firstMeetingCircumstances.isEmpty() && !otherUsefulInformation.isEmpty()) {
            HashMap<String, String> otherInformationsHashMap = new HashMap();
            otherInformationsHashMap.put("FirstMeetingTimeAndLocation", firstMeetingTimeAndLocation);
            otherInformationsHashMap.put("FirstMeetingCircumstances", firstMeetingCircumstances);
            otherInformationsHashMap.put("OtherUsefulInformation", otherUsefulInformation);
            otherInformations.setOtherInformations(otherInformationsHashMap);
        } else {
            System.out.println("Enter at least one character");
//            setOtherInformations(reader.nextLine());
        }
    }
}
