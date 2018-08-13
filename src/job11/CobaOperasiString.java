package job11;

public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "Mukhamad Rico Ramada/ XRPL3/ 27";
        System.out.println("identitas : " + identitas);
        String x = "Operasi";
        System.out.println("Isi variabel x : " + x);
        System.out.println("\"" + x + "\"panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variabel z : " + z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "Operation";
        System.out.println("isi variabel r : " + z);
        System.out.println("isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));
    }
}
