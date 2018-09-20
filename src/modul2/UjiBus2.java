package modul2;

public class UjiBus2 {

    public static void main(String[] args) {

        Latihan2M2 busBesar = new Latihan2M2(40);
        busBesar.cetak();

        busBesar.addPenumpang(15);
        busBesar.cetak();

        busBesar.addPenumpang(5);
        busBesar.cetak();

        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
