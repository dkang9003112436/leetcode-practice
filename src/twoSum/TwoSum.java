package twoSum;//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.

//Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]


//Constraints:
//
//        2 <= nums.length <= 104
//        -109 <= nums[i] <= 109
//        -109 <= target <= 109

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-5,3,5,7};
        int[] res = twoSum(nums, -2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[] {map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

// To solve this problem you just need to apply simple math.
// We are given target and we need to find two number that results in target when added together.
// target = a + b ->  a = target - b

//        1.Create a HashMap:
//        The method starts by creating an empty HashMap called map. This map will store numbers from the nums array as keys and their corresponding indices as values.
//
//        2. Loop through the nums array:
//        The method then iterates over each element in the nums array using a for loop.
//
//        3.Calculate the complement:
//        For each number nums[i] in the array, the code calculates the complement by subtracting nums[i] from the target. This complement is the number needed to add to nums[i] to reach the target.
//
//        4.Check if the complement is in the map:
//        The method checks if the complement exists in the map. If it does, that means the current number (nums[i]) and the complement add up to the target.
//
//        5.Return the indices:
//        If the complement is found in the map, the method returns an array containing the index of the complement (found in the map) and the current index i.
//
//        6.Update the map:
//        If the complement is not found, the method adds the current number nums[i] and its index i to the map.
//
//        7.Return null if no solution is found:
//        If the loop finishes without finding a pair of numbers that add up to the target, the method returns null.
