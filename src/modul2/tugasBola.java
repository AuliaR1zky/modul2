package modul2;

/**
 *
 * @author Kiki Aulia
 */
public class tugasBola {
  public double jarijari;
    
    public tugasBola(double jarijari) {
        this.jarijari = jarijari;
}
   public void setJarijari(double jarijari) {
       this.jarijari = jarijari;
}
   public void showDiameter() {
        System.out.println("Diameter Bola: " + 2 * jarijari);
    }

    public void showLuasPermukaan() {
        System.out.println("L. Permukaan Bola: " + (4 * Math.PI * (jarijari * jarijari)));
    }

    public void showVolume() {
        System.out.println("Volume Bola: " + (4 / 3 * Math.PI * (jarijari * jarijari * jarijari)));
    }
}  

