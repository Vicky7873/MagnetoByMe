package RandomUtils;

import org.apache.commons.lang3.RandomStringUtils;

public class randomClass {
	
	public String setTheRandomString() {
		String random=RandomStringUtils.randomAlphabetic(2);
		return random;
	}
	
	public String SetTheRandomInt() {
		String random=RandomStringUtils.randomNumeric(1);
		return random;
	}
	
	public String SetTheRandomEmail() {	
		String random=RandomStringUtils.randomAlphabetic(5);
		return random+"@gmail.com";
	}

}
