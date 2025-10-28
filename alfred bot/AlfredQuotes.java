import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return String.format("it is curruntly %s.", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        

        if(conversation.indexOf("Alexis") >= 0){
            return("right away sir, she certanialy isn sophistcated enough for that");
        }
        if(conversation.indexOf("Alfred") >= 0){
            return ("at your serviese, as you wish naturaly");
        }
        else{
            return ("right and with that i sall retire");
        }
        
    }
    
}