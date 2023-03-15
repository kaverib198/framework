package com.kavya.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kavya.base.BaseTest;
import com.kavya.utilities.PojoReader;

public class FpTest extends BaseTest {
	@Test
	public void fpTest() throws IOException {
		//getdriver().get("https://www.flipkart.com");
		
		
		String url=PojoReader.getconfProbj().getValue("Fp_url");
		getdriver().get(url);
	}

}
