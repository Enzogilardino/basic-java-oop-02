public class Datadiri{
    //Data member
    String nama;
    String JenisKelamin;
    String Alamat;
    String No;
    String email;
    String Hobby;
    String a;
    String b;
    String c;

    //constructor
    Datadiri(String nama,String JenisKelamin,String Alamat,String No,String email, String Hobby, String a, String b, String c){
        this.nama = nama;
        this.JenisKelamin = JenisKelamin;
        this.Alamat = Alamat;
        this.No = No;
        this.email = email;
        this.Hobby = Hobby;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Jenis Kelamin  : " + this.JenisKelamin);
        System.out.println("Alamat : " + this.Alamat);
        System.out.println("No.Telp : " + this.No);
        System.out.println("em@il : " + this.email);
        System.out.println("Hobby : " + this.Hobby);
        System.out.println("Riwayat Pendidikan :");
        System.out.println("a.SD : " + this.a);
        System.out.println("b.SMP : " + this.b);
        System.out.println("c.SMU/SMK : " + this.c);
    }

public static void main (String[] args) {
     Datadiri Datadiri1 = new Datadiri("Enzo","Laki - Laki","JL.PRAJURIT 1 GG.3","081344634932","enzogilardino@gmail.com","Sepak Bola","Xaverius 1","SMP NEGERI 1","SMA Negeri 1");
        Datadiri1.show();
    }
}
