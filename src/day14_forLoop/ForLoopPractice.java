package day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i=5;i>0;i--){
            System.out.println("Hello Cydeo");
        }
           int sum=0;
        for(int i = 1; i<101;i+=1 ) {
             sum =sum+i;

        }System.out.println(sum);

        int sumEven=0;
        for(int i=2;i<=100;i+=2){
            sumEven=sumEven+i;

        }System.out.println(sumEven);

        int sumOdd=0;
        for(int i =1; i<=100; i+=2){
            sumOdd=sumOdd+i;
        }
        System.out.println(sumOdd);

        for(char i='A'; i<='Z';i++){
            System.out.print(i+" ");
        }

        System.out.println();

        for(char i='Z'; i>='A';i--){

            System.out.print(i+" ");
        }


    }
}
