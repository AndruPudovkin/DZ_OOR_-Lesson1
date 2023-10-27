public class Main {
    
    public static void main(String[] args) {
        HotTea t1 = new HotTea(1,2,3);
        HotTea t2 = new HotTea(4,5,6);
        HotTea t3 = new HotTea(7,8,9);
        HotTea t4 = new HotTea(10,11,12);
        HotTea t5 = new HotTea(13,14,15);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(new ArrayList<>());
        vendingMachine.addHotTea(t1);
        vendingMachine.addHotTea(t2);
        vendingMachine.addHotTea(t3);
        vendingMachine.addHotTea(t4);
        vendingMachine.addHotTea(t5);

        System.out.println(vendingMachine.getProduct(1,2,3));
        System.out.println(vendingMachine.getProduct(1,1,1));

    }
}
