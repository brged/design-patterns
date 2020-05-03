package interpreter;

public class ValueNode implements Node {

	private int value;
	
	public ValueNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public int interpret() {
		
		return this.value;
	}

}
