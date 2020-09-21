import java.util.Scanner;

public class CreateSpaServices {
  public static void displaySpaInfo(){

    String service;
    double price;

    SpaService firstService = new SpaService();
    SpaService secondService = new SpaService();

    Scanner input = new Scanner(System.in);

    System.out.println("Enter first service >> ");
    service = input.nextLine();
    System.out.println("Enter price of first service >> ");
    price = input.nextDouble();
    firstService.setServiceDescription(service);
    firstService.setPrice(price);

    input.nextLine();

    System.out.println("Enter second service >> ");
    service = input.nextLine();
    System.out.println("Enter price of second service >> ");
    price = input.nextDouble(); 
    secondService.setServiceDescription(service);
    secondService.setPrice(price);

    System.out.println("First service details: ");
    System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

    System.out.println(" ");

    System.out.println("Second service details: ");
    System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
  }
}