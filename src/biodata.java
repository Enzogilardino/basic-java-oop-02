public class Biodata {
    String nama;
    String alamat;
    String noTelp;
    String email;
    String hobby;
    String riwayatPendidikan;

    public Biodata() {
        nama = "John Doe";
        alamat = "Jl. Jend. Sudirman No. 123, Jakarta";
        noTelp = "081234567890";
        email = "johndoe@example.com";
        hobby = "Membaca";
        riwayatPendidikan = "SD: SDN 01 Jakarta\nSMP: SMPN 01 Jakarta\nSMA: SMAN 01 Jakarta";
    }

    public void show() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("No. Telp\t: " + noTelp);
        System.out.println("Email\t\t: " + email);
        System.out.println("Hobby\t\t: " + hobby);
        System.out.println("Riwayat Pendidikan:\n" + riwayatPendidikan);
    }

    public static void main(String[] args) {
        Biodata b = new Biodata();
        b.show();
    }
}

