interface ram
{
    void multiply();
    void division();
}
public class interfacepra implements ram
{
    int a=78;
    int b=43;
    int c;
    public void multiply() {
        c=a*b;
        System.out.println("multiplication of two numbers is" + c);
    }
    public void division() {
        c=a/b;
        System.out.println("division of two numbers is" + c);
    }

    public static void main(String[] args) {
        interfacepra object=new interfacepra();
        object.multiply();
        object.division();
    }
}
