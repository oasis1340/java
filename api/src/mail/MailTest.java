package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

public class MailTest {
	
	public void sendMail(String mail) {
		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "소갈비찜 레시피";
        
        //보낸 이메일 작성
        String fromEmail = "oasis1340@gmail.com";
        String fromUsername = "재영킹";
        
        String toEmail = mail; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "oasis1340@gmail.com";         
        final String password = "yqgh udwy cmfi rgpt";
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
//        sb.append("<marquee>안녕하세요</marquee>\n");
        sb.append("1. 소갈비는 5cm 정도 길이로 토막 내 찬물에 담가 핏물을 빼고 건져 기름기를 떼고 간이 잘 배도록 군데군데 깊숙하게 칼집을 넣어주세요~\r\n"
        		+ "2. 무는 큼직하게 깍둑 썰고 밤은 속껍질을 벗기세요~\r\n"
        		+ "3. 은행은 겉껍질을 벗기고 기름 두른 팬에 볶아 속껍질을 벗겨주세요~\r\n"
        		+ "4. 양념장에 넣을 배 즙은 강판에 갈아 거즈에 걸러 놓으세요~\r\n"
        		+ "5. 핏물 뺀 갈비를 큼직한 냄비에 담고 잠길 정도로 물을 부어 한 번 끓어 오를 때까지 한소끔 삶아 건지세요~\r\n"
        		+ "6. 찜 할 양념장을 만드는데 오래 끓여 국물이 졸아들면 짜지므로 약간 심심하게 만드는 것이 좋아요~\r\n"
        		+ "7. 삶아낸 갈비에 양념장의 2/3만 넣고 육수를 부어 고루 섞이도록 뒤적인 다음 한소끔 끓이고 찜 국물이 끓기 시작하면 무, 밤, 대추, 은행을 한데 담고 남은 양념장을 고루 끼얹어 가면서 버무려 주세요~\r\n"
        		+ "8. 7)을 조리듯 쪄 내는데 맛이 들면 찜기에 담고 지단을 얹어 내면 됩니다~^^");    
  
        html = sb.toString();
        
        // 메일 옵션 설정
        Properties props = new Properties();    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        try {
          // 메일 서버  인증 계정 설정
          Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(username, password);
            }
          };
          
          // 메일 세션 생성
          Session session = Session.getDefaultInstance(props, auth);
          
          // 메일 송/수신 옵션 설정
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(fromEmail, fromUsername));
          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
          message.setSubject(subject);
          message.setSentDate(new Date());
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		
		MailTest sendMail = new MailTest();
		String[] mail = {"bear595@naver.com"};
		
		for (int i = 0; i < 4; i++) {
			sendMail.sendMail(mail[0]);
		}
		
	}
}
