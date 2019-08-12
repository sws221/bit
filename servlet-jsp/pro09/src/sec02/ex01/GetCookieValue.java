package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieValue
 */
@WebServlet("/getcookie")
public class GetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		Cookie[] allValues = request.getCookies(); //request�� getCookies() �޼��带 ȣ���� ���������� ��Ű ������ ��û�� �� ��Ű ������ �迭�� �����´�.
		for(int i=0;i<allValues.length;i++) {
			if(allValues[i].getName().equals("cookieTest")) { //�迭�� ������ �� ����� ��Ű �̸�(cookieTest)�� �˻��ؼ� ��Ű ���� ������.
				out.println("<h2>Cookie �� �������� : " + URLDecoder.decode(allValues[i].getValue(), "utf-8"));
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}