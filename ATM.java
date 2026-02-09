import java.util.Scanner;
public class ATM{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the amount you wants to withdraw");
int amount=input.nextInt();
double currency_notes=(amount/5000);
double currency_notes1=(amount/500);

if (amount>=50_000){
System.out.println("ATM cash limit exceeds.");
}


else
{
if(amount<50000 && amount%500==0)
{
System.out.println("\nAmount=" +amount   +"\nNumber of Rs.5000 notes="  +(int)currency_notes  +"\nNumber of 500 currency notes="  +(int)currency_notes1);
}
else
{
if(amount<500)
{
System.out.println("Amount is less than withdraw limit");
}
}
}



}//main

}//class