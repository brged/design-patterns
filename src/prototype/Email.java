package prototype;

public class Email implements Cloneable {
	private int num;
	private Attachment attachment=null;
	
	public Email(){
		this.attachment=new Attachment();
	}
	
	public Object clone(){
		Email clone=null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	public void display(){
		System.out.println("查看邮件！");
	}
	
	public Attachment getAttachment(){
		return this.attachment;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
