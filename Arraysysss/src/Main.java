import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main ( String[] args )
    {

        Random rand = new Random(); // creating Random object
        int[] arr = new int[20]; //creating a new array with 20 values
        int number_of_ones = 0; // declaring integer for counting the number of ones

        for (int i = 0; i < arr.length; i++) {
            int n = rand.nextInt(7); // random number between 1-6
            arr[i] = n; // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
            if(n == 1){
                number_of_ones += 1; // making the variable from number ones larger every time a one is randomly created
            }
        }
        System.out.println("number of ones in array 1 is: " + number_of_ones);




        Random rand2 = new Random(); // creating Random object
        int[] arr2 = new int[10];

        int average = 0;


        for (int i = 0; i < arr2.length; i++) {
            int n2 = rand2.nextInt(101);
            arr2[i] = n2; // storing random integers in an array
            System.out.println(arr2[i]); // printing each array element

            average += n2;
        }
        System.out.println("the average of array 2 is " + (average/arr2.length));


        System.out.println("\nswapping 2 random index positions of array 2");

        Random rand3 = new Random(); // creating Random object
        int n3 = rand3.nextInt(10); // picking a random index in the array

        Random rand4 = new Random(); // creating Random object
        int n4 = rand4.nextInt(10); // picking a random index in the array

        int last_value = arr2[n3]; // making a temporary value for the first swapped value, so it is kept the same after swapping
        arr2[n3] = arr2[n4];
        arr2[n4] = last_value;

        System.out.println("array 2 with 2 random values swapped:\n "+Arrays.toString(arr2));

        System.out.println("array 2 backwards: \n");
        for (int i = arr2.length-1; i >= 0; i--) { //looping through the array in descending order
            System.out.print(arr2[i]+", ");
        }


    }


}
