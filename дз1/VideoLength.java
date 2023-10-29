public class VideoLength {
    public static void main(String[] args) {
        System.out.println(getVideoLengthInSeconds("12:44")); // 764
        System.out.println(getVideoLengthInSeconds("01:00")); // 60
        System.out.println(getVideoLengthInSeconds("10:60")); // -1
        System.out.println(getVideoLengthInSeconds("999:59")); // 59939
    }

    public static int getVideoLengthInSeconds(String videoLength) {
        String[] parts = videoLength.split(":");
        if (parts.length != 2) {
            return -1;
        }

        int minutes;
        int seconds;
        try {
            minutes = Integer.parseInt(parts[0]);
            seconds = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (seconds >= 60) {
            return -1;
        }

        return minutes * 60 + seconds;
    }
}