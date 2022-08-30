package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("K:\\Workspace\\SeleniumBasic\\src\\propertyFile\\text.properties");
		Properties p=new Properties();
		p.load(f);
		
		String dk=p.getProperty("driverKey");
		String de=p.getProperty("driverExecutablePath");
	}

}
