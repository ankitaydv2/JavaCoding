public class LinearSearch {
    /* Given an array nums and an integer target, 
    return the index of target if it exists in nums.
     Otherwise, return -1. */
    public static int linearSearch(int nums[], int target){
        for(int i =0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 9};
        int target = 7;

        int result = linearSearch(nums, target);
        System.out.println(result); // Output: 2
    }
}
