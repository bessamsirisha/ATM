import java.util.Scanner;

public class ATM {
    static int balance = 30000;
    static Scanner sc = new Scanner(System.in);
    static int PIN = sc.nextInt();
    public static void main(String[] args) {
        System.out.println("Welcome to Atm");
        System.out.println("1:Bank Balance Enquiry");
        System.out.println("2:Cash Withdrawal");
        System.out.println("3:Pin Change");
        System.out.println("4:Exit");
        System.out.println("Enter Your Choice");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                BankBalanceEnquiry();
                break;
            case 2:
                CashWithdrawal();    
                break;
            case 3:
                PinChange();
                break;
            case 4:
                Exit();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    } 
   
        static void BankBalanceEnquiry( ){
            System.out.println("check balance");
            System.out.println(ATM.balance);
        }
        static void CashWithdrawal(){
            System.out.println("Valid Pin Number");
            if(ATM.balance <=0){
                System.out.println("Not Enough Balance");
            }
            Scanner s = new Scanner(System.in);            
            System.out.println("Enter the Amount need to withdraw");
            int b = sc.nextInt();
            System.out.println("Check Balance");
            int c = ATM.balance-b;
            System.out.println(c);
            String d = sc.nextLine();
            if(d=="Cancel"){
              System.out.println("exit");
            }
        }
        static void PinChange(){
            System.out.println("Enter Pin number");
            Scanner p= new Scanner(System.in);
            int e = p.nextInt();
            if(e == ATM.PIN){
                System.out.println("Change Pin");
                int newpin = sc.nextInt();
            }else{
                System.out.println("Wrong Pin");
            }
        }
        static void Exit(){
            System.out.println("Exited from ATM");
        }
        Scanner.close();
    }


