/*
Given an array,
rotate the array to the right by k steps, where k is non-negative.
 */

public void rotateAnArray(int[] nums, int k) {
    if (nums.length <= 1) return;

    int steps = k % nums.length;
    reverse(nums, 0, nums.length-1);
    reverse(nums, 0, steps-1);
    reverse(nums, steps, nums.length-1);
}

public void reverse(int[] nums, int start, int end){
    while (start < end){
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end++;  // decrement end "end--" or you get the exception, java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    }
}
