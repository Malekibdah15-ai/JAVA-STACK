public class Sculpture extends Art {
    private String material;

    public Sculpture(String title, String author,  String description, String material){
        super(title, author, description);
        this.material = material;
        
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getMatreial(){
        return material;
    }
    public void viewArt(){
        System.out.println("art title " + getTitle());
        System.out.println("art author " + getAuthor());
        System.out.println("art description " + getDsecription());
        System.out.println("art material " + getMatreial());
    }
    
}
