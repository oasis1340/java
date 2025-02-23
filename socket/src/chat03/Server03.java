package chat03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server03 {
	public static void main(String[] args) throws IOException{
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("연결 대기중...");
			
			socket = serverSocket.accept();
			System.out.println("연결 완료!");
			
			while (true) {
				String inMessage = in.readLine();
				System.out.println("서버 메세지 > " + inMessage);
				
				System.out.println("클라이언트에 보낼 메세지 >> ");
				String outMessage = sc.nextLine();
				out.write(outMessage + "\n");
				out.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
			if (socket != null) {
				socket.close();
			}
			if (serverSocket != null) {
				serverSocket.close();
			}
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
	}
}
