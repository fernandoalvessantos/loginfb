package com.fernando.loginfb;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class IndexController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Principal principal, Model model) {
        String nomeLogado = ((OAuth2AuthenticationToken) principal).getPrincipal().getAttribute("name");
        model.addAttribute("nomeLogado", nomeLogado);
        return "index";
    }

}
