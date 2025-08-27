import java.util.Scanner;
import java.lang.*;

public class reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string so we can reverse it! ");
        String useString = input.next();

        reverseString(useString);
        

    }
    public static String reverseString(String useString){
        String reversed = "";
        if (useString == null){
            return null;
        }
        else{
        for(int i = 0; i < useString.length(); i++){
            reversed = useString.charAt(i) + reversed;
        }
        System.out.print("The string you entered reversed is: " + reversed);
        return reversed;
    }
}
}