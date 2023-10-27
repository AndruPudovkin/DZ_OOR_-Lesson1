package PACKAGE_NAME;public class HotDrinksVendingMachine {
  
    List<HotTea> hotTeas;
    public  HotDrinksVendingMachine(List<HotTea> HotDrink){
        this.hotTeas = HotDrink;
    }

    public List<HotTea> getHotTeas() {
        return hotTeas;
    }

    public void setHotTeas(List<HotTea> hotTeas) {
        this.hotTeas = hotTeas;
    }

    @Override
    public HotDrink getProduct(int name, int volume, int temperature) {
        for (HotTea item: hotTeas){
            if(item.getName()==name && item.getVolume()==volume && item.getTemperature()==temperature){
                return item;
            }
        }
        return null;
    }
    public void addHotTea (HotTea hotTea){
        this.hotTeas.add(hotTea);
    }
}
