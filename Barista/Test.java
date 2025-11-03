public class Test{

    public static void main(String[] args) {
        Item coffe = new Item("coffe", 3.4);
        Item Nescafe = new Item("Nascafe", 2.4);
        Item latte = new Item("latte", 4.4);
        Item mocha = new Item("mocha", 2.0);

        coffe.setName("coffe");
        coffe.setPrice(3.4);

        Nescafe.setName("Nescafe");
        Nescafe.setPrice(2.4);

        System.out.println(" name " + coffe.getName() + " price "  + coffe.getPrice());
        System.out.println(" name " + Nescafe.getName() + " price "  + Nescafe.getPrice());

        Order Malek = new Order("malek");
        Order tareq = new Order();
        Order kamel = new Order();

        
        Malek.addItem(coffe);
        Malek.addItem(Nescafe);

        tareq.addItem(latte);

        

        System.out.println("Malek order");
        Malek.display();
        System.out.println(Malek.getStatusMessage());
        System.out.println(Malek.getOrderTotal());
////////////////////////////////////////////////////////
        System.out.println("tareq order");
        tareq.display();
        System.out.println(tareq.getStatusMessage());
        


    }
}