
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int greatestNumber = number1;
        
        if (greatestNumber < number2) {
            greatestNumber = number2;
        }
        
        if (greatestNumber < number3) {
            greatestNumber = number3;
        }
        
        return greatestNumber;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
