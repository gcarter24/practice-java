public class sortArray {
  public static void main(String[] args) {
    int i;
    int arr[] = { 43, 15, 3, -6, 0, 18, 52, -49, 29, 105 };
    arraySort(arr, arr.length);
    for (i = 0; i < arr.length; i++) {
      // System.out.print(arr[i] + " ");
      System.out.println(arr[i]);
    }
  }

  private static void arraySort(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      int j = i;
      int a = arr[i];
      while ((j > 0) && (arr[j - 1] > a)) {
        arr[j] = arr[j - 1];
        j--;
      }
      arr[j] = a;
    }
  }
}
