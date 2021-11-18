package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Eleve;

/**
 * Servlet Filter implementation class authFilters
 */
@WebFilter("/actor")
public class authFilter implements Filter {

    /**
     * Default constructor. 
     */
    public authFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
			
		    	HttpServletRequest req = (HttpServletRequest) request;
				HttpSession session = req.getSession();
				Eleve user=(Eleve) session.getAttribute("USER");
				
				
				HttpServletResponse res = (HttpServletResponse) response;
				if (user != null) {
					res.sendRedirect("/accueil");
								
					return;
				}
				// passe la requete au filter.
				chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
