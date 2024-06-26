import java.util.Scanner;

public class TP2_1_H071221073 {

    String name;
    int age;
    boolean isMale;

    public TP2_1_H071221073
(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }

    public String toString() {
        return "Nama: " + name + "\n"
                + "Usia: " + age + "\n"
                + "Jenis Kelamin: " + getGender();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Usia: ");
        int age = scanner.nextInt();

        boolean isMale = false;
        while (true) {
            System.out.print("Jenis Kelamin (L/P): ");
            char gender = scanner.next().toUpperCase().charAt(0);
            scanner.nextLine();

            if (gender == 'L' || gender == 'P') {
                isMale = gender == 'L';
                break;
            } else {
                System.out.println("Jenis Kelamin Tidak Valid. Silakan masukkan kembali!");
            }
        }

        TP2_1_H071221073
     person1 = new TP2_1_H071221073
    (name, age, isMale);
        System.out.println("==================================");
        System.out.println(person1);
        scanner.close();
    }
}