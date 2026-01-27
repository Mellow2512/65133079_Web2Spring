package th.nguyenphananhtai.VDDoGetDoPost;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DoGetDoPost")
public class DoGetDoPost extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        out.append("Bạn vừa gửi Yêu cầu dạng GET, đây là đáp ứng của tôi");
        out.append("<br><br>");

        String html = ""
                + "<form method='POST' action='DoGetDoPost'>"
                + "Họ: <input type='text' name='fname'><br><br>"
                + "Tên: <input type='text' name='lname'><br><br>"
                + "<input type='submit' value='Gửi đi'>"
                + "</form>";

        out.append(html);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        PrintWriter out = response.getWriter();

        out.append("Bạn vừa gửi Yêu cầu dạng POST, đây là đáp ứng của tôi");
        out.append("<br><br>");

        out.append("Giá trị tham số fname = " + fname);
        out.append("<br>");
        out.append("Giá trị tham số lname = " + lname);
    }
}
