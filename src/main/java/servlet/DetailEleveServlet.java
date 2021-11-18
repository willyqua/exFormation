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




/**
 * Servlet implementation class DetailEleveServlet
 */
@WebServlet("/detaileleve")
public class DetailEleveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DetailEleveServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		 List<Eleve> eleves = (List<Eleve>)session.getAttribute("LISTELEVE");
		 
		 	String prenom;
	        String programme;
	        String nom;
	        int age;
	        int note;
	        for (int i = 0; i < eleves.size(); i++) {
	               nom = eleves.get(i).getNom().toString();
	               prenom = eleves.get(i).getPrenom().toString();
	               //programme = eleves.get(i).getProgramme().toString();
	               age = eleves.get(i).getAge();
	               note= eleves.get(i).getNote();

	        ServletOutputStream out = response.getOutputStream();
	        out.println("<html>");
	        out.println("<body>");
	        
	        out.println("<p> nom :" + nom + "</p>");
	        out.println("<p> prenom :" + prenom + "</p>");
	        out.println("<p> age :" + age + "</p>");
	        //out.println("<p> programme :" + programme + "</p>");
	        out.println("<p> note :" + nom + "</p>");
	        out.println("</body>");
	        out.println("</html>");
		 
		request.getRequestDispatcher("/WEB-INF/detailEleve.jsp").forward(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
