package modul2;

public class Tugas1 {
    public double penumpang;
    public double maxPenumpang;
    public double counter;
    public double penumpangBaru;
    public double average;
    public double password;
    public double cetakpenumpang;

    public double getPenumpang() {
        return penumpang;
    }

    public double getMaxPenumpang() {
        return maxPenumpang;
    }

    public double getCounter() {
        return counter;
    }

    public double getPenumpanBaru() {
        return penumpangBaru;
    }

    public double getAverage() {
        return average;
    }

    public double getPassword() {
        return password;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public void setMaxPenumpang(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public void setCounter(double counter) {
        this.counter = counter;
    }

    public void setPenumpangBaru(double penumpangBaru) {
        this.penumpangBaru = penumpangBaru;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setPassword(double password) {
        this.password = password;
    }
    
    
    public Tugas1(double maxPenumpang) {
     this.maxPenumpang = maxPenumpang;
        penumpang = 0;
}
     public void addpenumpang(double penumpang) {
          double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;}
    }
     
     public void getpenumpang(int password) {
    if (password == 23) {
        System.out.println("Password Benar");
    }else {
        System.out.println("Password Salah");
    }
     }
     public void cetakpenumpang() {
    System.out.println("Penumpang bus: " + penumpang);
    System.out.println("Penumpang bus sekarang: " + penumpangBaru);
    System.out.println("Maksimum penumpang yang seharusnya: " + maxPenumpang);
}
}

      
