//  Reverse array using a new array and printing each element out on new line 

// Take input the size of the array and the elements of the array.
// Consider a function reverse which takes the parameters-the array(say arr)and the size of the array(say n).
// Inside the function, a new array (with the array size of the first array, arr) is initialized. The array arr[] is iterated from the first element, and each element of array arr[] is placed in the new array from the back, i.e., the new array is iterated from its last element.
// All the elements of the array arr[] are placed reversely in the new array

public class reverseArray {

  static void reverse(int a[], int n) {
    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      b[j - 1] = a[i];
      j = j - 1;
    }
    System.out.println("Reversed array is: \n");
    for (int k = 0; k < n; k++) {
      System.out.println(b[k]);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    reverse(arr, arr.length);
  }

}
