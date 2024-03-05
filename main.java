public class main {
    
    public static void main(String[] args) {

        Client c = new Client();
        JenisLaundry j = new JenisLaundry();
        Transaksi t = new Transaksi();
        Laporan l = new Laporan();
        
        l.NamaToko();
        l.laporan(j);
        l.laporan(c);
        t.prosesTransaksi(c, t, j);
        l.laporan(j);
        l.laporan(c);
    }
}
