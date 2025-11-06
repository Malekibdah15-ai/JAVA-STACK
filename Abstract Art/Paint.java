public class Paint extends Art {
    private String paintType;
    

    public Paint(String title, String author,  String description, String paintType ){
        super(title, author, description);
        this.paintType = paintType;
        
    }
    public void setPaintType(String paintType){
        this.paintType = paintType;
    }
    public String getPaintType(){
        return paintType;
    }

    public void viewArt(){
        System.out.println("art title " + getTitle());
        System.out.println("art author " + getAuthor());
        System.out.println("art description " + getDsecription());
        System.out.println("art type " + getPaintType());
    }

}
