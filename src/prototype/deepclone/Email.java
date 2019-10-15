package prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * 通过序列化实现深克隆
 * @author WWW
 *
 */
public class Email implements Serializable {

	private int num;
	private Attachment attachment=null;
	
	public Email(){
		attachment=new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{
		//将对象写到数组缓冲区中
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object object = ois.readObject();
		return object;
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
