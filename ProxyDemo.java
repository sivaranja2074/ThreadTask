package Thread;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

interface Human
{
	void walk(); 
	void talk();
}	
class Person implements Human
{
	public void walk()
	{
		System.out.println("I am walking");
	}
	public void talk()
	{
		System.out.println("I am talking");
	}
}
class ProxyHandler implements InvocationHandler
{
	private final Object target;
	private Map<String,Integer> methods=new HashMap<>();
	public ProxyHandler(Object target)
	{
		this.target=target;
	}
	
	@Override
    public Object invoke(Object proxy, Method method, Object[] args) 
      throws Throwable {
		
		String methodName=method.getName();
		 if(methodName.contains("toString"))
		 {
			 return methods.toString();
		 }

		methods.merge(methodName, 1, Integer::sum);
		return method.invoke(target, args);
    }
}

public class ProxyDemo {

	
	@SuppressWarnings("unchecked")
	public static <T> T withLogging(T target, Class<T> iterface)
	{
		return (T) Proxy.newProxyInstance(
				iterface.getClassLoader(),
				new Class<?>[] {iterface},
				new ProxyHandler(target));
	}
	
	public static void main(String args[])
	{
		Person person=new Person();
		Human human=withLogging(person,Human.class);
		
		human.talk();
		human.walk();
		human.walk();
		System.out.println(human);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
