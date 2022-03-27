public class Campfire {
    public void campfire(){ //only happens if stopped at the inn
        
        if(paper = true){
        System.out.println("Because of your stop at the strange girl's place, night falls just as you're in the middle of a forest.\nYou set up a campfire and open your bag to get some food, when the sheet of black paper falls out.\n You pick it up and notice that at the places, where the paper was touching with the king's scroll,\nthe color was gathering into faint letters\nIt occurs to you that perhaps this paper can reveal the content of sealed messages.\n Theoretically you could use it to look into the scroll you're carrying... but should you?");
        System.out.println("1) Yes... for the safety of the king, of course!");
        System.out.println("2) No, I should respect the secrecy of correspondence.");
        choice = sc.nextInt();
        
        switch(choice){
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
        
        switch(choice){
            case 1 -> {
                System.out.println("You break the seal off and unfurl the scroll while reading.\nSoon, your mouth is hanging open and your hands are shaking.\nAlthough you didn't really know what to expect, it certainly wasn't a hateful letter full of threats.\nThen you feel the color drain from your face when you unroll the scroll fully and see thesymbol inscribed on the lower half.\nYou don't have to be an expert to recognise it as a lethal curse.\n You throw the scroll on the ground, but it's too late. You feel your whole body tingling before your vision fades to black.\nIn the following days, people would come looking for you, but all they find is an empty campsite and a blank scroll. ");
                death();
            }
            }
            case 2 -> {
                System.out.println("You fold the paper and place it back in your bag, making sure it's completely separated from the scroll.\nYou cook your dinner, eat and go to sleep, trying to keep your eyes off your bag.\nBut despite your decision, you can't stop thinking about what is in that scroll");
                System.out.println("Come morning you pack up and head towards the capital, the faint outline already visible on the horizon");
                endGate();
            }
        } 
    }
}
