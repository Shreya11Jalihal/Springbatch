package main.java.com.example.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper {

	public Person_Details mapRow(ResultSet rs, int Rownum) throws SQLException {
		Person_Details details = new Person_Details();
		details.setFirstName(rs.getString("firstName"));
		details.setLastName(rs.getString("lastName"));
		details.setSchool(rs.getString("school"));
		details.setRollnumber(rs.getInt("rollnumber"));
		return details;

	}

}
