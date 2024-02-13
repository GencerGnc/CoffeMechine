import java.util.Locale;
import java.util.Scanner;

public class KahveMakinasi {
    private KahceCesitleri kahceCesitleri;

    private KahveBoyu kahveBoyu;

    private boolean sutVarmi;
    private boolean sekerVarmi;
    private int sekerSayisi;

    Scanner readtInt = new Scanner(System.in);
    Scanner readStr = new Scanner(System.in);

    void sistem() {
        KahveSecim();
        sekerSor();
        beyazSuSor();
        afganmiFasmi();

    }


    public KahveMakinasi() {
        setKahceCesitleri(kahceCesitleri);
        setKahveBoyu(kahveBoyu);
        setSutVarmi(sutVarmi);
        setSekerVarmi(sekerVarmi);
        setSekerSayisi(sekerSayisi);
    }

    public KahceCesitleri getKahceCesitleri() {
        return kahceCesitleri;
    }

    public void setKahceCesitleri(KahceCesitleri kahceCesitleri) {
        this.kahceCesitleri = kahceCesitleri;
    }

    public KahveBoyu getKahveBoyu() {
        return kahveBoyu;
    }

    public void setKahveBoyu(KahveBoyu kahveBoyu) {
        this.kahveBoyu = kahveBoyu;
    }

    public boolean isSutVarmi() {
        return sutVarmi;
    }

    public void setSutVarmi(boolean sutVarmi) {
        this.sutVarmi = sutVarmi;
    }

    public boolean isSekerVarmi() {
        return sekerVarmi;
    }

    public void setSekerVarmi(boolean sekerVarmi) {
        this.sekerVarmi = sekerVarmi;
    }

    public int getSekerSayisi() {
        return sekerSayisi;
    }

    public void setSekerSayisi(int sekerSayisi) {
        this.sekerSayisi = sekerSayisi;
    }

    void KahveSecim() {
//        System.out.println("<1>Americano,\n" +
//                "<2>Espresso,\n" +
//                "<3>Cappucino,\n" +
//                "<4>Latte,\n" +
//                "<5>Mocha,\n" +
//                "<6>Macchiato,\n" +
//                "<7>Affogato,\n" +
//                "<8>BuzluKahve,\n" +
//                "<9>Frappuccino,\n" +
//                " <10>Irish\n" +
//                "<0> Cıkıs\n");
//
//
//        System.out.println("Kahve seciniz ");
//        int secim = readtInt.nextInt();


           for(KahceCesitleri kahve : KahceCesitleri.values()){
               System.out.println(kahve);
           }
        System.out.println("Kahve seçin");
           String secim1=readStr.nextLine();
        try {
            this.kahceCesitleri=KahceCesitleri.valueOf(secim1);
        }catch (IllegalArgumentException e){
            System.out.println("Hatalı giriş");
            KahveSecim();
        }

    }

    void sekerSor() {
        System.out.println("Şeker istermisiniz ?(evet/hayir)");
        String seker = readStr.nextLine();
        if (seker.equalsIgnoreCase("evet")) {
            this.sekerVarmi = true;
        } else if (seker.equalsIgnoreCase("Hayir")) {
            this.sekerVarmi = false;
        } else {
            System.out.println("Yanlis giriş");
        }

        if (this.sekerVarmi) {
            System.out.println("kaç şeker istersiniz");
            this.sekerSayisi = readtInt.nextInt();
            System.out.println(this.sekerSayisi + "ekleniyor....");
        } else {
            System.out.println("Kaheveniz şekersiz hazırlanacak");
        }


    }

    void beyazSuSor() {
        System.out.println("Kahvenize süt istermisiniz ?(evet/hayir)");
        String beyazSu = readStr.nextLine();
        if (beyazSu.equalsIgnoreCase("evet")) {
            this.sekerVarmi = true;
        } else if (beyazSu.equalsIgnoreCase("Hayir")) {
            this.sekerVarmi = false;
        } else {
            System.out.println("Yanlis giriş");
        }

    }

    void afganmiFasmi() {
        System.out.println(" Small,\n" +
                "    Medium,\n" +
                "    Large,\n" +
                "    XLarge");
        System.out.println("Kaç santim lazım ?");
        String boy = readStr.nextLine().toLowerCase();
        this.kahveBoyu = KahveBoyu.valueOf(boy);


    }

    String seker() {
        String s = "";
        if (sekerVarmi) {
            s = "sekerli";

        } else
            System.out.println("sekersiz");
        return s;
    }

    String sut() {
        String s = "";
        if (sutVarmi) {
            s = "sütsüz";

        } else {
            s="sütlü";
        }
        return s;
    }


    @Override
    public String toString() {
        return "KahveMakinasi{" +
                "kahceCesitleri=" + kahceCesitleri +
                ", kahveBoyu=" + kahveBoyu +
                ", sutVarmi=" + sut() +
                ", sekerVarmi=" + seker() +
                ", sekerSayisi=" + sekerSayisi +
                "Hazirlaniyor"+
                '}';
    }
}