package singleton.identitycardno;

public class Client {

	public static void main(String[] args) {
		IdentityCardNo no1,no2;
		
		no1=IdentityCardNo.getInstance();
		no2=IdentityCardNo.getInstance();
		System.out.println(no1==no2);
		
		String str1,str2;
		System.out.println(str1=no1.getNo());
		System.out.println(str2=no2.getNo());
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
	}
}
