
public class Conditionals {

  // **IF, ELSE & ELSE IF STATEMENTS**
  // public static void main(String args[]) {
  // int x = 30;

  // if (x == 10) {
  // System.out.print("Value of X is 10");
  // } else if (x == 20) {
  // System.out.print("Value of X is 20");
  // } else if (x == 30) {
  // System.out.print("Value of X is 30");
  // } else {
  // System.out.print("This is else statement");
  // }
  // }

  // **NESTED IF STATEMENTS**
  // public static void main(String args[]) {
  // int x = 30;
  // int y = 10;

  // if (x == 30) {
  // if (y == 10) {
  // System.out.print("X = 30 and Y = 10");
  // }
  // }
  // }

  // **SWITCH CASE */
  public static void main(String args[]) {
    // char grade = args[0].charAt(0);
    char grade = 'C';

    switch (grade) {
      case 'A':
        System.out.println("Excellent!");
        break;
      case 'B':
      case 'C':
        System.out.println("Well done");
        break;
      case 'D':
        System.out.println("You passed");
      case 'F':
        System.out.println("Better try again");
        break;
      default:
        System.out.println("Invalid grade");
    }
    System.out.println("Your grade is " + grade);
  }

}

  

  

  

