package Bank;
import java.util.Scanner;
public class AtmProcess
{
    public static void main(String args[] )
    { 
        int balance = 200000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("welcome to Automated Teller Machine");
            System.out.println("1.withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. EXIT");
            int ch= sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter the money:");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println(" collect your money");
                }
                else
                {
                    System.out.println("No Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter the deposited money:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println(" check Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}