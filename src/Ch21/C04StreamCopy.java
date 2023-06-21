package Ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class C04StreamCopy {
	
	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("c:\\IOTEST\\늑대1.jpg");
		OutputStream out = new FileOutputStream("c:\\IOTEST\\copywolf.jpg");
		
		byte[] buffer = new byte[4096];
		
		while(true) {
			int cnt = in.read(buffer);
			if(cnt==-1)
				break;
			
			out.write(buffer,0,cnt);
		}
		
		
		
	}
}
