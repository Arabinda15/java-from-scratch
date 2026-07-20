public class LogicalOrOperator {

    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("You can relax.");
        } else {
            System.out.println("Go to work.");
        }
    }
}