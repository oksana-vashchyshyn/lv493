package softserve.edu.com.taqc493;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class REad {

	
		public static void main(String[] args) throws IOException
		{
		 InputStream inStream = new FileInputStream("D:\\122.txt");
		 OutputStream outStream = new FileOutputStream("D:\\111.txt");

		 while (inStream.available() > 0)
		 {
		  int data = inStream.read(); //������ ���� ���� �� ������ ��� ������
		  outStream.write(data); //���������� ����������� ���� � ������ �����.
		 }

		 inStream.close(); //��������� ������
		 outStream.close();
		}

	}


