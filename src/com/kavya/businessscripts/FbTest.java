package com.kavya.businessscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.kavya.base.BaseTest;
import com.kavya.utilities.PojoReader;

public class FbTest extends BaseTest {
	@Test
	public void fbTest() throws IOException {
		//getdriver().get("https://www.facebook.com");
		String url=PojoReader.getconfProbj().getValue("Fb_url");
		getdriver().get(url);
	}

}
