import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int maxCount = 0;
    int numMode = 0;

    final ArrayList<Integer> numArray = new ArrayList<>();

    for (int i = 0; numArray; i++) 
    {
      System.out.println("Enter an integer: ");
      int num = in.nextInt();

      numArray.add(num);
    }

    for (int j: numArray)
    {
      int currentCount = 0;

      for (int k: numArray)
      {
        if (j == k)
        {
          currentCount++;
        }
      }

      if (currentCount > maxCount)
      {
        maxCount = currentCount;
        numMode = j;
      }
    }
    System.out.println(numMode);
  }
}
