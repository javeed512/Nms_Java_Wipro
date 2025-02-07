package com.wipro.ems.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wipro.ems.pojo.Employee;

public class EmployeeModel { // Repository class

	int count = 0;

	public int addEmp(Employee emp) {

		// jdbc insert emp record

		Connection conn = DBUtil.getDBConnection();

		System.out.println("Data in model " + emp);
		System.out.println(conn);

		String query = "insert into employees values(?,?,?)";

		try {

			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public List<Employee> getAllEmployees() {

		List<Employee> list = new ArrayList<Employee>();

		Connection conn = DBUtil.getDBConnection();

		String query = "select * from Employees";

		try {
			PreparedStatement pstmt = conn.prepareStatement(query);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				// e1

		Employee e = new Employee(rs.getInt("eid"), rs.getString("ename"), rs.getDouble("salary"));

				list.add(e);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
