package modul2;

public class UjiBus3 {

    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahann penumpang
        Bus.addpenumpang(2);
        //Tambah 2 penumpang
        Bus.cetakpenumpang();

        Bus.addpenumpang(1);
        Bus.cetakpenumpang();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();

        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
    }
}
