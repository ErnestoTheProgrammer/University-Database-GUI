package Garcia_Ernesto;

public class PhoneNumberFormatException extends Exception{

	private String phoneStorage;

	public PhoneNumberFormatException(String phoneStorage) {
		super("Invalid Phone number Format " +  phoneStorage);
		this.phoneStorage = phoneStorage;

	}

	public String getPhoneNumber() {
		return this.phoneStorage;
	}

}
