//public class MergeSort {
//
//
//  public static void main(String[] args) {
//
//    int[] arr = {55, 23, 89, 100, 21, 10, 65, 3, 44};
//
//    mergeSort(0, arr.length, arr);
//
//    for(int i=0; i<arr.length; i++){
//      System.out.print(arr[i] + " ");
//    }
//
//
//  }
//
//  private void mergeSort(int left, int right, int[] arr) {
//    if (right > left) {
//      int mid = (left + right) / 2;
//
//      mergeSort(left, mid, arr);
//      mergeSort(mid + 1, right, arr);
//      merge(left, mid, right, arr);
//    }
//  }
//
//  private void merge(int left, int mid, int right int[]arr) {
//    int n1 = m - l + 1, n2 = h - m;
//    int[] left = new int[n1];
//    int[] right = new int[n2];
//    for (int i = 0; i < n1; i++) {
//      left[i] = arr[i + l];
//    }
//
//    for (int j = 0; j < n2; j++) {
//      right[j] = arr[m + 1 + j];
//    }
//
//    int i = 0, j = 0, k = l;
//    while (i < n1 && j < n2) {
//      if (left[i] <= right[j])
//        arr[k++] = left[i++];
//      else
//        arr[k++] = right[j++];
//    }
//    while (i < n1) {
//      arr[k++] = left[i++];
//    }
//
//    while (j < n2) {
//      arr[k++] = right[j++];
//    }
//
//  }
//}