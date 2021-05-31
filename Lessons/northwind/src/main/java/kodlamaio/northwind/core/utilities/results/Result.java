package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	public Result(String message, boolean success) {
		this(success);
		this.message = message;		
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMesssage() {
		return this.message;
	}

}
