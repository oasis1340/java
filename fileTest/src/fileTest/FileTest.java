package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	
//	throws는 해당 메서드를 사용한 쪽으로 예외를 발생시킨다.
//	따라서 메서드 내에서는 throws에 작성한 예외가 발생하지 않는다.
	
	public static void main(String[] args) throws IOException{
//		new FileWriter(경로, 이어쓰기 여부);
//		try {
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//			bufferedWriter.write("장재영 !!");
//			bufferedWriter.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			String line = null;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);				
			}
			
		} catch (IOException e) {
			System.out.println("없는 경로입니다.");
			e.printStackTrace();
			
		} finally {
				bufferedReader.close();
		}	
		
		
		
		
		
		
		
	}
}
