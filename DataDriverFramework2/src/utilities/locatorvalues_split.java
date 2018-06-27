package utilities;

import org.openqa.selenium.By;

public class locatorvalues_split {
	public static By locatorvaluessplit(String locvalues) {
		
		String locator_type=locvalues.split(":")[0];
		String locator_value=locvalues.split(":")[1];
		
		if (locator_type.equalsIgnoreCase("name")) {
			return By.name(locator_value);
		}
		else if(locator_type.equalsIgnoreCase("id")) {
			return By.id(locator_value);
		}
		else if (locator_type.equalsIgnoreCase("linktext")) {
			return By.linkText(locator_value);
		}
		else if (locator_type.equalsIgnoreCase("partiallinktext")) {
			return By.linkText(locator_value);
		}
		else if (locator_type.equalsIgnoreCase("xpath")) {
			return By.linkText(locator_value);
		}
		else if (locator_type.equalsIgnoreCase("cssselector")) {
			return By.linkText(locator_value);
		}
			
		return null;
		
	}
}
