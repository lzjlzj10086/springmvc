package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("file")
public class fileUploadController {
    /**
     * 单文件上传
     *      1.导坐标
     *      2.配置文件上传解析器
     *      3.编写代码
     * @return
     */
    @RequestMapping("upload")
    public String upload(String name,MultipartFile uploadFile) throws IOException {
        System.out.println(name);
        System.out.println(uploadFile);
        String filename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("D:\\upload\\"+filename));
        return "success";
    }
}
