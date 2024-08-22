import java.util.Scanner;
public class pathway2
{
    public static int playgame7(int pass1) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You got the game: 'Mystery Pathway: Time Trouble'");
        int n=0;
        if(pass1==0)
        {
            System.out.println("Now, you are going to be put in a story, make choices carefully and try to achieve the goal!");
            System.out.println("");
            System.out.println("It's a hot summer day, you enter the Time Travel Research Centre(TTRC), for an interview that you've been practicing and working hard for your entire life! You enter the interview room and see 2 interviewers sitting in big chairs.");
            Thread.sleep(1000);
            System.out.println("1.Sit down in the chair in front of them");
            System.out.println("2.Greet the interviewers and offer a handshake");
            System.out.print("Your choice: ");
            int ch1=sc.nextInt();
            int pass=0;
            if(ch1==2)
            {
                System.out.println("You go towards the interviewers and introduce yourself. Then you give them both an handshake. They smile and tell you to sit down.");
                Thread.sleep(1000);
                System.out.println("1.Sit Down");
                System.out.println("2.Order a burger for them and then sit down");
                System.out.print("Your choice: ");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    System.out.println("You smile back and sit down on the chair. Then the interviewer asks for your documents to see your strengths and weaknesses.");
                    Thread.sleep(1000);
                    System.out.println("1.Give your portfolio");
                    System.out.println("2.Give your ID");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        pass=1;
                    }
                    else if(ch==2)
                    {
                        System.out.println("You handover your school ID card to the interviewer and they look confusedly at you and tell that they need to see your portfolio. You realise that you came unprepared to the interview and upset, turn back and go home.");
                        pass=0;
                    }
                }
                else if(ch==2)
                {
                    System.out.println("Feeling extra generous, you tell the interviewers to wait for 5 minutes and quickly run to a McDonald's next to the TTRC. You enter the restaurant.");
                    Thread.sleep(1000);
                    System.out.println("1.Look at the Menu");
                    System.out.println("2.Order 2 chicken burgers");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.println("You carefully look at the menu from top to bottom and try to find the best item to give to the interviewers");
                        Thread.sleep(1000);
                        System.out.println("1.Order 2 Veg Burgers");
                        System.out.println("2.Order 2 icecreams");
                        System.out.println("3.Order 3 Cups of Soda");
                        System.out.print("Your choice: ");
                        ch=sc.nextInt();
                        if(ch==1)
                        {
                            System.out.println("'I would like 2 Veg Burgers please', the waiter goes inside the kitchen and starts making the veg burgers. You sit down at a table looking at your phone. After 20 minutes of waiting, the waiter arrives to your table and gives you the 2 burgers apologizing for the long wait time caused due to the vegetables needing to be shipped from a factory. You take the burgers and go to the interview room.");
                            Thread.sleep(1000);
                            System.out.println("To your surprise, the room is empty, upon questioning a security guard, you come to know that the interviewers had another work to do so had to leave since I had come too late");
                            pass=0;
                        }
                        else if(ch==2)
                        {
                            System.out.println("You look outside and get an idea to buy 2 icecreams due to the very hot climate. You order the 2 icecreams but the waiter tells you that the icecream machine is broken. You remain adamant and ask him to get it fixed and then give it. THe waiter calls some mechanics and after 1 hour the icse cream machine starts working and you get the 2 icecreams. You look at your watch, notice that you are late and quickly run to the interview room.");
                            Thread.sleep(1000);
                            System.out.println("To your surprise, the room is empty, upon questioning a security guard, you come to know that the interviewers had another work to do so had to leave since I had come too late. Sad, you take one icecream for yourself and give the other one to the security guard and head back home.");
                            pass=0;
                        }
                        else if(ch==3)
                        {
                            System.out.println("You decide to buy 3 cups of ice cold soda since its so hot and you want one too. The waiter gives you the soda within 2 minutes and you go back into the interview room. The interviewers are delighted to see this refreshing drink during this hot climate.");
                            Thread.sleep(1000);
                            System.out.println("The three of you drink the soda and get refreshed. The interviewers tell that they were exhausted and thank you a lot a for this kind gesture! Then they ask for your portfolio to see your strengths and weaknesses.");
                            pass=1;
                        }
                    }
                    else if(ch==2)
                    {
                        System.out.println("'May I have 2 chicken burgers, please', you order the food and pay for it, and within a few minutes, the food is ready and the waiter brings it to you asking whether you would like it to go or packed.");
                        Thread.sleep(1000);
                        System.out.println("1.To Go");
                        System.out.println("2.Packed");
                        System.out.print("Your choice: ");
                        ch=sc.nextInt();
                        if(ch==1)
                        {
                            System.out.println("'I would like it To Go', the waiter leaves the two burgers on your table and you pick them up and head back to the interview room. However, suddenly, you trip over a rock on the sidewalk and one of the burgers fall down, since it was To Go, the burger got completely ruined. Frustrated, you gave up and decided to go home.");
                            pass=0;
                        }
                        if(ch==2)
                        {
                            System.out.println("'Can you please pack it', the waiter brings a bag and packs the two burgers safely. You then thank him and walk towards the interview room. The interviewers look curiously at the bag and ask what you have brought. You open the cover and give them each the burger.");
                            Thread.sleep(1000);
                            System.out.println("'Hey, is this chicken?', I'm sorry but we both are vegetarian. Shocked, you take the burgers away from them and apologize. You notice that the two burgers are getting cold so you eat both the burgers there in front of them. The two interviewers do not like what you are doing and dismiss you.");
                            pass=0;
                        }
                    }
                }
            }
            else if(ch1==1)
            {
                System.out.println("You sit down in the chair in front of them. The interviewers tell you that you should be more polite and that you should've introduced yourself first. They lose interest in you due to this behaviour and dismiss you.");
                pass=0;
            }
            if(pass==1)
            {
                System.out.println("You take out your portfolio from your bag and hand it to them.");
                Thread.sleep(1000);
                System.out.println("They examine the portfolio and with a smile on their faces, they welcome you and tell that you have what is needed for this job!");
                Thread.sleep(1000);
                System.out.println("Wonderful! You have passed Level 1 of the story!");
                n+=10;
            }  
            else if(pass==0)
            {
                 Thread.sleep(1000);
                 System.out.println("Oh No! Looks like you made a poor choice! Better Luck Next Time!");
            }
            else
            System.out.println("Oops! Looks like you wrote a non-existant option! Try again next time!");
        }
        if(pass1==1)
        {
            System.out.println("Now, you are going to be put in Level 2 of this story, make choices carefully and try to achieve the goal!");
            System.out.println("");
            System.out.println("Soon, a manager comes to you and shows you to a lab in the top floor of the building. Here, he tells you that you will be the first human to test time travel.");
            Thread.sleep(1000);
            System.out.println("1.Accept the offer");
            System.out.println("2.Decline the offer and tell that you would like to get some more information on this experiment first.");
            System.out.print("Your choice: ");
            int ch1=sc.nextInt();
            int pass=0;
            if(ch1==1)
            System.out.println("'Sure! Thank you so much for this opportunity'");
            if(ch1==2)
            {
                System.out.println("'The first ever human?, Are you sure its safe?'. 'Thats why we need you to test it, to check if it's safe or not'. 'Umm, can I please work at a lower job first and then build up to this, I think I need more experience in this project before I do such a thing'. 'Sure, that's not a problem!'. You are made assistant manager of the time travel project.");
                Thread.sleep(1000);
                System.out.println("After 2 months of working on the project, you finally believe in its safety and soon you start practicing for it!");
                ch1=1;
            }
            if(ch1==1)
            {
                System.out.println("Many employees train you to become fit and able for time travel. They take many precautions to ensure your safety.");
                Thread.sleep(1000);
                System.out.println("Soon, the day has come. You're going to be the first ever human to do time travel. Before leaving your home, your mother suggests you to take something with you just incase you need it.");
                System.out.println("1.Take a pencil");
                System.out.println("2.Take an apple");
                System.out.println("3.Take a watch");
                System.out.println("4.Take a iron ring");
                System.out.print("Your choice: ");
                int ch=sc.nextInt();
                String s1="You wear the Iron Suit since it is very strong and would definitely withstand any forces that may act on you during the time travel. \n";
                String s2="You wear the Space Suit since you have a feeling that there may not be breathable air when you are travelling in time \n";
                String s3="You wear the Cotton Suit as you want to feel as lightweight as possible so that you can easily pass through time \n";
                String s4="The scientists get the time machine ready. Your heart is beating crazily and everyone in the lab starts wishing you good luck. Then you step into the time machine. BEEP, the chief scientist clicks on a button, and you VANISH into the machine! \n";
                String s5="Everything turns black around you and slowly your vision gets restored. You find yourself speeding with just fast beams of light passing all around you. Wow, you exclaim but can't hear your own voice as you're going much faster than the speed of sound! \n";
                String s6="You panick and move fast but it does not help and soon you get lost in an endless void of infinite space and time.";
                if(ch==1)
                {
                    System.out.println("You take a pencil since it would be useful to write important things that you would see in your journey that you don't want to forget. \n");
                    Thread.sleep(1000);
                    System.out.println("Then you walk towards the labaratory nervous and excited. There, the employees greet you and let you choose the suit that you want to wear. They inform you that each has its advantages and disadvantages.");
                    System.out.println("1.Iron Suit");
                    System.out.println("2.Space Suit");
                    System.out.println("3.Cotton Suit");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.println(s1);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You quickly take out a pencil from inside your suit and try to write down what your experiencing. However, the pencil flies behind you and dissapears into the light. You try to catch it but lose balance and fall back. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==2)
                    {
                        System.out.println(s2);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You try reaching to grab the pencil out of your pocket but due to the thick bulky space suit, you're unable to. You try to bend a bit more but accidently tear your suit. You suddenly lose balance and fall back. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==3)
                    {
                        System.out.println(s3);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You quickly grab the pencil from your inside your shirt and write what your experiencing but suddenly, the pencil flies behind you and disappears into the light. You try to catch it but accidently lose balance and fall back. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                }
                else if(ch==2)
                {
                    System.out.println("You decide to take an apple with you just incase you feel hungry during the time travel journey. \n");
                    Thread.sleep(1000);
                    System.out.println("Then you walk towards the labaratory nervous and excited. There, the employees greet you and let you choose the suit that you want to wear. They inform you that each has its advantages and disadvantages. \n");
                    System.out.println("1.Iron Suit");
                    System.out.println("2.Space Suit");
                    System.out.println("3.Cotton Suit");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.println(s1);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("Soon you become hungry since due to the fast time travel. You take out the apple from inside your suit and eat it. However, due to some chemical and time reaction, the iron of the suit poisoned the apple and when you ate it, you fell asleep. When you wake up you realise that you have lost balance and cannot get back up. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==2)
                    {
                        System.out.println(s2);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("Soon you become hungry since due to the fast time travel. You try reaching to grab the apple out of your pocket but due to the thick bulky space suit, you're unable to. You try to bend a bit more but accidently tear your suit. You suddenly lose balance and fall back. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==3)
                    {
                        System.out.println(s3);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("Soon you become hungry since due to the fast time travel. You grab the apple effortlessly from your suit and bite into it. It fills your hunger and also calms you down. Now you have better control of your body and do not panic. \n");
                        Thread.sleep(1000);
                        System.out.println("After what felt like an hour, you reach the end of the long time tunnel, and your vision is entirely white. Slowly, your eyes adjust to the light and you see all the scientists clapping and cheering for you! \n");
                        pass=2;
                    }
                }
                else if(ch==3)
                {
                    System.out.println("You take a watch with you since you're curious what time travel will do to it. \n");
                    Thread.sleep(1000);
                    System.out.println("Then you walk towards the labaratory nervous and excited. There, the employees greet you and let you choose the suit that you want to wear. They inform you that each has its advantages and disadvantages. \n");
                    System.out.println("1.Iron Suit");
                    System.out.println("2.Space Suit");
                    System.out.println("3.Cotton Suit");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.println(s1);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You take out the watch from inside your suit and observe it. You notice something strange happening so you adjust the watch but suddenly the light around you stops and you freeze in time. You yell but nobody can hear you. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==2)
                    {
                        System.out.println(s2);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You take out the watch from inside your suit and observe it. You notice something strange happening so you adjust the watch but suddenly the light around you stops and you freeze in time. You yell but nobody can hear you. \n");
                        Thread.sleep(1000);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==3)
                    {
                        System.out.println(s3);
                        Thread.sleep(1000);
                        System.out.println(s4);
                        Thread.sleep(1000);
                        System.out.println(s5);
                        Thread.sleep(1000);
                        System.out.println("You take out the watch from inside your suit and observe it. You notice something strange happening so you adjust the watch but suddenly the light around you stops and you freeze in time. You yell but nobody can hear you. \n");
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s6);
                        pass=1;
                    }
                }
                else if(ch==4)
                {
                    System.out.println("You take a iron ring as a remembrance of home so that you don't feel alone during your time travel journey \n");
                    Thread.sleep(333);
                    Thread.sleep(333);
                    Thread.sleep(333);
                    Thread.sleep(333);
                    System.out.println("Then you walk towards the labaratory nervous and excited. There, the employees greet you and let you choose the suit that you want to wear. They inform you that each has its advantages and disadvantages. \n");
                    System.out.println("1.Iron Suit");
                    System.out.println("2.Space Suit");
                    System.out.println("3.Cotton Suit");
                    System.out.print("Your choice: ");
                    ch=sc.nextInt();
                    if(ch==1)
                    {
                        System.out.println(s1);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s4);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s5);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println("After drifting in time for a while, you feel lonely, so you try to take out the iron ring from your suit to see it. However, you're unable to due to the passage of time, the iron ring attached itself to the iron suit. You pull hard but accidently rip a part of the suit and lose balance. You fall back and struggle to get back up. \n");
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==2)
                    {
                        System.out.println(s2);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s4);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s5);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println("After drifting in time for a while, you feel lonely, you try reaching to grab the iron ring out of your pocket but due to the thick bulky space suit, you're unable to. You try to bend a bit more but accidently tear your suit. You suddenly lose balance and fall back. \n");
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s6);
                        pass=1;
                    }
                    else if(ch==3)
                    {
                        System.out.println(s3);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s4);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println(s5);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println("After drifting in time for a while, you feel lonely, you reach into your suit and take out the iron ring in it. You examine the ring and hug it close to you. It makes you feel much better and you calm down. Now you have better control of your body and do not panic. \n");
                        Thread.sleep(333);
                        Thread.sleep(333);
                        Thread.sleep(333);
                        System.out.println("After what felt like an hour, you reach the end of the long time tunnel, and your vision is entirely white. Slowly, your eyes adjust to the light and you see all the scientists clapping and cheering for you! \n");
                        pass=2;
                    }
                }
            }
            if(pass==2)
            {
                System.out.println("You slowly walk out of the time machine tired but still full of excitement. You have successfully time travelled for the first time in human history!! \n");
                Thread.sleep(333);
                Thread.sleep(333);
                Thread.sleep(333);
                Thread.sleep(333);
                System.out.println("Awesome! You have successfully completed the story and survived!! \n");
                n+=20;
            }  
            else if(pass==1)
            {
                 Thread.sleep(333);
                 Thread.sleep(333);
                 Thread.sleep(333);
                 Thread.sleep(333);
                 Thread.sleep(333);
                 System.out.println("Oh No! Looks like you made a poor choice! Better Luck Next Time!");
            }
            else
            System.out.println("Oops! Looks like you wrote a non-existant option! Try again next time!");
        }
        if(pass1>1)
        {
            System.out.println("You have completed both levels of this story! Would you like to restart? Y/N");
            char ch=sc.next().charAt(0);
            if(ch=='Y')
            n=1234;
            else
            System.out.println("Skipping Game..");
        }
        return n;
    }
}