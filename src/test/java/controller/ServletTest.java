package controller;

import controller.command.admins.AdminCommand;
import org.junit.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;


public class ServletTest {
    final String path = "WEB-INF/view/login.jsp";
@Test
    public void  whenCallDoGet () throws ServletException, IOException {
        final AdminCommand servlet = new AdminCommand();
        final HttpServletRequest request = mock(HttpServletRequest.class);
        final HttpServletResponse response = mock(HttpServletResponse.class);
        final RequestDispatcher requestDispatcher = mock(RequestDispatcher.class);


    }

}