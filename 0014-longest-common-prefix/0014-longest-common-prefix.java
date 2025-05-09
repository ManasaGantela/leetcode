class Solution {
    public String longestCommonPrefix(String[] strs) {
       if(strs==null || strs.length==0)
       return "";
       String Prefix=strs[0];
       for(String s:strs)
       while(s.indexOf(Prefix)!=0)
       Prefix=Prefix.substring(0,Prefix.length()-1);
       return Prefix;
    }
}
        