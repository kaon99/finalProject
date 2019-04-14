package controller.command.pagesCommand;

import controller.command.Command;
import model.service.SubjectService;
import model.service.impl.SubjectServiceImpl;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetGradeCommandPage implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        SubjectService subjectService = new SubjectServiceImpl();
        request.setAttribute("databaseList", subjectService.findAll());
        return PageResourseManager.getProperty("admin/setgrade");
    }
}
