import java.util.Arrays;
public class secondlargeelementinarray{
    public static int secondlargest(int[] a, int total)
    {
        Arrays.sort(a);
        return a[total-2];
    }
    public static void main(String args[]){
        int a[]={1,2,13,64,35,22};
        System.out.println("Second Largest: "+secondlargest(a,6));
    }}

