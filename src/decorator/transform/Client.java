package decorator.transform;

public class Client {

	public static void main(String[] args) {
		Transform camaro;
		camaro=new Car();
		camaro.move();
		System.out.println("-----------------------");
//		Robot bumblebee=new Robot(camaro);
//		bumblebee.move();
//		bumblebee.say();
		
		Airplane bumblebee=new Airplane(camaro);
		bumblebee.move();
		bumblebee.fly();
	}
}
