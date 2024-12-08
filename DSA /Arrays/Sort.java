package Arrays;
import java.util.Arrays;

public class Sort {
    public int[] bubble(int[] myArray){
        int length = myArray.length;
        for(int i = 0; i < length -1; i++){
            for(int j = 0; j < length -i -1; j ++){   //length - i - 1 ==> bcz in every iteration the largest number is swapped and we need one less iteration next time.
                if(myArray[j] > myArray[j + 1]){
                    int temp = myArray[j + 1];
                    myArray[j+1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public int[] selection(int [] myArray){
        int n = myArray.length;
        for(int i =  0; i < n; i++){
            int min = i;
            for (int j = i; j < n; j++){
                if(myArray[min] > myArray[j]){
                    min = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[min];
            myArray[min] = temp;
        }
        return myArray;
    }

    public int partition (int[] array, int low, int high){
        int pivot = array[high];
        int i  =  low -1;
        for (int j = low; j< high; j++ ){
            if (array[j] <= pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i + 1] = array[high];
        array[high] = temp;
    return i + 1;
    }
    public void quicksort(int[] array, int low, int high){ 
        if (low < high){
            int position = partition(array, low, high);
            quicksort(array, low, position-1);
            quicksort(array, position +1, high);
        }
    }    
    
    public void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = (right - left)/2 + left;

            mergeSort(arr, left, mid); // First half of the array, the left half.
            mergeSort(arr, mid + 1, right); // Second half of the array, the right half.
            
            merge(arr, left, mid, right); // Merge when it has reached to the single value in Array.   
        }
    }
    public void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1; // + 1 is bcz we want to add the mid value in the left array.
        int n2 = right - mid;

        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1); 
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right + 1);

        int i = 0; int j = 0; int k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else{
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
    
    public static void main(String[] args) {
        Sort obj = new Sort();
        int[] arr = {23, 45, 2 ,3 ,53, 100, 43, 265, 23, 1, 6};
        obj.mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }   
}
