// // LeetCode 242 - Valid Anagram
// // Time Complexity: O(n) 
// // Space Complexity: O(1)
// import java.util.HashMap;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }
//         HashMap<Character, Integer> s_map = new HashMap<>();
//         HashMap<Character, Integer> t_map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             s_map.put(c, s_map.getOrDefault(c, 0) + 1);
//         }

//         for (char c : t.toCharArray()) {
//             t_map.put(c, t_map.getOrDefault(c, 0) + 1);
//         }

//         return s_map.equals(t_map);
//     }
// }

//OPTIMAL APPROACH
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int[] freq = new int[26];

        for(char c : s.toCharArray())
            freq[c-'a']++;

        for(char c : t.toCharArray())
            freq[c-'a']--;

        for(int count : freq)
            if(count != 0)
                return false;

        return true;
    }
}
