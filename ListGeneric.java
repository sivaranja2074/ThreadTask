package Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListGeneric {
	public static void printAll(List<?> list) {
	      for (Object item : list)
	         System.out.println(item.getClass().getName()+" "+item + " ");
	   }
	   public static void main(String args[]) {
	      List<String> stringList = new ArrayList<String>();
	      stringList.add("siva");
	      stringList.add("raji");
	      stringList.add("Ajay");
	      printAll(stringList);
	      List<Double> doubleList = Arrays.asList(1.2, 2.3, 3.5);
	      printAll(doubleList);
	   }
	}

