class Solution {
    public void reverseString(char[] s) {
      
      String c=new StringBuilder(new String(s)).reverse().toString();
      for(int i=0;i<s.length;i++)
      {
        s[i]=c.charAt(i);
        System.out.println(s[i]);
      }

    }
}