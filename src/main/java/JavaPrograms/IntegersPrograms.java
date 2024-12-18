package JavaPrograms;

import java.util.ArrayList;

public class IntegersPrograms {
    public static void main(String [] args){
        //primeNumbers(100);

        int f = factorialOf(5);
        System.out.println(f);
    }

    public static int factorialOf(int i){
        int f = 1;
        if (i>1){
             f = i * factorialOf(i-1);
        }

        return f;
    }

    public static void primeNumbers(int i) {
        ArrayList<Integer> prime = new ArrayList<>();
        for(int a=2;a<=i;a++){
            boolean flag = true;
                for(int j=2;j<a;j++){
                    if (a%j==0){
                        flag=false;
                    }
                }
                if (flag){
                    prime.add(a);
                }
            }

        for (int x : prime){
            System.out.println(x);
        }
        //System.out.println(prime.size());
    }
}

