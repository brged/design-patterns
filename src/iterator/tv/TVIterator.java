package iterator.tv;

public interface TVIterator {

	void setChannel(int i);
	void next();
	void previous();
	boolean isLast();
	Object currentItem();
	boolean isFirst();
}
