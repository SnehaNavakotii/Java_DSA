
import java.util.*;
//hi hello
class ComputeElectricityBill {

    // Function to calculate the
    // electricity bill
    public static int calculateBill(int units)
    {

        // Condition to find the charges
        // bar in which the units consumed
        // is fall
        if (units <= 100) {
            return units * 10;
        }
        else if (units <= 200) {
            return (100 * 10)
                + (units - 100)
                      * 15;
        }
        else if (units <= 300) {
            return (100 * 10)
                + (100 * 15)
                + (units - 200)
                      * 20;
        }
        else if (units > 300) {
            return (100 * 10)
                + (100 * 15)
                + (100 * 20)
                + (units - 300)
                      * 25;
        }
        return 0;
    }

    // Driver Code
    public static void main(String args[])
    {
        int units = 250;

        System.out.println(
            calculateBill(units));
    }
}