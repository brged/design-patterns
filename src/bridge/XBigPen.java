package bridge;

public class XBigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType="超大号毛笔绘制";
		this.color.bepaint(penType, name);
	}

}
