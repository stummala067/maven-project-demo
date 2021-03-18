package longestCommonPrefix;

public class RunSolution {
    public static void main (String[] args){
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"dog","racecar","car"};
        Solution s1 = new Solution();
        String ret = s1.longestCommonPrefix(strs);
        System.out.println(ret);
    }
}


class Solution {
    private String common_part(String str1, String str2){
        int n = Math.min(str1.length(), str2.length());
        int count = -1;
        for (int i=0;i<n;i++){
            if( str1.charAt(i)==str2.charAt(i) ){
                count = i;
            } else {
                break;
            }
        }
        if (count == -1){
            return "";
        } else {
            String ret_str = str1.substring(0,count+1);
            return ret_str;
        }
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n==0){
            return "";
        }
        String temp_str = strs[0];
        for (int i = 1; i < n; i++) {
            temp_str = common_part(temp_str, strs[i]);
//            System.out.println("inter print = " + temp_str);
            if (temp_str == "") {
                return "";
            }
        }

        return temp_str;
    }
}
