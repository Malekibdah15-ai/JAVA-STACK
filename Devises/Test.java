public class Test{
    public static void main(String[] args){

        // Devise phone = new Devise(100);

        Phone telPhone = new Phone(100);

        System.out.println(telPhone.makeCall() + " " +  telPhone.makeCall() + " " + telPhone.makeCall() + " " + telPhone.playGame() + " " +  telPhone.playGame() + " " + telPhone.charge());

    }
}