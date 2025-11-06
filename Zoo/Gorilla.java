public class Gorilla extends Mammol {

    public Gorilla(String name, int energy){
        super(name, energy);

    }
    public Gorilla(){
        super();
    }

    public String throwSomething(){
        setEnergy(getEnergy()-5);
        DecreaseEnregy(5);
        System.out.println(getEnergy());
        return " Gorilla animal " + getName() +  "Gorilla energy is" + getEnergy() + " it throw something ";
    }

    public String eatBanana(){
        setEnergy(getEnergy()+10);
        String text =  " Gorilla animal " + getName() +  "Gorilla energy is" + getEnergy();
        if (getEnergy() == 100){
            text += "Gorilla is happy";
        }
        return text;
    }

    public String climp(){
        setEnergy(getEnergy()-10);
        System.out.println(getEnergy());
        return " Gorilla animal " + getName() +  "Gorilla energy is" + getEnergy() + " it climp a tree ";
    }

}
