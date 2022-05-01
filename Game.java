
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public final class Game {

    String position, endingName; //used for switch handling choices
    int letterOpened; //if paper is used opens a new ending
    JFrame window;
    Container container;
    JPanel locationPanel, main, choicePanel; //all panels
    JLabel locationName;
    JTextArea storyText;
    JButton choice1, choice2, choice3; //all buttons
    Font normal = new Font("Times New Roman", Font.PLAIN, 25);
    Font small = new Font("Times New Roman", Font.PLAIN, 15);
    ChoiceHandler choiceHandler = new ChoiceHandler();

    //template for buttons
    public JButton choiceButton(String text1) {
        JButton button1 = new JButton(text1);
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.setFont(normal);
        return button1;
    }

    public JPanel mainPanel() {
        JPanel panel = new JPanel();
        panel.setBounds(45, 50, 700, 400);
        panel.setBackground(Color.black);
        return panel;
    }

    public JTextArea story(String st) {
        JTextArea s = new JTextArea(st);
        s.setBounds(45, 50, 700, 400);
        s.setBackground(Color.black);
        s.setForeground(Color.white);
        s.setFont(normal);
        s.setLineWrap(true); //wraps text if too long
        s.setEditable(false);
        s.setWrapStyleWord(true); //splits text by words not letters
        return s;
    }

    //panel for buttons
    public JPanel choiceP() {
        JPanel choice = new JPanel();
        choice.setBounds(200, 450, 400, 195);
        choice.setBackground(Color.red);
        choice.setLayout(new GridLayout(3, 1));
        return choice;
    }

    public JPanel locationP() {
        JPanel l = new JPanel();
        l.setBounds(250, 0, 300, 25);
        l.setBackground(Color.black);
        return l;
    }

    public JLabel locationN(String n) {
        JLabel k = new JLabel(n);
        k.setForeground(Color.white);
        k.setFont(small);
        return k;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public void start() {
        letterOpened = 0;
        position = "void";
        endingName = null;

        //creates the game window
        window = new JFrame();
        window.setSize(800, 700);
        window.getContentPane().setBackground(Color.black);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        container = window.getContentPane();

        locationPanel = locationP();
        locationName = locationN("Location: Void");
        locationPanel.add(locationName);
        container.add(locationPanel);

        main = mainPanel();
        container.add(main);

        //start of story
        storyText = story("Welcome, young courier.\n\nAs you well know, you of all our courier trainees have been chosen todeliver a top secret message to our beloved king. This is the greatest honor any courier can recieve; the chance you have been waiting for your whole life! More importantly, with this scroll you carry with you the trust and honor of every courier from our guild.\nNo pressure though.\n\nWell then, are you ready to start your journey?");
        main.add(storyText);

        choice1 = choiceButton("Bring it on!");
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1"); //different outcomes to buttons
        choice2 = choiceButton("I think I'll just go home");
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choice3 = choiceButton("");
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choicePanel = choiceP();
        choicePanel.add(choice1);
        choicePanel.add(choice2);
        choicePanel.add(choice3);
        container.add(choicePanel);

        window.setVisible(true);
    }

    public void death() {
        position = "death";
        storyText.setText("Your choice has rendered this whole game useless, therefore your character will now explode.\n\nThank you for almost playing");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
    }

    public void townOutside() {
        position = "townOutside";
        locationName.setText("Location: Village Outskirts");
        storyText.setText("You begin your journey to the capital.\n\nThe first day goes by without any accidents, and soon night starts to set.\n\nThat's when you arrive at the outskirts of a small village. There is only a handful of houses and warm light streaming through the windows of what is most likely a tavern.");
        choice1.setText("Spend the night");
        choice2.setText("Move on");
        choice3.setText("");
    }

    public void townTavern() {
        position = "townTavern";
        locationName.setText("Location: Village Tavern");
        storyText.setText("You enter the tavern and find an empty table. The smell of freashly baked bread, soup, and meat immediately makes your mouth water.\n\nA young man, evidently a worker at the inn, approaches you and asks what you'd like in a monotone voice.\nHowever, when he sees your courier badge, he perks up.\n\nMan: Uh, excuse me, um... are you a courier by any chance?");
        choice1.setText("Yes, I am");
        choice2.setText("What's it to you?");
        choice3.setText("<html><center>Just bring me some food and leave me alone, will ya?</center></html>");
    }

    public void refuse1() {
        position = "refuse1";
        locationName.setText("Location: Village Tavern");
        storyText.setText("Man: But I... yes, of course. My apologies.\n\nThe man takes your order, but a grey-haired lady brings your meal instead.\nYou don't see the man again for the rest of the evening nor the morning after.\n\nAfter a quick but delicious breakfast you leave the tavern feeling refreshed and continue on your journey.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void yes() {
        position = "yes";
        storyText.setText("Man: You see, my aunt lives alone quite a ways away and I heard she has recently fallen ill. I have too much work here at the tavern so I can't visit her so if you could deliver this medicine to her, I would be very grateful");
        choice1.setText("What about payment?");
        choice2.setText("I'd be happy to help");
        choice3.setText("<html><center>Sorry, I have more important things to do</center></html>");
    }

    public void payment() {
        position = "payment";
        storyText.setText("Man: Ah, yes of course. Unfortunately I don't have much to give you, I barely make enough to feed my family, but my aunt is a collector, surely she will have something that would interest you");
        choice1.setText("I'd be happy to help");
        choice2.setText("<html><center>Sorry, I have more important things to do</center></html>");
        choice3.setText("");

    }

    public void accept() {
        position = "accept";
        storyText.setText("Man: Oh thank you so much! I promise you won't regret this. You  know what? Your meal is on the house!\n\nThe man practically dances off and brings you your meal along with a jar of ointment and a small piece of parchment with instructions on doses.\nYou rest at the inn and leave the next morning after a quick but delicious breakfast feeling refreshed.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void refuse2() {
        position = "refuse2";
        storyText.setText("Man: Oh... of course, I understand.\n\nThe man leaves and brings you your meal a moment later all the while assuring you it's ok.\nYou rest at the inn and leave the next morning after a quick but delicious breakfast feeling refreshed");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void auntMeet() {
        position = "auntMeet";
        locationName.setText("Location: Small Cottage");
        storyText.setText("Around noon you arrive at a small cottage at the outskirts of the woods. As you knock a small voice calls: Enter!\nThe moment you open the door a strong flowery scent hits your nose.\nThe interior of the house is small and scarcely decorated, but cozy. Bundles of herbs hang from the ceiling, others lay in stacks and jars on shelves around the walls. There is a table and some chairs, a closet, and even a small fireplace.\nAt first the room seems empty, but then a tower of blankets in the corner moves and a small girl peeks out.\n\nGirl: You smell funny. Like paper and ink. And *sniff* is that ointment in your bag? Feyfey sent you, didn't he? Honestly, that boy worries too much.");
        choice1.setText("<html><center>I thought... Feyfey said his aunt lived alone?</center></html>");
        choice2.setText("Goodbye");
        choice3.setText("");
    }

    public void goodbye() {
        position = "goodbye";
        storyText.setText("You turn on your heel and hightail it out of the cottage, barely slowing down to toss the ointment and instructions on a table. Once you're a few metres away you glance back to see the girl looking after you from the doorway with a disappointed expression");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void auntDialogue() {
        position = "auntDialogue";
        locationName.setText("Location: Small Cottage");
        storyText.setText("The girl looks at you as if questioning your inteligence.\n\nGirl: I do live alone, can't you see? Now give me that ointment, my head hurts. Feyfey really took his time to get this to me.\n\nThe girl snatches the bottle from you and climbs back in her blanket fortress without another word. You stand there, wondering if perhaps you heard the man wrong about the girl being his aunt. Then again you've seen weirder things than this.\nYou wait for a while, but when the girl doesn't appear again, you headfor the door. You only manage a few steps outside before someone calls out to you. You turn to see a young woman standing in doorway.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void auntDialogue2() {
        position = "auntDialogue2";
        storyText.setText("Woman: Ah, much better! You know, Feyfey may be tad too overprotective, but his medicine does wonders.Here, this is for your troubles. I have a feeling you'll need it.\n\nThe woman forces a single sheet of ink black paper into your hands before turning her back to you.\nYou look at the paper in confusion and open your mouth to ask what it is for, but find that both the woman and the cottage have disappeared.\nOnce you finish questioning your sanity, you put the paper in your bag and continue on your journey.");
    }

    public void campfireBad() {
        position = "campfireBad";
        locationName.setText("Location: Middle of Nowhere");
        storyText.setText("Because of your stop at the strange girl's place your travel takes more time than expected and night falls just as you're in the middle of a forest.\nYou set up a campfire and open your bag to get what's left of your food, when your eyes fall on the scroll you're carying.\nA thought creeps into your mind: out here in the middle of Nowhere, no one would see if you took a peek at the scroll's contents\nThe seal had no symbol so it would be easy to fix with the tools you carry... but should you?");
        choice1.setText("<html><center>Yes... for the safety of the king, of course!</center></html>");
        choice2.setText("<html><center>No, I should respect the secrecy of correspondence.</center></html>");
        choice3.setText("");
    }

    public void campfireGood() {
        position = "campfireGood";
        locationName.setText("Location: Middle of Nowhere");
        storyText.setText("Because of your stop at the strange girl's place your travel takes more time than expected and night falls just as you're in the middle of a forest.\nYou set up a campfire and open your bag to get what's left of your food, when the sheet of black paper you got from the strange girl/woman falls out.\n You pick it up and notice that at the places, where the paper was touching with the king's scroll, the color was gathering into faint letters.\nIt occurs to you that perhaps this paper can reveal the content of sealed messages. Theoretically you could use it to look into the scroll you're carrying... but should you?");
        choice1.setText("<html><center>Yes... for the safety of the king, of course!</center></html>");
        choice2.setText("<html><center>No, I should respect the secrecy of correspondence.</center></html>");
        choice3.setText("");
    }

    public void letterRead() {
        letterOpened = 1;
        position = "letterRead";
        storyText.setText("You glance around to make sure you're alone, before carefully taking the scroll out of your bag.\nThe moment you lay it onto the black paper, the color starts moving around. You watch mesmerised as words appear one by one, until a complete letter lays before you.\nYou gingerly pick it up and start reading. Soon, your mouth is hanging open and your hands are shaking.\nAlthough you didn't really know what to expect, it certainly wasn't a hateful letter full of threats and cuss words.\nAnd although that by itself is concerning, the worst part is the strange symbol scribbled over half of the page.\nThough you're no expert, you can clearly see that it is a rune containing a lethal curse.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void letterRead2() {
        position = "letterRead2";
        storyText.setText("Whoever opens the actual scroll is sure to die within minutes. You feel the color drain from your face when you remember who the letter was for.\n\nAfter placing both the scroll and paper in your bag, you lay down to sleep, but can only think about what to do with what you've just learned.\n\nCome morning you pack up and slowly head towards the capital, already visible on the horizon.");
    }

    public void letterDeath() {
        position = "letterDeath";
        storyText.setText("You break the seal off and unfurl the scroll while reading.\nSoon, your mouth is hanging open and your hands are shaking.\nAlthough you didn't really know what to expect, it certainly wasn't a hateful letter full of threats.\nThen you feel the color drain from your face when you unroll the scroll fully and see the symbol inscribed on the lower half.\nYou don't have to be an expert to recognise it as a lethal curse.\n You throw the scroll on the ground, but it's too late. You feel your whole body tingling before your vision fades to black.\nIn the following days, people would come looking for you, but all they find is an empty campsite and a blank scroll.");
        choice1.setText("------");
        choice2.setText("------");
        choice3.setText("------");
    }

    public void unread() {
        position = "letter";
        storyText.setText("You fold the paper and place it back in your bag, making sure it's completely separated from the scroll.\nYou cook your dinner, eat and go to sleep, trying to keep your eyes off your bag.\nBut despite your decision, you can't stop thinking about what is in that scroll.\n\nCome morning you pack up and head towards the capital, the faint outline already visible on the horizon.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void endGate() {
        position = "endGate";
        locationName.setText("Location: City Gate");
        storyText.setText("After a long journey you finally arrive to the Capital. You walk through the sea of buildings big and small towards the forest of gleaming towers that is the palace.\nHowever, when you get to the gates of the palace, the guards standing on both sides of it suddenly block your way.\n\nGuard: Halt, outsider! If you wish to speak with the king, you first need to state your business.");
        choice1.setText("<html><center>I am from the Courier guild, I have a message for the king</center></html>");
        choice2.setText("<html><center>Step aside, my business isn't with you</center></html>");
        choice3.setText("Attack him");
    }

    public void attack() {
        position = "attack";
        endingName = "Prisoner";
        storyText.setText("For some reason you decide to attack the guards, but they quickly subdue you.\n\nGuard: Aha! So you're one of them afterall! Your assassin friends already tried to get in and failed. Let's throw this one in with the others.\nBefore you can really comprehend what is going on, you are dragged underground.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void attack2() {
        position = "attack2";
        storyText.setText("The guards throw you in a cell full of people in various states of consciousness, who all look at you with animosity.\nThey tell you the execution is tomorrow and then leave you with more questions than ever.\nYou look at the unfamiliar faces around you and something in their faces makes you wonder if you'll even survive until morning.");
    }

    public void insult() {
        position = "insult";
        storyText.setText("The guards frown at your rude words. The one who spoke pushes you back as you try to get past them.\nThey look ready to throw you in jail, but then one of them spots your courier badge.\n\nGuard 2: Hang on a second, look. This one's from the courier quild.\nThe first guard takes a look at your badge and sighes.\n\nGuard: Is that so? Well, you can go inside then, but I'm warning you. Everyone is a bit on the edge so you better behave");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void talk() {
        position = "talk";
        storyText.setText("Guard: Is that so? Well, you can go inside then, but I'm warning you. Everyone is a bit on the edge so you better behave.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void endThroneroomGood() {
        position = "endThroneroomGood";
        locationName.setText("Location: Throne room");
        storyText.setText("You enter a room decorated in gold and silver. Sunlight floods through giant windows and almost blinds you for a few seconds.\nPeople in fancy clothing stand around the room, as well as a large number of guards.\nThe king sits on an elevated throne at the opposite end of the room.\nAs you enter, the guard announces you and all eyes turn to you and everyone becomes quiet.\nIn the deafening silence, you cross the room and kneel in front of the throne.\nA servant rushes forwad to inspect your courier badge. Once he confirms it's real, he takes the scroll and hands in to the king.\nAt that moment you remember the night before and what the letter actually contained.\nIf you were going to do something, you would have to do it now.");
        choice1.setText("<html><center>Warn the king about the trap</center></html>");
        choice2.setText("<html><center>Wait and see what happens</center></html>");
        choice3.setText("Run away");
    }

    public void endThroneroomBad() {
        position = "endThroneroomBad";
        locationName.setText("Location: Throne room");
        storyText.setText("You enter a room decorated in gold and silver. Sunlight floods through giant windows and almost blinds you for a few seconds.\nPeople in fancy clothing stand around the room, as well as a large number of guards.\nThe king sits on an elevated throne at the opposite end of the room.\nAs you enter, the guard announces you and all eyes turn to you and everyone becomes quiet.\nIn the deafening silence, you cross the room and kneel in front of the throne.\nA servant rushes forwad to inspect your courier badge. Once he confirms it's real, he takes the scroll and hands in to the king.\nSuddenly you get a strange feeling, as if everything was about to fall apart.\n\nWhat do you do?.");
        choice1.setText("<html><center>Run away just in case</center></html>");
        choice2.setText("<html><center>Wait and see what happens</center></html>");
        choice3.setText("");
    }

    public void waiting() {
        position = "waiting";
        storyText.setText("The king breaks the seal and unrolls the scroll.\n As he starts reading his brows furrow and he glances at you over the paper. Then he unrolls the scroll completely and his eyes widen.\nHe looks at you again, this time with a horrified expression, and then crumbles to the ground.\nChaos breaks out in the throneroom as everyone begins shouting.\nMedics are called and everyone seems to forget about you for a bit\n\nNow what do you do?");
        choice1.setText("<html><center>Stay</center></html>");
        choice2.setText("<html><center>Running away sounds much better now</center></html>");
        choice3.setText("");
    }

    public void endingPrisoner() {
        endingName = "Prisoner";
        position = "endingPrisoner";
        locationName.setText("Location: Prison Cell");
        storyText.setText("After a moment the medics that were called relise what happened to the king and immediately order your arrest. The pair of guards previously guarding the door grabs you and hauls you off into an interrogation room.\nYou talk about your journey a good dozen times and answer more questions than on all your school exams combined.\nIn the end however, you are still found guilty, mostly because the kingdom needs a scapegoat.\nThe guards grab you and drag you off again.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void endingOutlaw() {
        endingName = "Outlaw";
        position = "endingOutlaw";
        locationName.setText("Location: Unknown");
        storyText.setText("Not wanting to stick around, you take a flying leap out of the nearest window,\nYou land safely on the bushes in the garden below and continue running. All  the way you can hear the guards yelling after you.\n\nIn the following weeks you make your way towards the border, trying to steer clear of the numerous royal guards.\nYou hear whispers on the streets about the king's asssassination and can only hang your head and push on.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void endingOutlaw2() {
        position = "endingOutlaw2";
        storyText.setText("One evening, as you rest next to a forest stream, hooded figures surround you. One of them adresses you in a rough voice.\nFigure: So, you're the one everyone is looking for. The courier that delivered the kings death.\nYou don't respond and after a tense moment of silence he chuckles.\nFigure: Well done. You've made our job easy. Now, we would like to have a little chat with you.You slowly back away and end up stumbling into the stream. What in the world have you gotten yourself into?");
    }

    public void endingCourier() {
        endingName = "Courier";
        position = "endingCourier";
        storyText.setText("You yell out a warning just before the king breaks the seal. Once eagain all eyes turn to you, this tme with questioning looks.\nYou calmly recount what you've discovered about the letter and hand over the copied version of the scroll. The king seems grimly concerned but strangely unsurprised. He calls his advisors to him and they start a hushed conversation. It drags on and on and despite the seriousnes of the situation you start to nod off. Then the kings voice jerks you awake.\nKing: This is a serious matter. We will need to find whoever send this letter, maybe it will lead us to the mastermind of this all. Courier, although you have violated the secrecy of correspondence, your actions have likely saved my life.");
        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
    }

    public void endingCourier2() {
        position = "endingCourier2";
        locationName.setText("Location: City Gate");
        storyText.setText("King: We will need you to stay here at the castle until the matter is settled, and act as a witness. However, saving a life, a king's no less, is something I will not forget. Once this is over I will see to it that you are properly rewarded. You nod, feeling relieved. Although your fate isn't clear yet, at least it doesn't seem like you'll be exiled or executed.\n\n\nA few days later you stand in front of the city gates, a stack of scrolls in your bag.\nYou take a moment to adjust the brand new badge on your chest. The letters 'Royal Courier' gleam in the sunlight. With a smile and a song on your lips you take off to your next destination.");
    }

    public void endMessage() {
        locationName.setText("Location: Void");
        position = "endMessage";
        storyText.setText("Congratulations, you have reached the " + endingName + " ending!\n\nThere are other endings you can get, all you have to do is try other choices throughout the game.\nSo, would you like to try again?");
        choice1.setText("Yes");
        choice2.setText("No");
        choice3.setText("");
    }

    //class for button choices
    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String choice = event.getActionCommand(); //recognises chosen button

            switch (position) {
                case "void" -> {
                    switch (choice) {
                        case "c1" -> {
                            townOutside();
                        }
                        case "c2" -> {
                            death();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "townOutside" -> {
                    switch (choice) {
                        case "c1" -> {
                            townTavern();
                        }
                        case "c2" -> {
                            endGate();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "townTavern" -> {
                    switch (choice) {
                        case "c1" -> {
                            yes();
                        }
                        case "c2" -> {
                            yes();
                        }
                        case "c3" -> {
                            refuse1();
                        }
                    }
                }

                case "yes" -> {
                    switch (choice) {
                        case "c1" -> {
                            payment();
                        }
                        case "c2" -> {
                            accept();
                        }
                        case "c3" -> {
                            refuse2();
                        }
                    }
                }

                case "refuse1" -> {
                    switch (choice) {
                        case "c1" -> {
                            endGate();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }

                case "accept" -> {
                    switch (choice) {
                        case "c1" -> {
                            auntMeet();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "payment" -> {
                    switch (choice) {
                        case "c1" -> {
                            accept();
                        }
                        case "c2" -> {
                            refuse2();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "refuse2" -> {

                    switch (choice) {
                        case "c1" -> {
                            endGate();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }

                case "auntMeet" -> {
                    switch (choice) {
                        case "c1" -> {
                            auntDialogue();
                        }
                        case "c2" -> {
                            goodbye();
                        }
                        case "3" -> {
                            break;
                        }
                    }
                }
                case "goodbye" -> {
                    switch (choice) {
                        case "c1" -> {
                            campfireBad();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "auntDialogue" -> {
                    switch (choice) {
                        case "c1" -> {
                            auntDialogue2();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "auntDialogue2" -> {
                    switch (choice) {
                        case "c1" -> {
                            campfireGood();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "campfireGood" -> {
                    switch (choice) {
                        case "c1" -> {
                            letterRead();
                        }
                        case "c2" -> {
                            unread();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "campfireBad" -> {
                    switch (choice) {
                        case "c1" -> {
                            letterDeath();
                        }
                        case "c2" -> {
                            unread();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "letterRead2" -> {
                    switch (choice) {
                        case "c1" -> {
                            endGate();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "letterRead" -> {
                    switch (choice) {
                        case "c1" -> {
                            letterRead2();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endGate" -> {
                    switch (choice) {
                        case "c1" -> {
                            talk();
                        }
                        case "c2" -> {
                            insult();
                        }
                        case "c3" -> {
                            attack();
                        }
                    }
                }
                case "talk" -> {
                    switch (choice) {
                        case "c1" -> {
                            if (letterOpened == 1) {
                                endThroneroomGood();
                            } else {
                                endThroneroomBad();
                            }
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "insult" -> {
                    switch (choice) {
                        case "c1" -> {
                            if (letterOpened == 1) {
                                endThroneroomGood();
                            } else {
                                endThroneroomBad();
                            }
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "attack" -> {
                    switch (choice) {
                        case "c1" -> {
                            endMessage();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endMessage" -> {
                    switch (choice) {
                        case "c1" -> {
                            start();
                        }
                        case "c2" -> {
                            position = "none";
                            storyText.setText("Thank you for playing.");
                            choice1.setText("");
                            choice2.setText("");
                            choice3.setText("");
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endThroneroomBad" -> {
                    switch (choice) {
                        case "c1" -> {
                            waiting();
                        }
                        case "c2" -> {
                            endingOutlaw();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endThroneroomGood" -> {
                    switch (choice) {
                        case "c1" -> {
                            endingCourier();
                        }
                        case "c2" -> {
                            waiting();
                        }
                        case "c3" -> {
                            endingOutlaw();
                        }
                    }
                }
                case "waiting" -> {
                    switch (choice) {
                        case "c1" -> {
                            endingPrisoner();
                        }
                        case "c2" -> {
                            endingOutlaw();
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endingCourier" -> {
                    switch (choice) {
                        case "c1" -> {
                            endingCourier2();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endingCourier2" -> {
                    switch (choice) {
                        case "c1" -> {
                            endMessage();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endingOutlaw2" -> {
                    switch (choice) {
                        case "c1" -> {
                            endMessage();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endingOutlaw" -> {
                    switch (choice) {
                        case "c1" -> {
                            endingOutlaw2();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
                case "endingPrisoner" -> {
                    switch (choice) {
                        case "c1" -> {
                            endMessage();
                        }
                        case "c2" -> {
                            break;
                        }
                        case "c3" -> {
                            break;
                        }
                    }
                }
            }
        }
    }
}
