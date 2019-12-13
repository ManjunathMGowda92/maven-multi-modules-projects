package org.manjunath.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Class <i>PropertiesReader</i> is used to demonstrate the reading of files
 * from the resources folder using the <i>ResourceStream</i>
 * 
 * @author Manjunath HM
 *
 */
public class PropertiesReader {

	public static void main(String[] args) {
		PropertiesReader reader = new PropertiesReader();
		reader.readProperties();

		reader.readPropertyFiles();

		System.out.println();
		readProps();
	}

	/**
	 * Used to read the resource files. Where the method is static, so we need
	 * to use the .class.getClassLoader() method to load the class and then
	 * access the file using the ResourceStream
	 */
	private static void readProps() {
		// Directly reading under static method
		InputStream inputStream = null;
		try {
			String fileName = "application.properties";

			// class need to be loaded by using .class method as we are
			// accessing it from static method
			inputStream = PropertiesReader.class.getClassLoader().getResourceAsStream("properties/" + fileName);
			Properties props = new Properties();
			props.load(inputStream);

			System.out.println(props.get("application.name"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Used to read the resource files.
	 * 
	 * <p>
	 * In this we are not loading the class as it is a instance method and it
	 * will be called using the object instance
	 * </p>
	 */
	private void readProperties() {
		InputStream inputStream = null;

		try {
			inputStream = getClass().getClassLoader().getResourceAsStream("properties/application.properties");
			Properties props = new Properties();
			props.load(inputStream);

			System.out.println(props.get("application.name"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Used to read the resource files.
	 * 
	 * <p>
	 * In this we are not loading the class as it is a instance method and it
	 * will be called using the object instance. Also the resource folder need
	 * to be start with the "/"(forward slash), because we are not using the
	 * getClassLoader() method.
	 * </p>
	 * 
	 * <p>
	 * When getClassLoader() method is used then "/"(forward slash) is not
	 * required
	 * </p>
	 */
	private void readPropertyFiles() {
		InputStream inputStream = null;

		// if we are not using the getClassLoader(), then "/" is required.
		try {
			inputStream = getClass().getResourceAsStream("/properties/application.properties");
			Properties props = new Properties();
			props.load(inputStream);

			System.out.println(props.get("application.name"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
