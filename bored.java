import java.util.Scanner;
import java.io.*;
public class bored
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ARE YOU BORED??");
        Thread.sleep(500);
        System.out.println("           v.3.2          ");
        Thread.sleep(500);
        System.out.println("");
        for(int i=0;i<5;i++)
            System.out.println("");
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        Thread.sleep(200);
        for(int i=0;i<30;i++)
            System.out.println("");
        System.out.println("MENU");
        System.out.println("1. Guess the word");
        System.out.println("2. Rock, Paper, Scissors");
        System.out.println("3. Wacky Story Creator");
        System.out.println("4. Magic 8 Ball   [POPULAR]");
        System.out.println("5. Mystery Pathway: Need Some Broccoli");
        System.out.println("6. Lucky Room");
        System.out.println("7. Mystery Pathway: Time Trouble");
        System.out.println("");
        System.out.println("Enter a choice[number] or for random game enter 'Y' or to end game enter 'N'!");
        for(int i=0;i<5;i++)
            System.out.println("");
        int x=1;
        int points=0;
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        int p6=0;
        int pass1=0;
        int brocpass=0;
        int nbroc=1234;
        int nplay=0;
        char end='y';
        int present=1;
        int l;
        System.out.println("Enter choice (or) Y");
        end=sc.next().charAt(0);//putting Y here doesn't work, fix it
        while(x!=0)
        {
            Thread.sleep(1000);
            nplay++;
            l=(int)(Math.random()*7)+1;
            int adm=Character.getNumericValue(end);
            if(adm>0&&adm<=7)
            {
                l=adm;
                System.out.println("<Choice=["+l+"]>");
            }
            else
                System.out.println("Randomly choosing a game for you to play...");
            for(int i=0;i<10;i++)
                System.out.println("");
            Thread.sleep(700);
            switch(l)
            {
                case 1: 
                    System.out.println("You got the game: 'Guess the Word'");
                    System.out.println("From the following list, I will have any word in my mind, try to Guess the Word correctly!!");
                    System.out.println("List:");
                    System.out.println("Apple");
                    System.out.println("Ball");
                    System.out.println("Bottle");
                    System.out.println("Pizza");
                    System.out.println("Clock");
                    String guess[]={"Apple","Ball","Bottle","Pizza","Clock"};
                    int g=(int)(Math.random()*5);
                    String ans=guess[g];
                    for(int i=0;i<2;i++)
                        System.out.println("");
                    System.out.print("Your Guess: ");
                    String uguess=sc.next();
                    System.out.print("checking..");
                    Thread.sleep(700);
                    System.out.print("..are you correct?");
                    System.out.println("");
                    Thread.sleep(1000);
                    if(uguess.equals(ans))
                    {
                        System.out.println("Correct!!");
                        points+=10;
                        p1+=10;
                    }
                    else
                    {
                        System.out.println("Wrong :(");
                        System.out.println("Correct Answer: "+ans);
                        System.out.println("Better Luck Next Time!!");
                    }
                    break;

                case 2:
                    System.out.println("You got the game: 'Rock, Paper, Scissors'");
                    System.out.println("Enter 'ROCK', 'PAPER' or 'SCISSORS' in each round. Good Luck! [First to get 5 points wins!]");
                    System.out.println("");
                    int n=1;
                    String complay[]={"Rock","Paper","Scissors"};
                    int point=0,upoint=0;
                    while(upoint!=5 && point!=5)
                    {
                        System.out.println("Round "+n+":");
                        System.out.print("You put: ");
                        String uplay=sc.next();
                        int p=(int)(Math.random()*3);
                        String play=complay[p];
                        System.out.println("Computer put: "+play);
                        System.out.println("--------");
                        if((play.equals("Scissors") && uplay.equals("ROCK")) || (play.equals("Paper") && uplay.equals("SCISSORS")) || (play.equals("Paper") && uplay.equals("SCISSOR")) || (play.equals("Rock") && uplay.equals("PAPER")))
                        {
                            upoint++;
                            System.out.println("Computer:- "+point);
                            System.out.println(name+":- "+upoint);
                        }
                        else if(play.equalsIgnoreCase(uplay) || (play.equals("Scissors") && uplay.equals("SCISSOR")))
                        {
                            System.out.println("DRAW");
                            System.out.println("Computer:- "+point);
                            System.out.println(name+":- "+upoint);
                        }
                        else
                        {
                            point++;
                            System.out.println("Computer:- "+point);
                            System.out.println(name+":- "+upoint);
                        }
                        n++;
                        System.out.println("");
                        System.out.println("");
                    }
                    if(upoint==5)
                    {
                        System.out.println("Good Job! You Won!");
                        points+=5;
                        p2+=5;
                    }
                    else
                    {
                        System.out.println("Computer Won!");
                        System.out.println("Better Luck Next Time!!");
                        points+=upoint;
                        p2+=upoint;
                    }
                    break;

                case 3:
                    System.out.println("You got the game: 'Wacky Story Creator'");
                    System.out.println("Answer the following questions:");
                    System.out.println("");
                    System.out.print("Favorite Color: ");
                    String s1=sc.next();
                    System.out.print("Favorite Food: ");
                    String clear=sc.nextLine();
                    String s2=sc.nextLine();
                    System.out.println("Any 2 actions [Ex. running, eating, playing,etc.]: ");
                    System.out.print("Action 1: ");

                    String s3=sc.nextLine();
                    System.out.print("Action 2: ");

                    String s4=sc.nextLine();
                    String place[]={"Bouncy House", "Castle", "Beach", "Auto Stand", "School", "Restaurant", "Airport", "Playground", "Hospital", "Swimming Pool", "Hotel"};
                    int pl=(int)(Math.random()*11);
                    String s5=place[pl];
                    System.out.println("Enter any two characters: ");
                    System.out.print("Character 1: ");
                    String s6=sc.next();
                    System.out.print("Character 2: ");
                    String s7=sc.next();
                    String person[]={"brother", "sister", "cow", "grandmother", "grandfather", "dog", "teacher", "cousin","cat"};
                    int per=(int)(Math.random()*9);
                    String s8=person[per];
                    String emot[]={"and started laughing", "and got surprised", "and took a picture", "and started crying"};
                    int em=(int)(Math.random()*4);
                    String s9=emot[em];
                    String time[]={"The very next moment, ", "After they both turned old, ", "After many years, ", "After buying an apple, "};
                    int tm=(int)(Math.random()*4);
                    String s10=time[tm];
                    String plac[]={"house", "mansion", "classroom"};
                    int pla=(int)(Math.random()*3);
                    String s11=plac[pla];
                    String cur[]={"great curiousity", "a feeling of disgust", "sheer disappointment","jealousy"};
                    int cu=(int)(Math.random()*4);
                    String s12=cur[cu];
                    String noti[]={"his hands", "his food", "the sky",s7};
                    int not=(int)(Math.random()*4);
                    String s13=noti[not];
                    System.out.println("");
                    System.out.println("creating story...");
                    Thread.sleep(1000);
                    System.out.println("");
                    System.out.println("Generated Story:");
                    System.out.println("One Day, "+s6+" looked outside the window of his "+s11+" and saw "+s7+" "+s3+" with his "+s8+", with "+s12+", "+s6+" started eating some "+s2+". However, suddenly, he noticed that "+s13+" turned "+s1+" "+s9+". "+s10+s6+" took "+s7+" to the "+s5+" and they both were "+s4+" there. The End!");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Hope the story's Wacky! :D");
                    points+=5;
                    p3+=5;
                    break;

                case 4:
                    System.out.println("You got the game: 'Magic 8 Ball'");
                    System.out.println("Enter a YES or NO Question and the Magic 8 Ball will answer it for you!");
                    Thread.sleep(500);
                    String ar[]={"Yes", "No", "Maybe", "50/50", "Of Course", "Definitely Not!","It is certain","Signs point to No"};
                    System.out.println("");
                    System.out.println("What Question would you like to ask the Magic 8 Ball?");
                    String magic=sc.next();
                    System.out.println("The Magic 8 Ball is processing your question...");
                    Thread.sleep(2000);
                    System.out.print("Answer: ");
                    int a=(int)(Math.random()*8);
                    System.out.println(ar[a]);
                    System.out.println("");
                    String clar=sc.nextLine();
                    points+=2; 
                    p4+=2;
                    break;

                case 5:
                    System.out.println("You got the game: 'Mystery Pathway: Need Some Broccoli'");
                    if(brocpass==1)
                    {
                        System.out.println("You have completed this story! Would you like to restart? Y/N");
                        char chbroc=sc.next().charAt(0);
                        if(chbroc=='Y')
                            nbroc=1234;
                        else
                        {
                            System.out.println("Skipping Game..");
                            nbroc=0;
                        }
                    }
                    if(nbroc==1234)
                    {
                        System.out.println("Now, you are going to be put in a story, make choices carefully and try to survive!");
                        System.out.println("");
                        System.out.println("You are going to a supermarket to buy some broccoli since your mom asked you to. But then suddenly, the air becomes cold and windy and the sun slowly gets dimmer..BAMM, Thunder. You decide to go into some shelter until the storm ends.");
                        Thread.sleep(1000);
                        System.out.println("1.Go inside spooky house which is right next to you");
                        System.out.println("2.Run to the supermarket");
                        System.out.println("3.Return back home");
                        System.out.print("Your choice: ");
                        int ch1=sc.nextInt();
                        int win=1;
                        if(ch1==2)
                        {
                            System.out.println("You run as fast as you can to the supermarket!! You're so close to reaching the doorway, just seconds away.. when suddenly LIGHTNING..CRACK...it strikes you..the world around you goes black..");
                            win=0;
                        }
                        else if(ch1==3)
                        {
                            System.out.println("Dun Dun..Dun Dun..your heart is beating as you race past the wind back to the safeness of your home...but without the key thing that you came out for, the broccoli...You reach home, open the door but without the broccoli..'There's thunder, I couldn't buy the brocoli', 'You're just making excuses since you don't want to eat healthy!!' *Gets beaten*...");
                            win=0;
                        }
                        else if(ch1==1)
                        {
                            System.out.println("You notice that the door of the spooky house is wide open..A perfect area to rest till the storm ends! You walk in with caution when suddenly the door SLAMS shut behind you!");
                            Thread.sleep(1000);
                            System.out.println("1.Open the door");
                            System.out.println("2.Walk into the kitchen");
                            System.out.print("Your choice: ");
                            int ch=sc.nextInt();
                            if(ch==1)
                            {
                                System.out.println("Frightened, you drop the bag you were carrying and rush to open the door. You grab onto the doorknob to open it but suddenly, lightning strikes the other side of the doorknob...you feel electricity entering into you..you fall flat on the floor behind you..");
                                win=0;
                            }
                            else if(ch==2)
                            {
                                System.out.println("Realizing that the wind probably pushed the door close, you walk into the kitchen, where a small candle is burning. You look around to see if anybody is there but just notice a fridge, a faucet, and a chair");
                                Thread.sleep(1000);
                                System.out.println("1. Turn on faucet");
                                System.out.println("2. Open fridge");
                                System.out.println("3. Sit on chair");
                                System.out.print("Your choice: ");
                                ch=sc.nextInt();
                                if(ch==1)
                                {
                                    System.out.println("Your hands feel cold so you hope to warm them up under some hot water. You walk towards the faucet and turn on the hot valve...Suddenly extremely hot water touches your hand and you yelp in shock...quickly moving back, you hit your head on a wooden shelf...the world around you goes black..");
                                    win=0;
                                }
                                else if(ch==3)
                                {
                                    System.out.println("Your legs are tired and weakened so you decide to sit on the wooden chair right in front of you in the kitchen...ahh it feels so relaxing to finally sit down after all you've been through...but suddenly, CREAK, the chair had been infested by termites which completely weakened the legs of the chair, BAM, the chair falls down, with you in it and you hit your head on the floor..the world around you goes black..");
                                    win=0;
                                }
                                else if(ch==2)
                                {
                                    System.out.println("You notice a large fridge in the kitchen when suddenly you hear your stomach growling, your extremely hungry since you did not even eat lunch yet. You open the fridge and notice a bag full of fresh green broccoli!");
                                    Thread.sleep(1000);
                                    System.out.println("1. Take the broccoli");
                                    System.out.println("2. Leave the broccoli");
                                    System.out.print("Your choice: ");
                                    ch=sc.nextInt();
                                    if(ch==1)
                                    {
                                        System.out.println("'Finally! Yess, I can finally go home!' You grab the broccoli and turn around but to your shock, there is an old woman standing right there. She picks up her walking stick and BAM, hits you and takes the broccoli back from you..'You little stealer!, How dare you come into my house'..the world around you goes black..");
                                        win=0;
                                    }
                                    else if(ch==2)
                                    {
                                        System.out.println("'Hmm..I don't even know who lives here, I shoudln't take anything'...you close the fridge back and turn around to head back home but to your shock, there is an old woman standing right there. 'Who are you and what are you doing in my house??!!' You explain everything and say sorry for coming into the house uninvited..The old lady comforts you and offers you the bag of broccoli for your troubles. You thank her and see that the storm has ended, the clouds disappear. You walk back home glad and joyful for making the right choices. When you reach home, your mom worried about what took so long, hugs you and quickly makes your favorite broccoli fry and you finally eat your lunch filling your hunger!");
                                        win=2;
                                    }
                                }
                            }
                        }
                        if(win==2)
                        {
                            Thread.sleep(1000);
                            System.out.println("Good Job and good choices. You have passed and survived the story!");
                            brocpass=1;
                            nbroc=0;
                            points+=10;
                            p5+=10;
                        }
                        else if(win==0)
                        {
                            Thread.sleep(1000);
                            System.out.println("Oh No! Looks like you made a wrong choice! Better Luck Next Time!");
                            brocpass=0;
                        }
                        else
                            System.out.println("Oops! Looks like you wrote a non-existant option! Try again next time!");
                    }
                    break;

                case 6:
                    int n6=luckyroom.playgame6();
                    points+=n6;
                    p6+=n6;
                    break;

                case 7:
                    int n7=pathway2.playgame7(pass1);
                    if(n7==1234)
                    {
                        pass1=0;
                        n7=pathway2.playgame7(pass1);
                    }
                    if(n7>0)
                    {
                        pass1++;
                        points+=n7;
                        p5+=n7;
                    }
            }   

            System.out.println("");
            System.out.println("");
            System.out.println("Are you still bored? Enter choice (or) Y (or) N");
            end=sc.next().charAt(0);
            if(end=='N')
            {
                System.out.println("Ok! I hope you enjoyed playing! Good Bye!!");
                x=0;
                break;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("creating certificate...");
        Thread.sleep(2000);
        for(int i=0;i<10;i++)
            System.out.println("");
        System.out.println("______________________________________________________________________");
        System.out.println("|                  ARE YOU BORED?? User Certificate                  |");
        String col="|  Name: "+name;
        int len=col.length();
        if(len>69)
        {
            col=col.substring(0,69);
        }
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        System.out.println("|                                                                    |");
        col="|      Number of Games Played= "+nplay;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        System.out.println("|    ------------------------------------------------------------    |");
        col="|                  Guess the Word -->  "+ p1;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        col="|                Rock, Paper, Scissors -->  "+ p2;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        col="|                Wacky Story Creator -->  "+ p3;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        col="|                  Magic 8 Ball -->  "+ p4;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        col="|                  Mystery Pathway -->  "+ p5;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        col="|                    Lucky Room -->  "+ p6;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        System.out.println("|                                                                    |");
        col="|                                        Total Points -->  "+ points;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(69-len);i++)
            System.out.print(" ");
        System.out.println("|");
        System.out.println("|                                                                    |");
        System.out.println("______________________________________________________________________");
        /*for(int i=0;i<10;i++)
            System.out.println("");
        FileWriter fr=new FileWriter("boredpoints.txt",true);
        BufferedWriter br=new BufferedWriter(fr);
        PrintWriter pr=new PrintWriter(br);
        pr.write(name+" -> "+points);
        pr.write("\n");
        pr.close();
        fr.close();
        br.close();*/
    }
}