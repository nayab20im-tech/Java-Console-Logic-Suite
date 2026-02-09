import java.util.Scanner;
public class Eggs{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Enter total number of eggs ");
int number = input.nextInt();
double $30_eggs_packing = number/30;
System.out.print("Number of 30 eggs packing : "+(int)$30_eggs_packing);
double left1 = number%30;
System.out.println("\t\tNumber of loftover eggs :"+(int) left1);
double $24_eggs_packing = number/24;
System.out.print("Number of 24 eggs packing : "+(int)$24_eggs_packing);
double left2 = number%24;
System.out.println("\t\tNumber of loftover eggs : "+(int)left2);
double $18_eggs_packing = number/18;
System.out.print("Number of 18 eggs packing : "+(int)$18_eggs_packing);
double left3 = number%18;
System.out.println("\t\tNumber of loftover eggs : "+(int)left3);
double $12_eggs_packing = number/12;
System.out.print("Number of 12 eggs packing : "+(int)$12_eggs_packing);
double left4 = number%12;
System.out.println("\t\tNumber of loftover eggs : "+(int)left4);
double $6_eggs_packing = number/6;
System.out.print("Number of 6 eggs packing : "+(int)$6_eggs_packing);
double left5 = number%6;
System.out.println("\t\tNumber of loftover eggs : " +(int)left5);
}//main
}//class
