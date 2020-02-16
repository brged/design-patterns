package adapter.dataencryter;

public class CipherAdapter extends DataOperation {
	private Caesar cipher;
	
	public CipherAdapter() {
		this.cipher=new Caesar();
	}

	@Override
	public String doEncrypt(int key, String ps) {
		return this.cipher.doEcrypt(key, ps);
	}
	

}
