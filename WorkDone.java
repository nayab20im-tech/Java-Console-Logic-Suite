import java.util.Scanner;
public class WorkDone{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount of force in newton :");
double amount_of_force = input.nextDouble();
System.out.print("Enter the amountof displacement in meters :");
double amount_of_displacement = input.nextDouble();
System.out.print("Enter the angle between force and displacement : ");
double angle = input.nextDouble();

double work_done = amount_of_force*amount_of_displacement*Math.cos(angle);
System.out.print("Work Done : " +(int)work_done);
}//main
}//class