package ais.helloworldservlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartServlet2
 */
@WebServlet("/StartServlet2")
public class StartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Leitet ebenfalls weiter, jedoch ohne, dass die URL angezeigt wird. Somit immer noch URL von StartServlet angezeigt
		// Hat tieferes Understanding vom Projekt  - somit nur Mapping String n�tig (/hiddenservlet/ResultsServlet) ohne den Projektnamen
		RequestDispatcher dispatcher = request.getRequestDispatcher("/hiddenservlets/ResultsServlet.do");
		dispatcher.forward(request, response); // effektives weiterleiten
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
