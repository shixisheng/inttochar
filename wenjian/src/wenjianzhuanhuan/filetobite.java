package wenjianzhuanhuan;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class filetobite {
	public static void main(String args[]){
		File f=new File("d:\\test.txt");
		try{f.createNewFile();}catch(IOException e){e.printStackTrace();}
		InputStream input=null;
		try{input=new FileInputStream(f);}catch(IOException e){e.printStackTrace();}
		byte b[]=new byte[1024];
		try{input.read(b);}catch(IOException e){e.printStackTrace();}
		try{input.close();}catch(IOException e){e.printStackTrace();}
		System.out.println("内容为："+new String(b));
	}
      
}
