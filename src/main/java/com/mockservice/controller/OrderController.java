package com.mockservice.controller;

import com.mockservice.util.JsonFileReaderUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class OrderController {

    @RequestMapping("/orders")
    @ResponseBody
    public String getOrders() {
        try {
            return JsonFileReaderUtil.readFile("Order");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "[]";
    }

}