import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava{


    public int[] getTenRolls(){
        Random rand = new Random();
        int[] rolls = new int[10];
        for(int i = 0; i < 10; i++){
            rolls[i] = rand.nextInt(20) + 1;
        };
        return rolls;
    }
    public char getRandomLetter(){
          

          char[] letters = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        Random rnd = new Random();
        int index = rnd.nextInt(26);
        return letters[index];

        
    }
    
    public String generatePassword(){
        char[] password = new char[8];

        for (int i = 0; i < 8; i++){
            password[i] = getRandomLetter();
        }
        return new String(password);

    }
    public String[] getNewPasswordSet(int length){
        String[] passwordset = new String[length];
        for(int i = 0; i < length; i++){
            char[] word = new char[8];
            for(int j = 0; j < 8; j++){
                word[j] = getRandomLetter();
                passwordset[i] = new String(word);
            };
        };
        return passwordset;
    }

}
