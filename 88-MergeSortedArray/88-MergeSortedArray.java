// Last updated: 9/2/2026, 12:21:12 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int arr[]=new int[m+n];
4      for(int i=0;i<m;i++){
5        arr[i]=nums1[i];
6      }
7      int p=m;
8      for(int i=0;i<n;i++){
9        arr[p++]=nums2[i];
10      }
11       Arrays.sort(arr);
12
13        for (int i = 0; i < m + n; i++) {
14            nums1[i] = arr[i];
15        }
16    }
17}