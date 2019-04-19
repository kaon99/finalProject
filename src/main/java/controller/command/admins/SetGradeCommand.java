package controller.command.admins;

import controller.command.Command;
import controller.command.pagesCommand.SetGradeCommandPage;
import controller.validation.ValidationUtil;
import model.exception.WrongDataException;
import model.service.RatingService;
import model.service.SubjectService;
import model.service.impl.RatingServiceImpl;
import model.service.impl.SubjectServiceImpl;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.Optional;

public class SetGradeCommand implements Command {
    RatingService ratingService = new RatingServiceImpl();
    SubjectService subjectService = new SubjectServiceImpl();
    ValidationUtil validationUtil = new ValidationUtil();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {

            String email = request.getParameter((AttributesResourseManager.getProperty("parameter.email")));
            Optional<Integer> subject = Optional.ofNullable(Integer.parseInt(request.getParameter((AttributesResourseManager.getProperty("parameter.subject")))));

            request.setAttribute("databaseList", subjectService.findAll());
            Optional<Integer> grade = Optional.ofNullable(Integer.parseInt(request.getParameter((AttributesResourseManager.getProperty("parameter.grade")))));
            if (Objects.isNull(email) && Objects.isNull(subject) || !validationUtil.userExist(email)) {
                throw new WrongDataException();
            } else {
                ratingService.setmark(email, subject.get(), grade.get());

            }


        } catch (WrongDataException e) {
            request.setAttribute("userExist", true);
            return new SetGradeCommandPage().execute(request, response);
        }

        return PageResourseManager.getProperty("redirect.admin.setgrade");
    }
}