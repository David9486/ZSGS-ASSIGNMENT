
public class MyString {
    char arr[];
    String str1;
    public MyString(String str1) {
        this.arr=str1.toCharArray();
        this.str1=str1;
    }


    public int length(){
        int n=0;
        for(char c:arr){
            n++;
        }
        return n;
    }
    public char CharAt(int index){
        //char a=' ';
        /*for(int i=0;i<length();i++){
            a=arr[index];
            break;
        }*/
        return arr[index];
    }
    public boolean equals(String str1, String str2){
        if(str1.length()!=str2.length()) {
            return false;
        }
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)) {
                    return false;
                }
            }

        return true;
    }
    public String toUpperCase(){
        String s="";
        for(char c:arr){
            if(c>='a'&&c<='z'){
                s=s+(char)(c-32);
            }
            else{
                s=s+c;
            }
        }
        return s;
    }
    public String toLowerCase(){
        String s="";
        for(char c:arr){
            if(c>='A'&&c<='Z'){
                s=s+(char)(c+32);
            }
            else{
                s=s+c;
            }
        }
        return s;
    }
    public String substring(int start,int end){
        String s="";
        for(int i=start;i<end;i++){
            s+=arr[i];
        }
        return s;
    }
    public String concat(String str1,String str2){
        return str1+str2;
    }

    public boolean contains(String str1,String str2){
        for(int i=0;i<=str1.length()-str2.length();i++) {
            int temp=i;
            for(int j=0;j<str2.length();j++) {
                if ((str1.charAt(temp) == str2.charAt(j))) {
                    temp++;
                }
            }
            if(temp-i==str2.length()) return true;
        }
        return false;
    }
    public int indexOf(char ch){
        for(int i=0;i<length();i++){
            if(arr[i]==ch){
                return i;
            }
        }
        return 0;
    }
    public String replace(char old,char new1){
        //char[] rearr=new char[length()];
        String rearr="";
        for(int i=0;i<arr.length;i++){
            if(old!=arr[i]){
                rearr+=arr[i];
            }
            else rearr+=new1;
        }
        return rearr;
    }
}
