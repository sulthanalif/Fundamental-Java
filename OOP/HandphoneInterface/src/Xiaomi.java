import interfaces.Phone;

public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone saya menyala.....");
        System.out.println("Selamat data di Xiaomi");
        System.out.println("Android Version 10");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Matikan Handphone");
    }
    
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume sudah maksimal!!!");
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang " + this.volume + "%");
            }
        } else {
            System.out.println("Handphone mati, silahkan nyalakan terlebih dahulu!!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume sudah minimal!!!");
                System.out.println("Volume = " + this.volume + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang " + this.volume + "%");
            }
        } else {
            System.out.println("Handphone mati, silahkan nyalakan terlebih dahulu!!!");
        }
    }

    //getter setter
    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
}