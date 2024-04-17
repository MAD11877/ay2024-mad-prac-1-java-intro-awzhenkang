import java.util.Scanner;
import java.util.numArray;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    ArrayList<Integer> numArray = new ArrayList<>();

    int num;

    while ((num = in.nextInt()) != -1)
    {
      numArray.add(num);
    }

    int maxCount = 0;
    int numMode = 0;

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
    System.out.print(numMode);
  }
}
