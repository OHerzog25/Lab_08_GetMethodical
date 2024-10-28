import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        Scanner in = new Scanner(System.in);

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch (month) {
            case 1, 3, 5, 6, 7, 9, 10, 12:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
                break;

            case 4, 8, 11:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
                break;

            case 2:
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
                break;
        }
        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 0, 59);

        System.out.println("Your were born on " + month + "/" + day + "/" + year + " at" + hour + ":" + minute);

    }
}
