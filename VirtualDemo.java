import javax.swing.event.SwingPropertyChangeSupport;

public class VirtualDemo {
    public static void main(String[] args) {
    Pegawai pegawai1 = new Pegawai("Regina Nathamiya Pramija", "Padang", 1);
    Pegawai pegawai2 = new Pegawai("Shea Kanaka", "Bali", 2);
    Pegawai pegawai3 = new Pegawai("Farrel Valentino Pramija", "Kalimantan",3);

    Pegawai gajiPegawai = new Gaji("Gina", "Nanggalo", 4,2750000.0);
    Pegawai gajiPegawai2 = new Gaji("Shee", "Ubud", 5,2700000.0);
    Pegawai gajiPegawai3 = new Gaji("Farrel", "Banjarmasin", 6, 3200000.0 );

    pegawai1.mailCheck();
    gajiPegawai.mailCheck();
    pegawai2.mailCheck();
    gajiPegawai2.mailCheck();

    // Polimorfisme
    double weeklyPay1 = ((Gaji) gajiPegawai).computePay();
    double weeklyPay2 = ((Gaji) gajiPegawai2).computePay();
    double weeklyPay3 = ((Gaji) gajiPegawai3).computePay();
    System.out.println("");
    System.out.println("======================================");
    System.out.println("");
    System.out.println("Pembayaran bulanan untuk " + gajiPegawai.getName() + ": " + weeklyPay1);
    System.out.println("Pembayaran bulanan untuk " + gajiPegawai2.getName() + ": " + weeklyPay2);
    System.out.println("Pembayaran bulanan untuk " + gajiPegawai3.getName() + "; " + weeklyPay3);
    }
}
