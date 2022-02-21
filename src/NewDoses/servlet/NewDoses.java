package NewDoses.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework1.model.ListVaccinesEntry;


@WebServlet("/NewDoses")
public class NewDoses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewDoses() {
        super();
        
    }
    
    private ListVaccinesEntry getVaccine(String name) {
    	@SuppressWarnings("unchecked")
		List<ListVaccinesEntry> entry = (List<ListVaccinesEntry>) getServletContext().getAttribute("entry");
    	System.out.println(name);
		for(ListVaccinesEntry vaccine : entry) 
			if(vaccine.getVaccine().equals(name)) return vaccine;
		return null;
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.getRequestDispatcher("/WEB-INF/NewDoses.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int doses = Integer.parseInt(request.getParameter("newDoses"));
		ListVaccinesEntry vaccine = getVaccine(name);
		int temp = vaccine.getDosesRec();
		
		vaccine.setDosesRec(temp+doses);
		vaccine.setDosesLeft(temp+doses);  
		
		response.sendRedirect("ListVaccines");
	}

}

