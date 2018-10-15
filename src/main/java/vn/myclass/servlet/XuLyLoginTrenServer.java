package vn.myclass.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XuLyLoginTrenServer
 */
public class XuLyLoginTrenServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XuLyLoginTrenServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		boolean loi = false;
		if(email!=null || email.isEmpty()) {
			request.setAttribute("emailError", "email chưa nhập");
			loi=true;
		}
		if(pass ==null || pass.isEmpty()) {
			request.setAttribute("pasError", "chưa nhập password");
			loi =true;
		}
		if(loi) {
			/*RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);*/
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
		if(email.equals("email") && pass.equals("pass")) {
			response.sendRedirect("index.jsp");
		}else {
			
			/*request.setAttribute("loginError", "kiểm tra lại mật khẩu");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);*/
			request.setAttribute("loginError", "kiểm tra lại mật khẩu");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		boolean loi = false;
		if(email!=null || email.isEmpty()) {
			request.setAttribute("emailError", "email chưa nhập");
			loi=true;
		}
		if(pass ==null || pass.isEmpty()) {
			request.setAttribute("pasError", "chưa nhập password");
			loi =true;
		}
		if(loi) {
			/*RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);*/
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		if(email.equals("email") && pass.equals("pass")) {
			response.sendRedirect("index.jsp");
		}else {
			
			/*request.setAttribute("loginError", "kiểm tra lại mật khẩu");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);*/
			request.setAttribute("loginError", "kiểm tra lại mật khẩu");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
