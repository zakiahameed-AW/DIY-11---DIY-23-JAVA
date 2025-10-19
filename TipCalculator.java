import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the bill amount: ");
        double bill = input.nextDouble();

    
        System.out.print("Enter tip percentage (default is 15): ");
        double tipPercent = input.nextDouble();

        double tipAmount = (bill * tipPercent) / 100;

        double total = bill + tipAmount;

        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Total Amount (Bill + Tip): " + total);

        input.close();
    }
}


