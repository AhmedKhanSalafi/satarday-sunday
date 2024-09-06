package mock;

public class Duplicate {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

        int j;

       //
       // int [] arr ={55,44,55};

        int [] arr =new int[3];

        arr= new int[]{55, 44, 55};



       // int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        for(int i =0; i<=arr.length;i++){


            for( j =i+1; j<=arr.length;j++){

              if(arr[i]==arr[j]){

                  System.out.println("duplicate arr"+" "+arr[j]);
              }

    }


        }

     //   int[] numbers; // Declaring an integer array

     //   numbers = new int[5]; // Creating an array of 5 integers



    }



}
