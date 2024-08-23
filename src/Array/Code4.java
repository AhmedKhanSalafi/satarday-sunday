package Array;

public class Code4 {

    public static void main(String[] args) {
//find sum of first and last element is 10
        int ar[] = {44, 77, 99, 33, 22, 5};

        int first = ar[0];
        int last=ar[ar.length-1];

        if (first+last==10){
            System.out.println("sum of first and last element is 10");
        }else {
            System.out.println("sum of first and last element is not 10");
        }
    }
}