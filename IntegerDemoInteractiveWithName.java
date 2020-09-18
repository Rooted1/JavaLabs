import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
  public static void main(String[] args){
    String name;

    Scanner userName = new Scanner(System.in);

    System.out.println("Please enter your username >> ");
    name = userName.nextLine();

    System.out.print("Welcome " + name);
  }
}