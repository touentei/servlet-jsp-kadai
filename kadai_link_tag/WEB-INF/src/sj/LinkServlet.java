package sj;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	        // リクエスト・レスポンスの設定
	        request.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html; charset=UTF-8");

//	        PrintWriter out = response.getWriter();

	         // フォワードによる画面遷移
	         request.setAttribute( "msg", "Servletからデータを受信しました：侍太郎さん、こんにちは！" );
	         RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
	         dispatcher.forward(request, response);
	         
	    }

}
