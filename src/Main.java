import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a measurement in meters:");

        if(in.hasNextDouble()){
            double meters = in.nextDouble();

            double miles = meters / 1689.34;
            double feet = meters / .3048;
            double inches = meters / .0254;

            System.out.println("Measurement in miles: " +miles);
            System.out.println("Measurement in feet: " + feet);
            System.out.println("Measurement in inches: " +inches);
        }
        else
        {
            System.out.println("Invalid input for the measurement in meters.");
        }
        in.close();
    }
}