package data;

import org.openqa.selenium.By;

public class locatorsplit {
	public static By splitvalues(String locvalues) {
		String locator_type=locvalues.split(":")[0];
		String locator_value=locvalues.split(":")[1];
		
		if (locator_type.equalsIgnoreCase("name")) {
			return By.name(locator_value);
		}
		else if(locator_type.equalsIgnoreCase("id")) {
			return By.name(locator_value);
		}
		else if (locator_type.equalsIgnoreCase("linkText")) {
			return By.linkText(locator_value);
		}
		return null;
		
	}
}
