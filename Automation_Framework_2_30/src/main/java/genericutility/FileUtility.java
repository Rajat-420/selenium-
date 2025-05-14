package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility{
		public static void main(String[] args) throws IOException  {
			FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
			Properties prop =new Properties();
	
			prop.load(fis);
			String URL = prop.getProperty("url");
			String email = prop.getProperty("email");
			String password = prop.getProperty("password");
			System.out.println(URL);
			
		}

		public String getDataFrmProperty(String string) {
			return null;
		}
}
