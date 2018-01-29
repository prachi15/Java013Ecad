package com.ict.gnu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.gnu.dao.DBMan;

public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String roll,stuname,cat,branch,message;
		roll=request.getParameter("roll");
		stuname=request.getParameter("stuname");
		cat=request.getParameter("cat");
		branch=request.getParameter("branch");
		message=request.getParameter("message");
		int i=DBMan.InsertRecord(roll, stuname, branch, cat, message);
		String page="index.jsp?msg=";
		if(i==1)
		{
			page+="insert successful";
		}
		else
		{
			page+="insert failed";
		}
		getServletContext().getRequestDispatcher(page).forward(request, response);
		
	}

}
