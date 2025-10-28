public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double latte = 4.5;
        double  coffe= 2.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Ahmad";
        String customer2 = "Sali";
        String customer3 = "Adam";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2= false;
        boolean isReadyOrder3 = true;
        
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
        // ** Your customer interaction print statements will go here ** //
        if(isReadyOrder2){
            System.out.println(customer2 + " " + readyMessage + " " + displayTotalMessage + latte);
        }
        else{
            System.out.print(customer2+ " " + pendingMessage );
        }
        if(isReadyOrder1){
            System.out.println(customer1 + " " + readyMessage + displayTotalMessage + coffe);
        }
        else{
            System.out.println(customer1 + " " + pendingMessage);

        }
        System.out.println(customer2 + " " + displayTotalMessage + (latte + latte));
        if(isReadyOrder2){
            System.out.println(customer2 + " " + readyMessage);
        }
        else{
            System.out.println(customer2 + " " + pendingMessage);
        }
        System.out.println(customer3 + " " + displayTotalMessage +(latte - coffe));

    }
}