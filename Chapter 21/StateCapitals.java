import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitals{
    public static void main(String[] args){

        Map<String,String> hashMap = new HashMap();
        hashMap.put("Alabama","Montgomery");
        hashMap.put("Alaska","Juneau");
        hashMap.put("Arizona","Phoenix");
        hashMap.put("Arkansas","Little Rock");
        hashMap.put("California","Sacramento");
        hashMap.put("Colorado","Denver");
        hashMap.put("Conneticut","Hartford");
        hashMap.put("Delaware","Dover");
        hashMap.put("Florida","Tallahassee");
        hashMap.put("Georgia","Atlanta");
        hashMap.put("Hawaii","Honolulu");
        hashMap.put("Idaho","Boise");
        hashMap.put("Illinois","Springfield");
        hashMap.put("Indiana","Indianapolis");
        hashMap.put("Iowa","Des Moines");
        hashMap.put("Kansas","Topeka");
        hashMap.put("Kentucky","Frankfort");
        hashMap.put("Louisiana","Baton Rouge");
        hashMap.put("Maine","Augusta");
        hashMap.put("Maryland","Annapolis");
        hashMap.put("Massachusettes","Boston");
        hashMap.put("Michigan","Lansing");
        hashMap.put("Minnesota","Saint Paul");
        hashMap.put("Mississippi","Jackson");
        hashMap.put("Missouri","Jefferson City");
        hashMap.put("Montana","Helena");
        hashMap.put("Nebraska","Lincoln");
        hashMap.put("Nevada","Carson City");
        hashMap.put("New Hampshire","Concord");
        hashMap.put("New Jerssey","Trenton");
        hashMap.put("New York","Albany");
        hashMap.put("New Mexico","Sante Fe");
        hashMap.put("North Carolina","Raleigh");
        hashMap.put("North Dakota","Bismark");
        hashMap.put("Ohio","Columbus");
        hashMap.put("Oklahoma","Oklahoma City");
        hashMap.put("Oregon","Salem");
        hashMap.put("Pennsylvania","Harriisburg");
        hashMap.put("Rhode Island","Providence");
        hashMap.put("South Carolina","Columbia");
        hashMap.put("South Dakota","Pierre");
        hashMap.put("Tennessee","Nashville");
        hashMap.put("Texas","Austin");
        hashMap.put("Utah","Salt Lake City");
        hashMap.put("Vermont","Monteplier");
        hashMap.put("Virginia","Richmond");
        hashMap.put("Washington","Olympia");
        hashMap.put("West Virginia","Charleston");
        hashMap.put("Wisconsin","Madison");
        hashMap.put("Wyoming","Cheyenne");
       
      
        for(int i = 0; i < hashMap.size(); i++){
            System.out.print("Enter a state: ");
            Scanner input = new Scanner(System.in);
            String state = input.next();
        if(hashMap.containsKey(state)){
            System.out.println(state + ": " + hashMap.get(state));
        }else{
            System.out.print("Sorry you have not entered a state.");
        }
    }
    }
}