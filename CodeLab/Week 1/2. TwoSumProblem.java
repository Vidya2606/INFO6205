/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
 */

public int twoSumProblem(int[] nums, int target){
    // map to store previously checked int
    Map<Integer, Integer> checked = new HashMap<Integer, Interger>();
    // for each checked int, put int as key and value as index in the map
    for (int i = 0; i<nums.length; map.put(nums[i], i++)){
        // if two nums that adds up to the target is found
        if (checked.containsKey(target - nums[i])){
            return new int[]{map.get(target - nums[i]), i};
        }
    }
}