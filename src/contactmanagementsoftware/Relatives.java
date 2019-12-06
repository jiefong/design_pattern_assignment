package contactmanagementsoftware;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Relatives extends Acquaintances implements Serializable{
    private String BDate;
    private String LDate;
    public static int numberRel = 0;
    private static Scanner reader = new Scanner(System.in);
    
    Relatives(){
        super();
        numberRel++;
        otherInformations = new ROtherInformations();
    }
    
//    Relatives(String name, String mobileNo, String email, String relativesBirthday, String lastDayMet){
//        super(name, mobileNo, email);
//        numberRel++;
//        otherInformations = new ROtherInformations(relativesBirthday,lastDayMet);
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
    
    public String getBDate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("RelativesBirthday");
    }

//    public void setBDate(String BDate) {
//        this.BDate = BDate;
//    }

    public String getLDate() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("LastDateMet");
    }

//    public void setLDate(String LDate) {
//        this.LDate = LDate;
//    }
    
    @Override
    public void setOtherInformations(String[] othersInfoArray){
        String relativesBirthday = othersInfoArray[0];
        String lastDateMet = othersInfoArray[1];
        HashMap<String,String> otherInformationsHashMap = new HashMap();
        otherInformationsHashMap.put("RelativesBirthday", relativesBirthday);
        otherInformationsHashMap.put("LastDateMet", lastDateMet);
        otherInformations.setOtherInformations(otherInformationsHashMap);
    }
}
