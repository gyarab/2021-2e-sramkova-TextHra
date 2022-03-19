
import java.util.Scanner;

public class Hra {

    int maxHP; //def 5
    int health; //def 5
    int damage; //def 1
    String currentWeapon; //def Fists
    String playerName;
    int choice;

    Scanner sc = new Scanner(System.in);

    public void start() {
        maxHP = 5;
        health  = 5;
        damage = 5;
        currentWeapon = "Fists";

        System.out.println("Welcome, young courier.");
        System.out.println("As you well know, you of all our courier trainees have been chosen to deliver a top secret message to our beloved king.");
        System.out.println("This is the greatest honor any courier can recieve; the chance you have been waiting for your whole life!");
        System.out.println("So, uh... what was your name again?");

        playerName = sc.nextLine();

        System.out.println("Ah, yes, of course " + playerName + ".");
        System.out.println("Remember, with this scroll you carry with you the trust and honor of every courier from our guild.");
        System.out.println("Well then, " + playerName + " are you ready to start your journey?");
        System.out.println("1) Bring it on!");
        System.out.println("2) I think I'll just go home.");

        choice = sc.nextInt();
        if (choice == 1) {
            //start first scene
        } else if (choice == 2) {
            System.out.println("Your choice has rendered this whole game useless, therefore your character will now explode.");
            System.out.println("Thank you for almost playing");
            //start death
        }
    }
}
