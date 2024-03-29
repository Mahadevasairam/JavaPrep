package Basics;

public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        String duration = getDurationString(75,30);
        String duration1 = getDurationString(6023);
        System.out.println(duration);
        System.out.println(duration1);
    }
    public static String getDurationString(int minutes,int seconds){
        if( minutes<0 || seconds < 0 || seconds > 59 ) {
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours +"h"+remainingMinutes+"m"+seconds+"s";
    }

    public static String getDurationString(int seconds){
        if(  seconds < 0  ) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes,remainingSeconds);
    }
}
