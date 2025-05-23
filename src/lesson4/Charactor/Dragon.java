package lesson4.Charactor;

public class Dragon extends Healing implements Attack, Flyable {

@Override
public void attack() {
    System.out.println("Dragon attacks with fire breath!"); 
}
    public void defend() {
        System.out.println("Dragon defends with its scales!"); 
    }

    @Override
    public void fly() {
        System.out.println("Dragon is flying!"); 
    }
    public void land() {
        System.out.println("Dragon has landed!"); 
    }

    @Override
    public void heal() {
        System.out.println("Dragon heals itself with magic!"); 
    }


}