package it.objectmethod.calcolatrice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SommaServlet extends HttpServlet {

	private static final long serialVersionUID = -2599788420941166316L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double numero1 = Double.parseDouble(req.getParameter("primoNumero"));
		double numero2 = Double.parseDouble(req.getParameter("secondoNumero"));
		double somma = numero1 + numero2;
		
		req.setAttribute("risultato", somma);
		req.getRequestDispatcher("pages/calcolatrice.jsp").forward(req, resp);
	}
	
}
