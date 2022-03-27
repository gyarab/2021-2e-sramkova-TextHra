
public class Aunt {

    public void auntLetter() {
        System.out.println("You begin your journey to the capital.\nAs night sets you arrive at the outskirts of a small village.");
        System.out.println("\nWhat do you do?");
        System.out.println("1) Spend the night");
        System.out.println("2) Move on");
        choice = sc.nextInt();

        if (choice == 2) {
            endGate();
        } else if (choice == 1) {
            System.out.println("You enter the local inn and find an empty table.\nA young man, evidently a worker at the inn, approaches you and asks what you'd like in a monotone voice.\nHowever, when he sees your courier badge, he perks up.");
            System.out.println("Man: Uh, excuse me, um... are you a courier by any chance?");

            System.out.println("1) Yes, I am.");
            System.out.println("2) What's it to you?");
            System.out.println("3) Just bring me some food and leave me alone, will ya?");
            choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Man: But I... yes, of course. My apologies.");
                System.out.println("The man takes your order, but a middle-aged lady brings your meal instead.\nYou don't see the man again for the rest of your stay.\nThe next morning you leave the inn feeling refreshed and continue on your journey.");
                
                endGate();
                
            } else if (choice == 1 || choice == 2) {
                System.out.println("Man: You see, my aunt lives alone quite a ways away and I heard she has recently fallen ill.\n     If you could deliver this medicine to her, I would be very grateful.");
                System.out.println("1) What about payment?");
                System.out.println("2) I'd be happy to help.");
                System.out.println("3) Sorry, I have more important things to do.");
                choice = sc.nextInt();
                
                if(choice == 1){
                    System.out.println("Man: Ah, yes of course.\n     Unfortunately, I don't have much to give you, but my aunt is a collector, surely she'll have something that would interest you.");
                    System.out.println("1) I'd be happy to help.");
                    System.out.println("2) Sorry, I have more important things to do.");
                    choice = sc.nextInt();
                    
                    if(choice == 1){
                        System.out.println("Man: Oh thank you so much! I promise you won't regret this. You know what? Your meal is on the house!");
                        System.out.println("The man practically dances off and brings you your meal along with a jar of ointment.\nYou rest at the inn and leave the next morning feeling refreshed.");
                        
                        auntMeet();
                    } else if(choice == 2){
                        System.out.println("Man: Oh... of course, I understand.");
                        System.out.println("The man leaves and brings you your meal a moment later all the while assuring you it's ok.\nYou rest at the inn and leave the next morning feeling refreshed.");
                        }
                        endGate();
                    }
                } else if(choice == 2){
                    System.out.println("Man: Oh thank you so much! I promise you won't regret this. You know what? Your meal is on the house!");
                    System.out.println("The man practically dances off and brings you your meal along with a jar of ointment.\nYou rest at the inn and leave the next morning feeling refreshed.");
                    
                    auntMeet();
                    
                } else if(choice == 3){
                    System.out.println("Man: Oh... of course, I understand.");
                    System.out.println("The man leaves and brings you your meal a moment later all the while assuring you it's ok.\nYou rest at the inn and leave the next morning feeling refreshed.");
                    
                    endGate();
                } 
            }
        }
    
    public void auntMeet(){
        System.out.println("Around noon you arrive at a small cottage at the outskirts of a small wood.As you knock a small voice calls: Enter!\nThe moment you open the door a strong flowery scent hits your nose.\nThe interior of the house is small and scarcely decorated, but cozy.\nBundles of herbs hang from theceiling,others lay in stacks and jars on shelves around the walls.\nThere is a table and some chairs, a closet, and even a small fireplace.\nAt first the room seems empty, but then a tower of blankets in the corner moves and a small girl peeks out.");
        System.out.println("Girl: You smell funny. Like paper and ink. And *sniff* is that ointment in your bag?\n    Feyfey sent you, didn't he? Honestly, that boy worries too much.");
        System.out.println("1) I thought... Feyfey said his aunt lived alone?");
        System.out.println("2) Goodbye.");
        choice = sc.nextInt();
        
        switch(choice){
            case 1 -> {
                System.out.println("The girl looks at you as if questioning your inteligence.");
                System.out.println("Girl: I do live alone, can¨t you see? Now give me that ointment, my head hurts");
                System.out.println("The girl snatches the bottle from you and climbs back in her blanket fortress without another word.\nYou stand there, wondering if perhaps you heard the man wrong.\nYou wait for a while, but when the girl doesn't appear again, you head for the door.\nYou only manage a few steps outside before someone calls out to you. You turn to see a young woman standing in doorway.");
                System.out.println("Woman: Ah, much better! You know, Feyfey may be tad too overprotective, but his medicine does wonders.\n    Here, this is for your troubles. I have a feeling you'll need it.");
                System.out.println("The woman forces a single sheet of ink black paper into your hands before turning her back to you.\nYou look at the paper in confusion and open your mouth to ask what it is for,\nbut fint that both the woman and the cottage have disappeared.\nOnce you finish questioning your sanity, you put the paper in your bag and continue on your journey.");
                paper = true;
                campfire();
            }
            case 2 ->{
                System.out.println("You turn on your heel and hightail it out of the cottage.\nAs you glance back you see the girl looking after you with a disappointed expression.");
                campfire();
            }
        }
    }
}
