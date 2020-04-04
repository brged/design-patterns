package flyweight.extrinsic;

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
	public void use(Port port) {
		System.out.println("Linked by Hub, type is "+type+", port is "+port.getPort());
	}

}
