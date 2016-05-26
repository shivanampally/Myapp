package resttest.exception;

public class appexception extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9154239953584851338L;
	public appexception(){}
	public appexception(String msg){super(msg);}
	public appexception(String msg,Throwable cause){super(msg,cause);}
}
