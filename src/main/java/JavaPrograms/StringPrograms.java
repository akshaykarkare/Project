package JavaPrograms;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Set;

public class StringPrograms {

    public static void main(String[] args){
        System.out.println("String Programs");

        //String concatenation
        //strConcat("aaabbbacfwww");

        //reverse string with preserving blank spaces
        //strReverser("I am a boy");

        //retrieve int from string
        extractIntFrmStr("India won by 123 runs");
    }

    public static void extractIntFrmStr(String in){
        String[] a1 = in.split(" ");
        int a=0;
        for (String x : a1){
            char c = x.charAt(0);

            if (Character.isDigit(c)){
                a = Integer.parseInt(x);
            }
        }
        System.out.println("extracted int is : " + a);
    }
    public static void strReverser(String input){
        char[] ic = input.toCharArray();
        char[] oc = new char[input.length()];
        //mark spaces
        for (int i =0; i<ic.length;i++){
            if (ic[i]==' '){
                oc[i] = ' ';
            }
        }

        //reverse string preserving marked spaces
        int j = oc.length -1;
        for (int i=0;i<ic.length;i++){
            if (ic[i]!=' '){
                while(oc[j]==' '){
                    j--;
                }
                oc[j] = ic[i];
                j--;
            }
        }

        System.out.println(new String(oc));



    }
    public static void strConcat(String input){
        String output = new String();
        int count =1;


        for (int i=1;i<=input.length();i++){
            if (i < input.length() && input.charAt(i) == input.charAt(i-1)){
                count+=1;
            }else {
                output+=(input.charAt(i-1));
                if (count > 1){
                    output+=(count);
                }
                count = 1;
            }
        }
        System.out.println(output);
    }
}
