
public class Ending {

    public void endGate() {
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

    public void endThroneroom() {
        System.out.println("You enter a room decorated in gold and silver. Sunlight floods through giant windows and almost blinds you for a few seconds.\nPeople in fancy clothing stand around the room, as well as a large number of guards.\n The king sits on an elevated throne at the opposite end of the room.\n As you enter, the guard announces you and all eyes turn to you and everyone becomes quiet.\n In the deafening silence, you cross the room and kneel in front of the throne.\nA servant rushes forwad to inspect your courier badge. Once he confirms it's real, he takes the scroll and hands in to the king.");
        if (openedLetter = true) {
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
                    
                    switch(choice){
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
                    
                    switch(choice){
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

    public void endingOutlaw() {
        System.out.println("Not wanting to stick around much longer, you take a flying leap out of the nearest window,\nYou land safely on the bushes in the garden below and continue running. All  the way you can hear the guards yelling after you.");
        System.out.println("In the following weeks you make your way toe´wards the border, trying to steer clear of the numerous royal guards.\nYou hear whispers on the streets about the king's asssassination and can only hang your head and push on.\nOne evening, as you rest next to a forest stream, hooded figures surround you. One of them adresses you in a rough voice.");
        System.out.println("Figure: So, you're the one everyone is looking for. The courier that delivered the kings death, " + playerName + ".\nYou don't respond and after a tense moment of silence he chuckles.\nFigure: Well done. You've made our job easy. Now, we would like to have a little chat with you.");
        System.out.println("You slowly back away and end up stumbling into the stream. What in the world have you gotten yourself into?");
        System.out.println("\n\nCongratulations, you have reched the Outlaw ending!");
        endMessage();
    }

    public void endingPrisoner() {
        System.out.println("Before you can really comprehend what is going on, you are dragged underground.\nThe guards throw you in a cell full of people in various states of consciousness, who all look at you with animosity.\nThey tell you the execution is tomorrow and then leave you with more questions than ever.\nYou look at the unfamiliar faces around you and wonder if you'll even survive until morning.");
        System.out.println("\n\nCongratulations, you have reched the Prisoner ending!");
        endMessage();
    }

    public void endingCourier() {
        System.out.println("You yell out a warning just before the king breaks the seal.Onc eagain all eyes turn to you, this tme with questioning looks.\nYou calmly recount what you've discovered about the letter and hand over the copied version of the scroll.\nThe king seems grimly concerned but strangely unsurprised. He calls his advisors to him and they start a hushed conversation.\nIt drags on and on and despite the seriousnes of the situation you start to nod off.\n Then the kings voice jerks you awake.");
        System.out.println("King: This is a serious matter.\n     We will need to find whoever send this letter, maybe it will lead us to the mastermind of this all.\n    Courier, although you have violated the secrecy of correspondence, your actions have likely saved my life,\n     We will need you to stay here at the castle until the matter is settled, and act as a witness.\nHowever, saving a life, a king's no less, is something I will not forget. Once this is over I will see to it\n    that you are properly rewarded.");
        System.out.println("You nod, feeling relieved. Although your fate isn't clear yet, at least it doesn't seem like you'll be exiled or executed.\n\n\nA few days later you stand in front of the city gates, a stack of scrolls in your bag.\nYou take a moment to sdjust the brand new badge on your chest.\n The letters 'Royal Courier' gleam in the sunlight.\nWith a smile and a song on your lips you take off to your next destination.");
        System.out.println("\n\nCongratulations, you have reched the Courier ending!");
        endMessage();
    }

    public void endMessage() {
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
