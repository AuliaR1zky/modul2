package modul2;

/**
 *
 * @author Kiki Aulia
 */
public class UjiBus {

    public static void main(String[] args) {
        //membuat objek bernama BusKecil
        Modul2 busKecil = new Modul2();
        //Memasukkan nilai jumlah penupang dan maksimal penumpang ke dalam objek busKecil
        busKecil.penumpang = 5;
        busKecil.maxPenumpang = 15;
        //Memanggil metod cetak pada class Bus
        busKecil.cetak();

        //Menambahkan penumpang pada busKecil
        busKecil.penumpang = busKecil.penumpang + 5;
        //Memanggil metod cetak pada class Bus
        busKecil.cetak();

        //mengurangi jumlah penumpang pada busKecil
        busKecil.penumpang = busKecil.penumpang - 2;
        busKecil.cetak();

        //Menambah lagi jumlah penumpang
        busKecil.penumpang = busKecil.penumpang + 8;
        busKecil.cetak();

    }
}
