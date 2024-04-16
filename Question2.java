import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        double height = in.nextDouble() / 100;

        double weight = in.nextDouble() / 100;

        double BMI = weight / (height * height);
        
        // Format BMI to 1 decimal place using String.format()
        String formattedBMI = String.format("%.1f", BMI);
        
    }
}
