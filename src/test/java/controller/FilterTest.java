package controller;

import controller.command.filter.AuthenticationFilter;
import controller.command.filter.LocaleFilter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import utils.AttributesResourseManager;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

import static org.mockito.Mockito.*;


public class FilterTest {

        @Mock
        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        @Mock
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        @Mock
    HttpSession httpSession = mock (HttpSession.class);
        @Mock
        FilterChain filterChain = mock(FilterChain.class);




    @Test
    public void testAuthenficationFilter() throws IOException, ServletException {

        // mock the getRequestURI() response
        when(httpServletRequest.getRequestURI()).thenReturn("/otherurl.jsp");

        AuthenticationFilter authenticationFilter = new AuthenticationFilter();
        authenticationFilter.doFilter(httpServletRequest, httpServletResponse,
                filterChain);

        // verify if a sendRedirect() was performed with the expected value
        verify(httpServletResponse).sendRedirect("/university/login");
    }


    @Test
    public void testLocaleFilter () throws IOException, ServletException {
    when(httpServletRequest.getRequestURI()).thenReturn("/university/login/language/ua");
        //when(httpServletRequest.getContextPath()).thenReturn("/university/login");

        LocaleFilter localeFilter = new LocaleFilter();
        localeFilter.doFilter(httpServletRequest,httpServletResponse,filterChain);
        verify(httpServletResponse,times(1)).sendRedirect(httpServletRequest.getContextPath() + httpServletRequest.getHeader("referer"));

        }
    }

