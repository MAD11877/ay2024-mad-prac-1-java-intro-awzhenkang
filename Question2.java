import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        double height = in.nextDouble() / 1000;

        double weight = in.nextDouble() / 1000;

        double BMI = weight / (height * height);

         double roundedBMI = Math.round(BMI * 10.0) / 10.0;
        
        System.out.println(roundedBMI);  
    }
}
