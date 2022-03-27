
import java.util.Scanner;

public class Hra {
    
    String playerName;
    int choice;
    boolean paper; //recieved in aunt arc
    boolean letterOpened; //if paper is used opens a new ending

    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        Hra game = new Hra();
        game.start();
    }

    public void start() {
        paper = false;
        letterOpened = false;

        System.out.println("Welcome, young courier.");
        System.out.println("As you well know, you of all our courier trainees have been chosen to deliver a top secret message to our beloved king.\nThis is the greatest honor any courier can recieve; the chance you have been waiting for your whole life!\nSo, uh... what was your name again?");

        playerName = sc.nextLine();

        System.out.println("Ah, yes, of course " + playerName + ".\nRemember, with this scroll you carry with you the trust and honor of every courier from our guild.\nWell then, " + playerName + " are you ready to start your journey?");
        System.out.println("1) Bring it on!");
        System.out.println("2) I think I'll just go home.");
        choice = sc.nextInt(); //accepts only 1 or 2, otherwise error
        
        if (choice == 1) {
            auntLetter();
        } else if (choice == 2) {
            System.out.println("Your choice has rendered this whole game useless, therefore your character will now explode.\nThank you for almost playing");
            death();
        }
    }
}
