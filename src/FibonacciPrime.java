import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciPrime {
    public static void main(String[] args) {
        fiboPrime();
    }

    private static void fiboPrime() {
        int f1=0,f2=1;
        int f3=0;
        int mid=0,flag=0;
        ArrayList<Integer> fibonacci=new ArrayList<>();
        for(int i=0;i<45;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if(checkPrime(f3)==true){
                fibonacci.add(f3);
            }
        }
        System.out.println(fibonacci);
    }

    private static boolean checkPrime(int f3) {
        int i,mid=0,flag=0;
        mid=f3/2;
        boolean result=false;
        if(f3==0||f3==1){
            result=false;
        }else{
            for(i=2;i<=mid;i++){
                if(f3%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                result=true;
            }
        }
        return result;
    }
}
