import java.util.Scanner;
public class one_way_currency_converter {

    public static void main(String[] args) {

        // Declare new Scanner
        Scanner s = new Scanner(System.in);

        // Declare Variable
        float ExRate, Value, ExDone;
        String Currency1, Currency2, forward;

        // Repeating the Process
        boolean Con = true;

        // Get what user wanting
        System.out.print("Enter Currency Name 1 : ");
        Currency1 = s.nextLine();
        System.out.print("\nEnter Currency Name 2 : ");
        Currency2 = s.nextLine();
        System.out.printf("\nExchange Rate 1 %s = ? %s : ", Currency1.toUpperCase(),Currency2.toUpperCase());
        ExRate = s.nextFloat();
        
        // will repeat itself upon answering yes both with calculating the exchangement
        do { 
            System.out.printf("\nEnter %s Value : ", Currency1.toUpperCase());
            Value = s.nextInt();
            s.nextLine(); 
            ExDone = Value * ExRate;
            System.out.printf("%.2f %s = %.2f %s\n", Value, Currency1.toUpperCase(), ExDone, Currency2.toUpperCase());
            System.out.println("Continue ? ");
            forward = s.nextLine();
            if (forward.toLowerCase().equals("yes")) {
                Con = true;
            } else { 
                Con = false; 
            }
        } while (Con);

        // Close the Scanner
        s.close();
    }
}