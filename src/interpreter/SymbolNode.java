package interpreter;

public abstract class SymbolNode implements Node {
	
	protected Node left;
	protected Node right;
	
	public SymbolNode(Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
	}
	
	

}
