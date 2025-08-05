package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// 3 Steps to load properties file
		Properties pro = new Properties();
		// FileInputStream fi = new FileInputStream("D:\\Git Repo\\PropertiesFileConcept\\src\\files\\ SiteData.properties");
		FileInputStream fi = new FileInputStream("./src/files/ SiteData.properties");
		pro.load(fi);
		
		String urlval = pro.getProperty("url");
		String browserval = pro.getProperty("browser");
		String emailval = pro.getProperty("email");
		String pwdval = pro.getProperty("password");
		
		System.out.println(urlval);
		System.out.println(browserval);
		System.out.println(emailval);
		System.out.println(pwdval);
		
		


		
	}

}
