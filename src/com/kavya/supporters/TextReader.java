package com.kavya.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.kavya.customizedexception.FrameworkException;

public class TextReader {
	
	private String filepath;
	private File file;
	private FileWriter filewriter;
	private BufferedWriter bufferedwriter;
	private FileReader filereader;
	private BufferedReader bufferedreader;
	
	
	public TextReader(String filepath) throws IOException {
		this.filepath=filepath;
	    file=new File(filepath);
		 filewriter = new FileWriter(file);
		 bufferedwriter= new BufferedWriter(filewriter);
		 filereader = new FileReader(file);
		 bufferedreader= new BufferedReader(filereader);
	}

	
	
	
	public void writeData(String data) throws IOException, FrameworkException {
		
		if(bufferedwriter!=null) {
			bufferedwriter.write(data);
			bufferedwriter.flush();
		}else {
			FrameworkException exception = new FrameworkException("Bufferedwriter is pointing to null");
			throw exception;
		}
		
	}
	
	
	
	
	public String getData() throws IOException, FrameworkException {
		String data="";
		if(bufferedreader!=null) {
			 data=bufferedreader.readLine();
			
		}
		else {
			FrameworkException exception = new FrameworkException("Bufferedreader is pointing to null");
			throw exception;
			
		}
		return data;
		}
	
	
	
	
	public List<String> totalData() throws IOException, FrameworkException {
		List<String> fileData=new ArrayList<String>();
		if(bufferedreader!=null) {
			while(bufferedreader.ready()) {
			 String data  =bufferedreader.readLine();
			 fileData.add(data);
			 }
			
		}
		else {
			FrameworkException exception = new FrameworkException("Bufferedreader is pointing to null");
			throw exception;
			
		}
		return fileData;
		

	}
	
	
	
}
