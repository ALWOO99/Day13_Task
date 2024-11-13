package vttp.batchb.ssf.day13task.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import vttp.batchb.ssf.day13task.models.ToDo;

@Controller
@RequestMapping("/todo/")
public class ToDoController {

    private List<ToDo> list = new ArrayList<>();  // In-memory list of tasks

    // Display the form and the list of tasks
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("task", new ToDo());  // Initialize a new empty ToDo object for the form
        model.addAttribute("tasks", list);  // Pass the list of tasks to the view
        return "todo_form";  // Thymeleaf template name
    }

    // Handle the form submission and add the task to the list
    @PostMapping("/")
     public String saveTask(@Valid @ModelAttribute ToDo task, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "todo_form";  // Return to the form page if validation fails
        }
        list.add(task);  // Add the new task to the list
        return "redirect:/todo/";  // Redirect to the form page to show the updated list
    }
}


