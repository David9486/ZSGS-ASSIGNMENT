package stringutils;

import java.util.Arrays;

public class Stringutils {
    public String concate(String m,String n){
        return m+n;
    }
    public String reverseStr(String m){
        char[] arr = new char[m.length()];
        int j = 0;

        for (int i = m.length() - 1; i >= 0; i--) {
            arr[j++] = m.charAt(i); // fill array from start
        }

        return new String(arr);
    }
    public int  lengthStr(String m){
        int len=0;
        for(int i=0;i<m.length();i++){
            len+=1;
        }
        return len;
    }

}
