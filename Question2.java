import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        double height = in.nextDouble() / 100;

        double weight = in.nextDouble() / 100;

        double BMI = Math.round(weight / (height * height),2);
        
        System.out.println(BMI);  
    }
}
