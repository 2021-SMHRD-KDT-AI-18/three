import java.sql.DriverManager;
import java.sql.Connection;

public class DB연결 {

	private void connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.Connection 연결
			// -연결하기위해서는 3개의 정보 필요 (주소,계정,비밀번호)
			String db_ur1 = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			String db_id = "campus_23K_AI18_p1_3 ";
			String db_pw = "smhrd3";
		
		} catch (Exception e) {
			
		}

		/*if (conn != null) {
			System.out.println("Connection 연결 성공");
		} else {
			System.out.println("연결 실패");
		}*/
	}
	

}
