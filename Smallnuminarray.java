import java.util.Arrays;

public class Smallnuminarray {
    public static int Smallest(int[] a, int i)
    {
        Arrays.sort(a);
        return a[0];
    }
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 7, 9, 4};

        System.out.println("Smallest: " + Smallest(a, 6));
    }
}