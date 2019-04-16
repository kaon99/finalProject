package controller.command.filter;


import utils.AttributesResourseManager;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LocaleFilter implements Filter {
    private Map<String, Locale> languages = new HashMap<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        languages.put("en", new Locale("en"));
        languages.put("ua", new Locale("ua"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();

        String path = request.getRequestURI();
        String page = request.getHeader("referer");
        if (path.contains("/language/")) {
            String language = path.replaceAll(".*/language/", "");
            session.setAttribute(AttributesResourseManager.getProperty("parameter.language"), languages.get(language));
            response.sendRedirect(request.getContextPath() + page);
        } else {
            filterChain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
