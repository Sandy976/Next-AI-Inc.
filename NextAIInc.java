public class NextAIInc {

    public static void calculatePay(double basePay, int hoursWorked) {
        final double MINIMUM_PAY = 30000;
        final int MAXIMUM_HOURS = 72;

        if (basePay < MINIMUM_PAY) {
            System.out.println("Error: Base pay must not be below UGX " + MINIMUM_PAY);
            return;
        }

        if (hoursWorked > MAXIMUM_HOURS) {
            System.out.println("Error: Hours worked must not exceed " + MAXIMUM_HOURS + " hours per week.");
            return;
        }

        int regularHours = Math.min(hoursWorked, 48);
        int overtimeHours = Math.max(hoursWorked - 48, 0);

        double totalPay = (regularHours * basePay) + (overtimeHours * basePay * 2);

        System.out.println("Total Pay: UGX " + totalPay);
    }

    public static void main(String[] args) {
        System.out.println("Testing Contractor A:");
        calculatePay(30000, 51); // Contractor A

        System.out.println("\nTesting Contractor B:");
        calculatePay(20000, 40); // Contractor B

        System.out.println("\nTesting Contractor C:");
        calculatePay(35000, 96); // Contractor C
    }
}
