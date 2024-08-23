package recursion;

public class Code1 {

    public static void main(String[] args) {

        //display 1 to 10 using recursion
Code1.print(1);

    }

    static void print(int n){
        System.out.println(n);
        if(n<10){
          print(n+1);
        }
    }
}