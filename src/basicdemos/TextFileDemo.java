package basicdemos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Nov830pm\\Framework\\src\\basicdemos\\text.txt");//physical location of the file
	
		boolean status =file.createNewFile();//it wil create a file in the location if it is not dr
	if(status) {
		System.out.println("File is created");
	}else {
		System.out.println("File already exists");
	}
	
	
	FileReader fr = new FileReader(file);
	BufferedReader br= new BufferedReader(fr);
	
	while(br.ready()){
		String data=br.readLine();
		System.out.println(data);
		}
	br.close();
	}
	

	
	
	/*//wrirting data to file
	//FileWriter fw=new FileWriter(file); if we run same sattement any numb of tyms it gives only single output
	FileWriter fw= new FileWriter(file,true);//if we write true statemwnt then in output we wil get how much tyms we run d code that many tyms we can see d same output in single txtfile
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("HELO");
	bw.newLine();
	bw.write("HI");
	bw.newLine();
	bw.write("JAVA");
	bw.newLine();
	
	bw.flush();//to move the dat frm buffer to the file we use flush
	bw.close();
		
	}*/

}
