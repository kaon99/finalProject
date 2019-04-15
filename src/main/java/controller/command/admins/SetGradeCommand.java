package controller.command.admins;

import controller.command.Command;
import controller.command.pagesCommand.SetGradeCommandPage;
import model.entity.Rating;
import model.exception.WrongDataException;
import model.service.RatingService;
import model.service.StudentService;
import model.service.SubjectService;
import model.service.impl.RatingServiceImpl;
import model.service.impl.StudentServiceImpl;
import model.service.impl.SubjectServiceImpl;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class SetGradeCommand implements Command {
    RatingService ratingService = new RatingServiceImpl();
    SubjectService subjectService =new SubjectServiceImpl();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {

            String email = request.getParameter((AttributesResourseManager.getProperty("parameter.email")));
            Integer subject =Integer.parseInt(request.getParameter((AttributesResourseManager.getProperty("parameter.subject"))));

            request.setAttribute("databaseList", subjectService.findAll());
            Integer grade =Integer.parseInt( request.getParameter((AttributesResourseManager.getProperty("parameter.grade"))));
            if (Objects.isNull(email) && Objects.isNull(subject)) {
                throw new WrongDataException();
            }
           ratingService.setmark(email,subject,grade);








        } catch (WrongDataException e) {
            e.printStackTrace();
        }

        return new SetGradeCommandPage().execute(request,response);
}
}