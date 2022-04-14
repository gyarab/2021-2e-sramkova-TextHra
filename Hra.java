
import java.util.Scanner;

public class Hra {

    String playerName;
    int choice;
    boolean paper; //recieved in aunt arc
    boolean letterOpened; //if paper is used opens a new ending

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Hra game = new Hra();
        game.start();
    }

    public void start() throws InterruptedException {
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

        switch (choice) {
            case 1 -> {
                start();
            }
            case 2 -> {
                System.exit(0);
            }
        }
    }

    public void auntLetter() throws InterruptedException {
        System.out.println("You begin your journey to the capital.\nAs night sets you arrive at the outskirts of a small village.");
        System.out.println("\nWhat do you do?");
        System.out.println("1) Spend the night");
        System.out.println("2) Move on");
        choice = sc.nextInt();

        switch (choice) {
            case 2 -> {
                endGate();
            }
            case 1 -> {
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

                    switch (choice) {
                        case 1 -> {
                            System.out.println("Man: Ah, yes of course.\n     Unfortunately, I don't have much to give you, but my aunt is a collector, surely she'll have something that would interest you.");
                            System.out.println("1) I'd be happy to help.");
                            System.out.println("2) Sorry, I have more important things to do.");
                            choice = sc.nextInt();

                            switch (choice) {
                                case 1 -> {
                                    System.out.println("Man: Oh thank you so much! I promise you won't regret this. You know what? Your meal is on the house!");
                                    System.out.println("The man practically dances off and brings you your meal along with a jar of ointment.\nYou rest at the inn and leave the next morning feeling refreshed.");

                                    auntMeet();
                                }
                                case 2 -> {
                                    System.out.println("Man: Oh... of course, I understand.");
                                    System.out.println("The man leaves and brings you your meal a moment later all the while assuring you it's ok.\nYou rest at the inn and leave the next morning feeling refreshed.");

                                    endGate();
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Man: Oh thank you so much! I promise you won't regret this. You know what? Your meal is on the house!");
                            System.out.println("The man practically dances off and brings you your meal along with a jar of ointment.\nYou rest at the inn and leave the next morning feeling refreshed.");

                            auntMeet();

                        }
                        case 3 -> {
                            System.out.println("Man: Oh... of course, I understand.");
                            System.out.println("The man leaves and brings you your meal a moment later all the while assuring you it's ok.\nYou rest at the inn and leave the next morning feeling refreshed.");

                            endGate();
                        }
                    }
                }
            }
        }
    }

    public void auntMeet() throws InterruptedException { //second part of auntLetter
        System.out.println("Around noon you arrive at a small cottage at the outskirts of a small wood.As you knock a small voice calls: Enter!\nThe moment you open the door a strong flowery scent hits your nose.\nThe interior of the house is small and scarcely decorated, but cozy.\nBundles of herbs hang from theceiling,others lay in stacks and jars on shelves around the walls.\nThere is a table and some chairs, a closet, and even a small fireplace.\nAt first the room seems empty, but then a tower of blankets in the corner moves and a small girl peeks out.");
        System.out.println("Girl: You smell funny. Like paper and ink. And *sniff* is that ointment in your bag?\n    Feyfey sent you, didn't he? Honestly, that boy worries too much.");
        System.out.println("1) I thought... Feyfey said his aunt lived alone?");
        System.out.println("2) Goodbye.");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("The girl looks at you as if questioning your inteligence.");
                System.out.println("Girl: I do live alone, can¨t you see? Now give me that ointment, my head hurts");
                System.out.println("The girl snatches the bottle from you and climbs back in her blanket fortress without another word.\nYou stand there, wondering if perhaps you heard the man wrong.\nYou wait for a while, but when the girl doesn't appear again, you head for the door.\nYou only manage a few steps outside before someone calls out to you. You turn to see a young woman standing in doorway.");
                System.out.println("Woman: Ah, much better! You know, Feyfey may be tad too overprotective, but his medicine does wonders.\n    Here, this is for your troubles. I have a feeling you'll need it.");
                System.out.println("The woman forces a single sheet of ink black paper into your hands before turning her back to you.\nYou look at the paper in confusion and open your mouth to ask what it is for,\nbut fint that both the woman and the cottage have disappeared.\nOnce you finish questioning your sanity, you put the paper in your bag and continue on your journey.");
                paper = true;
                campfire();
            }
            case 2 -> {
                System.out.println("You turn on your heel and hightail it out of the cottage.\nAs you glance back you see the girl looking after you with a disappointed expression.");
                campfire();
            }
        }
    }

    public void campfire() throws InterruptedException { //only happens if stopped at the inn

        if (paper = true) {
            System.out.println("Because of your stop at the strange girl's place, night falls just as you're in the middle of a forest.\nYou set up a campfire and open your bag to get some food, when the sheet of black paper falls out.\n You pick it up and notice that at the places, where the paper was touching with the king's scroll,\nthe color was gathering into faint letters\nIt occurs to you that perhaps this paper can reveal the content of sealed messages.\n Theoretically you could use it to look into the scroll you're carrying... but should you?");
            System.out.println("1) Yes... for the safety of the king, of course!");
            System.out.println("2) No, I should respect the secrecy of correspondence.");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("You glance around, to make sure you're alone, before carefully taking the scroll out of your bag.\nThe moment you lay it onto the black paper, the color starts moving around.\n You watch mesmerised as words appear one by one, until a complete letter lays before you.\nYou gingerly pick it up and start reading. Soon, your mouth is hanging open and your hands are shaking.\nAlthough you didn't really know what to expect, it certainly wasn't a hateful letter full of threats.\nAnd though that on itself is concerning, the worst part is the strange symbol scribbled over half of the page.\nThough you're no expert, you can clearly see that it is a rune containing a lethal curse.\n Whoever opens the actual scroll is sure to die within minutes.\nAfter placing both the scroll and paper in your bag, you lay down to sleep, but can only think abou\n what to do with what you've just learned.");
                    letterOpened = true;
                    System.out.println("Come morning you pack up and slowly head towards the capital, already visible on the horizon");
                    endGate();
                }
                case 2 -> {
                    System.out.println("You fold the paper and place it back in your bag, making sure it's completely separated from the scroll.\nYou cook your dinner, eat and go to sleep, trying to keep your eyes off your bag.\nBut despite your decision, you can't stop thinking about what is in that scroll");
                    System.out.println("Come morning you pack up and head towards the capital, the faint outline already visible on the horizon");
                    endGate();
                }
            }
        } else {
            System.out.println("Because of your stop at the strange girl's place, night falls just as you're in the middle of a forest.\nYou set up a campfire and open your bag to get some food, when your eyes fall on the scroll you're carying.\nA thought creeps into your mind: out in the middle of nowhere, no one would see if you took a peek at its contents\nThe seal had no symbol so it would be easy to fix with the tools you carry... but should you?");
            System.out.println("1) Yes... for the safety of the king, of course!");
            System.out.println("2) No, I should respect the secrecy of correspondence.");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("You break the seal off and unfurl the scroll while reading.\nSoon, your mouth is hanging open and your hands are shaking.\nAlthough you didn't really know what to expect, it certainly wasn't a hateful letter full of threats.\nThen you feel the color drain from your face when you unroll the scroll fully and see thesymbol inscribed on the lower half.\nYou don't have to be an expert to recognise it as a lethal curse.\n You throw the scroll on the ground, but it's too late. You feel your whole body tingling before your vision fades to black.\nIn the following days, people would come looking for you, but all they find is an empty campsite and a blank scroll. ");
                    death();
                }
                case 2 -> {
                    System.out.println("You fold the paper and place it back in your bag, making sure it's completely separated from the scroll.\nYou cook your dinner, eat and go to sleep, trying to keep your eyes off your bag.\nBut despite your decision, you can't stop thinking about what is in that scroll");
                    System.out.println("Come morning you pack up and head towards the capital, the faint outline already visible on the horizon");
                    endGate();
                }
            }
        }
    }

    public void endGate() throws InterruptedException {
        System.out.println("After a long journey you finally arrive to the main city.\nYou get to the gates of the palace, but the guards suddenly block your way.");
        System.out.println("Guard: Halt, outsider! State your name and business.");
        System.out.println("1) I am " + playerName + " from the courier guild. I have a message for the king");
        System.out.println("2) Step aside, my business is not with you.");
        System.out.println("3) 'Attack him'");
        choice = sc.nextInt();

        if (choice == 3) {
            System.out.println("For some reason you decide to attack the guards, but they quickly subdue you.");
            System.out.println("Guard: Aha! So you're one of them afterall!\n    Your assassin friends already tried to get in and failed.\n    Let's throw this one in with the others, boys.");
            endingPrisoner();
        } else if (choice == 1 || choice == 2) {
            if (choice == 2) {
                System.out.println("The guards frown at your rude words. The one who spoke pushes you back as you try to get past them.\nThey look ready to throw you in jail, but then one of them spots your courier badge.");
                System.out.println("Guard 2: Hang on a second, look. This one's from the courier quild.\nThe first guard takes a look at your badge and sighes.");
            }
            System.out.println("Guard: Is that so? Well, you can go inside then, but I'm warning you. Everyone is a bit on the edge so you better behave.");
            System.out.println("He shoots you one last warning look before opening the door and leting you in.");

            endThroneroom();
        }

    }

    public void endThroneroom() throws InterruptedException {
        System.out.println("You enter a room decorated in gold and silver. Sunlight floods through giant windows and almost blinds you for a few seconds.\nPeople in fancy clothing stand around the room, as well as a large number of guards.\n The king sits on an elevated throne at the opposite end of the room.\n As you enter, the guard announces you and all eyes turn to you and everyone becomes quiet.\n In the deafening silence, you cross the room and kneel in front of the throne.\nA servant rushes forwad to inspect your courier badge. Once he confirms it's real, he takes the scroll and hands in to the king.");
        if (letterOpened = true) {
            System.out.println("At that moment you remember the night before and what the letter actually contained.\n If you were going to do something, you would have to do it now.");
            System.out.println("1) Warn the king about the trap");
            System.out.println("2) Wait and see what happens");
            System.out.println("3) Run away");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    endingCourier();
                }
                case 2 -> {
                    System.out.println("The king breaks the seal and unrolls the scroll.\n As he starts reading his brows furrow and he glances at you over the paper. Then he unrolls the scroll completely and his eyes widen.\nHe looks at you again, this time with a horrified expression, and then crumbles to the ground.\nNow what do you do?");
                    System.out.println("1) Stay.");
                    System.out.println("2) Running away sounds much better now.");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1 -> {
                            System.out.println("Chaos breaks out in the throneroom as everyone begins shouting.\nMedics are called and everyone seems to forget about you for a bit.\nThe the pair of guards previously guarding the door grabs you and hauls you off into an interrogation room.\nYou talk about your journey a good dozen times and answer more questions than on all your school exams combined.\nIn the end however, you are still found guilty, mostly because the kingdom needs a scapegoat.\nThe guards grab you and drag you off again.");
                            endingPrisoner();
                        }
                        case 2 -> {
                            endingOutlaw();
                        }
                    }
                }
                case 3 -> {
                    endingOutlaw();
                }
            }
        } else {
            System.out.println("What do you want to do?");
            System.out.println("1) Wait and see what happens");
            System.out.println("2) Run away just in case");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("The king breaks the seal and unrolls the scroll.\n As he starts reading his brows furrow and he glances at you over the paper. Then he unrolls the scroll completely and his eyes widen.\nHe looks at you again, this time with a horrified expression, and then crumbles to the ground.\nNow what do you do?");
                    System.out.println("1) Stay.");
                    System.out.println("2) Running away sounds much better now.");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1 -> {
                            System.out.println("Chaos breaks out in the throneroom as everyone begins shouting.\nMedics are called and everyone seems to forget about you for a bit.\nThe the pair of guards previously guarding the door grabs you and hauls you off into an interrogation room.\nYou talk about your journey a good dozen times and answer more questions than on all your school exams combined.\nIn the end however, you are still found guilty, mostly because the kingdom needs a scapegoat.\nThe guards grab you and drag you off again.");
                            endingPrisoner();
                        }
                        case 2 -> {
                            endingOutlaw();
                        }
                    }
                }
                case 2 -> {
                    endingOutlaw();
                }
            }
        }
    }

    public void endingOutlaw() throws InterruptedException {
        System.out.println("Not wanting to stick around much longer, you take a flying leap out of the nearest window,\nYou land safely on the bushes in the garden below and continue running. All  the way you can hear the guards yelling after you.");
        System.out.println("In the following weeks you make your way toe´wards the border, trying to steer clear of the numerous royal guards.\nYou hear whispers on the streets about the king's asssassination and can only hang your head and push on.\nOne evening, as you rest next to a forest stream, hooded figures surround you. One of them adresses you in a rough voice.");
        System.out.println("Figure: So, you're the one everyone is looking for. The courier that delivered the kings death, " + playerName + ".\nYou don't respond and after a tense moment of silence he chuckles.\nFigure: Well done. You've made our job easy. Now, we would like to have a little chat with you.");
        System.out.println("You slowly back away and end up stumbling into the stream. What in the world have you gotten yourself into?");
        System.out.println("\n\nCongratulations, you have reched the Outlaw ending!");
        endMessage();
    }

    public void endingPrisoner() throws InterruptedException {
        System.out.println("Before you can really comprehend what is going on, you are dragged underground.\nThe guards throw you in a cell full of people in various states of consciousness, who all look at you with animosity.\nThey tell you the execution is tomorrow and then leave you with more questions than ever.\nYou look at the unfamiliar faces around you and wonder if you'll even survive until morning.");
        System.out.println("\n\nCongratulations, you have reched the Prisoner ending!");
        endMessage();
    }

    public void endingCourier() throws InterruptedException {
        System.out.println("You yell out a warning just before the king breaks the seal.Onc eagain all eyes turn to you, this tme with questioning looks.\nYou calmly recount what you've discovered about the letter and hand over the copied version of the scroll.\nThe king seems grimly concerned but strangely unsurprised. He calls his advisors to him and they start a hushed conversation.\nIt drags on and on and despite the seriousnes of the situation you start to nod off.\n Then the kings voice jerks you awake.");
        System.out.println("King: This is a serious matter.\n     We will need to find whoever send this letter, maybe it will lead us to the mastermind of this all.\n    Courier, although you have violated the secrecy of correspondence, your actions have likely saved my life,\n     We will need you to stay here at the castle until the matter is settled, and act as a witness.\nHowever, saving a life, a king's no less, is something I will not forget. Once this is over I will see to it\n    that you are properly rewarded.");
        System.out.println("You nod, feeling relieved. Although your fate isn't clear yet, at least it doesn't seem like you'll be exiled or executed.\n\n\nA few days later you stand in front of the city gates, a stack of scrolls in your bag.\nYou take a moment to sdjust the brand new badge on your chest.\n The letters 'Royal Courier' gleam in the sunlight.\nWith a smile and a song on your lips you take off to your next destination.");
        System.out.println("\n\nCongratulations, you have reched the Courier ending!");
        endMessage();
    }

    public void endMessage() throws InterruptedException {
        System.out.println("There are other endings you can get, all you have to do is try other choices throughout the game.\nSo, would you like to try again?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                auntLetter();
            }
            case 2 -> {
                System.out.println("Thank you for playing.");
            }
        }
    }
}