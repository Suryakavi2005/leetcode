// Last updated: 9/2/2026, 1:54:58 PM
1import java.util.*;
2
3class RandomizedSet {
4    ArrayList<Integer> list;
5    HashMap<Integer, Integer> map;
6    Random random;
7
8    public RandomizedSet() {
9        list = new ArrayList<>();
10        map = new HashMap<>();
11        random = new Random();
12    }
13
14    public boolean insert(int val) {
15        if (map.containsKey(val)) {
16            return false;
17        }
18
19        list.add(val);
20        map.put(val, list.size() - 1);
21
22        return true;
23    }
24
25    public boolean remove(int val) {
26        if (!map.containsKey(val)) {
27            return false;
28        }
29
30        int index = map.get(val);
31        int lastValue = list.get(list.size() - 1);
32
33        list.set(index, lastValue);
34        map.put(lastValue, index);
35
36        list.remove(list.size() - 1);
37        map.remove(val);
38
39        return true;
40    }
41
42    public int getRandom() {
43        int index = random.nextInt(list.size());
44        return list.get(index);
45    }
46}