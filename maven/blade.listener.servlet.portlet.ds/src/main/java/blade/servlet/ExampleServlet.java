package blade.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class ExampleServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		super.init();
		
		ServletContext servletContext = getServletContext();
		
		String contextAttributeValue = (String) servletContext.getAttribute("contextAttribute");
		
		System.err.println("Context attribute value: " + contextAttributeValue);
	}

}
