//package pl.coderslab.controller;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.entity.Offer;
//import pl.coderslab.repository.OfferRepository;
//
//import java.util.List;
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/offer")
//public class OfferController {
//
//    private final OfferRepository offerRepository;
//
//    @GetMapping("/add")
//    public String redirectOfferFormAdd(Model model) {
//        model.addAttribute("offer", new Offer());
//        return "/offer/offerAdd.jsp";
//    }
//
//    @PostMapping("/add")
//    @ResponseBody
//    public String addOffer(Offer offer) {
//        offerRepository.save(offer);
//        return "redirect:/offer/offerAdd";
//    }
//
//    @RequestMapping("/printAll")
//    public String showAllOffersView() {
//        return "/offer/showAllOffers.jsp";
//    }
//
//    @ModelAttribute("offers")
//    public List<Offer> offerList() {
//        return this.offerRepository.findAll();
//    }
//
//   //delete by id + link to each offer
//
////    @RequestMapping("/get/{id}")
////    public String getBook(@PathVariable long id) {
////        Book book = bookDao.findById(id);
////        return book.toString();
////    }
////@GetMapping("/api/employees/{id}")
////@ResponseBody
////public String getEmployeesByIdAndName(@PathVariable String id) {
////    userRepository.findByEmail(user.getEmail())
////    return "ID: " + id + ";
////}
//
//
//
//}