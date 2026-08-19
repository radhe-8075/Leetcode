class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String ns="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9'){
                ns+=ch;
            }
        }
         
         return checkPalin(ns);

    }
    boolean checkPalin(String s){
        String rev="";
        for(int i=s.length()-1; i>=0; i--){
            rev +=s.charAt(i);
        }
        return s.equals(rev);
    }
}