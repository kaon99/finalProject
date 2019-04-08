package controller.command.util;

import utils.PageResourseManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CommandUtil {

    public static void goToPage(HttpServletRequest req, HttpServletResponse resp, String url) {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(url);
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException | IOException e) {

        }
    }

    public static String getUserPageByRole(int accessLevel) {
        String page = "redirect:/login";
        switch (accessLevel) {
            case 2:
                page = PageResourseManager.getProperty("studentpage");
                break;
            case 3:
                page = PageResourseManager.getProperty("admin");
                break;
            default:
        }
        return page;

    }
}
