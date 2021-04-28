import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ty.assignemnt.apr26.JdbcClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class JunitInterfacetest {

	@Test
	void test() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root");
			JdbcClass jc = new JdbcClass();
			jc.insert(1, "rahul");
//     assertEquals(1, i);
			String query = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			assertEquals(1, rs.getInt(1));
			assertEquals("rahul", rs.getString(2));
			con.close();

		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Test
	void testUpdate() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root");
			JdbcClass jc = new JdbcClass();
			jc.update(1, "Harshi");
//    assertEquals(1, i);
			String query = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			assertEquals("Harshi", rs.getString(2));
			con.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}

	@Test
	void testSelect() {
		JdbcClass jc = new JdbcClass();
		ArrayList<Object> obj = jc.select();
		assertEquals(obj != null, true);
	}

	@Test
	void testDelete() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/studentdb?user=root&password=root");
			JdbcClass jc = new JdbcClass();
			jc.delete(1);
//     assertEquals(1, i);
			String query = "select * from student";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			assertEquals(rs.next(), false);
			con.close();
		} catch (Exception e) {
			e.getMessage();
		}

	}
}