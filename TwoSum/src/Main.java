import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array= new int[]{1,2,3};
        System.out.println(twoSum(array, 5));
    }

    public static int[] twoSum(int[] nums, int target){
       if (nums==null || nums.length<2){
           return new int[]{0,0};
       }
        HashMap<Integer, Integer> hashMap= new HashMap<>();
       for (int i=0; i<nums.length; i++){
           if (hashMap.containsKey(nums[i])){
               return new int[]{hashMap.get(nums[i]), i};
           }else {
               hashMap.put(target-nums[i], i);
           }
       }
       return new int[]{0,0};
    }
}