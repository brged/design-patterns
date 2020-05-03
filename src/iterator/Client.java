package iterator;

public class Client {

	public static void process(MyCollection collection){
		MyIterator i=collection.createIterator();
		
		while(!i.isLast()){
			System.out.println(i.currentItem());
			i.next();
		}
	}
	
	public static void main(String[] args) {
		MyCollection collection=new NewCollection();
		process(collection);
	}
}
