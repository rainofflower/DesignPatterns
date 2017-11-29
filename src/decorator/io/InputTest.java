package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try{
			InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream("E:/2000/Test8_1.txt")));
			
			while((c=in.read())>=0){
				System.out.print((char)c);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
