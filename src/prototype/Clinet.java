package prototype;

public class Clinet {

	public static void main(String[] args) {
		Email email,copyEmail;
		email=new Email();
		email.setNum(1);
		copyEmail=(Email) email.clone();
		
		System.out.println("email:"+(email==copyEmail));
		System.out.println("num:"+(email.getNum()==copyEmail.getNum()));
		System.out.println("attachment:"+(email.getAttachment()==copyEmail.getAttachment()));
	}
}
