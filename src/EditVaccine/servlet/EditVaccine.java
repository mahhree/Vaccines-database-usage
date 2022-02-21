package EditVaccine.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework1.model.ListVaccinesEntry;

/**
 * Servlet implementation class EditVaccine
 */
@WebServlet("/EditVaccine")
public class EditVaccine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditVaccine() {
        super();
        // TODO Auto-generated constructor stub
    }

    @SuppressWarnings("unchecked")
    private ListVaccinesEntry getEntry( int id )
    {
        List<ListVaccinesEntry> entries = (List<ListVaccinesEntry>) getServletContext()
            .getAttribute( "entry" );
        for( ListVaccinesEntry entry : entries )
            if( entry.getId() == id ) return entry;
        return null;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		ListVaccinesEntry entry = getEntry(Integer.parseInt(id));
		request.setAttribute("entry",entry);
		
		request.getRequestDispatcher("/WEB-INF/EditVaccine.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
	

		ListVaccinesEntry entry = getEntry(Integer.parseInt(request.getParameter("id")));
		entry.setVaccine(request.getParameter("name"));
		entry.setDosesRequired(Integer.parseInt(request.getParameter("DosesRequired")));
		entry.setBetDoses(Integer.parseInt(request.getParameter("betDoses")));

		//returning a view - redirect is considered a special view
		response.sendRedirect("ListVaccines");
	}
}
