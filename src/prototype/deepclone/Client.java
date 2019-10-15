package prototype.deepclone;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		Email email,copyEmail = null;
		email=new Email();
		email.setNum(1);
		try {
			copyEmail = (Email) email.deepClone();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("email:"+(email==copyEmail));
		System.out.println("num:"+(email.getNum()==copyEmail.getNum()));
		System.out.println("attachment:"+(email.getAttachment()==copyEmail.getAttachment()));
	}
}
