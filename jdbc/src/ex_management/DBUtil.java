package ex_management;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void close(ResultSet rs, Statement stmt) {
        close(rs, stmt, null);
    }
    
    public static void close(Statement stmt, Connection conn) {
        close(null, stmt, conn);
    }
}

/*

// 사용 예시
public Salerymen selectOne(int inputCode) {
    // ...코드 생략...
    } finally {
        DBUtil.close(rs, pstmt);
    }
}

*/