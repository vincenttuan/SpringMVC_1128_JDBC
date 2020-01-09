package com.web.mvc.controller;

import com.web.mvc.entity.Product;
import com.web.mvc.repository.spec.PUViewDao;
import com.web.mvc.repository.spec.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pu_view")
public class PUViewController extends BaseController {

    @Autowired
    @Qualifier("puViewDao")
    private PUViewDao dao;

    @GetMapping("/all")
    public String all(Model model) {
        model.addAttribute("list", dao.queryPUView());
        return "pu_view";
    }
    
    @GetMapping("/query/{codeName}")
    public String query(@PathVariable("codeName") String codeName, Model model) {
        model.addAttribute("list", dao.queryPUViewByProductCodeName(codeName));
        return "pu_view";
    }
    

}
