import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairsOfDivisibleSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        byte size= scan.nextByte();
        System.out.println("Enter the Array Elements:");
        int[] mainArray=new int[size];
        for(int i=0;i<size;i++){
            mainArray[i]= scan.nextInt();
        }
        System.out.println("Enter the Divisor:");
        int divisor= scan.nextInt();
        findDivisibleSumPairs(mainArray,divisor);
    }

    private static void findDivisibleSumPairs(int[] mainArray,int divisor) {
        System.out.println("The Divisible Sum Pairs:");
        //HashMap<Integer,Integer> storage=new HashMap<>();
        for(int i=0;i< mainArray.length;i++){
            for(int j=i+1;j<mainArray.length;j++){
                int tempSum=mainArray[i]+mainArray[j];
                if(tempSum%divisor==0){
                    System.out.println("["+mainArray[i]+","+mainArray[j]+"]");
//                  System.out.println(mainArray[i]);
//                  System.out.println(mainArray[j]);

//                  storage.put(i,j);
                }
            }
        }
//        for(Map.Entry<Integer,Integer> printval: storage.entrySet()){
//            System.out.println(printval.getKey()+" "+printval.getValue());
//        }
    }
}
