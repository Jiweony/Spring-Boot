package com.example.crud.controller;

import com.example.crud.dto.ItemsDto;
import com.example.crud.mappers.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    ItemMapper im;

    @GetMapping("")
    public String getListItem(){

        return "users/listItem";
    }

    @PostMapping("")
    @ResponseBody
    public Map<String, Object> getListInfo(){
        Map<String, Object> map = new HashMap<>();
        map.put("total", im.getCount());
        map.put("items", im.getItemList());

        return map;
    }

    @GetMapping("/viewItem")
    public String viewItem(@RequestParam int id, Model model) {

        ItemsDto result = im.viewItem(id);
        model.addAttribute("item", result);
        System.out.println(result);
        return "users/viewItem";
    }
}
