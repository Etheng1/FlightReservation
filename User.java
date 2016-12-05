/*
 * Created by: Leena Chaleunsouk
 * On: 12/03/16
 */
public class User {
	private int userID; // should be incremental and unique
	String userName; // should be unique
	String email; // should be unique
	String password;
	boolean userType; // returns true if admin, false if customer
	String adminPassword = "admin1!";
	String userAnswer; // must match adminPassword to be admin
	String fName;
	String lName;
	String ssn; // needs to be 9 digits; use isDigit
	String address;
	String zip;
	String state; // two letters; maybe do array so it could be a drop down
					// list.
	int seqQuestion; // drop down list; five possible choices
	String seqAnswer; // remember to ignore case

	// int count = 0; // increment userID

	/*
	 * public User(String userName, String email, String password, String
	 * userAnswer, String fName, String lName, String ssn, String address,
	 * String zip, String state, int seqQuestion, String seqAnswer) {
	 * this.userID = incrementUserID(); this.userName = userName; this.email =
	 * email; this.password = password; this.userAnswer = userAnswer;
	 * this.userType = whatUser(this.userAnswer); this.fName = fName; this.lName
	 * = lName; this.ssn = ssn; this.address = address; this.zip = zip;
	 * this.state = state; this.seqQuestion = seqQuestion; this.seqAnswer =
	 * seqAnswer; }
	 */
	public User() {

	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isUserType() {
		return userType;
	}

	public void setUserType(boolean userType) {
		this.userType = userType;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSeqQuestion() {
		return seqQuestion;
	}

	public void setSeqQuestion(int seqQuestion) {
		this.seqQuestion = seqQuestion;
	}

	public String getSeqAnswer() {
		return seqAnswer;
	}

	public void setSeqAnswer(String seqAnswer) {
		this.seqAnswer = seqAnswer;
	}

	/*
	 * public void setCount(int count) { this.count = incrementUserID(); }
	 *

	public boolean whatUser(String input) {
		if (input.equalsIgnoreCase(adminPassword)) {
			return true;
		} else {
			return false;
		}
	}

	public int incrementUserID() {
		count++;
		this.userID += count;
		return this.userID;
	}
*/
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", userType=" + userType + ", userAnswer=" + userAnswer + ", fName=" + fName + ", lName=" + lName
				+ ", ssn=" + ssn + ", address=" + address + ", zip=" + zip + ", state=" + state + ", seqQuestion="
				+ seqQuestion + ", seqAnswer=" + seqAnswer + "]";
	}
}
