import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in



    public static int numQuarters(double money) {
        int quarter=0;
        while(money>=0.25)
        {
            money-=0.25;
            quarter++;
        }
        return quarter;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money, int quarters) {
        int dime=0;
        money-= quarters*0.25;
        while(money>=0.10)
        {
            money-=0.10;
            dime++;
        }
        return dime;
    }

    // Takes a double money as input and returns the number of nickels that we
    // can return in change
    // You should use a while loop!
    public static int numNickels(double money, int quarters, int dimes) {
        int nickel=0;
        money-= quarters*0.25;
        money-= dimes*0.10;
        while(money>=0.05)
        {
            money-=0.05;
            nickel++;
        }
        return nickel;
    }

    // Takes a double money as input and returns the number of pennies that we
    // can return in change
    // You should use a while loop!
    public static int numPennies(double money, int quarters, int dimes, int nickels) {
        int penny=0;
        money-= quarters*0.25;
        money-= dimes*0.10;
        money-= nickels*0.05;
        while(money>=0.009)
        {
            money-=0.01;
            penny++;
        }
        return penny;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0.0 and 1000000.0");
        double d = scan.nextDouble();
        int quarters = numQuarters(d);
        int dimes = numDimes(d, quarters);
        int nickels = numNickels(d, quarters, dimes);
        int pennies = numPennies(d, quarters, dimes, nickels);

        System.out.println("You need " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies. You need " + (quarters+dimes+nickels+pennies) + " coins.");
        // Some code to test numQuarters
        /*(System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000*/

        // Some code to test numDimes
        /*System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502*/
        scan.close();
    }
}