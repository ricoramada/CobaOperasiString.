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
        
        System.out.println("Perbandingan isi dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
        System.out.println("perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
        
        String s = "operasi";
        System.out.println("isi variaabel s : " + s);
        System.out.println("perbadingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("s"));
        
        System.out.println("isi variabel x besar semua : " + x.toUpperCase());
        System.out.println("isi variabel x kecil semua : " + x.toLowerCase());
        
        String t = "  operasi string  ";
        System.out.println("isi variabel t : \""  + t.trim() +"\"");
        System.out.println("isi variabel t tanpa spasi : \"" + t.trim() +"\"");
        
        System.out.println("gabungkan isi variabel x dan r : " + x.concat(r));
    }
}
