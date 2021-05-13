package Array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {

    public static void main(String s[]){
        for(int i:usingHashMap(new int[]{2,7,11,15},9))System.out.println(i);
    }

    static int[] usingHashMap(int[] array, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=array.length-1;i++){
            if(map.containsKey(target-array[i])){
                return new int[]{map.get(target-array[i]),i};
            }
            map.put(array[i],i);
        }
        return new int[]{0,0};
    }
}
