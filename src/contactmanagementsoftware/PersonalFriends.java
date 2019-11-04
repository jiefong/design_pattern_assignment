package contactmanagementsoftware;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class PersonalFriends extends Acquaintances implements Serializable{
    private String AContext;
    private String ADate;
    private String Events;
    private static Scanner reader = new Scanner(System.in);
    public static int numberPerF = 0;
    
    PersonalFriends(){
        numberPerF++;
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
        return AContext;
    }

    public void setAContext(String AContext) {
        Scanner reader = new Scanner(System.in);
        if(!AContext.isEmpty())
            this.AContext = AContext;
        else{
            System.out.println("Enter at least one character");
            setAContext(reader.nextLine());
        }
    }

    public String getADate() {
        return ADate;
    }

    public void setADate(String ADate) {
        this.ADate = ADate;
    }

    public String getEvents() {
        return Events;
    }

    public void setEvents(String Events) {
        Scanner reader = new Scanner(System.in);
        if(!Events.isEmpty())
            this.Events = Events;
        else{
            System.out.println("Enter at least one character");
            setEvents(reader.nextLine());
        }
    }
}
