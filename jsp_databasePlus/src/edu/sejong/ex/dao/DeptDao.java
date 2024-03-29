package edu.sejong.ex.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import edu.sejong.ex.vo.DeptVO;

/*Data Access Objcet*/

public class DeptDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String id = "scott";
	private String pw = "tiger";

	public DeptDao() {
		try {
			// oracle.jdbc.driver.OracleDriver oracleDriver
			// = new oracle.jdbc.driver.OracleDriver()
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<DeptVO> deptList() {
		List<DeptVO> depts = new ArrayList<>();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String sql = "select * from dept01";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				DeptVO vo = new DeptVO(deptno, dname, loc);

				depts.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (rs != null)
					rs.close();

				if (stmt != null)
					rs.close();

				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}

		return depts;
	}

	public int insert(DeptVO dept) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "insert into dept01 (deptno, dname, loc) values(?,?,?)";

		System.out.println("sql 확인:" + sql);
		int result = -1;
		try {

			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	public int delete(DeptVO dept) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "delete from dept01 where deptno = ?";

		System.out.println("sql 확인:" + sql);
		int result = -1;
		try {

			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, dept.getDeptno());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	public int update(DeptVO dept) {

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql = "update dept01 set dname =? , loc =? where deptno = ?";

		System.out.println("sql 확인: update dept01 set dname = " + dept.getDname() +
				" , loc = " + dept.getLoc() + 
				" where deptno = " + dept.getDeptno());
		int result = -1;
		try {

			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstmt != null)
					pstmt.close();

				if (con != null)
					con.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

}
