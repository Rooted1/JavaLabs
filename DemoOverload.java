public class DemoOverload {
  public static void displayDate (int mm) {
    System.out.println("Event date " + mm + "/1/2018");
  }

  public static void displayDate (int mm, int dd) {
    System.out.println("Event date " + mm + "/" + dd + "/2018");
  }

  public static void displayDate (int mm, int dd, int yy) {
    System.out.println("Event date " + mm + "/" + dd + "/" + yy);
  }
}