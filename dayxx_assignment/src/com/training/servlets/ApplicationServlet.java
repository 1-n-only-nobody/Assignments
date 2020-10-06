package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Member;
import com.training.services.MemberDAOImplementation;
import com.training.utils.MyGsonParser;

/**
 * Servlet implementation class ApplicationServlet
 */
@WebServlet({ "/ApplicationServlet", "/applicationServlet" })
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	MemberDAOImplementation memberDAOImplementation = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
        super();
        this.memberDAOImplementation = new MemberDAOImplementation();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		List<Member> memberList = (List<Member>) memberDAOImplementation.findAll();
		
		response.setContentType("application/json");
		
		MyGsonParser parser = new MyGsonParser();
		
		String jsonResponse = parser.transformToGsonArray(memberList);
		out.println(jsonResponse);
		System.out.println(jsonResponse);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Member member = new Member();
		member.setMemberId(Integer.parseInt(request.getParameter("memberId")));
		member.setMemberName(request.getParameter("memberName"));
		member.setAccountOpeningDate(LocalDate.parse(request.getParameter("accountOpeningDate")));
		member.setMembershipType(request.getParameter("membershipType"));
		member.setFeesPaid(Double.parseDouble(request.getParameter("feesPaid")));
		member.setMaxBookAllowed(Integer.parseInt(request.getParameter("maxBookAllowed")));
		member.setPenaltyAmount(Double.parseDouble(request.getParameter("penaltyAmount")));
		
		boolean result = memberDAOImplementation.add(member);
		
		if (result) {
			System.out.println("ADDED");
		} else {
			System.out.println("NOT ADDED");
		}
		
		System.out.println(member);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/addMember.html");
		dispatcher.forward(request, response);
	}

}
