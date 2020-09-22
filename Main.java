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

    System.out.println(" ");

    System.out.println("Demonstrating block scope ");

    int x = 111;
    System.out.println("In first block x is " + x);

    {
      int y = 222;
      System.out.println("In second block x is " + x);
      System.out.println("In second block y is " + y);
    }
    {
      int y = 333;
      System.out.println("In third block x is " + x);
      System.out.println("In third block y is " + y);
      DemoBlock.demoMethod();
      System.out.println("After method x is " + x);
      System.out.println("After method y is " + y);
    }

    System.out.println("At the end x is " + x);
  }
}