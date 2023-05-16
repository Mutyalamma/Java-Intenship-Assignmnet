public class Fibonacciseries {

    public static void main(String[] args) {
        int n=15,firstvalue=0,secondvalue=1;
        System.out.println("Fibonacci Series till " + n);
        for (int i=1;i<=n;++i)
        {
            System.out.print(firstvalue + ", ");
            int nextvalue = firstvalue+secondvalue;
            firstvalue = secondvalue;
            secondvalue = nextvalue;
        }

    }
}