package com.aptech.simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getSession(false).getAttribute("products") == null){
			List<Product> products = new ArrayList<Product>();
			Product p = new Product();
			p.setName(request.getParameter("name"));
			p.setPrice(request.getParameter("price"));
			products.add(p);
			request.getSession(false).setAttribute("products", products);
		}else{
			addProducts(request, response);
		}
		response.sendRedirect("addnew.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void addProducts(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		List<Product> products = (List<Product>)request.getSession(false).getAttribute("products");
		products.add(p);
	}

}
