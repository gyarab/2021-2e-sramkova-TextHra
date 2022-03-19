
public class Aunt {

    public void auntLetter() {
        System.out.print("As night sets you arrive at the outskirts of a small village.");
        System.out.print("What do you do?");
        System.out.print("1) Spend the night");
        System.out.print("2) Move on");
        choice = sc.nextInt();

        if (choice == 2) {
            //next scene
        } else if (choice == 1) {
            System.out.print("You enter the local inn and find an empty table.");
            System.out.print("A young man, evidently a worker at the inn, approaches you and asks for your order in a monotone voice.");
            System.out.print("However, when he sees your courier badge, he perks up.");
            System.out.print("Man: Uh, excuse me, um... are you a courier by any chance?");

            System.out.print("1) Yes, I am.");
            System.out.print("2) What's it to you?");
            System.out.print("3) Just take my order and leave me alone, will ya?");
            choice = sc.nextInt();

            if (choice == 3) {
                System.out.print("Man: But I... yes, of course. My apologies.");
                System.out.print("The man takes your order, but a middle-aged lady brings your meal instead.");
                System.out.print("You don't see the man again for the rest of your stay");
                System.out.print("The next morning you leave the inn feeling refreshed and continue on your journey.");
                if (health < maxHP) {
                    health = health + 1;
                }
            } else if (choice == 1 || choice == 2) {

            }

        }
    }

    public void auntMeet() {

    }
}
