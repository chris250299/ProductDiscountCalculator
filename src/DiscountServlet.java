import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));
        float discountAmount = (float) (price * (percent/100));
        float discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<center>");
        writer.println("<h2>Product Discount Calculator</h2>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td> Product Description:</td>");
        writer.println("<td>" + product + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>List Price:</td>");
        writer.println("<td>" + price + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Discount Percent:</td>");
        writer.println("<td>" + percent + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td> Discount Amount</td>");
        writer.println("<td>" + discountAmount + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td> Discount Price </td>");
        writer.println("<td>" + discountPrice + "</td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("</center>");
        writer.println("</html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
