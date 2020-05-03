package interpreter;

import java.util.Stack;

public class Calculator {

	private String statement;
	private Node node;
	
	public void build(String statement){
		Node left=null;
		Node right=null;
		Stack stack=new Stack();
		
		String[] statementArr=statement.split(" ");
		
		for (int i = 0; i < statementArr.length; i++) {
			if(statementArr[i].equalsIgnoreCase("*")){
				left=(Node) stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new ValueNode(val);
				stack.push(new MulNode(left, right));
			}
			else if(statementArr[i].equalsIgnoreCase("/")){
				left=(Node) stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new ValueNode(val);
				stack.push(new DivNode(left, right));
			}
			else if(statementArr[i].equalsIgnoreCase("%")){
				left=(Node) stack.pop();
				int val=Integer.parseInt(statementArr[++i]);
				right=new ValueNode(val);
				stack.push(new ModNode(left, right));
			}
			else{
				int val=Integer.parseInt(statementArr[i]);
				stack.push(new ValueNode(val));
			}
		}
		this.node=(Node) stack.pop();
	}
	
	public int compute(){
		return node.interpret();
	}
}
