package flyweight.intrinsic;

public class Hub implements NetworkDevice {

	private String type;
	
	public Hub(String type) {
		this.type=type;
	}
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public void use() {
		System.out.println("Linked by Hub, type is "+type);
	}

}
