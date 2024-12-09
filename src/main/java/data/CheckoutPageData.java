package data;

public class CheckoutPageData {

	// file to extract data will be needed
	private String firstNameTextField = "mahmoud";
	private String lastNameTextField = "Goma";
	private String postalCodeTextField = "1234";

	public String getFirstName() {
		return firstNameTextField;
	}

	public String getPassword() {
		return lastNameTextField;
	}

	public String getPostalCode() {
		return postalCodeTextField;
	}

	public void setUserName(String firtsNameText) {
		this.firstNameTextField = firtsNameText;
	}

	public void setPassword(String lastNameText) {
		this.lastNameTextField = lastNameText;
	}

	public void setPostalCode(String postalCodeText) {
		this.postalCodeTextField = postalCodeText;
	}

}
