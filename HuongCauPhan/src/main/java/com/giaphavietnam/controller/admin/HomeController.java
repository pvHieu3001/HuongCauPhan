package com.giaphavietnam.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/quan-tri"})
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
    
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException {
		RequestDispatcher rd = req.getRequestDispatcher("/view/admin/edittree.jsp");
		rd.forward(req, res);
	}
}
