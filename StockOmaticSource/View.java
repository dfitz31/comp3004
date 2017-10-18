import java.util.Scanner;

public class View{
 Control controller;
 Scanner scanner;
 public View(Control c){
  controller = c;
 }
 
 public void run(){
  int choice;
  controller.generate();
  scanner = new Scanner(System.in);
  System.out.println("Welcome to the Stock-O-Matic 3000!\n\n\n");
  while(true){
      System.out.println("Main Menu:");
      System.out.println(" 1. Your Food ");
      System.out.println(" 2. Your Recipes");
      System.out.println("\n\nPlease enter choice: ");
      choice = scanner.nextInt();
      if(choice == 1){
          System.out.println("\n\nFood Menu:");
          System.out.println("1. View Food List");
          System.out.println("2. Add Food");
          System.out.println("3. Edit Food");
          System.out.println("\n\nPlease enter choice: ");
          choice = scanner.nextInt();
          if(choice == 1){
              System.out.println("\n\n");
              System.out.println(controller.foods.toString());
          }
      }
      else if(choice == 2){
      }
      else{
          System.out.println("Bye");
          break;
      }
  }
 }
}