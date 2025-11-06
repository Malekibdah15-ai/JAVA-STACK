public abstract class Art{
    private String title;
    private String author;
    private String description;


    public Art(String title, String author,  String description){
        this.title = title;
        this.author = author;
        this.description = description; 
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
     public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }
     public void setDescription(String description){
        this.description = description;
    }

    public String getDsecription(){
        return description;
    }
    public abstract void viewArt();
}