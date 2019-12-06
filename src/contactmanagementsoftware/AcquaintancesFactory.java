/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

/**
 *
 * @author Leanne
 */

public class AcquaintancesFactory {
    Acquaintances acq;
    
    public Acquaintances createAcquaintances(AcquaintancesType type, String name, String mobileNo, String email, String[] othersInfoArray){
        switch (type) {
            case PF:
                acq = new PersonalFriends();
                break;
            case R:
                acq = new Relatives();
                break;
            case PROF:
                acq = new ProfessionalFriends();
                break;
            case CA:
                acq = new CasualAcquaintances();
                break;
            default:
                break;
        }
        acq.setName(name);
        acq.setMobileNo(mobileNo);
        acq.setEmail(email);
        acq.setOtherInformations(othersInfoArray);
        return acq;
    }
}
