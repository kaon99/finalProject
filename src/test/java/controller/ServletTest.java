package controller;

import org.junit.Test;
import org.mockito.Mock;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;


public class ServletTest {
    @Mock
    HttpServletRequest request = mock(HttpServletRequest.class);
    @Mock
    HttpServletResponse response = mock(HttpServletResponse.class);
    @Mock
    RequestDispatcher requestDispatcher = mock(RequestDispatcher.class);

final private String page = "university/login";
@Test
    public void WhenCllDoGet () throws ServletException, IOException {
        final Servlet servlet = new Servlet();
        servlet.doGet(request,response);
        when(request.getRequestDispatcher(page)).thenReturn(requestDispatcher);
        //request.getRequestDispatcher(path).forward(request,response);
        verify(request,times(1)).getRequestDispatcher(page);
    }


}
