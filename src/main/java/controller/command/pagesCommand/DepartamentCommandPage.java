package controller.command.pagesCommand;

import controller.command.Command;
import model.service.SpecialtyService;
import model.service.impl.SpecialtyServiceImpl;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DepartamentCommandPage implements Command {
    private SpecialtyService specialtyService = new SpecialtyServiceImpl();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("speciatlyList" ,specialtyService.findAll());
        return PageResourseManager.getProperty("studentpage/departament");
    }
}
