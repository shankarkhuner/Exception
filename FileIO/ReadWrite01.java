
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


class RaedWrite 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Cyber101");
		FileOutputStream fos = new FileOutputStream("D:\\Success101");
		int info;
		while((info = fis.read()) !=-1)
			{
			System.out.println(" "+(char)info);
				fos.write(info);
			}
			fis.close();
			fos.clase();
	}
}
