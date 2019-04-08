package controller.command.filter;
import model.entity.Student;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationFilter implements Filter  {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final HttpSession session = request.getSession();
        String loginURI = request.getServletPath() + "/university/login";
        String registrationURI = request.getContextPath() + "/university/registration";

        boolean loggedIn = session != null && session.getAttribute(AttributesResourseManager.getProperty("parameter.user")) != null;
        boolean loginRequest = request.getRequestURI().equals(loginURI);
        boolean signUpRequest = request.getRequestURI().equals(registrationURI);
        if (loggedIn || loginRequest || signUpRequest) {
            filterChain.doFilter(request, response);
        } else if (request.getRequestURI().equals("/university/registration")) {
            request.getRequestDispatcher(PageResourseManager.getProperty("registration")).forward(request,response);

        }
        else if (request.getRequestURI().equals("/university/login")) {
            request.getRequestDispatcher(PageResourseManager.getProperty("login")).forward(request, response);
        }
        else {
response.sendRedirect("/");
        }

    }
    @Override
    public void destroy() {

    }
}
