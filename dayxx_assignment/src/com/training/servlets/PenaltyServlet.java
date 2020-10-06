package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Member;
import com.training.services.MemberDAOImplementation;
import com.training.utils.MyGsonParser;

/**
 * Servlet implementation class PenaltyServlet
 */
@WebServlet({ "/PenaltyServlet", "/penaltyServlet" })
public class PenaltyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	MemberDAOImplementation memberDAOImplementation = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PenaltyServlet() {
        super();
        this.memberDAOImplementation = new MemberDAOImplementation();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		List<Member> memberList = (List<Member>) memberDAOImplementation.findAll();
		
		List<Member> penaltyMemberList = new ArrayList<Member>();
		
		for (Member tempMember : memberList) {
			if (tempMember.getPenaltyAmount() > 0) {
				penaltyMemberList.add(tempMember);
			}
		}
		penaltyMemberList.sort(null);
		
		response.setContentType("application/json");
		
		MyGsonParser parser = new MyGsonParser();
		
		String jsonResponse = parser.transformToGsonArray(penaltyMemberList);
		out.println(jsonResponse);
		System.out.println(jsonResponse);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
