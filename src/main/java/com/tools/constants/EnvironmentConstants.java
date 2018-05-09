package com.tools.constants;

import com.tools.persistence.PropertyFileReader;

public class EnvironmentConstants {

	public static final String BASE_URL = PropertyFileReader.getEnvConstantsItem("BASE_URL");
	public static final String USERNAME = PropertyFileReader.getEnvConstantsItem("USERNAME");
	public static final String PASSWORD = PropertyFileReader.getEnvConstantsItem("PASSWORD");
}
