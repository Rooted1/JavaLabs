import javax.swing.JOptionPane;

public class ParadiseInfo {
  public static void main(String[] args){

    displayInfo();
  }

  public static void displayInfo(){
    System.out.println("Paradise Day Spa wants to pamper you.");
    System.out.println("We will make you look good.");

    String priceString, discountString;
    double price;
    double discount;
    double savings;

    priceString = JOptionPane.showInputDialog(null, "Enter cutoff price for discount >> ", "Cutoff Price ", JOptionPane.INFORMATION_MESSAGE);
    price = Double.parseDouble(priceString);


    discountString = JOptionPane.showInputDialog(null, "Enter discount rate as a whole >> ", "Discount Rate ", JOptionPane.INFORMATION_MESSAGE);
    discount = Double.parseDouble(discountString);

    savings = ParadiseInfo2.computeDiscountInfo(price, discount);

    JOptionPane.showMessageDialog(null, "Special this week on any service over " + price + "\nDiscount of " + discount + " percent. \nThat's a savings of at least $" + savings);
  }
}