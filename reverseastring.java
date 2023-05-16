public class reverseastring {
    public static void main(String[] args) {
       String str="Ram";
       String reversestr="";
       for (int i=0;i<str.length();i++)
       {
           reversestr=str.charAt(i)+reversestr;
       }
        System.out.println(reversestr);
        String uppercasestr = reversestr.toUpperCase();
        System.out.println(uppercasestr);

    }
}
