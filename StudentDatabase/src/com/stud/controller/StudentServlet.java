package com.stud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stud.bean.Student;
import com.stud.dao.StudentDao;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// reading action
		String action = request.getParameter("action");

		try
		{
		switch (action) {
		case "insert":
			try {
				inserStudentMark(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "view":
			try {
				viewStudentMark(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		}
		}catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

	}

	private void viewStudentMark(HttpServletRequest request,

			HttpServletResponse response) throws ServletException, IOException {

		// creating object for StudentDao
		StudentDao studentDao = new StudentDao();
		List<Student> listStudent;
		try {
			listStudent = studentDao.display();
			request.setAttribute("listStudent", listStudent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// setting value into List
		

		request.getRequestDispatcher("/JSP/Student.jsp").forward(request,
				response);
	}

	private void inserStudentMark(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// reading values
		String name = request.getParameter("studentname");
		Integer maths = Integer.parseInt(request.getParameter("maths"));
		Integer malayalam = Integer.parseInt(request.getParameter("malayalam"));
		Integer english = Integer.parseInt(request.getParameter("english"));
		Integer science = Integer.parseInt(request.getParameter("science"));
		Integer social = Integer.parseInt(request.getParameter("social"));

		// calculating total
		Integer total = maths + malayalam + english + science + social;

		// creating object Student
		Student student = new Student(name, english, science, social, maths,
				malayalam, total);
		// creating object for StudentDao
		StudentDao studentDao = new StudentDao();

		// calling insert method
		studentDao.insert(student);

		response.sendRedirect("StudentServlet?action=view");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
