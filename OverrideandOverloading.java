class parent {
    public void add(int x, int y)
    {
        System.out.println(x+y);
    }
    public void sub(int x,int y)
    {
        System.out.println(x-y);
    }
    public void add(int x, int y,int z)
    {
        System.out.println(x+y+z);
    }
}
class child extends parent{
    @Override
public void add(int x,int y){
        System.out.println(x+y);
    }
}
public class OverrideandOverloading {
    public static void main(String[] args) {
        parent p =new parent();
        p.add(34,45);
        p.sub(56,17);
        p.add(34,56,2);
        child c= new child();
        c.add(677,877);
        c.sub(87,23);
        c.add(22,4,9);

    }
}