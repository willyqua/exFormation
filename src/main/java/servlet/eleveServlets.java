package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Eleve;
import model.Formation;



/**
 * Servlet implementation class eleveServlets
 */
@WebServlet("/eleve")
public class eleveServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public eleveServlets() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		List<Eleve> eleves = new ArrayList<Eleve>();
		
		List<Formation> programme = new ArrayList<Formation>();
		
		
		 Eleve jhon =new Eleve("jhon","kio",40, 10, programme);
	     Eleve jil =new Eleve("jil","az",44,12,programme);
	     Eleve eric =new Eleve(" eric","gito",45,12,programme);
	     Eleve greg =new Eleve("greg","ego",25,16,programme);
	   
	     eleves.add(jhon);
	     eleves.add(jil);
	     eleves.add(eric);
	     eleves.add(greg);
	    
	     
		
	     String value = null;
	     int listEleve= 0;
	        for (int i = 0; i < eleves.size(); i++) {
	        value = eleves.get(i).getNom().toString();
	        listEleve =  eleves.size();
	       
	        ServletOutputStream out = response.getOutputStream();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<p> nom :" + value + "</p>");
	        out.println("<p> eleve :" + listEleve + "</p>");
	        //out.println("<a href= 'detail'>detail</a>");
	        out.println("</body>");
	        out.println("</html>");
	        
		
	
	        }
		
		request.getRequestDispatcher("/WEB-INF/eleve.jsp").forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
