import java.util.Scanner;

public class IT24102314Lab5Q3 {
    
     static int ROOM_CHARGE_PER_DAY = 48000;
     static int MIN_DAYS_FOR_DISCOUNT = 3;
     static int DISCOUNT_10 = 10;
     static int DISCOUNT_20 = 20;

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; 
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than end date.");
            return; 
        }
        int numberOfDays = endDate - startDate;
    
        System.out.println("Number of days reserved: " + numberOfDays);
        
        
        double discount = 0;
        if (numberOfDays >= MIN_DAYS_FOR_DISCOUNT && numberOfDays <= 4) {
            discount = DISCOUNT_10;
        } 
        else if (numberOfDays >= 5) {
            discount = DISCOUNT_20;
        }
        
       
        double totalAmount = ROOM_CHARGE_PER_DAY * numberOfDays * (1 - discount / 100.0);
        
        
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}