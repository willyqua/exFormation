package servlet;

import java.io.IOException;
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
 * Servlet implementation class ListFormationServlet
 */
@WebServlet("/listFormation")
public class ListFormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListFormationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		List<Formation> Nomformations = (List<Formation>)session.getAttribute("LISTFORMATION");
		
		
		String titre;
        String programmation;
        int nbreEleve;
        for (int i = 0; i < Nomformations.size(); i++) {
               titre = Nomformations.get(i).getTitre().toString();
               programmation = Nomformations.get(i).getProgrammation().toString();
               nbreEleve = Nomformations.get(i).getNbreEleves();
              

        ServletOutputStream out = response.getOutputStream();
        out.println("<html>");
        out.println("<body>");
        
        out.println("<p> titre :" + titre + "</p>");
        out.println("<p> programmation :" + programmation + "</p>");
        out.println("<p> note :" + nbreEleve + "</p>");
        out.println("</body>");
        out.println("</html>");
	}
        request.getRequestDispatcher("/WEB-INF/detailFormation.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
