package exeptions;

public class IdentifierNotAvailableException extends Exception{
	public IdentifierNotAvailableException() {
		super("In dieser Szene existert bereits ein objekt mit dieser kennung -> Please choose a different identifier!");
	}
}
