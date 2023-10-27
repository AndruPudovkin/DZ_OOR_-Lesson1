package PACKAGE_NAME;public class HotDrink {
  
    private int name;
    private  int volume;

    public HotDrink(int name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
