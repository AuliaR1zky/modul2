package modul2;

/**
 *
 * @author Kiki Aulia
 */
public class CobaBola {
    public static void main(String[] args) {
        double jarijari = 12;
        tugasBola Bola = new tugasBola(13);
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        System.out.println("\n\n");
        Bola.setJarijari(jarijari);

}
}