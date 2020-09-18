import java.util.Scanner;

public class IntegerDemoInteractive {
  public static void main(String[] args) {
    int anInt;
    byte aByte;
    short aShort;
    long aLong;

    Scanner input = new Scanner(System.in);

    System.out.print("Pls enter a byte integer >> ");
    aByte = input.nextByte();

    System.out.print("Pls enter an integer >> ");
    anInt = input.nextInt();

    System.out.print("Pls enter a short integer >> ");
    aShort = input.nextShort();

    System.out.print("Pls enter a long integer >> ");
    aLong = input.nextLong();

    System.out.println("The int is " + anInt);
    System.out.println("The byte is " + aByte);
    System.out.println("The short is " + aShort);
    System.out.println("The long is " + aLong);
  }
}