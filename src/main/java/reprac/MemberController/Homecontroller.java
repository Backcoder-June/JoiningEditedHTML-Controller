package reprac.MemberController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontroller {

    @GetMapping("/")
    public String mainhome(){
        return "Home";
    }
}