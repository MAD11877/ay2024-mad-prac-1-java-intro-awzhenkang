import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in); 

    System.out.println("Enter your height (in m): ");
    int height = in.nextDouble();

    System.out.println("Enter your weight (in kg): ");
    int weight = in.nextDouble();

    double BMI = weight / (height * height);
    System.out.println("Your BMI is " + BMI); 
  }
}
