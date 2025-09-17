/*
Author: 
Date: 

Description: 
*/
import java.util.Arrays;
import java.util.Comparator;

public class Exercise20_21 <E extends Comparable<E>>{
  public static void main(String[] args) {
    GeometricObject[] list = {new Circle(5), new Rectangle(4, 5),
        new Circle(5.5), new Rectangle(2.4, 5), new Circle(0.5), 
        new Rectangle(4, 65), new Circle(4.5), new Rectangle(4.4, 1),
        new Circle(6.5), new Rectangle(4, 5)};

        selectionSort(list, new GeometricObjectComparator());
        for(int i = 0; i < list.length; i++){
          if(list[i] instanceof Circle){
          System.out.print(list[i] + " ");
          } else if(list[i] instanceof Rectangle){
            System.out.print("Rectangle: "+ list[i].getArea() + " ");
          }
        }
    }
    public int compare(GeometricObject o1, GeometricObject o2) {
			double area1 = o1.getArea(); double area2 = o2.getArea();
			if (area1 < area2) 
				return -1;
			else if (area1 == area2) 
				return 0;
			else
				return 1;
		}
      private static <E> void selectionSort(E[] list, Comparator<? super E> comparator) {
        Arrays.sort(list, comparator);   
      }
                
}