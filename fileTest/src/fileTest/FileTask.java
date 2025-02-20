package fileTest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Stream;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		음식을 4개 출력
//		try {
//			String[] foods = {"햄버거", "떡볶이", "김밥", "라면"};
//			
//			BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", true));
//			for (int i = 0; i < foods.length; i++) {
//				bw.write(foods[i] + " ");
//			}
//			bw.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		음식을 모두 가져와서 콘솔에 출력
		BufferedReader br = new BufferedReader(new FileReader("foods.txt"));
		String line = null, temp = "";
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
//		br.close();
//		BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", true));
//		br.readLine().replace(br.readLine().contains("햄버거"), "");
//		값을 수정하기
		while((line = br.readLine()) != null) {
			if(line.equals("김밥")) {
				temp += "부대찌개\n";
				continue;
			}
			temp += line + "\n";
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter("foods.txt", true));
		bw.write(temp);
		bw.close();
//		햄버거 삭제
		while((line = br.readLine()) != null) {
			if(line.equals("햄버거")) {
				continue;
			}
			temp += line + "\n";
		}
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("foods.txt", true));
		bw1.write(temp);
		bw1.close();
		
	}
}
