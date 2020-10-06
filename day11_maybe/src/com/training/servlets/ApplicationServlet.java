package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
 * Servlet implementation class ApplicationServlet
 */
@WebServlet({ "/ApplicationServlet", "/mainServlet" })
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Student student1 = null;
	Student student2 = null;
	Student student3 = null;
	MarkList markList1 = null;
	MarkList markList2 = null;
	MarkList markList3 = null;
	BusinessInterface businessdao = null; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
        super();
        student1 = new Student("Manan", 100, "BCE");
        student2 = new Student("Parth", 115, "BCE");
        student3 = new Student("Parimal", 118, "BCE");
        markList1 = new MarkList(99, 98, 99, 89, student1);
        markList2 = new MarkList(97, 95, 89, 45, student2);
        markList3 = new MarkList(92, 78, 84, 99, student3);
        businessdao = new BusinessService();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		businessdao.addStudent(student1);
		businessdao.addStudent(student2);
		businessdao.addStudent(student3);
		businessdao.addMarks(markList1);
		businessdao.addMarks(markList2);
		businessdao.addMarks(markList3);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		session.setAttribute("businessdao", businessdao);
		session.setAttribute("studentList", businessdao.getStudents());
		
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
