public class Ending {
    
    public void endGate(){
        System.out.println("After a long journey you finally arrive to the main city.\nYou get to the gates of the palace, but the guards suddenly block your way.");
        System.out.println("Guard: Halt, outsider! State your name and business.");
        System.out.println("1) I am " + playerName + " from the courier guild. I have a message for the king");
        System.out.println("2) Step aside, my business is not with you.");
        System.out.println("3) 'Attack him'");
        choice = sc.nextInt();
        
        switch(choice){
            case 1 -> {
                
            }
            case 2 -> {
                System.out.println("The guards frown at your rude words. The one who spoke pushes you back as you try to get past them.\n");
                System.out.println("");
            }
            case 3 -> {
                System.out.println("For some reson you decide to attack the guards, but they quickly subdue you.");
                System.out.println("Guard: Aha! So you're one of them afterall!\n    Your assassin friends already tried to get in and failed.\n    Let's throw this one in with the others, boys.");
                System.out.println("Before you can really comprehend what is going on, you are dragged underground.\nThe guards throw you in a cell full of people in various states of consciousness, who all look at you with animosity.\nThey tell you the execution is tomorrow and then leave you with more questions than ever.\nYou look at the unfamiliar faces around you and wonder if you'll even survive until morning.");
                death();
            }
        }
        
    }
    
    public void endThroneroom(){
        
    }
    
    public void endingOutlaw(){
        
    }
    
    public void endingPrisoner(){
        
    }
    
    public void endingCourier(){
        
    }
    
}
