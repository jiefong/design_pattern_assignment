package contactmanagementsoftware;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

public class ProfessionalFriends extends Acquaintances {

//    private String CommonInterests;
    public static int numberProF = 0;
    
    ProfessionalFriends() {
        super();
        numberProF++;
        otherInformations = new PROFOtherInformations();
    }
    
//    ProfessionalFriends(String name, String mobileNo, String email, String commonInterest) {
//        super(name, mobileNo, email);
//        numberProF++;
//        otherInformations = new PROFOtherInformations(commonInterest);
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

    public String getCommonInterests() {
        HashMap<String, String> otherInformationsHashMap = otherInformations.getOtherInformations();
        return otherInformationsHashMap.get("CommonInterests");
    }

    @Override
    public void setOtherInformations(String[] othersInfoArray) {
//        Scanner reader = new Scanner(System.in);
        String commonInterests = othersInfoArray[0];
        if (!commonInterests.isEmpty()) {
            HashMap<String, String> otherInformationsHashMap = new HashMap<>();
            otherInformationsHashMap.put("CommonInterests", commonInterests);
            otherInformations.setOtherInformations(otherInformationsHashMap);
        } else {
            System.out.println("Enter at least one character");
//            setOtherInformations(reader.nextLine());
        }
    }
}
