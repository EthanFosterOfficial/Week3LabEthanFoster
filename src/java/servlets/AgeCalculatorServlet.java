package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 727045
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns =
{
    "/age"
})
public class AgeCalculatorServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String input = request.getParameter("age");
        request.setAttribute("age", input);

        try
        {
            int age = Integer.parseInt(input);
            age++;
            request.setAttribute("message", "Your age next year is " + age);
        } catch (NumberFormatException e)
        {
            request.setAttribute("message", "Please input your age as a valid Number");
        }

        

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);

    }

}
