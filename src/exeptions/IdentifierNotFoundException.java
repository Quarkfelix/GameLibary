package exeptions;

public class IdentifierNotFoundException extends Exception{
	public IdentifierNotFoundException() {
		super("The given identifier was not found.");
	}
}
