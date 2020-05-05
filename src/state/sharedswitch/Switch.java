package state.sharedswitch;

public class Switch {

	private static State state, onState, offState;
	private String name;
	
	public Switch(String name){
		this.name=name;
		onState=new OnState();
		offState=new OffState();
		state=onState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	// 打开开关
	public void on(){
		System.out.print(name);
		state.on(this);
	}
	
	// 关闭开关
	public void off(){
		System.out.print(name);
		state.off(this);
	}
	
	public static State getState(String type){
		if(type.equalsIgnoreCase("on")){
			return onState;
		}
		else{
			return offState;
		}
	}

}
