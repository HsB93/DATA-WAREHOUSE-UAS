package nirla.uas.controller;
import nirla.uas.model.Fakta;
import nirla.uas.util.FaktaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class FaktaController {
    @Autowired
    private FaktaUtil service;

    @GetMapping("/")
    private String viewHomePage(Model model) {
        List<Fakta> listFakta = service.listAll();
        model.addAttribute("listFakta", listFakta);
        System.out.print("Get /");
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("fakta", new Fakta());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveFakta (@ModelAttribute("fakta") Fakta fkr){
        service.save(fkr);
        return "redirect:/";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditFaktaPage(@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Fakta fkr = service.get(id);
        mav.addObject("fakta", fkr);
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deletefakta(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
