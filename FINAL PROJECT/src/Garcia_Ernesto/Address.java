/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the address for all of the classes will be created and be utilized for all the super and subclasses
 * for the database.
 */
package Garcia_Ernesto;

public class Address {

	private int streetNumber;
	private String apartmentNumber;
	private String streetName;
	private String city;
	private String state;
	private int zipCode;

	public Address() {
		super();
		this.streetNumber = 0;
		this.apartmentNumber = "";
		this.streetName = "";
		this.city = "";
		this.state = "";
		this.zipCode = 0;

	}

	public Address(int streetNumber, String apartmentNumber, String streetName, String city, String state, int zipCode) {

		//initializing the datafield's
		this.streetNumber = streetNumber;
		this.apartmentNumber = apartmentNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

	}

	public Address(int streetNumber, String streetName, String city, String state, int zipCode) {

		//initializing the datafield's
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;

	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;

	}

	public String getApartmentNumber() {
		return apartmentNumber;


	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;


	}

	public String getStreetName() {
		return streetName;

	}

	public void setCity(String city) {
		this.city = city;

	}

	public String getCity() {
		return city;

	}

	public void setState(String state) {
		this.state = state;

	}

	public String getState() {
		return state;

	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;

	}

	public int getZipCode() {
		return zipCode;

	}

	@Override
	public boolean equals(Object object) {
		if(!(object instanceof Address)) {
			return false;
		}

		Address rightHandSide = (Address) object;

		boolean isStreetNumber = this.streetNumber == rightHandSide.streetNumber;
		boolean isApartmentNumber = this.apartmentNumber == rightHandSide.apartmentNumber;
		boolean isStreetName = this.streetName.equalsIgnoreCase(rightHandSide.streetName);
		boolean isCity = this.city.equalsIgnoreCase(rightHandSide.city);
		boolean isState = this.state.equalsIgnoreCase(rightHandSide.state);
		boolean isZipCode = this.zipCode == rightHandSide.zipCode;



		return (isStreetNumber && isApartmentNumber && isStreetName && isCity && isState && isZipCode);


	}


	@Override
	public String toString() {
		String result = "";

		result += "\t\t" + this.streetNumber + " " + this.streetName + ".\n";
		result += "\t\t\t" + this.city + ", " + this.state + ", " + this.zipCode + " " + this.apartmentNumber + "\n"; 


		return result;


	}

}
