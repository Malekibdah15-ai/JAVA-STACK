import java.util.ArrayList;
public class Order{
    private String name; 
    private boolean ready; 
    public double total;
    private ArrayList<Item> items; 

    public Order(){
        this.name = "guest";
        this.items = new ArrayList<Item>();
    }
        
    public Order(String name ){

        this.name = name;
        this.items = new ArrayList<Item>();
        
    }

    public String getOrderName(){
        return name;
    }
    public void setOrderName(String name){
        this.name = name;
    }
    public boolean isReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    //////////////////////
    public void addItem(Item item){
        this.items.add(item);
        this.total += item.getPrice();
    }
    
    public String getStatusMessage(){
        if(this.ready==true){
            return"your order is ready";
        }else{
            return"Thank you for waiting. Your order will be ready soon";
        }
    }
    public double getOrderTotal(){
        return this.total;
    }
     
    public void display(){
        System.out.println("custmer name " + getOrderName());
        for(Item item : this.items){
            System.out.println( item.getName() + " "+ item.getPrice());
        }
        System.out.println("Total " + this.getOrderTotal());
        
    }

        

}
