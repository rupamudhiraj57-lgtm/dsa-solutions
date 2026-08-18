class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        /**for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }
        return set.size();**/
        int maxlen=0;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            while(set.contains(c))
            {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}