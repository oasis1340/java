package view;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
   public static void main(String[] args) {
      MemberVO memberVO = new MemberVO();
      MemberDAO memberDAO = new MemberDAO();
      
//      기본적으로 false
//      회원가입
//      if( memberDAO.checkId("oasis13401") ) {
//         System.out.println("사용 가능한 아이디");
//         memberVO.setMemberId("oasis13401");
//         memberVO.setMemberPassword("1234");
//         memberVO.setMemberName("장재영");
//         memberVO.setMemberAddress("서울시 송파구");
//         
//         memberDAO.join(memberVO); // 컨트롤러를 통해 화면에서 버튼 눌렀을 떄 실행될 메소드
//      } else {
//         System.out.println("중복된 아이디");
//      }
      
      memberVO.setMemberId("oasis1340");
      memberVO.setMemberPassword("1234");
      
      if (memberDAO.login(memberVO)) {
    	  System.out.println("로그인 성공");
      } else {
    	  System.out.println("로그인 실패");
      }
      
//    정보수정
      MemberVO updatedMember = new MemberVO();
      updatedMember.setMemberId("hgd123");
      updatedMember.setMemberPassword("1234");
      updatedMember.setMemberName("홍길동");
      updatedMember.setMemberAddress("서울시 강남구");
      
      memberDAO.update(updatedMember);
      System.out.println("수정 완료");
      
   }

}