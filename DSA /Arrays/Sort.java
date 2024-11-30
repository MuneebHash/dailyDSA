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
    
    
    
    public static void main(String[] args) {
        Sort obj = new Sort();
        int[] arr = {23, 45, 2 ,3 ,53};
        obj.quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }   
}
