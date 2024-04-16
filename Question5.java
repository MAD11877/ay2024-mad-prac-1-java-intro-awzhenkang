import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int maxCount = 0;
    int numMode = 0;

    const numArray = [];

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
