public class Main {
    public static void main(String[] args) {
        // Membuat objek Status
        Status status = new Status(true);

        // Membuat objek Kost menggunakan constructor dengan parameter
        Kost kost1 = new Kost("Budi", 204, status);

        // Memanggil method getInfo() untuk mendapatkan informasi tentang objek Kost
        kost1.getInfo();

        // Memanggil method statusKamar() untuk menampilkan status kamar
        kost1.statusKamar();

        // Mengubah status kamar menjadi tidak tersedia
        status.sedia = false;

        // Membuat objek Kost baru dengan status kamar tidak tersedia
        Kost kost2 = new Kost("Diana", 205, status);

        // Memanggil method getInfo() untuk mendapatkan informasi tentang objek Kost baru
        kost2.getInfo();

        // Memanggil method statusKamar() untuk menampilkan status kamar objek Kost baru
        kost2.statusKamar();
    }
}
