import java.util.ArrayList;
import java.util.List;

public class SortingMethods {
  private static void printArray(int[] arr){
    for(int i : arr){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  private static void swap(int[] arr, int x, int y){
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
  }
  // Time: O(N²) Space: O(1)
  private static void selectionSort(int[] arr){
    int n = arr.length;
    for(int i=0; i<n; i++){
      int min = i;
      for(int j=i+1; j<n; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      swap(arr, i, min);
    }
  }

  // Time: O(N²) Space: O(1)
  private static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i=n-1; i>=0; i--){
      boolean swapped = false;
      for(int j=0; j<i; j++){
        if(arr[j] > arr[j+1]){
          swap(arr, j, j+1);
          swapped = true;
        }
      }
      if(!swapped) break;
    }
  }
  // Time: O(N²) Space: O(1)
  private static void insertionSort(int[] arr){
    int n = arr.length;
    for(int i=1; i<n; i++){
      int key = arr[i];
      int j = i - 1; // run through the sorted array
      while(j >= 0 && key < arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = key;
    }
  }
  // Time: O(N log N) Space: O(N)
  private static void merge(int[] arr, int left, int mid, int right){
    int i=left;
    int j = mid + 1;
    List<Integer> temp = new ArrayList<>();

    while(i <= mid && j <= right){
      if(arr[i] <= arr[j]){
        temp.add(arr[i]);
        i++;
      } else {
        temp.add(arr[j]);
        j++;
      }
    }

    while(i <= mid){
      temp.add(arr[i]);
      i++;
    }

    while(j <= right){
      temp.add(arr[j]);
      j++;
    }

    for(i=left; i<=right; i++){
      arr[i] = temp.get(i - left);
    }
  }
  private static void mergeSort(int[] arr, int left, int right){
    if(left >= right) return;

    int mid = left + (right - left) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid+1, right);
    merge(arr, left, mid, right);
  } 

  private static int calculatePivot(int[] arr, int left, int right){
    int pivot = arr[left];
    int i = left;
    int j = right;
    while(i < j){
      while(i <= right && arr[i] <= pivot){
        i++;
      }
      while(j >= left && arr[j] > pivot){
        j--;
      }
      if(i < j){
        swap(arr, i, j);
      }
    }
    swap(arr, left, j);
    return j;
  }

  private static void quickSort(int[] arr, int left, int right){
    if(left < right){
      int pivot = calculatePivot(arr, left, right);
      quickSort(arr, left, pivot-1);
      quickSort(arr, pivot+1, right);
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{7, 5, 9, 3, 4, 8};
    // selectionSort(arr);
    // bubbleSort(arr);
    // insertionSort(arr);
    // mergeSort(arr, 0, arr.length - 1);
    quickSort(arr, 0, arr.length - 1);
    printArray(arr);
  }  
}
