import java.util.Scanner;

public class PracticeGame
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner (System.in);
        /*This is just a practice game with no real literary or entertainment value.
        I'm just screwing around with coding, but maybe I can do something fun with this eventually! So yeah.
        *It works pretty simply.If there are no options presented but a chunk of text has been provided, hit enter.
        *If there's options, you just type whatever the prompt asks. If there are multiple options, type whatever the option is word for word.
        Yep! With that out of the way, let's begin!*/

        //stats!
        int health = 20;
        int charm = 0;
        int strength = 0;
        int prick = 0; //this stat is for if you're an asshole
        int daring = 0;
        int intellect = 0;

        //items!
        int woodenSword = 20;
        //commands
        //System.out.println("Your prick stat is" + prick);

        System.out.println("Instructions: If no options are presented and the prompt asks nothing, hit enter.");
        System.out.println("If no options are presented but the prompt asks something, answer the prompt.");
        System.out.println("If options are presented, type the letter of your choice (they're not case sensitive!).");
        keyboard.nextLine();
        System.out.println("You wake up to find yourself sitting on a bed in a messy, vine-ridden cottage. Warm soup sits on a table close by, next to a glass of milk. You see herbs strewn about a table across from your bed, alongside glowing viles and colorful elixirs. The cottage only has one room, but it isn't too cramped. You don't know where you are or how you got here, but you know that you've never been here before. You sit up and are immediatley greeted by a small, fairy like creature.");
        keyboard.nextLine();
        System.out.println("Sprite: Hiya! I'm Maybell! There's so many things we need to do now that you're awake! But first... May I have your name?");
        System.out.println("");
        String name = keyboard.nextLine();
        System.out.println("");
        System.out.println( "Sprite: " + name + " ... what a cool name! What's your favorite color?");
        System.out.println("");
        String color = keyboard.nextLine();
        System.out.println("");
        System.out.println("Sprite: Hey, no way! My favorite color is " + color +" too! I like you already. Oh, what's your favorite thing to do?");
        System.out.println("");
        String hobby = keyboard.nextLine();
        System.out.println("");
        System.out.println("Sprite: That's super neat! I actually had a cousin who did that. We actually have a lot in common! Oh, I almost forgot! I was supposed to ask why you were here! I swear I'd lose my head if it wasn't screwed on. Do you mind telling me what brings you here?");
        System.out.println("");
        System.out.println("A) I don't know  / B)  What's it to you?    / C)   Kiss me and I'll tell you");
        System.out.println("");
        String purpose = keyboard.nextLine();

                                                 // First Choice! //

            if(purpose.equals("C")||purpose.equals("c"))
            {
                charm ++;
                System.out.println("");
                System.out.println("Sprite: No way, " + name + ", we just met! At least take me out first.. a cute fairy like me isn't easy.");
                keyboard.nextLine();
            }
            else if(purpose.equals("A")||purpose.equals("a"))
            {
                System.out.println("");
                System.out.println("Sprite: Oh.. well, that's not good. I promised the chief I'd figure out what the heck a human was doing here! I guess we'll have to figure something out then. I'll take you to see the chief! He asked for you anyways.");
                keyboard.nextLine();
            }
            else if(purpose.equals("B")||purpose.equals("b"))
            {
               System.out.println("");
                prick++;
                System.out.println("Sprite: Hmph, no need to be snooty! If you won't tell me then I can't help you.");
                System.out.println("");
                System.out.println("Ask for help?" + "     A) Yes / B) No");
                System.out.println("");
                String help = keyboard.nextLine();

                                                // Second choice! //

            if (help.equals("A")||help.equals("a"))
            {
                prick = prick - 1;
                System.out.println("");
                System.out.println("Sprite: Help? Sure thing! I'll take you to the village! That was the plan, anyways. Chief wanted a word with you himself.");
                keyboard.nextLine();
            }
            else if(help.equals("B")||help.equals("b"))
            {
                prick++;
                System.out.println("");
                System.out.println("Congrats! You've discovered your prick stat! This can only negatively affect you, so play nice!");
                System.out.println("");
                System.out.println("Sprite: I mean, if you don't want any help, I could just leave you here. I don't need to help you. I'll give you one last chance to accept my help.");
                System.out.println("");
                System.out.println("Accept Maybell's help?" + "    A) Yes / B) No");
                System.out.println("");

                                                // Third choice! //

                String helpTwo = keyboard.nextLine();
                    if (helpTwo.equals("A")||helpTwo.equals("a"))
                    {
                        System.out.println("");
                        System.out.println("Sprite: Alright... you were really close to losing there, bucko. I just want to help you.");
                        keyboard.nextLine();
                    }
                    else if(helpTwo.equals("B") ||helpTwo.equals ("b"))
                    {
                        System.out.println("");
                        System.out.println("Sprite: Alright then...");
                        keyboard.nextLine();
                        System.out.println("Sprite: You can stay here and fend for yourelf...");
                        keyboard.nextLine();
                        System.out.println( "Sprite: Goodluck, " + name + ".");
                        keyboard.nextLine();
                        System.out.println("With Maybell gone, you sit in the cottage for a few hours before deciding what course of action to take. You realize you're hungry and thirsty. You attepmt to hunt, but don't find any prey, or a river for that matter. Not knowing what else to do, you try and find the cabin, but to no avail. You survive for two days before your body is gruesomely ravagaved by a pack of hungry wolves who find you weak and helpless. Game over.");
                        System.exit(1);
                    }
            }

           }

        System.out.println("Sprite: Alrighty then! Get up so we can go to the village! The chief can be very judgemental. You need to look presentable!");
        keyboard.nextLine();
        System.out.println("Ready to leave, you sit up in bed, only to realize you're naked. Naked!? Did this perverted miniature gremlin strip you of your clothes?");
        keyboard.nextLine();
        System.out.println("Sprite: Ah, yeah... your clothes were a bit dirty, so I decided to wash them! Do most humans not shower like you? Anyways, let me find you some more clothes. I tried washing yours and... well... apparently fairy detergent doesn't work so well on human clothes. Who knew, right?");
        keyboard.nextLine();
        System.out.println("Maybell tosses you a " + color + ", human sized tunic and a pair of worn, leather human boots.");
        keyboard.nextLine();
        System.out.println("Sprite: I try to keep things on hand for unexpected visitors. In case you couldn't tell by my supplies, I'm a medicinal sprite! This is just my private hut I use to tend to whatever wounded creatures I should find in the woods. I take care of wounded creatures, all shapes and sizes. I must say though, I'm surprised I still have human clothes. It feels like a millenia since I last heard about a human in these parts, much less saw one! I'll fly out while you put these on, alright? Then we'll get going!");
        keyboard.nextLine();
        System.out.println("Maybell tosses you the clothes and you wait for her to leave before you put them on. Sure enough, they're a perfect fit! The " + color + " goes well with your complexion. Would you like to leave now or stay?");
        System.out.println("");
        System.out.println("A) Leave  / B) Stay");
        System.out.println("");
        String begPath = keyboard.nextLine();

                                                // Fourth Choice! //

                if (begPath.equals("B") ||begPath.equals("b"))
            {
                System.out.println("");
                System.out.println("There isn't much to do in here. Although, you have been eyeing those weird potions since you first came too... try one?");
                System.out.println("");
                System.out.println("A) Yes  / B) No");
                System.out.println("");
                String strangePotions = keyboard.nextLine ();

                                                // Fifth Choice! //

                if (strangePotions.equals("A")||strangePotions.equals("a"))
            {
                System.out.println("");
                System.out.println ("You pick up a glowing potion and drink it. You immediatley drop to the floor and begin writhing helplessly as the world fades to black. Man, if this fariy is supposed to heal people then what just happened? Talk about irnoy. What did you expect, a pair of wings? Game over.");
                keyboard.close();
                System.exit(1);
               }
               else if(strangePotions.equals("B") ||strangePotions.equals("b"))
               {
                   intellect++;
                   System.out.println("");
                   System.out.println("Congrats! you've discovered your intellect stat! You get points for not being stupid.");
                   System.out.println("");
                   System.out.println("You decide the potions may not be a good idea this time around.");
                   keyboard.nextLine();
               }
            }

                System.out.println("");
                System.out.println("You decide you shouldn't keep Maybell waiting. You step out the door, and your adventure begins.");
                keyboard.nextLine();
                                              //choice!//
                System.out.println("Now's a good time to check your stats!      A) show me!   /   B) I'm okay");
                System.out.println("");
                String shdjsj = keyboard.nextLine();
                if (shdjsj.equals("A")||shdjsj.equals("a"))
                System.out.println("");
                {
                    System.out.println("Your stats are health: " + health + "   strength: " + strength + "   intellect: " + intellect + "    daring: " + daring + "   prick: " + prick + ".");
                    keyboard.nextLine();
                }

                System.out.println("As you're following Maybell through the forest, you can't help but admire the scenery. Fireflies mosey around and light up the path, tree sap fills the air with a sweet, tantalizing aroma, and you occasionally catch glimpses of exotic wildlife. You don't know where you're from, but wherever that is, its beauty cannot compare to this. ");
                keyboard.nextLine();
                System.out.println("Sprite: Hey... I'm sure this is a touchy subject, but don't you remember anything at all? Family? Friends? Your home?");
                System.out.println("");
                System.out.println("A) Nope, not a thing.    /  B)  You're right, that's a touchy subject...    /  C)  Kiss me and I might consider telling");
                System.out.println("");
                String touchy = keyboard.nextLine ();
                System.out.println("");

                                                    // Sixth Choice! //

                if(touchy.equals("A") ||touchy.equals("a"))
                {
                    System.out.println("Sprite: Oh man, that's tough. Well, the village Oracle could possibly help recover them! It's always worth a shot. Besides, it'd at least be nice for you to meet her. We'll pay her a visit when we get there!");
                    keyboard.nextLine();
                }
                else if(touchy.equals("B")||touchy.equals("b"))
                {
                    System.out.println("Sprite: Yeah, I get it. Sorry I asked... Well, it may be in your best interest to pay the oracle a visit to help you sort things out if you've got any issues.");
                    keyboard.nextLine();
                }
                else if (touchy.equals("C")||touchy.equals("c"))
                {
                    charm ++;
                    System.out.println("Sprite: Nice try " + name + ", but you'll have to try harder than that!");
                    keyboard.nextLine();
                }

                System.out.println("You may or may not be letting it on, but you appreciate Maybell's company. You'd be lost without her.");
                System.out.println("Everything is going smoothly. You haven't been talking to Maybell much, but you're enjoying yourself.");
                System.out.println("You hear something to your right. You jerk your head to look at it, fearful of bandits or the like. You see that it's just a cute little squirell! You stop for a second to look at it until- snap!");
                keyboard.nextLine();
                System.out.println("You suddenly find yourself dangling from your foot in a tree, like meat dangled in a lion's den. Nobody wants to be stuck in a lion's den. Yell, or wait for Maybell to notice you're stuck?");
                System.out.println("");
                System.out.println("A) Yell    /  B)  Wait");
                System.out.println("");
                String trapUno = keyboard.nextLine();

                                                // Seventh Choice! //

                if(trapUno.equals("B")||trapUno.equals("b"))
                {
                    System.out.println("");
                    System.out.println("You decided to stay put! Maybell heard the trap go off and silently zipped over to help you out of it! Unfortunately, her faint glow was just bright enough to be spotted by attackers!");
                    keyboard.nextLine();
                }
                else if (trapUno.equals("A")||trapUno.equals("a"))
                {
                    System.out.println("");
                    System.out.println("You decide to yell! Maybell hears you and flies over as soon as she possibly can! Unfortunately, your yell alerted attackers that their trap worked!");
                    keyboard.nextLine();
                }

                System.out.println("Good job, " + name + "! You've triggered your first battle worse than a redditor with >10,000 karma and discovered your strength stat! There are also secret stats, so play wisely!");
                keyboard.nextLine();
                System.out.println("Three goblins jump out from their hiding spots and surround you and Maybell! Fight, or flee?");
                System.out.println("");
                System.out.println("A) Fight    /  B)  Flee");
                System.out.println("");
                String battleUno = keyboard.nextLine();
                System.out.println("");

                                                // Eighth Choice! //

                if(battleUno.equals("B")||battleUno.equals("b"))
                {
                    strength = strength -1;
                    daring = daring - 2;
                    System.out.println("Yeah, nice try bud. You're surrounded. Don't be a soy boy.");
                    keyboard.nextLine();
                }
                if(battleUno.equals("A")||battleUno.equals("a"))
                {
                    daring = daring ++;
                    strength = strength --;
                }

                System.out.println("You have to attack one of the three goblins. Attack 1, 2, or 3?");
                System.out.println("");
                System.out.println("Enter a number: 1    /    2    /    3");
                System.out.println("");

                                                // Ninth Choice! //

                String goblinchoiceuno = keyboard.nextLine();
                System.out.println("");
                System.out.println("You've chosen to attack goblin " + goblinchoiceuno + "! You throw a rock at it. It misses, but it chases it into a stream and the two others chased after.");
                keyboard.nextLine();
                System.out.println("Congratulations! You succesfullly won your first enemy encounter!");
                keyboard.nextLine();
                System.out.println("Sprite: Geeze " + name + ", that was scary! I'm glad those goblins were foolish enough to fall for that. I know I'm supposed to care for all creatures, but goblins just give me the heebie jeebies! I wonder why they decided to attack... this can't be any good.");
                keyboard.nextLine();
                System.out.println("You arrive in the village. It appears there's a festival going on!");
                System.out.println("");
                System.out.println("Where would you like to go?");
                System.out.println("");
                System.out.println("A) carnival booth");
                System.out.println("");
                String festivalBooth = keyboard.nextLine();




                //FIRST MAJOR STORYLINE!!!!!!




                if (festivalBooth.equals("A")||festivalBooth.equals("a"))
                {
                    System.out.println("");
                    System.out.println("You point excitedly at the canival booths, looking at Maybell for permission.");
                    keyboard.nextLine();
                    System.out.println("Sprite: Haha sure, why not " + name +"?");
                    keyboard.nextLine();
                    System.out.println("You run excitedly to the carnival booth with Maybell close behind. You decide to go to the balloon popping booth. You reach into your pocket and realize you don't have any money! You look dejectedly at Maybell before a couple htoughts cross your mind. You could probably earn tickets, but that kid just has his hanging out of his pocket...");
                    System.out.println("");
                    System.out.println("A) Steal from the child!   /   B) Ask Maybell if there's a way to work");
                    System.out.println("");
                    String kidSteal = keyboard.nextLine();
                    String kidStealMaybe = "";
                    {
                        if (kidSteal.equals("B")||kidSteal.equals("b"))
                        {
                            System.out.println("");
                            System.out.println("Are you sure? That could take some extra time. It may be worth it to let your prick stat take a hit.");
                            System.out.println("");
                            System.out.println("A) Yep, totally sure. I'm not a thief.   /   B) My stat can take a hit. Nothing a little kindness can't fix.");
                            System.out.println("");
                            kidStealMaybe = keyboard.nextLine();
                            System.out.println("");
                            if (kidStealMaybe.equals("A"))
                            {
                                System.out.println("Alrighty then! Good on you! Intellect +1 and prick -2!");
                                prick = prick -2;
                                intellect = intellect ++;
                            }




//SECOND MAJOR STORYLINE


                        }
                        if(kidSteal.equals("A")||kidSteal.equals("a") || kidStealMaybe.equals ("B")||kidStealMaybe.equals("b"))
                        {
                            System.out.println("");
                            System.out.println("You spot the kid. All alone. Nowhere near its parents. It's eyeing down some prizes at the baloon popping booth, the same one you were going to. You creep up behind it and it seems totally unaware of the imminent threat heading its way. You go to grab the tickets and...");
                            keyboard.nextLine();
                            System.out.println("Bingo! You got it! Looks like you got the easy way out!");
                            keyboard.nextLine();
                            System.out.println("");
                            System.out.println("Except, uh oh! What's this? The kid has a miniature sword!");
                            System.out.println("");
                            System.out.println("Give back the tickets? Or fight?   A) Give back the tickets   / B) Fight!");
                            keyboard.nextLine();
                            System.out.println("Before you get the chance to decide, the little shit stabs you in the leg! Its parents should've taught it better.");
                            System.out.println("");
                            System.out.println("You grab the nearest weapon, a throwing dart from the carnival booth.");
                            System.out.println("");
                            System.out.println("A) Kill the kid.");
                            System.out.println("");
                            String kidMurder = keyboard.nextLine();

                            if(!kidMurder.equals("A")||!kidMurder.equals("a"))
                            {
                                System.out.println("You chose this. Kill the kid.");
                                System.out.println("");
                                System.out.println("A) Kill the kid.");
                                keyboard.nextLine();
                                System.out.println("");
                            }
                        }
                    }
                }
                System.out.println("That's all I've got written so far! Thanks for playing!");
    }
}