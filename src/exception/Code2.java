package exception;

public class Code2 {

    public static void main(String[] args) {

        String s=null;
        System.out.println(s.length());//NullPointerException

        int i;
        String s1="abc";
        System.out.println( i=Integer.parseInt(s1));//NumberFormatException  );
      //  int i=Integer.parseInt(s);//NumberFormatException
    }
}
