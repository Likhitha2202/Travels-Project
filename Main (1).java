package travelsproject;
import Database.UserDataBase;


import java.util.*;


public class Main {
    private static final UserDataBase userDataBase = new UserDataBase();

    private static final PlanJourney planner = new PlanJourney();

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        boolean terminator = false;
        Menu menu = new Menu();

        while( !terminator ) {

            System.out.println();

            menu.printMenu();


            System.out.println("Please select the number");
            int x = Integer.parseInt(input.nextLine());


            switch (x) {
                case 1 -> UserRegistration.userRegistration(userDataBase,planner,Main.input);
                case 2 -> SignIn.signIn(input, userDataBase,planner);
            }
            System.out.print("press 1 for main menu\npress 2 for exit\n");
            int number = Integer.parseInt(input.nextLine());
            if (number == 2) {
                System.out.println("thank you");
                terminator = true;
            }
        }
    }

}
