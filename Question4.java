import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your integer of base: ");
    int base = in.nextInt();

    for (int i = base; i > 0; i--)
    {
      for (int k = 0; k < i; k++)
      {
        System.out.println("*");
      }
    }    
  }
}
