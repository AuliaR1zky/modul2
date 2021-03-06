package modul2;

public class Latihan2M2 {

    private int penumpang;
    private int maxPenumpang;

    //Konstruktor kelas Bus
    public Latihan2M2(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator untuk menambahkan penumpang

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang: " + penumpang);
        System.out.println("Penumpang maksimum seharusnya: " + maxPenumpang);
    }
}
