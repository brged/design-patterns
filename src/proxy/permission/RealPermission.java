package proxy.permission;

public class RealPermission implements AbstractPermission {

	@Override
	public void modifyUserInfo() {
		System.out.println("修改用户信息！");
		
	}

	@Override
	public void viewNote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void publishNote() {
		System.out.println("发布新帖！");
		
	}

	@Override
	public void modifyNote() {
		System.out.println("修改发布内容！");
		
	}

	@Override
	public void setLevel(int level) {
		// TODO Auto-generated method stub
		
	}

}
