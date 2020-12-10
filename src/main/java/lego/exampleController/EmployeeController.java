package lego.exampleController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Step 1: turn this class into a Spring MVC controller
@Controller
public class EmployeeController {

    //Step 2, add a method that will handle HTTP GET requests to a URI of "/input"
    //The method should add an instance of the Employee class to the model
    //the method will delegate the view to a Thymeleaf template in inputform.html
    @GetMapping("/input")
    public String displayForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "inputform";
    }

    //Step 3: Add a method that will handle POST requests to a URI of "/confirmation:
    //the method should retrieve an instance of Employee from the model.
    //The method will delegate the view to a Thymeleaf template in confirmation.html
    //Hint: use the @ModelAttribute annotation
    @PostMapping("/confirmation")
    public String displayConfirmation(@ModelAttribute Employee employee) {

        return "confirmation";
    }

}
