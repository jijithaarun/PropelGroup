package com.stud.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// reading action
		String action = request.getParameter("action");

		switch (action) {
		case "insert":
			inserStudentMark(request, response);
			break;
		case "view":
			viewStudentMark(request, response);
			break;

		}

	}

	private void viewStudentMark(HttpServletRequest request,
			HttpServletResponse response) {

	}

	private void inserStudentMark(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		// readubg
		String name = request.getParameter("name");
		Integer maths = Integer.parseInt(request.getParameter("maths"));
		Integer malayalam = Integer.parseInt(request.getParameter("malayalam"));
		Integer english = Integer.parseInt(request.getParameter("english"));
		Integer science = Integer.parseInt(request.getParameter("science"));
		Integer social = Integer.parseInt(request.getParameter("social"));
		Integer total = maths + malayalam + english + science + social;

		// creating object Student

		// creating object for StudentDao

		response.sendRedirect("StudentServlet?action=view");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
