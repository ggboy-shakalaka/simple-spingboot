package cn.zhaizq.simple.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class BaseController {
    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/**")
    public String action(@RequestBody(required = false) String json, MultipartFile file, String servicespId) {
        System.out.println("path    :" + request.getRequestURI());
        System.out.println("Time  :" + System.currentTimeMillis());
        System.out.println("Method  :" + request.getMethod());
        System.out.println("json strData  :" + json);
        System.out.println("param strData  :" + servicespId);
        if (file != null) {
            System.out.println("File Name  :" + file.getName());
            System.out.println("File Size  :" + file.getSize());
        }
        return "login success";
    }
}