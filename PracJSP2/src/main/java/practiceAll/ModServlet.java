package practiceAll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/mod")
public class ModServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String no = request.getParameter("no");
		int intNo = Integer.parseInt(no);
		List<Go> list = GoNew.list;
		Go go = list.get(intNo);
		request.setAttribute("go", go);
		
		String jsp = "/WEB-INF/jsp/mod.jsp";
		request.getRequestDispatcher(jsp).forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String no = request.getParameter("no");
//		int intNo = Integer.parseInt(no);
//		List<Go> list = GoNew.list;
//		Go go = list.get(intNo);
//		GoNew.list.set(go);
		String a = request.getParameter("title");
		String b =request.getParameter("ctnt");
		
		
		String no = request.getParameter("no");
		int intNo = Integer.parseInt(no);
		
		GoNew.list.get(intNo).setCtnt(b);
		GoNew.list.get(intNo).setTitle(a);
		
		
		response.sendRedirect("/detail?no=" + intNo);
		
	}

}
