package Array;

public class Code2 {

    public static void main(String[] args) {

        int ar []={44,77,99,33,22,5};
        int n = ar.length;
        int last=ar[n-1];
        int first = ar[0];

        System.out.println("fisrt and list array:"+" "+first+" "+last);

        //display array element

//        for(int i=0;i<=ar.length-1;i++){
//
//           // System.out.println(ar[i]);
//        }

        //for each loop

        for(int e:ar){
            System.out.println(e);
        }
    }
    }

