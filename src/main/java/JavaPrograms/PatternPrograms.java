package JavaPrograms;

public class PatternPrograms {
    public static void main(String[] args){
        //rightAngleTriangle();
        //triangle();
        diamond();

    }

    public static void diamond(){
        triangle();
        for (int i=4;i>=0;i--){
            for (int s=4;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void triangle(){
        for (int j=0;j<6;j++){
            for (int s=5;s>j;s--){
                System.out.print(" ");
            }
            for(int i=0;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void rightAngleTriangle(){
        for (int j=0;j<6;j++){
            for(int i=0;i<=j;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
