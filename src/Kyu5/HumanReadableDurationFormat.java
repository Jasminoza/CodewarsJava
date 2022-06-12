package Kyu5;

import java.util.ArrayList;

public class HumanReadableDurationFormat {
    public static void main(String[] args) {
        int seconds = 1;
        System.out.println(formatDuration(seconds).equals("1 second"));
        seconds = 62;
        System.out.println(formatDuration(seconds).equals("1 minute and 2 seconds"));
        seconds = 120;
        System.out.println(formatDuration(seconds).equals("2 minutes"));
        seconds = 3600;
        System.out.println(formatDuration(seconds).equals("1 hour"));
        seconds = 3662;
        System.out.println(formatDuration(seconds).equals("1 hour, 1 minute and 2 seconds"));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        ArrayList<String> arr = new ArrayList<>();

        int total = seconds;

        int years = total / 31536000;
        if (years == 1) {
            arr.add("1 year");
            total -= 31536000;
        }
        if (years > 1) {
            arr.add(years + " years");
            total -= 31536000 * years;
        }

        int days = total / 86400;
        if (days == 1) {
            arr.add("1 day");
            total -= 86400;
        }
        if (days > 1) {
            arr.add(days + " days");
            total -= 86400 * days;
        }

        int hours = total / 3600;
        if (hours > 0) {
            if (hours == 1) {
                arr.add("1 hour");
                total -= 3600;
            }
            if (hours > 1) {
                arr.add(hours + " hours");
                total -= 3600 * hours;
            }
        }

        int minutes = total / 60;
        if (minutes > 0) {
            if (minutes == 1) {
                arr.add("1 minute");
                total -= 60;
            }
            if (minutes > 1) {
                arr.add(minutes + " minutes");
                total -= 60 * minutes;
            }
        }

        int secs = total;
        if (secs > 0) {
            if (secs == 1) {
                arr.add("1 second");
            }
            if (secs > 1) {
                arr.add(secs + " seconds");
            }
        }

        StringBuilder sb = new StringBuilder();

        if (arr.size() > 1) {
            for (int i = 0; i < arr.size() - 1; i++) {
                sb.append(arr.get(i));
                sb.append(", ");
            }
            sb.append(arr.get(arr.size() - 1));
        } else {
            sb.append(arr.get(0));
        }

        if (sb.indexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(","), " and");
            sb.deleteCharAt(sb.lastIndexOf(","));
        }

        System.out.println(sb.toString());

        return sb.toString();
    }
}
