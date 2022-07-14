import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Fourte {
    public static void main(String[] args) {
        showTargetMath();
    }

    private static void showTargetMath() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Your Target Number:");
        int target = random.nextInt(9);
        System.out.println(target);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int number = random.nextInt(9);
            numbers.set(i,number);
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println("\nYou Can use these Operators: || ( || + || - || * || / || ) ||");
        System.out.println("Enter the Expression:");
        Stack<Character> expression=new Stack<>();
        for(int i=0;i<expression.size();i++){
            expression.push(scan.next().charAt(i));
            for(int j=0;j<4;j++){
//                if(numbers.get(i)!=expression.peek()){
//
//                }
            }
        }
        //buildFourte(expression,target);
    }

//    private static void buildFourte(Stack<Character> expression,int target) {
//
//        Stack<Character> storeExpression = new Stack<>();
//        int val = 0;
//        char currentOperator = '\0';
//        for (int i = 0; i < expression.length(); i++) {
//            char eachCharacter = expression.charAt(0);
//            storeExpression.push(eachCharacter);
//            if (eachCharacter >= 0 && eachCharacter <= 9) {
//                val = Character.getNumericValue(eachCharacter);
//            }
//            if (storeExpression.lastElement() == '+' || storeExpression.lastElement() == '-' || storeExpression.lastElement() == '/' || storeExpression.lastElement() == '*') {
//                currentOperator = storeExpression.pop();
//                switch (currentOperator) {
//                    case '+':
//                        val += storeExpression.pop();
//                        break;
//                    case '-':
//                        val -= storeExpression.pop();
//                        break;
//                    case '*':
//                        val *= storeExpression.pop();
//                        break;
//                    case '/':
//                        val /= storeExpression.pop();
//                        break;
//                }
//                //currentOperator='\0';
//            }
//
//        }
//        System.out.println("Value:" + val);
//
//        if(val==target){
//            System.out.println("SUCCESS!!");
//        }
//    }
}