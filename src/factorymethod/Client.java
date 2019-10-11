package factorymethod;

public class Client {	

	public static void main(String[] args) {
		TV tv;
		TVFactory factory;
		
		factory=(TVFactory) XMLUtil.getBean();
		tv = factory.produceTV();
		
		tv.play();
	}
}
