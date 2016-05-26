package resttesst.appresponse;

public class appresponse {

	public final static String success = "success";
	public final static String error = "error";
	
	private String status = success;
	private String msg;
	private Object paylod;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getPaylod() {
		return paylod;
	}
	public void setPaylod(Object paylod) {
		this.paylod = paylod;
	}

	
}
