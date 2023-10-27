package PACKAGE_NAME;public class HotTea {

    int temperature;
    public HotTea(int name, int volume) {
        super(name, volume);
    }

    public HotTea(int name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotTea{" +
                "name = " + super.getName() +
                ";volume = " + super.getVolume() +
                ";temperature = " + temperature +
                '}';
    }
}
