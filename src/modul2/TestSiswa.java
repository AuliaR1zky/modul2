package modul2;

public class TestSiswa {

    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Kiky");
        siswa.setAge(10);
        siswa.getAddress("Malang");

        System.out.print("Name: " + siswa.getName() + "Absen: " + siswa.getAbsen() + "Address: " + siswa.getAddress());

    }
}
