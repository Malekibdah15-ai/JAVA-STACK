import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        
        PuzzleJava generator = new PuzzleJava();
        int[] randomRolls = generator.getTenRolls();
        for(int rolls : randomRolls){
            System.out.println(rolls);
            
        }
        ;
        
                //..
        // Write your other test cases here.
        //..
        char randomLetters = generator.getRandomLetter();
        System.out.println(randomLetters);

      

       String password = generator.generatePassword();
       System.out.println(password);

       String newpwd = generator.getNewPasswordSet();
       System.out.println(newpwd);
    }
}
          
          
