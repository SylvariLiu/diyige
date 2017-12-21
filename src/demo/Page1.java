package demo;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Page1
 */
@WebServlet("/Page1")
public class Page1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this  page
		//request
		//session
		//application
		System.out.println("恵諒欺page1");
		request.setAttribute("name", "request議方象");
		HttpSession session = request.getSession();
		session.setAttribute("name", "session議方象");
		ServletContext application = request.getServletContext();
		application.setAttribute("name", "application議方象");
		
		
		Object Str1 = request.getAttribute("name");
		System.out.println(Str1);
		Object Str2 = session.getAttribute("name");
		System.out.println(Str2);
		Object Str3 = application.getAttribute("name");
		System.out.println(Str3);
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		request.getRequestDispatcher("Page2").forward(request, response);
//		response.sendRedirect("Page2");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
