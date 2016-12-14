package com.aptech.simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signout = request.getParameter("signout");
		System.out.println("====signout====signout: "+ signout);
		if(signout != null && "true".equals(signout.trim())){
			HttpSession session = request.getSession(false);
			if(session != null){
				session.invalidate();
				request.getRequestDispatcher("login.jsp").include(request, response);
			}
		}else{
			HttpSession session = request.getSession();
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession(false);
		if(user != null && "admin".equals(user.trim()) && pass != null && "admin".equals(pass.trim())){
			session.setAttribute("user", user);
			session.setAttribute("name", "Johnson");
			session.setMaxInactiveInterval(3000);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}else{
			session.setAttribute("msg", "Login again");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		
	}

}
