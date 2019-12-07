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
//    public boolean mobileNoChecker(String str)
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
//        if(mobileNoChecker(MobileNo) && MobileNo.length()>=6 && MobileNo.length()<=15)
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

    
    public boolean mobileNoChecker(String str)
    {
        int x;
        for (int j = 0; j < str.length(); j++) {
            x = (int) str.charAt(j);
            if (x < 48 || x > 57) {
                return false;
            }
        }
        return true;
    }
    
    
    public void setMobileNo(String mobileNo){
        Scanner reader = new Scanner(System.in);
        if(mobileNoChecker(mobileNo) && mobileNo.length()>=6 && mobileNo.length()<=15)
            this.mobileNo = mobileNo;
        else{
            System.out.print("Enter a valid Mobile No of length between 6 and 15 (inclusive): ");
            setMobileNo(reader.next());
        }
    }

    
    public void setEmail(String email){
        Scanner reader = new Scanner(System.in);
        if(email.contains("@"))
            this.email = email;
        else{
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
