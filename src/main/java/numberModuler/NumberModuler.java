package numberModuler;

public class NumberModuler {

	@Override
	public String toString() {
		return "NumberModuler [originalNumber=" + originalNumber + ", countryCode=" + countryCode + ", mobileNumber="
				+ mobileNumber + ", plan=" + plan + ", pack=" + pack + ", area=" + area + "]";
	}
	private String originalNumber;
	private String countryCode;
	private String mobileNumber;
	private String plan;
	private String pack;
	private String area;
public NumberModuler() {
	super();
}
public NumberModuler(String originalNumber, String countryCode, String mobileNumber, String plan, String pack,
		String area) {
	super();
	this.originalNumber = originalNumber;
	this.countryCode = countryCode;
	this.mobileNumber = mobileNumber;
	this.plan = plan;
	this.pack = pack;
	this.area = area;
}
public String getPlan() {
	return plan;
}
public void setPlan(String plan) {
	this.plan = plan;
}
public String getPack() {
	return pack;
}
public void setPack(String pack) {
	this.pack = pack;
}
public String getOriginalNumber() {
	return originalNumber;
}
public void setOriginalNumber(String originalNumber) {
	this.originalNumber = originalNumber;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
	
}
