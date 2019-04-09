package controller.command.filter;

import model.entity.Student;
import model.entity.types.Role;
import utils.AttributesResourseManager;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

public class RoleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        final HttpServletRequest req = (HttpServletRequest) servletRequest;
        final HttpServletResponse resp = (HttpServletResponse) servletResponse;
        final HttpSession session = req.getSession(false);

        Student student = (Student) session.getAttribute(AttributesResourseManager.getProperty("parameter.user"));
        if (Objects.nonNull(student)) {
            int accessLevel = student.getRole();
            if (accessLevel == Role.ADMIN.getRole()) {
                filterChain.doFilter(req, resp);
            }

        } else {
            req.getRequestDispatcher("/main").forward(req, resp);

        }
    }



    @Override
    public void destroy() {

    }
}
