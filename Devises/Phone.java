public class Phone extends Devise{


    public Phone(int battery){
        super(battery);
    }

    public String makeCall(){
        setBattery(getBattery() - 5);
        String bat = "battery remaining " + getBattery();
        return bat;

    }
        

    public String playGame(){
        setBattery(getBattery() - 20);
        String bat = "battery remaining " + getBattery();
        return bat;

    }
    

    public String charge(){
        setBattery(getBattery() + 50);
        String bat = "you charged you phone battery is " + getBattery();
        return bat;
        
    }

 }
