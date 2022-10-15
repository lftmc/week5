package week5Assignment;

public class AsteriskLogger implements Logger {

	

	@Override
	public void log(String logText) {
		System.out.println("***" + logText + "***");
		
	}

	@Override
	public void error(String errorText) {
		// TODO Auto-generated method stub
		
		System.out.println("*************");
		System.out.println("***" + errorText + "***");
		System.out.println("*************");
	}
	
}
