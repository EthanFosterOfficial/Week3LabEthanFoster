/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 727045
 */
public class arithmeticCalculatorServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        request.setAttribute("message", "--");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        try
        {

            int top = Integer.parseInt(first);
            int bottom = Integer.parseInt(second);
            int ans = 0;

            if (request.getParameter("+") != null)
            {
                ans = top + bottom;
                request.setAttribute("message", ans);
            } else if (request.getParameter("-") != null)
            {
                ans = top - bottom;
                request.setAttribute("message", ans);

            } else if (request.getParameter("*") != null)
            {
                ans = top * bottom;
                request.setAttribute("message", ans);

            } else if (request.getParameter("%") != null)
            {
                ans = top % bottom;
                request.setAttribute("message", ans);

            } else
            {
                request.setAttribute("message", "--");
            }

        } catch (NumberFormatException e)
        {
            request.setAttribute("message", "Invalid");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

}
