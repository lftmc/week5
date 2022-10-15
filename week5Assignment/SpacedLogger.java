package week5Assignment;

public class SpacedLogger implements Logger {

	private String spacer(String text) {
		StringBuilder spacedText = new StringBuilder(text);
		for (int i = 1; i < spacedText.length(); i +=2)
		    spacedText.insert(i, " ");
		
		return spacedText.toString();
		
	}
	
	@Override
	public void log(String logText) {
		// TODO Auto-generated method stub
		System.out.println(spacer(logText));
	}

	@Override
	public void error(String errorText) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + spacer(errorText));
	}

}
