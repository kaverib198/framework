package com.kavya.utilities;

public interface Driverpaths {
	
	String Chromekey="webdriver.chrome.driver";
	String ChromeVlaue=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	
	String edgekey="webdriver.edge.driver";
	String edgeVlaue=System.getProperty("user.dir")+"\\Drivers\\edgedriver.exe";
	
	String firefoxkey="webdriver.gecko.driver";
	String firefoxVlaue=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
	
	String safarifoxkey="webdriver.safari.driver";
	String safariVlaue=System.getProperty("user.dir")+"\\Drivers\\safaridriver.exe";

}
