package zylon.com.serverlet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

/**
 * Servlet implementation class SimpleServerlet
 */
@WebServlet("/*")
public class SimpleServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletInputStream   input =	request.getInputStream();
     BufferedReader 	reader = new BufferedReader(new InputStreamReader(input));
     String line = "";
     System.out.println(line=reader.readLine());
//     System.out.println(request.);
      while(!((line=reader.readLine())==null)){
    	  
    	  response.getWriter().println(line);
      }
		
	}

}
