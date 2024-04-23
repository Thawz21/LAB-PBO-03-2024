class Status {
    boolean sedia;
    
    Status(boolean sedia) {
        this.sedia = sedia;
    }
}

public class Kost {
    String nama;
    int nomorKamar;
    Status status;

    Kost(String nama, int nomorKamar, Status status) {
        this.nama = nama;
        this.nomorKamar = nomorKamar;
        this.status = status;
    }

    void getInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Kamar: " + nomorKamar);
    }

    void statusKamar() {
        if (status.sedia) {
            System.out.println("Kamar tersedia.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        Status status = new Status(true); // Memperbaiki inisialisasi objek Status
        Kost kost = new Kost("Budi", 204, status); // Memperbaiki nama variabel objek
        kost.getInfo();
        kost.statusKamar();
    }
}
