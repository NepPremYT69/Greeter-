import java.util.Scanner;
import java.time.LocalTime;

public class Greeter {
    public static void main(String[] args) {
        String name;
        System.out.print("Pls enter your name\t");
        Scanner inp = new Scanner(System.in);
        name = inp.nextLine();
        //to get local time
        LocalTime time = LocalTime.now();
        //get greeting acc to time
        String greeting = getGreeting(time);
        //print the greeting
        System.out.printf("%s %s! Have a Great Time :) ", greeting, name);


    }

    private static String getGreeting(LocalTime time) {
        int hour = time.getHour();
        if (hour < 12) {
            return "Good Morning";
        } else if (hour < 17) {
            return "Good Afternoon";
        }
        else {return "Good Evening";
        }

    }
}
