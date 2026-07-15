class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] ana = new int[26];
        for(int i=0;i<26;i++){
            ana[i]=0;
        }
        for(int i=0;i<s.length();i++){
            ana[s.charAt(i)-'a'] = ana[s.charAt(i)-'a']+1;
        }
        for(int i=0;i<s.length();i++){
            ana[t.charAt(i)-'a'] = ana[t.charAt(i)-'a']-1;
        }

        for(int i=0;i<26;i++){
            if(ana[i]!=0){
                return false;
            }
            
        }
        return true;
    }
}
