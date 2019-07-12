package teuton.webservice;

import java.util.ResourceBundle;

public class Version {
	
	private static final ResourceBundle bundle = ResourceBundle.getBundle("version");
	
	public String getName() {
		return bundle.getString("name");
	}

	public String getVersion() {
		return bundle.getString("version");
	}

	public String getDescription() {
		return bundle.getString("description");
	}

}
