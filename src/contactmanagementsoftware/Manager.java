/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Leanne
 */
public class Manager {
    
    MUI mg;
    
    public Manager(MUI mg){
        this.mg = mg;
    }

    public boolean saveContact(String Name, String Mobile, String Email, String One, String Two, String Three, int x,
                            boolean flag, ArrayList<ArrayList<Acquaintances>> a, int num) {
        
        if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(mg, "Enter a name");
            return false;
        }
        if (!MobileNoChecker(Mobile)) {
            JOptionPane.showMessageDialog(mg, "Enter a valid mobile number (6-15 digits)");
            return false;
        }
        if (!Email.contains("@")) {
            JOptionPane.showMessageDialog(mg, "Enter a valid email");
            return false;
        }
        switch (x) {
            case 0: //perF
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (!validDate(Three, mg)) {
                    return false;
                }
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                PersonalFriends perF;
                if (flag) {
                    perF = new PersonalFriends();
                } else {
                    perF = (PersonalFriends) a.get(x).get(num);
                }
                perF.setName(Name);
                perF.setMobileNo(Mobile);
                perF.setEmail(Email);
                perF.setEvents(One);
                perF.setAContext(Two);
                perF.setADate(Three);
                if (flag) {
                    a.get(x).add(perF);
                }
                //this.a.get(x).add(perF);
                break;
            case 1: //rel
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (!validDate(One, mg)) {
                    return false;
                }
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (!validDate(Two, mg)) {
                    return false;
                }
                Relatives rel;
                if (flag) {
                    rel = new Relatives();
                } else {
                    rel = (Relatives) a.get(x).get(num);
                }
                rel.setName(Name);
                rel.setMobileNo(Mobile);
                rel.setEmail(Email);
                rel.setBDate(One);
                rel.setLDate(Two);
                if (flag) {
                    a.get(x).add(rel);
                }
                break;
            case 2: //proF
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                ProfessionalFriends proF;
                if (flag) {
                    proF = new ProfessionalFriends();
                } else {
                    proF = (ProfessionalFriends) a.get(x).get(num);
                }
                proF.setName(Name);
                proF.setMobileNo(Mobile);
                proF.setEmail(Email);
                proF.setCommonInterests(One);
                if (flag) {
                    a.get(x).add(proF);
                }
                break;
            case 3: //ca
                if (One.isEmpty() || One.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (Two.isEmpty() || Two.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                if (Three.isEmpty() || Three.length() > 300) {
                    JOptionPane.showMessageDialog(mg, "Enter a valid value ( 1 to 300 chars)");
                    return false;
                }
                CasualAcquaintances ca;
                if (flag) {
                    ca = new CasualAcquaintances();
                } else {
                    ca = (CasualAcquaintances) a.get(x).get(num);
                }
                ca.setName(Name);
                ca.setMobileNo(Mobile);
                ca.setEmail(Email);
                ca.setWhenWhere(One);
                ca.setCircumstances(Two);
                ca.setOtherInfo(Three);
                if (flag) {
                    a.get(x).add(ca);
                }
                break;
            default:
                break;
        }
        return true;
    }

    public boolean MobileNoChecker(String str) {
        int x;
        if (str.isEmpty() || str.length() < 6 || str.length() > 15) {
            return false;
        }
        for (int j = 0; j < str.length(); j++) {
            x = (int) str.charAt(j);
            if (x < 48 || x > 57) {
                return false;
            }
        }
        return true;
    }

    public boolean validDate(String Date, MUI mg) {
        String pattern = "[0-3][0-9]/[0-1][0-9]/[0-9]{4}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(Date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (!m.find()) {
            JOptionPane.showMessageDialog(mg, "Enter a valid date");
            return false;
        } else {
            return true;
        }
    }
}
