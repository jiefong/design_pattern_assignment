package contactmanagementsoftware;

import java.io.Serializable;
import java.util.ArrayList;

public class ContactManagementSoftware implements Serializable {

    private static MUI mg;
//    private static ArrayList<ArrayList<Acquaintances>> a = new ArrayList<>();
//    private static ArrayList<Acquaintances> perF1 = new ArrayList<>();
//    private static ArrayList<Acquaintances> rel1 = new ArrayList<>();
//    private static ArrayList<Acquaintances> proF1 = new ArrayList<>();
//    private static ArrayList<Acquaintances> ca1 = new ArrayList<>();

    private static AcquaintancesSystem ac = new AcquaintancesList("master");
    private static AcquaintancesSystem perF1 = new AcquaintancesList("Personal Friends");
    private static AcquaintancesSystem rel1 = new AcquaintancesList("Relatives");
    private static AcquaintancesSystem proF1 = new AcquaintancesList("Professional Friends");
    private static AcquaintancesSystem ca1 = new AcquaintancesList("Casual Acquaintance");

    public static void main(String[] args) {
        mg = new MUI();

//        a.add(perF1);
//        a.add(rel1);
//        a.add(proF1);
//        a.add(ca1);
        mg.setMg(mg);
//        mg.setA(a);

        ac.addAcquaintances(perF1);
        ac.addAcquaintances(rel1);
        ac.addAcquaintances(proF1);
        ac.addAcquaintances(ca1);

        mg.setAc(ac);
        mg.setVisible(true);
    }
}
