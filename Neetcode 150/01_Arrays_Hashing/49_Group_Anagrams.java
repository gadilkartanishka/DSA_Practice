// // LeetCode 49 - Group Anagrams
// // Time Complexity: O(n*k*log(k)) 
// // Space Complexity: O(n*k)
// import java.util.*;

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             char[] chars = s.toCharArray();
//             Arrays.sort(chars);
//             String key = new String(chars);

//             // If key not present, create a new list
//             map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
//         }

//         return new ArrayList<>(map.values());
//     }
// }
//OPTIMAL SOLUTION
//Time Complexity:O(N*K)
//Space Complexity:O(N*K)

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            int[] count = new int[26];

            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int num : count) {
                key.append('#');
                key.append(num);
            }

            String k = key.toString();

            if (!map.containsKey(k)) {
                map.put(k, new ArrayList<>());
            }

            map.get(k).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
