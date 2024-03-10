package p4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BoardDAO {

	public List<BoardDTO> selectList() throws Exception {
		ArrayList<BoardDTO> list = new ArrayList<>();
		String sql = "select * from board2 order by idx desc fetch next 10 rows only";
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "c##itbank";
		String password = "it";
		Connection conn = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			BoardDTO dto = new BoardDTO();
			dto.setIdx(rs.getInt("idx"));
			dto.setTitle(rs.getString("title"));
			dto.setWriter(rs.getString("writer"));
			list.add(dto);
		}
		if(rs != null) 		rs.close();
		if(pstmt != null) 	pstmt.close();
		if(conn != null) 	conn.close();
		return list;
	}

}
