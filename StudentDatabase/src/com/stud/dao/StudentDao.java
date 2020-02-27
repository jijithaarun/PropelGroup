package com.stud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.stud.bean.Student;
import com.stud.dbc.ConnectionFactory;

public class StudentDao {

	// query for insert
	private static String INSERT_STUDENT = "insert into student(stud_name,maths,english,malayalam,social,science,total)values(?,?,?,?,?,?,?)";
	// query for display
	private static String FIND_ALL = "select * from student";

	// objects created
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;

	public String insert(Student student) throws Exception {

		int res = -1;
		connection = ConnectionFactory.getconnection();

		statement = connection.prepareStatement(INSERT_STUDENT);

		// set the values

		statement.setString(1, student.getName());
		statement.setInt(2, student.getEnglish());
		// set the values for query

		statement.setString(1, student.getName());
		statement.setInt(2, student.getMaths());
		statement.setInt(3, student.getEnglish());

		statement.setInt(3, student.getMalayalam());
		statement.setInt(4, student.getMaths());
		statement.setInt(5, student.getScience());
		statement.setInt(6, student.getSocial());

		statement.setInt(4, student.getMalayalam());
		statement.setInt(5, student.getSocial());
		statement.setInt(6, student.getScience());

		statement.setInt(7, student.getTotal());

		// check inserted or not
		if (1 == statement.executeUpdate()) {
			res = 1;
			return "Success";

		}
		// close
		statement.close();
		connection.close();
		return "something wrong";

	}

	public List<Student> display() throws Exception {
		// create an array list

		List<Student> listStudent = new ArrayList<>();

		List<Student> studentList = new ArrayList();

		connection = ConnectionFactory.getconnection();
		// call prepare statement
		statement = connection.prepareStatement(FIND_ALL);

		// excecute query
		resultSet = statement.executeQuery();
		// get from resultset
		while (resultSet.next()) {
			// retrieve the details
			Integer regId = resultSet.getInt("stud_id");
			String reName = resultSet.getString("stud_name");
			Integer reMaths = resultSet.getInt("maths");
			Integer reEnglish = resultSet.getInt("english");
			Integer reMalayalam = resultSet.getInt("malayalam");
			Integer reSocial = resultSet.getInt("social");
			Integer reScience = resultSet.getInt("science");
			Integer total = resultSet.getInt("total");

			// getting values to the patient object
			Student student = new Student(regId, reName, reMaths, reEnglish,
					reMalayalam, reSocial, reScience, total);

			listStudent.add(student);

			studentList.add(student);

		}

		return listStudent;

	}

}
