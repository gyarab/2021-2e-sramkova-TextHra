public class Weapon {
    int d;
    public Weapon(int damage){
        this.d = damage;
    }
    public void addWeapon() {
            int answer;
            System.out.println("Would you like to swap your current weapon for this one?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            answer = sc.nextInt();
            if (answer == 1) {
                Damage = d;
            }
        }
    
}
