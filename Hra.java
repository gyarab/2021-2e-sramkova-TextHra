
import java.util.Scanner;

public class Hra {

    int MaxHP; //def 5
    int HP; //def 5
    int Damage; //def 1
    String currentWeapon; //def Fists

    Scanner sc = new Scanner(System.in);

    //weapon template
    public class Weapon {
        int d;
        public Weapon(int damage) {
            this.d = damage;
        }

        public void addWeapon() {
            int answer;
            System.out.println("Would you like to swap your current weapon for this one?");
            System.out.println("Yes = 1");
            System.out.println("No = 2");
            answer = sc.nextInt();
            if (answer == 1) {
                Damage = d;
            }
        }
    }
}
