//package pl.coderslab.controller;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.entity.Exercise;
//import pl.coderslab.entity.Offer;
//import pl.coderslab.entity.User;
//import pl.coderslab.repository.ExerciseRepository;
//
//
//import javax.validation.Valid;
//import java.util.List;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/exercise")
//public class ExerciseController {
//
//    private final ExerciseRepository exerciseRepository;
//
//    @GetMapping("/add")
//    public String redirectExerciseFormAdd(Model model) {
//        model.addAttribute("exercise", new Exercise());
//        return "/exercise/exerciseAdd.jsp";
//    }
//
//    @PostMapping("/add")
//    @ResponseBody
//    public String addExercise(Exercise exercise) { exerciseRepository.save(exercise);
//        return "index.jsp";
//    }
//
//    @RequestMapping("/printAll")
//    public String showAllExercisesView() {
//        return "/exercise/showAllExercises.jsp";
//    }
//
//    @ModelAttribute("exercises")
//    public List<Exercise> exercisesList() {
//        return this.exerciseRepository.findAll();
//    }
//    }
////delete by id + link to each offer
