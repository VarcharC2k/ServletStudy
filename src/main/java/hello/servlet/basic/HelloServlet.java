package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    //cntl + o > Service 중 자물쇠(protect)된 메서드 호출
    //Service 메서드 호출
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        //응답받은 쿼리 파라미터 확인하기
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //response 보내보기
        //데이터 타입 설정
        response.setContentType("text/plain");
        //데이터 인코딩 설정
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);

    }
}
