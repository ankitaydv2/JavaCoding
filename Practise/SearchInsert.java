public class SearchInsert {
 /* Given a sorted array of distinct integers and a target value, 
 return the index if the target is found. If not,
  return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity. */
    public static int SearchInsert(int nums[], int target){
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] >= target){
                return i ;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};
        int target = 17;

        int result = SearchInsert(nums, target);
        System.out.println(result); // Output: 2
    }
}
