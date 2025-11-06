public class Mammol{
    private String name;
    private int energy;

    public Mammol(String name, int energy){
        this.name = name;
        this.energy = energy;

    }
    public Mammol(){

    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public void DecreaseEnregy(int value){
        this.energy += value;
    }

    public int getEnergy(){
        return energy;    
    }

    public int displayEnergy(){
        System.out.println(getEnergy());
        return getEnergy();

    }
}