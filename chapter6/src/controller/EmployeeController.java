package controller;

import domain.Employee;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

/**
 * Created by yinxin on 16-11-24.
 */
@Controller
public class EmployeeController {


    @RequestMapping(value = "employee_input")
    public String inputEmployee(Model model){
        model.addAttribute(new Employee());
        return "EmployeeForm";
    }

    @RequestMapping(value = "employee_save")
    public String saveEmployee(@ModelAttribute Employee employee, BindingResult bindingResult,Model model)
    {
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "EmployeeForm";
        }
        //save
        model.addAttribute("employee",employee);
        return "EmployeeDetails";
    }

}
