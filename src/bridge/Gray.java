package bridge;

public class Gray implements Color {

	@Override
	public void bepaint(String penType, String name) {
		System.out.println(penType + "灰色的" + name +".");
	}

}
