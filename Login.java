import  java.sql.Connection ;
import  java.sql.DriverManager ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.util.Scanner ;

public  class  Login {

	public  static  void  main ( String [] args ) {
		연결 conn =  null ; // DB 연결된 상태 (세션)을 담은 객체
	    PreparedStatement pstm =  null ;  // SQL 문을 객체 객체
	    PreparedStatement spstm = null ;
	    ResultSet rs =  null ;  // 쿼리 문을 날린 것에 대한 반환 값을 담을 객체
	    String sql = " 회원 값에 삽입 (?,?,?) " ;
	    String select = " 회원에서 ID, PW 선택 " ;
		String user =  " sys as sysdba " ;
        String pw =  " Gksmf1238 " ;
        String url =  " jdbc : oracle : thin : @localhost : 1521 : orcl " ;	 
        String did = null ;
        문자열 dpw = null ;
        시도 {
        클래스 . forName ( " oracle.jdbc.driver.OracleDriver " );      
        conn =  DriverManager . getConnection (URL, 사용자, pw);	       
        시스템 . 아웃 . println ( " DB 연결 성공 " );

        문자열 id, pwd, phone;
        스캐너 sc = 새  스캐너 ( 시스템 . in);
        시스템 . 아웃 . println ( " 아이디를 입력 해주세요 " );
        id = sc . nextLine ();
        시스템 . 아웃 . println ( " 비밀번호를 입력 해주세요 " );
        pwd = sc . nextLine ();
    	spstm = conn . prepareStatement (선택);
    	rs = spstm . executeQuery ();
    	while (rs . next ()) {
    		했다 = rs . getString ( " ID " );
    		dpw = rs . getString ( " PW " );
    		if (did . equals (id) && dpw . equals (pwd)) {
    			시스템 . 아웃 . println ( " 로그인에 성공했습니다 " );
    			휴식 ;
    		}
    	}
    	if ( ! did . equals (id) ||! dpw . equals (pwd)) {
			시스템 . 아웃 . println ( " 아이디 나 비밀번호를 잘못 입력하신 경우 " );
		}
         } catch ( SQLException e) {
        	 시스템 . 아웃 . println ( " sql 오류 " );
        	 e . printStackTrace ();
        } catch ( 예외 e) {
        	시스템 . 아웃 . println ( " 오류 " );
        }
        마침내 {
            // DB 연결을 종료한다.
            시도 {
                if (rs ! =  null ) {rs . 닫기();}   
                if (pstm ! =  null ) {pstm . 닫기();}   
                if (conn ! =  null ) {conn . 닫기(); }
            } catch ( 예외 e) {
                 새로운  RuntimeException 던지기 (e . getMessage ());
            }

        }
    }
}
