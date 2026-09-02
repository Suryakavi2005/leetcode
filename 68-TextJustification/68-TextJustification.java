// Last updated: 9/2/2026, 11:07:18 AM
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5
6        List<String> result = new ArrayList<>();
7
8        int i = 0;
9
10        while (i < words.length) {
11
12            int j = i;
13            int totalLength = 0;
14
15            // Find how many words can fit in this line
16            while (j < words.length) {
17
18                int wordLength = words[j].length();
19
20                if (totalLength + wordLength + (j - i) > maxWidth) {
21                    break;
22                }
23
24                totalLength += wordLength;
25                j++;
26            }
27
28            // Number of words in this line
29            int numberOfWords = j - i;
30
31            // Check if this is the last line
32            if (j == words.length || numberOfWords == 1) {
33
34                StringBuilder line = new StringBuilder();
35
36                for (int k = i; k < j; k++) {
37
38                    if (k > i) {
39                        line.append(" ");
40                    }
41
42                    line.append(words[k]);
43                }
44
45                // Add remaining spaces at the end
46                while (line.length() < maxWidth) {
47                    line.append(" ");
48                }
49
50                result.add(line.toString());
51
52            } else {
53                int totalSpaces = maxWidth - totalLength;
54                int gaps = numberOfWords - 1;
55                int spacesPerGap = totalSpaces / gaps;
56                int extraSpaces = totalSpaces % gaps;
57                StringBuilder line = new StringBuilder();
58                for (int k = i; k < j; k++) {
59                    line.append(words[k]);
60                    if (k < j - 1) {
61                        int spaces = spacesPerGap;
62                        if (k - i < extraSpaces) {
63                            spaces++;
64                        }
65                        for (int s = 0; s < spaces; s++) {
66                            line.append(" ");
67                        }
68                    }
69                }
70                result.add(line.toString());
71            }
72            i = j;
73        }
74        return result;
75    }
76}