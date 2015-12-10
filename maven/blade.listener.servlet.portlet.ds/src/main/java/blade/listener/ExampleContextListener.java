package blade.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ExampleContextListener implements ServletContextListener,ServletRequestListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.err.println("Context initialized");
		
		ServletContext servletContext = sce.getServletContext();
		
		servletContext.setAttribute("contextAttribute", "Listener passed");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		
	}

}
