import java.util.*;
public class Cyclone {
    public static Scanner gConsole = new Scanner(System.in);
    public static int gMAX_CYCLONES = 50;
    public static int gDatabaseSize;
    public static double[] gWindSpeed;


    public static void addUpdCyclone() {
        System.out.println("ADDUPDCYCLONE");
    }

    public static void Summary() {
        System.out.println("SUMMARY");

    }


    public static void clearDB() {
        System.out.println("CLEARDB");

    }

    public static void showCyclones() {
        System.out.println("SHOWCYCLONE");

    }


    public static void swapCyclones() {
        System.out.println("SWAPCYCLONES");
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

            switch(userChoice) {
                case 0:
                    break;
                case 1:
                    addUpdCyclone();
                    break;
                case 2:
                    Summary();
                    break;
                case 3:
                    clearDB();
                    break;
                case 4:
                    showCyclones();
                    break;
                case 5:
                    swapCyclones();
                    break;
                default:
                    System.out.println("Invalid value, please, try again.\n");
            }
            if (userChoice == 0) {break;}



        }





    }
}
