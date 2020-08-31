package com.sto.szdataobject.controller;

import com.sto.szdataobject.model.CommonReturnType;
import com.sto.szdataobject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * 数据操作控制器
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/index")
    public ModelAndView adminView() {
        ModelAndView model = new ModelAndView("upload");
        return model;
    }


    @RequestMapping("/import")
    @ResponseBody
    public CommonReturnType importData(@RequestParam(value = "file") MultipartFile file, HttpServletResponse response) throws IOException {
        if (file != null) {
            int result = dataService.importData(file);

        }
        return CommonReturnType.create("");
    }

    @RequestMapping("/importCollect")
    @ResponseBody
    public CommonReturnType importDataCollect(@RequestParam(value = "file") MultipartFile file, HttpServletResponse response) throws IOException {
        if (file != null) {
            return CommonReturnType.create(dataService.importDataCollect(file));
        }
        return CommonReturnType.create("");
    }
}
