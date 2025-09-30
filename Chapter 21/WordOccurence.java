public class WordOccurence implements Comparable<WordOccurence> {
    String word;
    int count;
 
     WordOccurence(String word, Integer count) {
      this.word = word;
      this.count = count;
    }
     int getCount(){
      return count;
     }
     String getWord(){
      return word;
     }
     void increaseCount(){
      count++;
     }
     public String toString(){
           String list ="WordOccurence: " + word + " " + count;
           return list;
          }

    public int compareTo(WordOccurence other) {
       return Integer.compare(this.count, other.count);
    }

 }