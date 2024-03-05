public class Laporan extends JenisLaundry {
    public void NamaToko(){
        System.out.println("\t"+super.namaToko);
    }

    public void laporan(JenisLaundry jenislaundry){
    int x = jenislaundry.getJmlLaundry();

    System.out.println();
    System.out.println("Tabel Laundry");
    System.out.println();
    System.out.println("JenisLaundry \tHarga \tDurasi");

    for (int i = 0; i < x; i++) {
        System.out.println(jenislaundry.getNamaLaundry(i) + "\t" + jenislaundry.getHarga(i) + "\t" + jenislaundry.getDurasi(i));
        }
    }

    public void laporan(Client client){
    int x=client.getJmlClient();

    System.out.println();
    System.out.println("Nama Client");
    System.out.println();
    System.out.println("Nama \tAlamat \t\tTelepon \t\tSaldo");

        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i)+"\t"+
            client.getAlamat(i)+"\t"+"\t"+client.getTelepon(i)+"\t"+"\t"+
            client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenislaundry){
    int x=transaksi.getJmlTransaksi();

    System.out.println();
    System.out.println("Laporan Transaksi");
    System.out.println();
    System.out.println("Nama Laundry \tHarga \tDurasi \tJumlah");

    int total=0;
    for (int i = 0; i < x; i++) {
        int
        jumlah=transaksi.getBanyaknya(i)*jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
        total+=jumlah;
        System.out.println(jenislaundry.getNamaLaundry(transaksi.getIdJenisLaundry(i))+"\t"+ transaksi.getBanyaknya(i)+"\t"+jenislaundry.getDurasi(transaksi.getIdJenisLaundry(i))+"\t"+jumlah);
        }
    System.out.println("Total Omset = " + total);
    }
}


