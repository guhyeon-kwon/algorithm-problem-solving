package inf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class inf_q8_2 {
    /*
    Map + Array

    배열이 주어지면 가장 빈도수가 높은 k 개의 요소를 return
     */
    public static List<Integer> topFrequent(int[] nums, int k){
        if(nums.length == 0) return null;

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length+1];
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()){
            int topFrequent = map.get(key);
            if(list[topFrequent] == null){
                list[topFrequent] = new ArrayList<>();
            }
            list[topFrequent].add(key);
        }

        for(int lastIndex=list.length-1; lastIndex >= 0; lastIndex--){
            if(list[lastIndex] != null){
                for(int i=0; i<list[lastIndex].size() && result.size() < k; i++){
                    result.add(list[lastIndex].get(i));
                }
            }
        }

        return result;
    }
}
