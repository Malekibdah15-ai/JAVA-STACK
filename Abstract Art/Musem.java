import java.util.ArrayList;
public class Musem {
    public static void main(String[] args){
        Paint paint = new Paint("The Persistence of Memory", "Salvador Dalí", "Melting clocks in a desert landscape.", "Oil");
        Paint paint2 = new Paint("Starry Night", "Vincent van Gogh", "A dreamy depiction of a night sky.", "Oil");


        Sculpture s1 = new Sculpture("David", "Michelangelo", "A marble statue representing the Biblical hero.", "Marble");
        Sculpture s2 = new Sculpture("The Thinker", "Auguste Rodin", "A bronze sculpture of a man in deep thought.", "Bronze");
    

    ArrayList<Art> musem = new ArrayList<Art>();
    
    musem.add(paint);
    musem.add(paint2);
    musem.add(s1);
    musem.add(s2);
 
    for(Art art: musem){
        art.viewArt();
    }
}
    
}
