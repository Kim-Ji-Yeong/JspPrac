package practiceAll;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/write")
public class ServletWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
		String jsp = "/WEB-INF/jsp/write.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//post는 무조건 인코딩
		request.setCharacterEncoding("UTF-8");
		
		
		
		String title = request.getParameter("title");
		String ctnt = request.getParameter("ctnt");
		
		
		Go go = new Go();
		go.setCtnt(ctnt);
		go.setTitle(title);
		
		GoNew.list.add(go);
		
		response.sendRedirect("/list");
		
	}

}





