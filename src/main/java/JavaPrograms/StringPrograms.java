package JavaPrograms;

import org.checkerframework.checker.units.qual.C;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class StringPrograms {

    public static void main(String[] args){
        System.out.println("String Programs");

        //String concatenation
        //strConcat("aaabbbacfwww");

        //reverse string with preserving blank spaces
        //strReverser("I am a boy");

        //retrieve int from string
        //extractIntFrmStr("India won by 123 runs");

        //reverse string
        //reverseStringWay2("Akshay");

        //reverse words in string
        //reverseWordsInString("Winter is Coming !!");

        //Print even letter Words
        //printEvenLenWords("This is a Java Program");

        //Insert String
        //insertString("geeksGeeks","For");

        // Check string is balanced
        //isBalancedString("[({<})]");

        //sort strings
        //sortString("GeekOfGeeks");

        //Sorting technics
/*        insertionSort();
        selectionSort();
        bubbleSort();*/
    }

    public static void sortString(String in){
        char[] carr = in.toLowerCase().toCharArray();
        System.out.println(in);

        int itr = in.length();
        while (itr>=0){
            for (int i=1;i<in.length();i++){
                if (carr[i]<carr[i-1]){
                    char c = carr[i];
                    carr[i] = carr[i-1];
                    carr[i-1] = c;
                }
            }
            itr--;
        }

        System.out.println(String.valueOf(carr));

    }
    public static void isBalancedString(String in){
        boolean flag = in.length() % 2 == 0;
        char[] cr = in.toCharArray();
        Stack<Character> sc = new Stack<>();
        for(char c : cr){
            switch(c) {
                case '{':
                case '[':
                case '<':
                case '(':
                    sc.add(c);
                    break;
                case '>':
                    if (sc.pop()!='<'){
                        flag=false;

                    }
                    break;
                case ']':
                    if (sc.pop()!='['){
                        flag=false;
                    }
                    break;
                case ')':
                    if (sc.pop()!='('){
                        flag=false;
                    }
                    break;
                case '}':
                    if (sc.pop()!='{'){
                        flag=false;
                    }
                    break;
                default:
                    System.out.println("default - case not found" + c);
                    break;

            }
        }
        if (flag){
            System.out.println("Its balanced");
        }else {
            System.out.println("Its Not");
        }
    }
    public static void insertString(String in1, String in2){
        String s1 = in1.substring(0,5);
        String s2 = in1.substring(5);
        String fl = s1+in2+s2;
        System.out.println(fl);
    }
    public static void printEvenLenWords(String in){
        String[] iar = in.split(" ");
        for (String x : iar){
            if (x.length() % 2 == 0){
                System.out.println(x + " its even");
            }
        }
    }
    public static void reverseWordsInString(String in){
        String[] iar = in.split(" ");
        StringBuilder b = new StringBuilder();
        String[] rar = new String[iar.length];
        int rari = 0;
        for(String x : iar){
            String rs = new String();
            for (int a=x.length()-1;a>=0;a--){
                rs+=x.charAt(a);
            }
            rar[rari] = rs;
            rari++;
        }

        for (String x : rar){
            b.append(x);
            b.append(" ");
        }
        System.out.println(b.toString().trim());
    }

    public static void reverseStringWay2(String in){
        String r = new String();
        for (int a =in.length()-1; a>=0;a--){
            r+=in.charAt(a);
        }
        System.out.println(r);
    }
    public static void reverseStringWay1(String in){
        char[] r = new char[in.length()];
        char[] i = in.toCharArray();
        int j =r.length-1;
        for(int a=0;a<i.length;a++){
            r[j] = i[a];
            j--;
        }
        System.out.println(String.valueOf(r));

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

    public static void insertionSort(){
        int a [] = {3,2,1,8,8};
        int len = a.length;
        System.out.println("Before sorting -- ");
        printArray(a);

        for (int i=1;i<len;i++){
            int j=i-1;
            int current = a[i];

            while (j >=0 && current < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;

        }
        System.out.println("After sorting -- ");
        printArray(a);
    }

    public static void selectionSort(){
        //selection sort

        int a [] = {3,3,1,5,8};
        int len = a.length;
        System.out.println("Before sorting -- ");
        printArray(a);

        for(int count=0;count<len;count++) {
            int smallest_index = count;
            for (int x = count+1; x < len; x++) {
                if (a[smallest_index] > a[x]) {
                    smallest_index = x;
                }
            }
            int temp = a[count];
            a[count] = a[smallest_index];
            a[smallest_index] = temp;
        }

        System.out.println("After sorting -- ");
        printArray(a);
    }

    public static void bubbleSort(){
        int a[] = {3,1,8,3,7};
        int len = a.length;
        System.out.println("Before sorting -- ");
        printArray(a);

        while (len>0){

            for (int b=0;b<a.length-1; b++){
                if (a[b] > a[b+1]){
                    int t = a[b+1];
                    a[b+1] = a[b];
                    a[b]=t;
                }
            }
            len--;
        }
        System.out.println("After sorting -- ");
        printArray(a);
    }

    public static void printArray(int a[]){
        int len = a.length;
        for (int b=0;b<=len-1;b++){
            System.out.print(a[b] + " ");
        }
        System.out.println(" ");
    }
}
