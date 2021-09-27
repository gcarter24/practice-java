public class Looping {
  // **WHILE LOOP**
  // public static void main(String args[]) {
  // int x = 10;

  // while (x < 20) {
  // System.out.print("value of x : " + x);
  // x++;
  // System.out.print("\n");
  // }
  // }
  // **FOR LOOP**
  // public static void main(String args[]) {

  // for (int x = 10; x < 20; x = x + 1/* x++ */) {
  // System.out.print("value of x : " + x);
  // System.out.print("\n");
  // }
  // }
  // **DO WHILE LOOP**
  // public static void main(String args[]) {
  // int x = 10;

  // do {
  // System.out.print("value of x : " + x);
  // x++;
  // System.out.print("\n");
  // } while (x < 20);
  // }

  // **ENHANCED FOR LOOP */
  public static void main(String args[]) {
    int[] numbers = { 10, 20, 30, 40, 50 };

    for (int number : numbers) {
      System.out.print(number);
      System.out.print(",");
    }
    System.out.print("\n");
    String[] names = { "James", "Larry", "Tom", "Lacy" };

    for (String name : names) {
      System.out.print(name);
      System.out.print(",");
    }
  }
}
