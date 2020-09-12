public class LeapYearCalculator {

    public static boolean isLeapYear(int year) {

        while (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                return true;
            }else
            if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("1600 : " + isLeapYear(1600));
        System.out.println("2000 : " + isLeapYear(2000));
        System.out.println("2400 : " + isLeapYear(2400));
        System.out.println("-1600 : " + isLeapYear(-1600));
        System.out.println("1600 : " + isLeapYear(1600));
        System.out.println("2017 : " + isLeapYear(2017));
        System.out.println("2000 : " + isLeapYear(2000));
        System.out.println(isLeapYear(1924));
    }
}
