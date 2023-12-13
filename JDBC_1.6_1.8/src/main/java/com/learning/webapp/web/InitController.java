package com.learning.webapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learning.webapp.db.DataBaseConnection;

@WebServlet("/init-connection")
public class InitController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		
		// setting content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DataBaseConnection connection = new DataBaseConnection();
		
		connection.initConnection();
		
		out.print("<h3>Connection Estanlised.</h3>");
	}

}