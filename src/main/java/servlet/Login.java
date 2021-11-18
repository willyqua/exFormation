package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	
	
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
	/*	User userConnected = new User("case","wil", 28 , 15 ,"Formation JAVA", 12345);
		User user = (User) session.getAttribute("USER");
		//set user dans session
		
         
        RequestDispatcher dispatcher = null;
		
		if(user.getNom().equals("case") && user.getMotDp() == (12345)){
	            dispatcher = request.getRequestDispatcher("/WEB-INF/accueil.jsp");
	        }else{
	            dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
	        }
	        dispatcher.forward(request, response);
	        }*/
		
	}
			
			//session.setAttribute("USER",userConnected );
		//response.sendRedirect("/accueil");
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

	}
