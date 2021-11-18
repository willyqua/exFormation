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
 * Servlet implementation class FormationServlet
 */
@WebServlet("/formation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		request.getRequestDispatcher("/WEB-INF/formation.jsp").forward(request, response);
		
		 List<Formation> Nomformations = new ArrayList();
		
		 Formation Langue = new Formation("japonais","jap",25);
		 Formation programmation = new Formation("JAVA","jav",44);
		 Formation sport = new Formation("Foot","foot",44);
		 Formation litterature = new Formation("litterature","litteraire",25);
	   
		 Nomformations.add(Langue);
		 Nomformations.add(programmation);
		 Nomformations.add(sport);
		 Nomformations.add(litterature);
		 
		 
		 String nomFormation;
	     
	        for (int i = 0; i < Nomformations.size(); i++) {
	        nomFormation = Nomformations.get(i).getTitre().toString();
	        
		 
		 ServletOutputStream out = response.getOutputStream();
	        out.println("<html>");
	        out.println("<body>");
	        out.println("<p> nom des formations :" + nomFormation + "</p>");
	        
	        out.println("</body>");
	        out.println("</html>");
	        } 
	        request.getRequestDispatcher("/WEB-INF/formation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
