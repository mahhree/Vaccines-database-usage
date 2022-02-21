package ListVaccines.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework1.model.ListVaccinesEntry;

@WebServlet("/ListVaccines")
public class ListVaccines extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListVaccines() {
		super();
	// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

		super.init(config);
		List<ListVaccinesEntry> entry = new ArrayList<ListVaccinesEntry>();
		entry.add(new ListVaccinesEntry("Pfizer/BioNTech", 2, 21,10000,10000));
		entry.add(new ListVaccinesEntry("Johnson & Johnson", 1,0,5000,5000));

		getServletContext().setAttribute("entry", entry);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out = response.getWriter();  
	
	request.getRequestDispatcher("/WEB-INF/ListVaccines.jsp").forward(request, response);
	}
	
	
}
