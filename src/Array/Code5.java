package Array;

public class Code5 {

    public static void main(String[] args) {

        //if lenth is odd print middle element
        //if lenth is even print avg of middle 2 element

        int[]ar={6,2,8,9,1,6,7,5};
        int n= ar.length;

        if (n%2!=0){

            System.out.println(" middle element"+(ar[n/2]));
        }else {
            int x= ar[n/2-1];
            int y= ar[n/2];

            System.out.println("avg of middle 2 element"+((x+y)/2));
        }
    }
}
