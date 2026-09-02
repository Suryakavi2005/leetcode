// Last updated: 9/2/2026, 12:45:01 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5
6        HashMap<String, List<String>> map = new HashMap<>();
7
8        for (String word : strs) {
9            char[] chars = word.toCharArray();
10
11            Arrays.sort(chars);
12            String key = new String(chars);
13
14            if (!map.containsKey(key)) {
15                map.put(key, new ArrayList<>());
16            }
17            map.get(key).add(word);
18        }
19
20        return new ArrayList<>(map.values());
21    }
22}