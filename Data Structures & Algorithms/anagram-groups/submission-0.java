class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String, ArrayList<String>> res = new HashMap<>(); 
        for(int i=0;i<n;i++){
            int[] anna = new int[26];
            for(int j=0;j<strs[i].length();j++){
                anna[strs[i].charAt(j)-'a'] = anna[strs[i].charAt(j)-'a']+1;
            }
            StringBuilder sb = new StringBuilder();
            for (int val : anna) {
                sb.append(val).append('#'); // '#' acts as a clean delimiter
            }
            String key = sb.toString();

            res.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(res.values());

    }
}
