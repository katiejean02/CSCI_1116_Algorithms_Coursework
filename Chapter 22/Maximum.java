import java.util.ArrayList;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user = input.next();
        String longest = "";
        String substring = "";
        
        for(int i = 0; i < user.length() - 2; i++){
            longest = "" + user.charAt(i);

            for(int j = i +1; j< user.length(); j++){
                if(user.charAt(j -1) + 1 > user.charAt(j)){
                    break;
                }
                longest += user.charAt(j);
            }
            if(longest.length() > substring.length()){
                substring = longest;
            }
                i += longest.length() -1;
            
        }
        
        System.out.println("Maximum consecutive substring is : " + substring);
    }
}
