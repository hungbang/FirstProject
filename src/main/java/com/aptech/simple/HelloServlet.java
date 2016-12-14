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

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(urlPatterns={"/HelloServlet"}, initParams={
		@WebInitParam(name= "param1", value="12")
})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("====doGet======");
		String param = request.getParameter("param");
		String param1 = "test";
		System.out.println("====value of param======"+ param);
		String initParam = getServletContext().getInitParameter("param1");
		System.out.println("====afasdfasd==="+ initParam);
		List<Product> ps = new ArrayList<Product>();
		for (int i = 0; i < 5; i++) {
			Product p = new Product();
			p.setName("hahaha- " + i);
			p.setAddress("da nang -" + i);
			ps.add(p);
		}
		
		
//		PrintWriter out = response.getWriter();
//		out.append("<div>");
//		out.append("<h1>");
//		out.append("param will be: "+ param);
//		out.append("</h1>");
//		out.append("</div>");
		request.setAttribute("msg", param);
		request.setAttribute("products", ps);
		request.setAttribute("msg1", param1);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
//		response.sendRedirect("welcome.jsp");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("====dopost======");
		String param = request.getParameter("param");
		System.out.println("====value of param======"+ param);
		doGet(request, response);
	}

}
