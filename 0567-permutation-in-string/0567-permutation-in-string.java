class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int n=s2.length();
       int k=s1.length();

       int f1[]=new int[26];
       for(char ch:s1.toCharArray()) f1[ch-'a']++;

       int f2[]=new int [26];
       for(int i=0; i<s2.length(); i++){
        //include
        char ch=s2.charAt(i);
        f2[ch-'a']++;

        if(i<k-1) continue;

        if(Arrays.equals(f1,f2)) return true;

        int sin=i-k+1;
        char sch=s2.charAt(sin);
        f2[sch-'a']--;
       }
       return false;

      /* for(int i=0; i<=n-k; i++){
        String sub=s2.substring(i,i+k);
        if(isAnagram(sub,s1)) return true;
       }
       return false;
    }
     public boolean isAnagram(String s, String t) {
       int f1[]=new int[26];
        for(char ch:s.toCharArray()){
            f1[ch-'a']++;
        }
          int f2[]=new int[26];
        for(char ch:t.toCharArray()){
            f2[ch-'a']++;
        }
        
        return Arrays.equals(f1,f2);  */
    }
}