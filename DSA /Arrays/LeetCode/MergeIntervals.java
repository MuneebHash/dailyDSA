package Arrays.LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
 * LeetCode Question #56
 * Difficulty : Medium.
*/

public class MergeIntervals {

    public int[][] selectionSort(int[][] myArray){
        for(int i = 0; i < myArray.length; i++){
            int min = i;
            for(int j = i + 1; j < myArray.length; j++){
                if( myArray[min][0] > myArray[j][0]){
                    min = j;
                }
            }
            int[] temp = myArray[min];
            myArray[min] = myArray[i];
            myArray[i] = temp;
        }
        return myArray;
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> IntervalList = new ArrayList<>();
        int[][] sortedArray = selectionSort(intervals);

        IntervalList.add(sortedArray[0]);

        for(int i =  1; i < sortedArray.length; i++){
            int[] previous = IntervalList.get(IntervalList.size() -1);
                if(sortedArray[i][0] <= previous[1]){
                    previous[1] = Math.max(sortedArray[i][1], previous[1]);
                }
                else{
                    IntervalList.add(sortedArray[i]);
                }
        }
        return IntervalList.toArray(new int[IntervalList.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();
        int[][] input_array = {{5, 3},{8, 1},{2, 9},{4, 6}};
        int[][] arr = obj.merge(input_array);
        System.out.println(Arrays.deepToString(arr));
    }
}
