import java.util.Scanner;
public class luckyroom
{
    public static int playgame6() throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("You got the game: 'Lucky Room'");
        System.out.println("There are 4 boxes below each with a unique unknown value of points, Guess and recieve the points that you choose!!");
        System.out.println("");
        System.out.println("");
        System.out.println("    __________    __________    __________    __________");
        System.out.println("   |          |  |          |  |          |  |          |");
        System.out.println("   |     A    |  |     B    |  |     C    |  |     D    |");
        System.out.println("   |          |  |          |  |          |  |          |");
        System.out.println("    ----------    ----------    ----------    ----------");
        System.out.println("");
        System.out.println("");
        int points[]={0,5,10,50};
        int a=(int)(Math.random()*4);
        int A=points[a];
        int B=0;
        int C=0;
        int D=0;
        if(A==0)
        {
            int rpoints[]={5,10,50};
            int c=(int)(Math.random()*3);
            C=rpoints[c];
            if(C==5)
            {
                B=10;
                D=50;
            }
            else if(C==10)
            {
                B=50;
                D=5;
            }
            else if(C==50)
            {
                B=5;
                D=10;
            }
        }
        else if(A==5)
        {
            int rpoints[]={0,10,50};
            int c=(int)(Math.random()*3);
            C=rpoints[c];
            if(C==0)
            {
                B=10;
                D=50;
            }
            else if(C==10)
            {
                B=50;
                D=0;
            }
            else if(C==50)
            {
                B=0;
                D=10;
            }
        }
        else if(A==10)
        {
            int rpoints[]={5,0,50};
            int c=(int)(Math.random()*3);
            C=rpoints[c];
            if(C==5)
            {
                B=0;
                D=50;
            }
            else if(C==0)
            {
                B=50;
                D=5;
            }
            else if(C==50)
            {
                B=5;
                D=0;
            }
        }
        else if(A==50)
        {
            int rpoints[]={5,0,10};
            int c=(int)(Math.random()*3);
            C=rpoints[c];
            if(C==5)
            {
                B=0;
                D=10;
            }
            else if(C==0)
            {
                B=10;
                D=5;
            }
            else if(C==10)
            {
                B=5;
                D=0;
            }
        }
        System.out.print("Box Chosen: ");
        char ch=sc.next().charAt(0);
        System.out.println("");
        System.out.print("You won...");
        Thread.sleep(2000);
        int n=0;
        switch(ch)
        {
            case 'A':
                System.out.print(A);
                n=A;
                break;
            case 'B':
                System.out.print(B);
                n=B;
                break;
            case 'C':
                System.out.print(C);
                n=C;
                break;
            case 'D':
                System.out.print(D);
                n=D;
                break;
        }
        System.out.print(" Points!");
        System.out.println("");
        System.out.println("Inside the Boxes:");
        Thread.sleep(1000);
        System.out.println("    __________    __________    __________    __________");
        System.out.println("   |     A    |  |     B    |  |     C    |  |     D    |");
        System.out.print("   ");
        String col="|    "+A;
        int len=col.length();
        System.out.print(col);
        for(int i=0;i<(11-len);i++)
        System.out.print(" ");
        System.out.print("|");
        System.out.print("  ");
        col="|    "+B;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(11-len);i++)
        System.out.print(" ");
        System.out.print("|");
        System.out.print("  ");
        col="|    "+C;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(11-len);i++)
        System.out.print(" ");
        System.out.print("|");
        System.out.print("  ");
        col="|    "+D;
        len=col.length();
        System.out.print(col);
        for(int i=0;i<(11-len);i++)
        System.out.print(" ");
        System.out.print("|");
        System.out.println("  ");
        System.out.println("   |          |  |          |  |          |  |          |");
        System.out.println("    ----------    ----------    ----------    ----------");
        return(n);
    }
}