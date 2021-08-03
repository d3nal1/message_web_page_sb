//package pl.coderslab.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.entity.Offer;
//import pl.coderslab.entity.User;
//import pl.coderslab.repository.OfferRepository;
//import pl.coderslab.repository.UserRepository;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//import java.security.Principal;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//@Controller
//@ControllerAdvice
//@RequestMapping("/")
//public class UserController {
//
//    private final UserRepository userRepository;
//    private final OfferRepository offerRepository;
//
//    public UserController(UserRepository userRepository, OfferRepository offerRepository) {
//        this.userRepository = userRepository;
//        this.offerRepository = offerRepository;
//    }
//
//
//
//
//
//
//    @GetMapping("/add")
//    public String redirectUsersFormAdd(Model model) {
//        model.addAttribute("user", new User());
//        return "users/usersAdd.jsp";
//    }
//
//    @PostMapping("/add")
//    public String addUsers(User user) {
//        userRepository.save(user);
//        return "/users/usersAdd.jsp";
//    }
//
//    @ModelAttribute("offers")
//    public List<Offer> offersList() {
//        return this.offerRepository.findAll();
//    }
//
//    @ModelAttribute("username")
//    public String username(Principal principal) {
//        return principal == null ? null : principal.getName();
//    }
//
////    @GetMapping("/login")
////    public String form(Model model) {
////        model.addAttribute("user", new User());
////        return "/users/login.jsp";
////    }
//    //current User
//
//
//    @RequestMapping("/printAll")
//    public String showAllUsersView() {
//        return "/users/showAllUsers.jsp";
//    }
//
//    @ModelAttribute("users")
//    public List<User> userList() {
//        return this.userRepository.findAll();
//    }
//
//    //login admin/user - REPLACED BY SPRING SECURITY
////    @PostMapping("/login")
////    public String login(@Valid User user, BindingResult result, HttpServletResponse response, HttpServletRequest request) {
////        if (result.hasErrors()) {
////            return "/users/login.jsp";
////        }
////        if (userRepository.findByEmail(user.getEmail()) != null
////                && userRepository.findByEmail(user.getEmail()).getPassword().equals(user.getPassword())
////                && userRepository.findByEmail(user.getEmail()).getRole().equals("ADMIN")) {
////            User sessionUser = userRepository.findByEmail(user.getEmail());
////            HttpSession session = request.getSession();
////            session.setAttribute("user", sessionUser);
////            return "/users/adminMain.jsp";
////        } else  if (userRepository.findByEmail(user.getEmail()) != null
////                && userRepository.findByEmail(user.getEmail()).getPassword().equals(user.getPassword())
////                && userRepository.findByEmail(user.getEmail()).getRole().equals("USER")) {
////            User sessionUser = userRepository.findByEmail(user.getEmail());
////            String sessionUsername = user.getUsername();
////            HttpSession session = request.getSession();
////            session.setAttribute("user", sessionUser);
////            session.setAttribute("username", sessionUsername);
////
////            return "/users/userMain.jsp";
////        } else {
////            return "/users/loginError.jsp";
////        }
//    }
//
