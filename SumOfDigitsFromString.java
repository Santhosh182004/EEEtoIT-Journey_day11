import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int sum=0;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                 int num=ch-'0';
                 sum+=num;
            }
        }
        System.out.println("The sum of digits form the given string is : "+sum);
    }}
