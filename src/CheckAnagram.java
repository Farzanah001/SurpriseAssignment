import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1= scan.next().toLowerCase();
        System.out.println("Enter String 2:");
        String str2= scan.next().toLowerCase();
        checkAnagram(str1,str2);
    }

    private static void checkAnagram(String str1, String str2) {
        char[] firstString=new char[str1.length()];
        char[] secondString=new char[str2.length()];
        for(int i=0;i<str1.length();i++){
            char tempChar=str1.charAt(i);
            firstString[i]=tempChar;
        }
        for(int i=0;i<str2.length();i++){
            char tempChar=str1.charAt(i);
            secondString[i]=tempChar;
        }

        Arrays.sort(firstString);
        Arrays.sort(secondString);
        int count=0;
        if(str1.length()!=str2.length()){
            System.out.println("Given Strings Are Not Anagram");
        }
        else {
            for (int i = 0; i < firstString.length; i++) {
                if(firstString[i]==secondString[i]){
                    count++;
                }
            }
            if(str1.length()==count){
                System.out.println("Given String is an Anagram");
            }
            else{
                System.out.println("Given Strings are Not Anagram");
            }
        }
    }
}
