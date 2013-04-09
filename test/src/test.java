import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import org.omg.CORBA.DataOutputStream;


public class test {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
//		System.out.println("Hello my name is \n Daniel \r\n Tovar");
//		
//		File file=new File("./Daniel2.txt");
//		PrintWriter pw = new PrintWriter(file);
//		pw.write("Damiel \r\n is the best");
//		pw.close();
		
		test t=new test();
		try {
			t.Write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Write() throws FileNotFoundException, IOException {
		File file = new File("./Myfile1.dat"); // .txt or .bin
	    FileOutputStream fos = new FileOutputStream(file);
	    String data = "Hello \r\nworld";
	    fos.write(data.getBytes());
	    fos.close();
    }

}
