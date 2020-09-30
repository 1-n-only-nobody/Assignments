package com.training.servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.entity.MarkList;
import com.training.entity.Student;
import com.training.ifaces.BusinessInterface;
import com.training.services.BusinessService;

/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet({ "/ProcessServlet", "/process" })
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		String studentName = request.getParameter("tempStudent");
		
//		session.setAttribute("sessionStudent", studentName);
		BusinessInterface businessdao = (BusinessService) session.getAttribute("businessdao");
		MarkList markList = null;
		List<Student> studentList = (List<Student>) session.getAttribute("studentList");
		Iterator<Student> studentIterator = studentList.iterator();
//		System.out.println(studentName);
		while (studentIterator.hasNext()) {
			
			Student student = (Student) studentIterator.next();
//			System.out.println(student.getStudentName());
			if (student.getStudentName().equals(studentName)) {
//				System.out.println(student);
				markList = businessdao.getMarks(student);
			}
		}
		
		session.setAttribute("studentMarks", markList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/showStudents.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
