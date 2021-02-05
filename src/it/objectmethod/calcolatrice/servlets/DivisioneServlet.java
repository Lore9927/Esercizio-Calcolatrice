package it.objectmethod.calcolatrice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DivisioneServlet extends HttpServlet{

	private static final long serialVersionUID = 4831705103293385042L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double numero1 = Double.parseDouble(req.getParameter("primoNumero"));
		double numero2 = Double.parseDouble(req.getParameter("secondoNumero"));
		double divisione = numero1 / numero2;
		
		req.setAttribute("risultato", divisione);
		req.getRequestDispatcher("pages/calcolatrice.jsp").forward(req, resp);
	}

}
