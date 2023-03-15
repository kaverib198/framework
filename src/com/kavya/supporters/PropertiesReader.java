package com.kavya.supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {
	private String filepath;
	private FileInputStream fip;
	private Properties properties;
	private String value;
	
	public PropertiesReader (String filepath) throws IOException {
		this.filepath=filepath;
		 fip=new FileInputStream(filepath);
		 properties=new Properties();
		properties.load(fip);	
	}
	
	
	public String getValue(String key) {
		if(properties!=null) {
			 value=properties.getProperty(key);
		}else {
			//throw exception
			System.out.println("properties is pointing to null");
		}
		return value;

	}
	
	public String getValue(String key,String defaultvalue) {
		if(properties!=null) {
			 value=properties.getProperty(key);
			if(value==null) {
				value=defaultvalue;
			}
		}else {
			//throw exception
			System.out.println("properties is pointing to null");
		}
		return value;

	}
	
	public String getValue(Object key) {
		if(properties!=null) {
			 value=(String) properties.get(key);
		}else {
			//throw exception
			System.out.println("properties is pointing to null");
		}
		return value;
	

}
	
	public String getValue(Object key,Object defaultvalue) {
		if(properties!=null) {
			String value=(String) properties.get(key);
			if(value==null) {
				value=(String) defaultvalue;
			}
		}else {
			//throw exception
			System.out.println("properties is pointing to null");
		}
		return value;
		
}
	
public String writeData(String key,String value) throws IOException {
	if(properties!=null) {
		properties.setProperty(key, value);
		FileOutputStream fileoutputstrem = new FileOutputStream(filepath);
		properties.store(fileoutputstrem, "file is saved");
		
		
	}else {
		//throw exception
		System.out.println("properties is pointing to null");
	}
	return value;
}

public void writeData(Object key,Object value) throws IOException {
	if(properties!=null) {
		properties.put(key, value);
		FileOutputStream fileoutputstrem = new FileOutputStream(filepath);
		properties.store(fileoutputstrem, "file is saved");
		
		
	}else {
		//throw exception
		System.out.println("properties is pointing to null");
	}

}

public void remove(String key,String value) throws IOException {
	if(properties!=null) {
		properties.remove(key,value);
		FileOutputStream fileoutputstrem = new FileOutputStream(filepath);
		properties.store(fileoutputstrem, "file is saved");
		
		
	}else {
		//throw exception
		System.out.println("properties is pointing to null");
	}

}


public void replace(String key,String value) throws IOException {
	if(properties!=null) {
		properties.replace(key,value);
		FileOutputStream fileoutputstrem = new FileOutputStream(filepath);
		properties.store(fileoutputstrem, "file is saved");
		
		
	}else {
		//throw exception
		System.out.println("properties is pointing to null");
	}

}

public Set getAllkeys() {
	Set setkeys=null;
	if(properties!=null) {
		setkeys =properties.keySet();
	}
	return setkeys;
}

public List getAllvalues() {
	List listvalues=new ArrayList<>();
	Set setkeys=null;
	if(properties!=null) {
		setkeys =properties.keySet();
		for(Object object:setkeys) {
			String key=(String) object;
			value=properties.getProperty(key);
			listvalues.add(key);
		}
	}
	return listvalues;
}

public Map getKeysValues() {
	if(properties!=null) {
		Map mapkeyvalues=new HashMap<>();
		Set setkeys=null;
		if(properties!=null) {
			setkeys =properties.keySet();
			for(Object object:setkeys) {
				String key=(String) object;
				value=properties.getProperty(key);
mapkeyvalues.put(key,value);
			}
		}
		return mapkeyvalues;
	}
	return properties;}}
	
	






