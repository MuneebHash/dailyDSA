package Arrays;

public class Search {

    public int linearSearch(int[] arr, int key){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        
        if (arr[mid] == key) {
            return mid;
        } else if (key > arr[mid]) {
            return binarySearch(arr, key, mid + 1, high);
        } else {
            return binarySearch(arr, key, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        Search obj = new Search();
        int[] array = {1, 2, 3, 5, 6, 8, 9, 10};
        // System.out.println(obj.linearSearch(array, 23));
        System.out.println(obj.binarySearch(array, 3 , 0 , array.length-1));
    }
}
