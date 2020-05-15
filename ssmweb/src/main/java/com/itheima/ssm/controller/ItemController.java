package com.itheima.ssm.controller;

import com.itheima.ssm.pojo.Item;
import com.itheima.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.lang.model.element.NestingKind;

/**
 * @PackageName: com.itheima.ssm.controller
 * @ClassName: ItemController
 * @Author: caibing
 * @Date: 2020/5/11 15:54
 * @Description:
 */
@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    public String findById(@PathVariable("id")int id, Model model){

        Item item = itemService.findById(id);
        Model item1 = model.addAttribute("item", item);
        return "index.jsp";
    }
}
