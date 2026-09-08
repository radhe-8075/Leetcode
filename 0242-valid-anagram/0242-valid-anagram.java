class Solution {
    public boolean isAnagram(String s, String t) {
       
       /* if (s.length() != t.length()) return false;
        
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int c : count) {
            if (c != 0) return false;
        }
        */
       /* char a1[]=s.toCharArray();
        char a2[]=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        */
        int f1[]=new int[26];
        for(char ch:s.toCharArray()){
            f1[ch-'a']++;
        }
          int f2[]=new int[26];
        for(char ch:t.toCharArray()){
            f2[ch-'a']++;
        }
        
        return Arrays.equals(f1,f2);
    }
}