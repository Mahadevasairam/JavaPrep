import java.util.Scanner;

public class NumberofDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("enter the year: ");
        int year = sc.nextInt();
        printNumberOfDays(month,year);

    }
    public static boolean isLeapYear( int year){
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 != 0)){
            return true;
        }
        else return false;
    }
    public static void printNumberOfDays(int month,int year){
        if(month<1 || month >12){
            System.out.println("INVALID MONTH");
        }
        if(year < 0 || year > 9999){
            System.out.println("invalid Year");
        }
        switch(month){
            case 1:
                System.out.println("January "+year+" has 31 days");
                break;
            case 2:
                System.out.println("February "+year+" has"+((isLeapYear(year)) ? " 29 days.": " 28 days"));
                break;
            case 3:
                System.out.println("March "+year+" has 31 days");
                break;
            case 4:
                System.out.println("April "+year+" has 30 days");
                break;
            case 5:
                System.out.println("May "+year+" has 31 days");
                break;
            case 6:
                System.out.println("June "+year+" has 30 days");
                break;
            case 7:
                System.out.println("July "+year+" has 31 days");
                break;
            case 8:
                System.out.println("August "+year+" has 31 days");
                break;
            case 9:
                System.out.println("september "+year+" has 30 days");
                break;
            case 10:
                System.out.println("October "+year+" has 31 days");
                break;
            case 11:
                System.out.println("November "+year+" has 30 days");
                break;
            case 12:
                System.out.println("December "+year+" has 31 days");
                break;
        }
    }

}
