package data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReminderDAO {

	DatabaseManager _databaseManager;

	public ReminderDAO() {
		_databaseManager = new DatabaseManager();
	}

	public void insert(ReminderEntity entity) {
		String query = "INSERT INTO `reminder` (`Date`,`Month`,`Year`,`Occation`) VALUES("
				+ "'"
				+ entity.getDate()
				+ "',"
				+ "'"
				+ entity.getMonth()
				+ "',"
				+ "'"
				+ entity.getYear()
				+ "',"
				+ "'"
				+ entity.getOccation() + "')";

		_databaseManager.executeUpdate(query);
	}

	public void delete(ReminderEntity entity) {
		String query = "DELETE FROM `reminder` WHERE Occation=" + "'"
				+ entity.getOccation() + "'";

		_databaseManager.executeUpdate(query);
	}

	public void update(ReminderEntity entity) {
		String query = "UPDATE `reminder` SET `Occation`=" + "'"
				+ entity.getOccation() + "'" + "WHERE Date='"
				+ entity.getDate() + "' AND Month='" + entity.getMonth()
				+ "' AND Year='" + entity.getYear() + "'";

		_databaseManager.executeUpdate(query);
	}

	public ArrayList<ReminderEntity> get() {
		ArrayList<ReminderEntity> list = new ArrayList<ReminderEntity>();
		String query = "SELECT Date, Month, Year , Occation FROM `reminder`";

		ResultSet resultSet = _databaseManager.executeQuery(query);

		try {
			while (resultSet.next()) {
				ReminderEntity entity = new ReminderEntity();
				entity.setDate(resultSet.getInt("Date"));
				entity.setMonth(resultSet.getString("Month"));
				entity.setYear(resultSet.getInt("Year"));
				entity.setOccation(resultSet.getString("Occation"));
				list.add(entity);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			_databaseManager.closeConnection();
		}
		return (ArrayList<ReminderEntity>) list;
	}
}