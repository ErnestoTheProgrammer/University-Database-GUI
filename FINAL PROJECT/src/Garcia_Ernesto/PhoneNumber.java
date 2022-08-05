/* Name: Ernesto Garcia
 * CIN: 306774005
 * Course & Section: CS2012 Sections 20 
 * Description: In this class, the phone number will be created, passed in to a toString method and will be used in the other classes.
 * you will have to input the phone number in three different parts
 */
package Garcia_Ernesto;

public class PhoneNumber {

	private String type;
	private int areaCode;
	private int prefix;
	private int suffix;


	public PhoneNumber() {
		super();
		this.type = "";
		this.areaCode = 0;
		this.prefix = 0;
		this.suffix = 0;

	}

	public PhoneNumber(String type, int areaCode, int prefix, int suffix) {

		this.type = type;
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.suffix = suffix;


	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getSuffix() {
		return suffix;
	}

	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

	@Override
	public boolean equals(Object object){//create method in another class

		if(!(object instanceof PhoneNumber)){//fix the method so that 
			return false;

		}

		PhoneNumber rightHandSide = (PhoneNumber)object;

		boolean isType = this.type.equalsIgnoreCase(rightHandSide.type);
		boolean isAreaCode = this.areaCode == rightHandSide.areaCode;
		boolean isPrefix = this.prefix == rightHandSide.prefix;
		boolean isSuffix = this.suffix == rightHandSide.suffix;


		return (isAreaCode && isPrefix && isSuffix && isType);  




	}

	@Override
	public String toString() {

		String result = "";

		result += this.getType() + ": ";

		result += String.format("%s%03d%s", "(", this.areaCode, ")- ");//one not using the get method in the class

		result += String.format("%03d%s", this.getPrefix(), "-");

		result += String.format("%04d", this.getSuffix());


		return result;




	}







}
