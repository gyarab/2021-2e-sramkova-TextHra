
public class Death {

    public void death() throws InterruptedException {
        System.out.println("GAME OVER");
        System.out.println("You have died!");
        
        Thread.sleep(5);
        System.out.println(".");
        Thread.sleep(5);
        System.out.println(".");
        Thread.sleep(5);
        System.out.println(".");
        Thread.sleep(5);
        
        System.out.println("Try again?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        choice = sc.nextInt();
        
        switch(choice){
            case 1 -> {
                start();
            }
            case 2 -> {
                System.exit(0);
            }
        }
    }
}
