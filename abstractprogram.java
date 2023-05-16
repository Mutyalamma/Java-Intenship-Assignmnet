abstract class plane {
    public abstract void takeoff();
    public abstract void fly();
}
class cargoplane extends plane {
    public void takeoff() {
        System.out.println("The cargo plane is taking off");
    }
    public void fly()
    {
        System.out.println("The cargo plane is flying");
    }
}
public class abstractprogram {
    public static void main(String[] args) {
        cargoplane cp = new cargoplane();
        cp.takeoff();
        cp.fly();
    }
}
