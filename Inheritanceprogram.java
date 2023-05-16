class Animal
{
    public void eat()
{
    System.out.println("Animal is eating");
}
}
class dog extends Animal{
    public void bark()
    {
        System.out.println("The dog is barking");
    }
}
class cat extends dog
{
    public void sleep()
    {
        System.out.println("The cat is sleeping ");
    }
}
public class Inheritanceprogram {
    public static void main(String[] args) {
        cat cat= new cat();
        cat.eat();
        cat.bark();
        cat.sleep();
    }

}
