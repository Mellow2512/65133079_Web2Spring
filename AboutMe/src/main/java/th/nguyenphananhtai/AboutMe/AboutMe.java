package th.nguyenphananhtai.AboutMe;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AboutMe() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String avatarUrl = "https://ui-avatars.com/api/?name=Anh+Tai&size=150&background=6366f1&color=fff&bold=true";
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Giới Thiệu - Nguyễn Phan Anh Tài</title>");
        out.println("<link href='https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap' rel='stylesheet'>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css'>");
        out.println("<style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
        out.println("body { font-family: 'Inter', sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; display: flex; align-items: center; justify-content: center; padding: 20px; }");
        out.println(".container { max-width: 900px; width: 100%; }");
        out.println(".profile-card { background: white; border-radius: 24px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); overflow: hidden; animation: fadeInUp 0.6s ease; }");
        out.println("@keyframes fadeInUp { from { opacity: 0; transform: translateY(30px); } to { opacity: 1; transform: translateY(0); } }");
        out.println(".card-header { background: linear-gradient(135deg, #6366f1 0%, #8b5cf6 100%); padding: 50px 40px; text-align: center; position: relative; }");
        out.println(".card-header::before { content: ''; position: absolute; top: 0; left: 0; right: 0; bottom: 0; background: url('data:image/svg+xml,<svg width=\"100\" height=\"100\" xmlns=\"http://www.w3.org/2000/svg\"><circle cx=\"50\" cy=\"50\" r=\"40\" fill=\"rgba(255,255,255,0.05)\"/></svg>'); opacity: 0.3; }");
        out.println(".avatar-container { position: relative; display: inline-block; margin-bottom: 20px; }");
        out.println(".avatar { width: 150px; height: 150px; border-radius: 50%; border: 5px solid white; box-shadow: 0 10px 30px rgba(0,0,0,0.2); transition: transform 0.3s ease; }");
        out.println(".avatar:hover { transform: scale(1.05); }");
        out.println(".status-badge { position: absolute; bottom: 10px; right: 10px; background: #10b981; width: 24px; height: 24px; border-radius: 50%; border: 3px solid white; }");
        out.println(".card-header h1 { color: white; font-size: 32px; font-weight: 700; margin-bottom: 8px; text-shadow: 0 2px 4px rgba(0,0,0,0.1); }");
        out.println(".subtitle { color: rgba(255,255,255,0.9); font-size: 18px; font-weight: 400; }");
        out.println(".card-body { padding: 40px; }");
        out.println(".section-title { font-size: 20px; font-weight: 600; color: #1f2937; margin-bottom: 24px; display: flex; align-items: center; gap: 12px; }");
        out.println(".section-title i { color: #6366f1; font-size: 24px; }");
        out.println(".info-grid { display: grid; grid-template-columns: repeat(auto-fit, minmax(250px, 1fr)); gap: 20px; }");
        out.println(".info-item { background: #f9fafb; padding: 20px; border-radius: 12px; border-left: 4px solid #6366f1; transition: all 0.3s ease; }");
        out.println(".info-item:hover { background: #f3f4f6; transform: translateX(5px); box-shadow: 0 4px 12px rgba(0,0,0,0.08); }");
        out.println(".info-label { font-size: 13px; font-weight: 500; color: #6b7280; text-transform: uppercase; letter-spacing: 0.5px; margin-bottom: 8px; display: flex; align-items: center; gap: 8px; }");
        out.println(".info-label i { color: #6366f1; }");
        out.println(".info-value { font-size: 16px; font-weight: 600; color: #1f2937; }");
        out.println(".skills-section { margin-top: 40px; }");
        out.println(".skills-container { display: flex; flex-wrap: wrap; gap: 12px; }");
        out.println(".skill-tag { background: linear-gradient(135deg, #6366f1 0%, #8b5cf6 100%); color: white; padding: 10px 20px; border-radius: 20px; font-size: 14px; font-weight: 500; transition: all 0.3s ease; cursor: default; }");
        out.println(".skill-tag:hover { transform: translateY(-2px); box-shadow: 0 4px 12px rgba(99,102,241,0.4); }");
        out.println(".social-links { margin-top: 40px; display: flex; justify-content: center; gap: 16px; }");
        out.println(".social-link { width: 48px; height: 48px; border-radius: 50%; background: #f3f4f6; display: flex; align-items: center; justify-content: center; color: #6366f1; font-size: 20px; transition: all 0.3s ease; text-decoration: none; }");
        out.println(".social-link:hover { background: #6366f1; color: white; transform: translateY(-3px); box-shadow: 0 6px 16px rgba(99,102,241,0.4); }");
        out.println("@media (max-width: 768px) { .card-header { padding: 40px 24px; } .card-body { padding: 24px; } .info-grid { grid-template-columns: 1fr; } .card-header h1 { font-size: 26px; } }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<div class='profile-card'>");
        
        out.println("<div class='card-header'>");
        out.println("<div class='avatar-container'>");
        out.println("<img src='" + avatarUrl + "' alt='Avatar' class='avatar'>");
        out.println("<div class='status-badge'></div>");
        out.println("</div>");
        out.println("<h1>Nguyễn Phan Anh Tài</h1>");
        out.println("<p class='subtitle'>Sinh viên Công nghệ thông tin</p>");
        out.println("</div>");
        
        out.println("<div class='card-body'>");
        
        out.println("<div class='section-title'>");
        out.println("<i class='fas fa-user'></i>");
        out.println("<span>Thông tin cá nhân</span>");
        out.println("</div>");
        
        out.println("<div class='info-grid'>");
        
        out.println("<div class='info-item'>");
        out.println("<div class='info-label'><i class='fas fa-id-card'></i> Mã sinh viên</div>");
        out.println("<div class='info-value'>65133079</div>");
        out.println("</div>");
        
        out.println("<div class='info-item'>");
        out.println("<div class='info-label'><i class='fas fa-graduation-cap'></i> Chuyên ngành</div>");
        out.println("<div class='info-value'>Công nghệ thông tin</div>");
        out.println("</div>");
        
        out.println("<div class='info-item'>");
        out.println("<div class='info-label'><i class='fas fa-envelope'></i> Email</div>");
        out.println("<div class='info-value'>tai.npa.65cntt@ntu.edu.vn</div>");
        out.println("</div>");
        
        out.println("<div class='info-item'>");
        out.println("<div class='info-label'><i class='fas fa-map-marker-alt'></i> Địa chỉ</div>");
        out.println("<div class='info-value'>Việt Nam</div>");
        out.println("</div>");
        
        out.println("</div>");
        
        out.println("<div class='skills-section'>");
        out.println("<div class='section-title'>");
        out.println("<i class='fas fa-code'></i>");
        out.println("<span>Kỹ năng</span>");
        out.println("</div>");
        out.println("<div class='skills-container'>");
        out.println("<div class='skill-tag'><i class='fab fa-java'></i> Java</div>");
        out.println("<div class='skill-tag'><i class='fas fa-server'></i> Servlets</div>");
        out.println("<div class='skill-tag'><i class='fas fa-database'></i> Database</div>");
        out.println("<div class='skill-tag'><i class='fab fa-html5'></i> HTML/CSS</div>");
        out.println("<div class='skill-tag'><i class='fab fa-js'></i> JavaScript</div>");
        out.println("<div class='skill-tag'><i class='fas fa-laptop-code'></i> Web Development</div>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='social-links'>");
        out.println("<a href='https://github.com/Mellow2512/65133079_Web2Spring' class='social-link'><i class='fab fa-github'></i></a>");
        out.println("<a href='https://www.facebook.com/nguyen.tai.344123' class='social-link'><i class='fab fa-facebook'></i></a>");
        out.println("<a href='mailto:tai.npa.65cntt@ntu.edu.vn' class='social-link'><i class='fas fa-envelope'></i></a>");
        out.println("</div>");
        
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}