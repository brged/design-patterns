package adapter;

import utils.XMLUtil;

public class Client {

	public static void main(String[] args) {
		Robot robot=(Robot) new XMLUtil().getBean("src/adapter/config.xml");
		robot.cry();
		robot.move();
		
	}
}
