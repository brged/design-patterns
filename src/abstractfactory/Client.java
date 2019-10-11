package abstractfactory;

import utils.XMLUtil;

public class Client {
	public static void main(String[] args) {
		Television tv;
		AirConditioner ac;
		EFactory factory;
		
		factory=(EFactory) XMLUtil.getBean("src/abstractfactory/config.xml");
		
		tv=factory.produceTelevision();
		tv.play();
		
		ac=factory.produceAirConditioner();
		ac.changeTemperature();
	}
}
