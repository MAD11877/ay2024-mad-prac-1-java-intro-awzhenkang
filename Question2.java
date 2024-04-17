import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        double height = in.nextDouble() / 100;

        double weight = in.nextDouble() / 100;

        double BMI = weight / ((height / 100) * (height / 100));
        
        System.out.println(BMI);  
    }
}
