import java.util.Scanner;
import java.util.ArrayList;

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
     
    Scanner in = new Scanner(System.in);
    int maxCount = 0;
    int numMode = 0;

    const numArray = []

    for (int i = 0; i < numArray; i++) 
    {
      System.out.println("Enter an integer: ");
      int num = in.nextInt();

      numArray.Add(num);
    }

    for (int j: numArray)
    {
      int count = 0;

      for (int k: numArray)
      {
        if (j == k)
        {
          count++;
        }
      }

      if (count > maxCount)
      {
        maxCount = count;
        numMode = j;
      }
    }
    System.out.println(numMode);
  }
}
