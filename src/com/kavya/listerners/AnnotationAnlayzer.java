package com.kavya.listerners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationAnlayzer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer analyser=annotation.getRetryAnalyzerClass();
		if(analyser==null) {
			annotation.setRetryAnalyzer(CustomRetry.class);
		}
		
	}

}
