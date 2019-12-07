package contactmanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//public class Acquaintances implements Serializable{
//    private String Name;
//    private String MobileNo;
//    private String Email;
//    public static int number = 0;
//    
//    Acquaintances(){
//        number++;
//    }
//        
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Scanner reader = new Scanner(System.in);
//        if(!name.isEmpty())
//          this.Name = name;
//        else{
//            System.out.println("Enter atleast one character");
//            setName(reader.nextLine());
//        }
//    }
//
//    public String getMobileNo() {
//        return MobileNo;
//    }
//
//    public String getEmail() {
//        return Email;
//    }
//    
//    public boolean MobileNoChecker(String str)
//    {
//        int x;
//        for(int j = 0 ; j < str.length() ; j++)
//        {
//            x = (int)str.charAt(j);
//            if( x < 48 || x > 57 )
//            return false;    
//        }
//        return true;
//    }
//    
//    
//    public void setMobileNo(String MobileNo){
//        Scanner reader = new Scanner(System.in);
//        if(MobileNoChecker(MobileNo) && MobileNo.length()>=6 && MobileNo.length()<=15)
//            this.MobileNo = MobileNo;
//        else{
//            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
//            setMobileNo(reader.next());
//        }
//    }
//    
//    public void setEmail(String Email){
//        Scanner reader = new Scanner(System.in);
//        if(Email.contains("@"))
//            this.Email = Email;
//        else{
//            System.out.print("Enter a valid Email: ");
//            this.setEmail(reader.next());
//        }
//    }
//}
public abstract class Acquaintances implements Serializable, AcquaintancesSystem {

    private String name;
    private String mobileNo;
    private String email;
    public static int number = 0;
    OtherInformations otherInformations;

    Acquaintances() {
        number++;
    }

//    Acquaintances(String name,String mobileNo,String email){
//        this.name = name;
//        this.mobileNo = mobileNo;
//        this.email = email;
//        number++;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner reader = new Scanner(System.in);
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Enter atleast one character");
            setName(reader.nextLine());
        }
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public boolean MobileNoChecker(String str) {
        int x;
        for (int j = 0; j < str.length(); j++) {
            x = (int) str.charAt(j);
            if (x < 48 || x > 57) {
                return false;
            }
        }
        return true;
    }

    public void setMobileNo(String MobileNo) {
        Scanner reader = new Scanner(System.in);
        if (MobileNoChecker(MobileNo) && MobileNo.length() >= 6 && MobileNo.length() <= 15) {
            this.mobileNo = MobileNo;
        } else {
            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
            setMobileNo(reader.next());
        }
    }

    public void setEmail(String Email) {
        Scanner reader = new Scanner(System.in);
        if (Email.contains("@")) {
            this.email = Email;
        } else {
            System.out.print("Enter a valid Email: ");
            this.setEmail(reader.next());
        }
    }

    public abstract void setOtherInformations(String[] othersInfoArray);

    @Override
    public void addAcquaintances(AcquaintancesSystem acquaintances) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void removeAcquaintances(int position) {
        throw new UnsupportedOperationException("Not implemented");

    }

    @Override
    public AcquaintancesSystem getAcquaintances(int position) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ArrayList<AcquaintancesSystem> getChild() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public HashMap<String, String> getInformation() {
        HashMap<String, String> hash = new HashMap<String, String>();
        hash.put("Name", getName());
        hash.put("Mobile", getMobileNo());
        hash.put("Email", getEmail());
        return hash;
    }
    
    @Override
    public HashMap<String, String> getOtherInformation(){
        return otherInformations.getOtherInformations();
    }
}

//interface OtherInformations{
//    public HashMap<String,String> getOtherInformations();
//    public void setOtherInformations(HashMap<String,String> newOtherInformations);
//}
//class CAOtherInformations implements OtherInformations{
//    private String firstMeetingTimeAndLocation, firstMeetingCircumstances, otherUsefulInformation;
//    
//    public CAOtherInformations() {
//    }
//    
//    public CAOtherInformations(String firstMeetingTimeAndLocation, String firstMeetingCircumstances, String otherUsefulInformation) {
//        this.firstMeetingTimeAndLocation = firstMeetingTimeAndLocation;
//        this.firstMeetingCircumstances = firstMeetingCircumstances;
//        this.otherUsefulInformation = otherUsefulInformation;
//    }
//
//    public String getFirstMeetingTimeAndLocation() {
//        return firstMeetingTimeAndLocation;
//    }
//
//    public void setFirstMeetingTimeAndLocation(String firstMeetingTimeAndLocation) {
//        this.firstMeetingTimeAndLocation = firstMeetingTimeAndLocation;
//    }
//
//    public String getFirstMeetingCircumstances() {
//        return firstMeetingCircumstances;
//    }
//
//    public void setFirstMeetingCircumstances(String firstMeetingCircumstances) {
//        this.firstMeetingCircumstances = firstMeetingCircumstances;
//    }
//
//    public String getOtherUsefulInformation() {
//        return otherUsefulInformation;
//    }
//
//    public void setOtherUsefulInformation(String OtherUsefulInformation) {
//        this.otherUsefulInformation = OtherUsefulInformation;
//    }
//
//    @Override
//    public HashMap<String,String> getOtherInformations() {
//        HashMap<String,String> otherInformationsHashMap = new HashMap();
//        otherInformationsHashMap.put("FirstMeetingTimeAndLocation", getFirstMeetingTimeAndLocation());
//        otherInformationsHashMap.put("FirstMeetingCircumstances", getFirstMeetingCircumstances());
//        otherInformationsHashMap.put("OtherUsefulInformation", getOtherUsefulInformation());
//        return otherInformationsHashMap;
//    }
//
//    @Override
//    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
//        firstMeetingTimeAndLocation = newOtherInformations.get("FirstMeetingTimeAndLocation");
//        firstMeetingCircumstances = newOtherInformations.get("FirstMeetingCircumstances");
//        otherUsefulInformation = newOtherInformations.get("OtherUsefulInformation");
//    }
//}
//class PFOtherInformations implements OtherInformations{
//    private String specificEvent, firstAcquaintanceContext, firstAcquaintanceDate;
//    
//    public PFOtherInformations() {
//    }
//    
//    public PFOtherInformations(String specificEvent, String firstAcquaintanceContext, String firstAcquaintanceDate) {
//        this.specificEvent = specificEvent;
//        this.firstAcquaintanceContext = firstAcquaintanceContext;
//        this.firstAcquaintanceDate = firstAcquaintanceDate;
//    }
//    
//    public String getSpecificEvent() {
//        return specificEvent;
//    }
//
//    public void setSpecificEvent(String specificEvent) {
//        this.specificEvent = specificEvent;
//    }
//
//    public String getFirstAcquaintanceContext() {
//        return firstAcquaintanceContext;
//    }
//
//    public void setFirstAcquaintanceContext(String firstAcquaintanceContext) {
//        this.firstAcquaintanceContext = firstAcquaintanceContext;
//    }
//
//    public String getFirstAcquaintanceDate() {
//        return firstAcquaintanceDate;
//    }
//
//    public void setFirstAcquaintanceDate(String firstAcquaintanceDate) {
//        this.firstAcquaintanceDate = firstAcquaintanceDate;
//    }           
//
//    @Override
//    public HashMap<String, String> getOtherInformations() {
//        HashMap<String,String> otherInformationsHashMap = new HashMap();
//        otherInformationsHashMap.put("SpecificEvent", getSpecificEvent());
//        otherInformationsHashMap.put("FirstAcquaintanceContext", getFirstAcquaintanceContext());
//        otherInformationsHashMap.put("FirstAcquaintanceDate", getFirstAcquaintanceDate());
//        return otherInformationsHashMap;
//    }
//    
//    @Override
//    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
//        specificEvent = newOtherInformations.get("SpecificEvent");
//        firstAcquaintanceContext = newOtherInformations.get("FirstAcquaintanceContext");
//        firstAcquaintanceDate = newOtherInformations.get("FirstAcquaintanceDate");
//    }
//}
//class ROtherInformations implements OtherInformations{
//    private String relativesBirthday, lastDateMet;
//    
//    public ROtherInformations() {
//    }
//    
//    public ROtherInformations(String relativesBirthday, String lastDateMet) {
//        this.relativesBirthday = relativesBirthday;
//        this.lastDateMet = lastDateMet;
//    }
//
//    public String getRelativesBirthday() {
//        return relativesBirthday;
//    }
//
//    public void setRelativesBirthday(String relativesBirthday) {
//        this.relativesBirthday = relativesBirthday;
//    }
//
//    public String getLastDateMet() {
//        return lastDateMet;
//    }
//
//    public void setLastDateMet(String lastDateMet) {
//        this.lastDateMet = lastDateMet;
//    }
//    
//    @Override
//    public HashMap<String, String> getOtherInformations() {
//        HashMap<String,String> otherInformationsHashMap = new HashMap();
//        otherInformationsHashMap.put("RelativesBirthday", getRelativesBirthday());
//        otherInformationsHashMap.put("LastDateMet", getLastDateMet());
//        return otherInformationsHashMap;
//    }
//    
//    @Override
//    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
//        relativesBirthday = newOtherInformations.get("RelativesBirthday");
//        lastDateMet = newOtherInformations.get("LastDateMet");
//    }
//}
//class PROFOtherInformations implements OtherInformations{
//    private String commonInterests;
//    
//    public PROFOtherInformations() {
//    }
//    
//    public PROFOtherInformations(String commonInterest) {
//        this.commonInterests = commonInterest;
//    }
//
//    public String getCommonInterest() {
//        return commonInterests;
//    }
//
//    public void setCommonInterest(String commonInterest) {
//        this.commonInterests = commonInterest;
//    }
//    
//    @Override
//    public HashMap<String, String> getOtherInformations() {
//        HashMap<String,String> otherInformationsHashMap = new HashMap();
//        otherInformationsHashMap.put("CommonInterests", getCommonInterest());
//        return otherInformationsHashMap;
//    }
//    
//    @Override
//    public void setOtherInformations(HashMap<String, String> newOtherInformations) {
//        commonInterests = newOtherInformations.get("CommonInterests");
//    }
//}
//
