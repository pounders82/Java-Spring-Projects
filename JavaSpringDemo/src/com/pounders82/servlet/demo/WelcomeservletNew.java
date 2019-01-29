package com.pounders82.servlet.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pounders82.service.demo.WelcomeService;

/**
 * Servlet implementation class Welcomeservlet
 */
@WebServlet("/WelcomeservletNew")
public class WelcomeservletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeservletNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Create the Data (model) and add the request data		
		//Invoking the business layer
		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Nick Pounders");
		request.setAttribute("myWelcomeMessage", welcomeMessage);
		
		//2. Retrieve the request dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WelcomeNew.jsp");
		
		//3.Forward request to dispatcher
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
