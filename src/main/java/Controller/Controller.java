package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Controller extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uri=request.getRequestURI();
		
		String[] uris=uri.split("/");
		
		String page="";
		
		if(uris[1].equals("index")) {
			page="index.jsp";
		}
		
		request.getRequestDispatcher("/WEB-INF/"+page).forward(request, response);
		
		
		
	
	}
	
}
