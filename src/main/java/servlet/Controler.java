package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Controler
 */
 @WebServlet("/controleur")
public class Controler extends HttpServlet {
	 private String paramLogin;
	 private String paramPassword;
	     
	    public Controler(String paramLogin, String paramPassword) {
		super();
		
		this.paramLogin = paramLogin;
		this.paramPassword = paramPassword;
	}

		public void init() throws ServletException {
	        this.paramLogin = "zero";
	        this.paramPassword = "zoro";
	    }
	   	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controler() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		request.getRequestDispatcher("/WEB-INF/login.jsp");
		
		//request.getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
        String pwd = request.getParameter("pwd");
        
        RequestDispatcher dispatcher = null;
		
		if(this.paramLogin.equalsIgnoreCase(login) && this.paramPassword.equalsIgnoreCase(pwd)){
	            dispatcher = request.getRequestDispatcher("/WEB-INF/accueil.jsp");
	        }else{
	            dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
	        }
	        dispatcher.forward(request, response);
	        }
		
 }


