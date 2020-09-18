import javax.swing.JOptionPane;

public class SalaryDialog {
  public static void main(String[] args) {
    String wageString, dependentsString;
    double wage, weeklyPay;
    int dependents;
    final double HOURS_IN_WEEK = 37.5;

    wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);

    //convert wageString from string to double
    weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

    dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2",
    JOptionPane.QUESTION_MESSAGE);

    //convert dependentsString from string to integer
    dependents = Integer.parseInt(dependentsString);

    JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + "dependents");
  }
}