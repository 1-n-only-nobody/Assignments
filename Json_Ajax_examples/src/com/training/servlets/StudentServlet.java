package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Student;
import com.training.services.StudentServiceImpl;
import com.training.utils.MyGsonParser;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		
//		String employee = "{"
//				+ " 'id': '101',"
//				+ " 'name': 'ramesh'"
//				+ "}";
		
//		out.println("<h1> Using JSON </h1>");
		
//		out.println(employee);
		
		StudentServiceImpl service = new StudentServiceImpl();
		
		Student student = service.findById(Integer.parseInt(id));
		
//		HashMap<Integer, Student> studentMap = service.findAll();
		
		MyGsonParser parser = new MyGsonParser();
		
		String jsonResponse = parser.transformToGson(student);
		
		out.println(jsonResponse);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		System.out.println(id);
		String name = request.getParameter("name");
		System.out.println(name);
//		int idKey = Integer.parseInt(id.trim());
		
		StudentServiceImpl service = new StudentServiceImpl();
		
		Student student = service.findById(Integer.parseInt(id));
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("application/json");
		
		MyGsonParser parser = new MyGsonParser();
		
		String jsonResponse = parser.transformToGson(student);
		
		out.println(jsonResponse);
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/studentInfo.jsp");
//		dispatcher.forward(request, response);
//		response.sendRedirect("/studentInfo.jsp");
//		doGet(request, response);
	}

}
