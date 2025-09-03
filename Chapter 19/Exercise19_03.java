/* Author: Katie Prohaska
 * Date; 09/03/2025
 * This code returns an array without the duplicates.
 */
import java.util.ArrayList;

public class Exercise19_03{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);
        list.add(42);
        list.add(25);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
            for(int j = 1; j < list.size(); j++){
            if(list.get(0) == list.get(j)){
                list.remove(j);
            }
            }
            return list;
        }
    }
