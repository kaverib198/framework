package comm.kavya.objectRepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		/*File file=new File("D:\\\\Nov830pm\\\\Framework\\\\Config.properties");
		FileInputStream file=new FileInputStream("file");
		*/
		
		//specifiying location of the file
		FileInputStream fip=new FileInputStream("D:\\Nov830pm\\Framework\\Config.properties");
		
		//loading the file
		Properties properties= new Properties();
		properties.load(fip);
		
		//reading daata frm config propertis
		/*String qa_url_value=properties.getProperty("qa_url");
		System.out.println("qa_url"+qa_url_value);
		
		String qa_un_value=properties.getProperty("qa_un");
		System.out.println("qa_un"+qa_un_value);
		
		String qa_pswd_value=properties.getProperty("qa_pswd");
		System.out.println("qa_pswd"+qa_pswd_value);
		
		String qa_pswd_value1=properties.getProperty("qa_pswd456");//null values as it is not dr in config file
		System.out.println("qa_pswd456"+qa_pswd_value1);
		
		String qa_pswd_value2=properties.getProperty("qa_pswd456","JOB IS MUST");//defaultvalue  byprogrammer as it is not dr in config file
		System.out.println("qa_pswd456"+qa_pswd_value2);
		*/
		
		//wriritng data to congif.properyies
		properties.setProperty("HI", "hello");
		properties.setProperty("JAVA", "hello");
		properties.setProperty("Selenium", "hello");
		
		
		properties.put("hasttable", "method");
		
		FileOutputStream fop=new FileOutputStream("D:\\Nov830pm\\Framework\\Config.properties");
		properties.store(fop, "file saved");//to store the file
		
		
	}

}
