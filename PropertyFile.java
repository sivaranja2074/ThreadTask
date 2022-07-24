package Thread;
import java.util.*;  
import java.io.*;  
public class PropertyFile {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\java\\Task\\src\\Thread\\demo.properties");  
      
    Properties property=new Properties();  
    property.load(reader);  
      
    System.out.println(property.getProperty("name"));  
    System.out.println(property.getProperty("dept")); 
    System.out.println(property.getProperty("email"));  
}  
}  