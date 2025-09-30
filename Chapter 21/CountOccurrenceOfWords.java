import java.util.*;
import java.lang.Comparable;


public class CountOccurrenceOfWords extends WordOccurence{
		CountOccurrenceOfWords(String word, Integer count) {
				super(word, count);
			}
		
				public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";
			
		ArrayList<WordOccurence> list = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		String[] words = text.split("[\\s+\\p{P}]");
		for(int i = 0; i < words.length; i++){
			String key = words[i].toLowerCase();

			if(key.length() > 0){
				if(!map.containsKey(key)){
					map.put(key,1);
				}else{
					int value = map.get(key);
					value++;
					map.put(key,value);
				}
			}
		}
	
	map.forEach((k,v) -> list.add(new WordOccurence(k,v)));
	Collections.sort(list);
	for(int j = 0; j < list.size(); j++){
		System.out.println(list.get(j) + " ");
	}
}
}
