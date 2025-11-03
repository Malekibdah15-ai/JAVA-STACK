public class Bat extends Mammol {

    public Bat(String name, int energy){
        super(name, energy);

    }

    public String fly(){ 
        if(getEnergy() < 50){
            return " bat  " + getName() +  " the bat is tired";
        }
        setEnergy(getEnergy() - 50);
        String message = " bat animal " + getName() +  "bat energy is" + getEnergy() + " it fly ";
        return message;
    }

    public String eatHuman(){
        if(getEnergy() == 100){
            return " its too weak";
        }
        setEnergy(getEnergy() + 25);
        String message =  " bat animal " + getName() +  "bat energy is" + getEnergy() + " the bat is good now ";
        return message;
    }
    public String attackTown(){
        if(getEnergy() == 100){
            return " bat" + getName() + " the bat is too weak to attack";
        }
        setEnergy(getEnergy() - 100);
        String message = " bat name " + getName() +  "animal energy is" + getEnergy() + " it attacked a town";
        return message;
    }
}
