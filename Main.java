class Main {
  public static void main(String[] args) {
    final int NUMBER_OF_DEPTS = 20;
    final double PI = 3.14159;
    final double TAX_RATE = 0.015;
    final String COMPANY = "ABC Manufacturing";

    double hours = 25;
    double yourHoursWorked = 37.5;

    System.out.println("Hello world! " + COMPANY);
    System.out.println(COMPANY);

    System.out.println("Calling method from another class...");

    System.out.println(" ");
    
    ParadiseInfo.displayInfo();

    System.out.println(" ");

    DemoGrossPay.calculateGross(5);
    DemoGrossPay.calculateGross(hours);
    DemoGrossPay.calculateGross(yourHoursWorked);

    System.out.println(" ");

    CreateSpaServices.displaySpaInfo();
  }
}