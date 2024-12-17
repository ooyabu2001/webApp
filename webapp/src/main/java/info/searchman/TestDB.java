package info.searchman;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
	
		
        try {
			insertShain();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("登録処理が失敗しました");
		}
		 
	}

	//社員を登録
	public static void insertShain() throws SQLException {

	//社員を登録するSQL
	String sql = "insert into shain(id, name, sei, nen, address) values(?,?,?,?,?);";
	try (Connection con = ConnectionBase.getConnection();
	PreparedStatement pstmt = con.prepareStatement(sql);) {
	//パラメータをSQLにセット
	pstmt.setInt(1, 300);
	pstmt.setString(2, "長野太郎");
	pstmt.setString(3, "男");
	pstmt.setInt(4, 2010);
	pstmt.setString(5, "長野県長野市");
	//SQL文を表示
	System.out.println(pstmt.toString());
	//SQL実行
	pstmt.executeUpdate();
	}
	}
	
	
}
