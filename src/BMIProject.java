import java.util.Scanner;

public class BMIProject {

    public static void main(String[] args){
        //Declare
        int Inches;
        int Pounds;
        float Meters;
        float Kilograms;
        float Total;


        Scanner keyboard;

        //initializing

        keyboard = new Scanner(System.in);



        System.out.println("What is your height in inches.");
        Inches = keyboard.nextInt();
        Meters = Inches *(0.0254f);
        System.out.println("What is your weight in pounds.");
        Pounds = keyboard.nextInt();
        Kilograms = Pounds *(0.453592f);
        Total = Kilograms/Meters*Meters;
        System.out.println("Your BMI is "+Total+".");









    }
}
