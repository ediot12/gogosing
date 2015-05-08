package exam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import exam.dto.Member;

public class MemberDAO {
	
	
	//생성자
	public MemberDAO(){
		System.out.println("생성자");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		//
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jspuserc","jsp1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertMember(Member member){
		System.out.println("회원가입");
		String sql = "insert into member values(?,?,?,?,?,?,default)";
	}
	
	public void deleteMember(Member member){
		System.out.println("회원삭제");
	}

}
