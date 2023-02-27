import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File obj = new File("Test.txt");	//creates and delete file
		FileOutputStream fileOutputStream = null;	//writes data into a file
		FileInputStream fileInputStream = null;	//reads data from the file
		
		int ch;
		byte cities[] = {'a', 'h', 'd', 'm', 'g', 'm'};
		
		try {
			fileOutputStream = new FileOutputStream(obj);
			fileOutputStream.write(cities);
			fileOutputStream.close();
			
			fileInputStream = new FileInputStream(obj);
			while((ch = fileInputStream.read())!=-1) {
				System.out.print((char)ch + ", ");
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
