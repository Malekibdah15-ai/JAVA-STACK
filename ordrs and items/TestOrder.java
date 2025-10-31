public class TestOrder{
    public static void main(String[] args){
        Item tea = new Item("tea",  3.2);
        Item mocha = new Item("mocha",  5.2);
        Item coffe = new Item("coffe",  4.2);
        Item nescafe = new Item("nescafe",  2.2);

        Order order1 = new Order("rami");
        order1.addItems(tea);
        order1.addItems(mocha);
        System.out.println(order1.getTotal());

        Order order2 = new Order("jimmy");
        order2.addItems(mocha);
        order2.addItems(coffe);
        System.out.println(order2.getTotal());

        Order order3 = new Order("samoul");
        order3.addItems(coffe);
        System.out.println(order3.getTotal());

        Order order4 = new Order("malek");
        order4.addItems(nescafe);
        System.out.println(order4.getTotal());
    }
}