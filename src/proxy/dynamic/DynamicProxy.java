package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	
	private Object obj;
	
	public DynamicProxy() {}
	
	public DynamicProxy(Object obj){
		this.obj=obj;
	}

	//实现 invoke() 方法，调用在真实主题类中定义的方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preRequest();
		method.invoke(obj, args);
		postRequest();
		return null;
	}
	
	public void preRequest(){
		System.out.println("调用之前！");
	}
	
	public void postRequest(){
		System.out.println("调用之前！");
	}

}
