package flyweight.intrinsic;

public class Switch implements NetworkDevice {

	private String type;
	
	public Switch(String type) {
		this.type=type;
	}
	
	@Override
	public String getType() {
		return type;
	}

	@Override
	public void use() {
		System.out.println("Linked by switch, type is "+type);
	}

}
