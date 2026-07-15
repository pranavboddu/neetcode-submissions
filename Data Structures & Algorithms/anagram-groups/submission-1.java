class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String, ArrayList<String>> res = new HashMap<>(); 
        for(int i=0;i<n;i++){
            char[] anna = new char[26];
            for(char c:strs[i].toCharArray()){
                anna[c-'a']++;
            }
            String key = new String(anna);

            res.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(res.values());

    }
}
