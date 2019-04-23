package controller;

import controller.command.Command;
import controller.command.CommandFactory;
import controller.command.pagesCommand.SendNotificatioinCommandPage;
import model.entity.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.mockito.MockitoAnnotations.Mock.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(CommandFactory.class)
public class ServletTest {
    @InjectMocks
    private Servlet servlet;
    @Mock
   private HttpServletRequest request;
    @Mock
   private HttpServletResponse response ;
    @Mock
    private RequestDispatcher requestDispatcher;
    @Mock
   private Command command;


    @Before
    public void setUp (){
        MockitoAnnotations.initMocks(this);
        //PowerMockito.mockStatic(CommandFactory.class);
        when(CommandFactory.getCommand("/university/login/")).thenReturn(command);
        when(command.execute(request,response)).thenReturn("/university/login");
        when(request.getRequestDispatcher(page)).thenReturn(requestDispatcher);


    }

    final private String page = "WEB-INF/view/sendnotification.jsp";

    @Test
    public void WhenCallDoGet() throws ServletException, IOException {


servlet.doGet(request,response);


      verify(requestDispatcher,times(1)).forward(request,response);



    }


}
