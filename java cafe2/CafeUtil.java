import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CafeUtil{


    public  int getStreakGoal(){
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            sum +=i;
        }
        return sum;
    }
    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for(int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu ){
        for (int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
        
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter your name please");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("your name is " + username);
        System.out.println("There are "+ customers.size() + " people in front of you " );
        System.out.printf("There are %d. people in front of you", customers.size() );
    }
}