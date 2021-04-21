import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Double num1, num2, num3, num4, num5;

    Scanner in = new Scanner(System.in);
//     System.out.println("Enter the first number:");
    num1 = in.nextDouble();
//     System.out.println("Enter the seond number:");
    num2 = in.nextDouble();
//     System.out.println("Enter the third number:");
    num3 = in.nextDouble();
//     System.out.println("Enter the fourth number:");
    num4 = in.nextDouble();
//     System.out.println("Enter the fifth number:");
    num5 = in.nextDouble();
    in.close();

    double[] num = new double[5]; // array named num is declared with 5 variables
    num[0] = num1;
    num[1] = num2;
    num[2] = num3;
    num[3] = num4;
    num[4] = num5;

    double[] data = {num1, num2, num3, num4, num5};
    int mode = 0;
    int[] index = new int[999];
    int maximum = Integer.MIN_VALUE;

    for (int i = 0; i < data.length; i++){
        index[(int) data[i]]++;
    }
    for (int i = 0; i < index.length; i++){
        if(maximum < index[i]){
            maximum = index[i];
            mode = i;
        }
    }

    System.out.println(mode);
    
  }
}
