package contactmanagementsoftware;

//import java.util.ArrayList;

public class ContactManagementSoftware{

    private static MUI mg;

    private static AcquaintancesSystem ac = new AcquaintancesList("master");
    private static AcquaintancesSystem perF1 = new AcquaintancesList("Personal Friends");
    private static AcquaintancesSystem rel1 = new AcquaintancesList("Relatives");
    private static AcquaintancesSystem proF1 = new AcquaintancesList("Professional Friends");
    private static AcquaintancesSystem ca1 = new AcquaintancesList("Casual Acquaintance");

    public static void main(String[] args) {
        mg = new MUI();

        mg.setMg(mg);

        ac.addAcquaintances(perF1);
        ac.addAcquaintances(rel1);
        ac.addAcquaintances(proF1);
        ac.addAcquaintances(ca1);

        mg.setAc(ac);
        mg.setVisible(true);
    }
}
