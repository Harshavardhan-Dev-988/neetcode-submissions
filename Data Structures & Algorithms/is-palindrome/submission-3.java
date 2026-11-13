class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left<right && left<s.length() && right>=0){
            while(!((s.charAt(left) >= 'a' && s.charAt(left)<='z') || (s.charAt(left) >= 'A' && s.charAt(left)<='Z') || (s.charAt(left) >= '0' && s.charAt(left) <= '9'))){
                left++;
            }
            while(!((s.charAt(right) >= 'a' && s.charAt(right)<='z') || (s.charAt(right) >= 'A' && s.charAt(right)<='Z') || (s.charAt(right) >= '0' && s.charAt(right) <= '9'))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
