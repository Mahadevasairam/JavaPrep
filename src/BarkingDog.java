public class BarkingDog {
    public static void main(String[] args) {
        boolean response = shouldWakeUP(false, 2);
        System.out.println(response);
    }

    public static boolean shouldWakeUP(boolean barking, int hourOfDay) {
        if (hourOfDay >= 1 && hourOfDay <= 23) {
            if ((barking == true) && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

