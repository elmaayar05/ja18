/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }

    /** Check if year is leap by analyzing if year is either:
    * 1- divisible by 400
    * 2- divisible by 4 and not 100
    * if year is leap return boolean true
    * if year is not leap return boolean false
    * @param year to be analyzed
    */
    public static boolean isLeapYear(int year) {
        // checking if the year is divisible by 400
        if (year % 400 == 0) {
            return true;
        // checking if the year is divisible by 4 and not divisible by 100
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }
}

