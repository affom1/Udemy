package ais.helloworldservlet.servlets;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldButWithTime
 */
@WebServlet("/HelloWorldButWithTime")
public class HelloWorldButWithTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldButWithTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		double sqrtvalue = Math.sqrt(1352.0);

		Date now = new Date();
		String currentTime = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now);


		
		out.println("<html><body><h1 align='center'>Hello World Servlet</h1>"
				+ "<br>The square root of 1352 is: " + sqrtvalue + "<br>" 
				+ "<br>Do you know what time it is? it is: " + currentTime + "<br>" 
				 +  "</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
