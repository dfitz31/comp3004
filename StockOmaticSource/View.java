import java.util.Scanner;

public class View{
 Control controller;
 Scanner scanner;
 public View(Control c){
  controller = c;
 }
 
 public void run(){
  int choice;
  scanner = new Scanner(System.in);
  System.out.println("Welcome to the Stock-O-Matic 3000!\n\n\n");
  System.out.println("Main Menu:");
  System.out.println(" 1. Your Food ");
  System.out.println(" 2. Your Recipes");
  System.out.println("\n\nPlease enter choice: ");
  choice = scanner.nextInt();
 }
}