public class Constructors {
    private int x,y,z;
    public Constructors()
    {
        z=67+89;
        z=674-567;
    }
    public void add()
    {
        System.out.println("The addition is" + z);
    }
    public void sub()
    {
        System.out.println("The substraction is" + z);
    }
}
class Mainconstructor {
    public static void main(String[] args) {
        Constructors object = new Constructors();
        object.add();
        object.sub();
    }
}
