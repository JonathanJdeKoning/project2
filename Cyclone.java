import java.util.*;
public class Cyclone {
    public static Scanner gConsole = new Scanner(System.in);
    public static int gMAX_CYCLONES = 50;
    public static int gDatabaseSize;
    public static double[] gWindSpeed;


    public static void addUpdCyclone() {

    }

    public static void Summary() {


    }


    public static void clearDB() {


    }

    public static void showCyclones() {


    }


    public static void swapCyclones() {


    }


    public static void main(String[] args) {
        System.out.println("Fall2023 - UTSA - CS1083 - Section 006 - Project 2 - Cyclone - written by Jonathan de Koning");

        //TODO: Verify that Database size is not over 50
        System.out.print("Please, enter the number of cyclones in the database (Max 50): ");
        gDatabaseSize = gConsole.nextInt();
        while (true){
            System.out.println("MAIN MENU");
            System.out.println("0 - Exit, 1 - Add/Update a cyclone, 2 - Summary, 3 - CLear Database, 4 - Show Cyclones, 5 - Swap Cyclones");

            //TODO: More rigorous Input handling
            System.out.print("Select an option : ");
            int userChoice = gConsole.nextInt();

            if (userChoice < 0 || userChoice > 5) {
                System.out.println("Invalid value, please, try again.\n");
                continue;
            }


        }





    }
}
