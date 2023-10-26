public class Main {
    public static void main(String[] args){
    String secondsOnlyTimeStamp = getDuration(50000);
    }

    public static String getDuration(int seconds){
        if(seconds < 0){
        System.out.println("Invalid seconds input: " + seconds);
        }

        float totalHours = seconds / 3600f;
        int hoursOnly = (int) (totalHours);
        float minsAndSecsOnly = (totalHours - hoursOnly) * 60f;
        int minsOnly = (int) (minsAndSecsOnly);
        int secsOnly =  (int) ((minsAndSecsOnly - minsOnly) * 60f);

        String timestamp = getTimeStamp(hoursOnly, minsOnly, secsOnly);

        System.out.println("seconds only " + timestamp);

        float totalMinsAndSecs =  totalHours * 60f;
        int totalMinsOnly = (int) (totalMinsAndSecs);
        int totalSecsOnly = (int) ((totalMinsAndSecs - totalMinsOnly) * 60);

        getDuration(totalMinsOnly, totalSecsOnly);

        return timestamp;
    }
    public static String getDuration(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            System.out.println("Invalid input: " + minutes + "m " + seconds + "s." );
        }

        float totalHours = minutes / 60f;
        int hoursOnly = (int) (totalHours);
        int minsOnly = (int)((totalHours - hoursOnly) * 60f);

        String timestamp = getTimeStamp(hoursOnly, minsOnly, seconds);

        System.out.println("mins and seconds " + timestamp);

        return timestamp;
    }

    public static String getTimeStamp(int h, int m, int s){
        return h + "h " + m + "m " + s + "s.";
    }
}
