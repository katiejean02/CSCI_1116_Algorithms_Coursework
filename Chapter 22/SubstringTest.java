import java.util.Scanner;

public class SubstringTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string s1: ");
        String user1 = input.nextLine();

        System.out.println("Enter a string s2: ");
        String user2 = input.nextLine();

        if(user1.contains(user2)){
            System.out.println("s2 is a substring of s1.");
            for(int i = 0; i < user1.length(); i++){
                if(user1.charAt(i) == user2.charAt(0)){
                    System.out.println("Matched index at " + i);
                }
            }
        }else{
            System.out.println("s2 is not a substirng of s1.");
        }
    }
}