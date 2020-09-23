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
            double top;
            double bottom;
            top = Double.parseDouble(first);
            bottom = Double.parseDouble(second);
            double ans = 0;
            if(request.getAttribute("+") != null)
            {
                ans = top + bottom;
            }
            else if(request.getAttribute("-") != null)
            {
                ans = top - bottom;
            }
            else if(request.getAttribute("*") != null)
            {
                ans = top * bottom;
            }
            else if(request.getAttribute("%") != null)
            {
                ans = top / bottom;
            }
            
            request.setAttribute("message", ans);
            
        } catch (NumberFormatException e)
        {
            request.setAttribute("message", "Please input your age as a valid Number");
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithimeticCalculator.jsp")
                .forward(request, response);
    }

}
