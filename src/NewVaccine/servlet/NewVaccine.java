package NewVaccine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework1.model.ListVaccinesEntry;

/**
 * Servlet implementation class NewVaccine
 */
@WebServlet("/NewVaccine")
public class NewVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NewVaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		request.getRequestDispatcher("/WEB-INF/NewVaccine.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String NAMEmessage = request.getParameter("name");
		int DREQmessage = Integer.parseInt(request.getParameter("DosesRequired"));
		int BETDOSESmessage = Integer.parseInt(request.getParameter("betDoses"));
		ListVaccinesEntry entry = new ListVaccinesEntry(NAMEmessage,DREQmessage,BETDOSESmessage, 0, 0);
		
		List<ListVaccinesEntry> entries = (List<ListVaccinesEntry>) getServletContext().getAttribute("entry");
		entries.add(entry);

		//returning a view - redirect is considered a special view
		response.sendRedirect("ListVaccines");

	}

}
