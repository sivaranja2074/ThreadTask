package Thread;

import java.util.ArrayList;
import java.util.List;

public class ListObject {
	public static void main(String args[]) {
		List<Object> list=new ArrayList<>();
		list.add(123);
		list.add(123.45);
		list.add("Sivaranja");
		System.out.println(list.toString());
		for(var str:list)
		{
			System.out.println(str.getClass().getName());
		}
	
		
	}
}
