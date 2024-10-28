import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int fav_int = 0;
        double fav_double = 0.0;
        fav_int = SafeInput.getInt(in, "Enter your favorite Int");
        fav_double = SafeInput.getDouble(in, "Enter your favorite Double");
        System.out.println("Your favorite Int is " + fav_int + ", and your favorite Double is " + fav_double);
    }
}
