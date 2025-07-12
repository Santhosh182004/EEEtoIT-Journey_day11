import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str2=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                  char ch2= Character.toUpperCase(ch);
                   str2+=ch2;                   
            }
            else{
              char ch3=  Character.toLowerCase(ch);
                   str2+=ch3;
            }
        }
        System.out.println(str2);     
    }
}
