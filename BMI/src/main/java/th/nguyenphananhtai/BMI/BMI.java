package th.nguyenphananhtai.BMI;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BMI")
public class BMI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BMI() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='vi'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Tính chỉ số BMI</title>");
        out.println("<link href='https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap' rel='stylesheet'>");
        out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css'>");
        out.println("<style>");
        out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
        out.println("body { font-family: 'Inter', sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; display: flex; align-items: center; justify-content: center; padding: 20px; }");
        out.println(".container { background: white; border-radius: 24px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); overflow: hidden; width: 100%; max-width: 450px; animation: fadeInUp 0.6s ease; }");
        out.println("@keyframes fadeInUp { from { opacity: 0; transform: translateY(30px); } to { opacity: 1; transform: translateY(0); } }");
        out.println(".header { background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); padding: 40px 30px; text-align: center; position: relative; }");
        out.println(".header::before { content: ''; position: absolute; top: 0; left: 0; right: 0; bottom: 0; background: url('data:image/svg+xml,<svg width=\"100\" height=\"100\" xmlns=\"http://www.w3.org/2000/svg\"><circle cx=\"50\" cy=\"50\" r=\"40\" fill=\"rgba(255,255,255,0.05)\"/></svg>'); opacity: 0.3; }");
        out.println(".header-icon { background: rgba(255,255,255,0.2); width: 80px; height: 80px; border-radius: 50%; display: inline-flex; align-items: center; justify-content: center; margin-bottom: 15px; backdrop-filter: blur(10px); }");
        out.println(".header-icon i { font-size: 36px; color: white; }");
        out.println(".header h1 { color: white; font-size: 28px; font-weight: 700; margin-bottom: 8px; position: relative; }");
        out.println(".header p { color: rgba(255,255,255,0.9); font-size: 15px; position: relative; }");
        out.println(".form-content { padding: 40px 30px; }");
        out.println(".input-group { margin-bottom: 24px; }");
        out.println(".input-group label { display: block; font-weight: 600; color: #374151; margin-bottom: 10px; font-size: 14px; display: flex; align-items: center; gap: 8px; }");
        out.println(".input-group label i { color: #667eea; font-size: 16px; }");
        out.println(".input-wrapper { position: relative; }");
        out.println(".input-wrapper input { width: 100%; padding: 14px 16px; padding-right: 45px; border: 2px solid #e5e7eb; border-radius: 12px; font-size: 16px; transition: all 0.3s ease; background: #f9fafb; }");
        out.println(".input-wrapper input:focus { outline: none; border-color: #667eea; background: white; box-shadow: 0 0 0 4px rgba(102,126,234,0.1); }");
        out.println(".input-unit { position: absolute; right: 16px; top: 50%; transform: translateY(-50%); color: #9ca3af; font-weight: 600; font-size: 14px; }");
        out.println(".button-group { display: flex; gap: 12px; margin-top: 32px; }");
        out.println(".btn { flex: 1; padding: 16px; border: none; border-radius: 12px; font-size: 16px; font-weight: 600; cursor: pointer; transition: all 0.3s ease; display: flex; align-items: center; justify-content: center; gap: 8px; }");
        out.println(".btn-submit { background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: white; flex: 2; }");
        out.println(".btn-submit:hover { transform: translateY(-2px); box-shadow: 0 8px 20px rgba(102,126,234,0.4); }");
        out.println(".btn-reset { background: #f3f4f6; color: #6b7280; }");
        out.println(".btn-reset:hover { background: #e5e7eb; color: #374151; }");
        out.println(".info-box { background: #eff6ff; border-left: 4px solid #3b82f6; padding: 16px; border-radius: 8px; margin-top: 24px; }");
        out.println(".info-box p { color: #1e40af; font-size: 13px; line-height: 1.6; display: flex; align-items: start; gap: 10px; }");
        out.println(".info-box i { margin-top: 2px; }");
        out.println("@media (max-width: 480px) { .container { border-radius: 16px; } .header { padding: 30px 20px; } .form-content { padding: 30px 20px; } }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        
        out.println("<div class='container'>");
        out.println("<div class='header'>");
        out.println("<div class='header-icon'><i class='fas fa-weight-scale'></i></div>");
        out.println("<h1>Tính chỉ số BMI</h1>");
        out.println("<p>Đánh giá tình trạng cân nặng của bạn</p>");
        out.println("</div>");
        
        out.println("<div class='form-content'>");
        out.println("<form action='BMI' method='POST'>");
        
        out.println("<div class='input-group'>");
        out.println("<label><i class='fas fa-ruler-vertical'></i> Chiều cao</label>");
        out.println("<div class='input-wrapper'>");
        out.println("<input type='number' step='0.01' name='height' placeholder='Nhập chiều cao' required>");
        out.println("<span class='input-unit'>m</span>");
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='input-group'>");
        out.println("<label><i class='fas fa-weight'></i> Cân nặng</label>");
        out.println("<div class='input-wrapper'>");
        out.println("<input type='number' step='0.1' name='weight' placeholder='Nhập cân nặng' required>");
        out.println("<span class='input-unit'>kg</span>");
        out.println("</div>");
        out.println("</div>");

        out.println("<div class='button-group'>");
        out.println("<button type='submit' class='btn btn-submit'><i class='fas fa-calculator'></i> Tính toán</button>");
        out.println("<button type='reset' class='btn btn-reset'><i class='fas fa-redo'></i> Xóa</button>");
        out.println("</div>");
        
        out.println("<div class='info-box'>");
        out.println("<p><i class='fas fa-info-circle'></i> BMI = Cân nặng (kg) / Chiều cao² (m²)</p>");
        out.println("</div>");
        
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String s_height = request.getParameter("height");
        String s_weight = request.getParameter("weight");

        try {
            double height = Double.parseDouble(s_height);
            double weight = Double.parseDouble(s_weight);

            double bmi = weight / (height * height);
            String result = "";
            String color = "";
            String bgColor = "";
            String icon = "";

            if (bmi < 18.5) {
                result = "Gầy (Thiếu cân)";
                color = "#f59e0b";
                bgColor = "#fef3c7";
                icon = "fa-face-frown";
            } else if (bmi <= 22.9) {
                result = "Cân nặng bình thường";
                color = "#10b981";
                bgColor = "#d1fae5";
                icon = "fa-face-smile";
            } else if (bmi >= 23 && bmi <= 24.9) {
                result = "Thừa cân: Tiền béo phì";
                color = "#f97316";
                bgColor = "#fed7aa";
                icon = "fa-face-meh";
            } else if (bmi >= 25 && bmi <= 29.9) {
                result = "Thừa cân: Béo phì cấp độ 1";
                color = "#ef4444";
                bgColor = "#fecaca";
                icon = "fa-face-frown-open";
            } else {
                result = "Thừa cân: Béo phì cấp độ 2";
                color = "#dc2626";
                bgColor = "#fca5a5";
                icon = "fa-face-sad-tear";
            }

            out.println("<!DOCTYPE html>");
            out.println("<html lang='vi'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Kết quả BMI</title>");
            out.println("<link href='https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap' rel='stylesheet'>");
            out.println("<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css'>");
            out.println("<style>");
            out.println("* { margin: 0; padding: 0; box-sizing: border-box; }");
            out.println("body { font-family: 'Inter', sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; display: flex; align-items: center; justify-content: center; padding: 20px; }");
            out.println(".result-container { background: white; border-radius: 24px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); overflow: hidden; width: 100%; max-width: 500px; animation: fadeInUp 0.6s ease; }");
            out.println("@keyframes fadeInUp { from { opacity: 0; transform: translateY(30px); } to { opacity: 1; transform: translateY(0); } }");
            out.println(".result-header { background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); padding: 30px; text-align: center; position: relative; }");
            out.println(".result-header::before { content: ''; position: absolute; top: 0; left: 0; right: 0; bottom: 0; background: url('data:image/svg+xml,<svg width=\"100\" height=\"100\" xmlns=\"http://www.w3.org/2000/svg\"><circle cx=\"50\" cy=\"50\" r=\"40\" fill=\"rgba(255,255,255,0.05)\"/></svg>'); opacity: 0.3; }");
            out.println(".result-header h2 { color: white; font-size: 24px; font-weight: 700; position: relative; }");
            out.println(".result-content { padding: 40px 30px; text-align: center; }");
            out.println(".bmi-circle { width: 180px; height: 180px; border-radius: 50%; background: " + bgColor + "; margin: 0 auto 30px; display: flex; flex-direction: column; align-items: center; justify-content: center; position: relative; box-shadow: 0 8px 24px rgba(0,0,0,0.1); }");
            out.println(".bmi-circle::before { content: ''; position: absolute; inset: -8px; border-radius: 50%; background: linear-gradient(135deg, " + color + ", " + color + "88); opacity: 0.2; z-index: -1; }");
            out.println(".bmi-value { font-size: 56px; font-weight: 800; color: " + color + "; line-height: 1; }");
            out.println(".bmi-label { font-size: 14px; color: #6b7280; font-weight: 600; margin-top: 8px; text-transform: uppercase; letter-spacing: 1px; }");
            out.println(".status-card { background: " + bgColor + "; border-radius: 16px; padding: 24px; margin-bottom: 30px; }");
            out.println(".status-icon { font-size: 48px; color: " + color + "; margin-bottom: 12px; }");
            out.println(".status-text { font-size: 20px; font-weight: 700; color: " + color + "; margin-bottom: 8px; }");
            out.println(".status-desc { font-size: 14px; color: #6b7280; }");
            out.println(".bmi-scale { background: #f3f4f6; border-radius: 12px; padding: 20px; margin-bottom: 30px; }");
            out.println(".bmi-scale h3 { font-size: 16px; font-weight: 600; color: #374151; margin-bottom: 16px; text-align: left; }");
            out.println(".scale-item { display: flex; justify-content: space-between; align-items: center; padding: 10px 0; border-bottom: 1px solid #e5e7eb; }");
            out.println(".scale-item:last-child { border-bottom: none; }");
            out.println(".scale-label { font-size: 14px; color: #6b7280; }");
            out.println(".scale-range { font-size: 14px; font-weight: 600; color: #374151; }");
            out.println(".btn-back { display: inline-flex; align-items: center; gap: 8px; padding: 14px 32px; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: white; text-decoration: none; border-radius: 12px; font-weight: 600; font-size: 16px; transition: all 0.3s ease; }");
            out.println(".btn-back:hover { transform: translateY(-2px); box-shadow: 0 8px 20px rgba(102,126,234,0.4); }");
            out.println("@media (max-width: 480px) { .result-container { border-radius: 16px; } .result-content { padding: 30px 20px; } .bmi-circle { width: 160px; height: 160px; } .bmi-value { font-size: 48px; } }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");

            out.println("<div class='result-container'>");
            out.println("<div class='result-header'>");
            out.println("<h2><i class='fas fa-clipboard-check'></i> Kết quả của bạn</h2>");
            out.println("</div>");
            
            out.println("<div class='result-content'>");
            out.println("<div class='bmi-circle'>");
            out.println("<div class='bmi-value'>" + String.format("%.1f", bmi) + "</div>");
            out.println("<div class='bmi-label'>BMI</div>");
            out.println("</div>");
            
            out.println("<div class='status-card'>");
            out.println("<div class='status-icon'><i class='fas " + icon + "'></i></div>");
            out.println("<div class='status-text'>" + result + "</div>");
            out.println("<div class='status-desc'>Chiều cao: " + height + "m | Cân nặng: " + weight + "kg</div>");
            out.println("</div>");
            
            out.println("<div class='bmi-scale'>");
            out.println("<h3><i class='fas fa-chart-line'></i> Bảng phân loại BMI</h3>");
            out.println("<div class='scale-item'>");
            out.println("<span class='scale-label'>Gầy (Thiếu cân)</span>");
            out.println("<span class='scale-range'>&lt; 18.5</span>");
            out.println("</div>");
            out.println("<div class='scale-item'>");
            out.println("<span class='scale-label'>Bình thường</span>");
            out.println("<span class='scale-range'>18.5 - 22.9</span>");
            out.println("</div>");
            out.println("<div class='scale-item'>");
            out.println("<span class='scale-label'>Tiền béo phì</span>");
            out.println("<span class='scale-range'>23.0 - 24.9</span>");
            out.println("</div>");
            out.println("<div class='scale-item'>");
            out.println("<span class='scale-label'>Béo phì cấp độ 1</span>");
            out.println("<span class='scale-range'>25.0 - 29.9</span>");
            out.println("</div>");
            out.println("<div class='scale-item'>");
            out.println("<span class='scale-label'>Béo phì cấp độ 2</span>");
            out.println("<span class='scale-range'>&ge; 30.0</span>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("<a href='BMI' class='btn-back'><i class='fas fa-arrow-left'></i> Tính toán lại</a>");
            out.println("</div>");
            out.println("</div>");
            
            out.println("</body>");
            out.println("</html>");

        } catch (Exception e) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><meta charset='UTF-8'><title>Lỗi</title>");
            out.println("<link href='https://fonts.googleapis.com/css2?family=Inter:wght@400;600&display=swap' rel='stylesheet'>");
            out.println("<style>");
            out.println("body { font-family: 'Inter', sans-serif; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); min-height: 100vh; display: flex; align-items: center; justify-content: center; padding: 20px; }");
            out.println(".error-box { background: white; padding: 40px; border-radius: 16px; text-align: center; max-width: 400px; box-shadow: 0 20px 60px rgba(0,0,0,0.3); }");
            out.println(".error-icon { font-size: 64px; color: #ef4444; margin-bottom: 20px; }");
            out.println("h2 { color: #374151; margin-bottom: 10px; }");
            out.println("p { color: #6b7280; margin-bottom: 24px; }");
            out.println("a { display: inline-block; padding: 12px 28px; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); color: white; text-decoration: none; border-radius: 8px; font-weight: 600; }");
            out.println("</style></head><body>");
            out.println("<div class='error-box'>");
            out.println("<div class='error-icon'><i class='fas fa-exclamation-triangle'></i></div>");
            out.println("<h2>Có lỗi xảy ra!</h2>");
            out.println("<p>Vui lòng nhập số hợp lệ và thử lại.</p>");
            out.println("<a href='BMI'><i class='fas fa-arrow-left'></i> Quay lại</a>");
            out.println("</div></body></html>");
        }
    }
}