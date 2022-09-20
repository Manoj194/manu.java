package tyss.SDET40_genericFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Query;
import com.mysql.jdbc.Driver;

public class DatabaseUtility {

	Connection connection;

	public List<String> GetDataFromDataBase(String query, String columnName) throws SQLException {
		Statement statement = connection.createStatement();
		String Query = null;
		ResultSet result = statement.executeQuery(query);
		List<String> list = new ArrayList<>();
		while (result.next()) {
			list.add(result.getString(columnName));
		}
		return list;
	}

	public void oopenBbconnection(String dbURL, String dbUsername, String dbPassword) throws SQLException {
		Driver dbdriver = new Driver();
		DriverManager.registerDriver(dbdriver);
		connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
	}

	public void CloseDB() throws SQLException {
		connection.close();
	}
}
