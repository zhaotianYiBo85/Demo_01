package com.ityuan.controller;

import com.ityuan.pojo.GarBage;
import com.ityuan.service.GarBageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/garbage")
public class GarBageController {
    @Autowired
    private GarBageService garBageService;

    @RequestMapping("/insert")
    public Map<String,Object> insert(GarBage garBage, Model model) {
        System.out.println(garBage.toString());
        Map<String, Object> garbageList = new HashMap<String, Object>();
        int rows = garBageService.insert(garBage);
        if (rows > 0) {
           garbageList.put("code",100);
           garbageList.put("msg","插入成功");
           return garbageList;

        } else {
            garbageList.put("code",200);
            garbageList.put("msg","插入失败");
            return garbageList;
        }

    }

    @RequestMapping("/listGarbage")
    @ResponseBody
    private Map<String, Object> ListGarBage(String gname) {
        Map<String, Object> garbageList = new HashMap<String, Object>();
        if (gname.isEmpty()) {
            garbageList.put("code", 250);
            garbageList.put("message", "输入不能为空");
            garbageList.put("datalist", null);
            return garbageList;
        } else {
            List<GarBage> datalist = garBageService.selectByName(gname);
            if (datalist.size() > 0) {
                garbageList.put("code", 200);
                garbageList.put("message", "success");
                garbageList.put("datalist", datalist);
            } else {
                garbageList.put("code", 250);
                garbageList.put("message", "error");
                garbageList.put("datalist", datalist);
            }
            return garbageList;
        }
    }


    @RequestMapping("/selectbytype")
    @ResponseBody
    private Map<String, Object> ListByType(int gtype) {
        Map<String, Object> garbageMap = new HashMap<String, Object>();
        List<GarBage> datalist = garBageService.selectByType(gtype);
        if (datalist.size() > 0) {
            garbageMap.put("code", 200);
            garbageMap.put("message", "success");
            garbageMap.put("datalist", datalist);
        } else {
            garbageMap.put("code", 250);
            garbageMap.put("message", "error");
            garbageMap.put("datalist", datalist);
        }
        return garbageMap;
    }

    @RequestMapping("/allData")
    @ResponseBody
    private Map<String, Object> AllList() {
        Map<String, Object> garbageMap = new HashMap<String, Object>();
        List<GarBage> datalist = garBageService.select();
        System.out.println("========================================================\n" + datalist.size());
        if (datalist.size() > 0) {
            garbageMap.put("code", 200);
            garbageMap.put("message", "success");
            garbageMap.put("datalist", datalist);
        } else {
            garbageMap.put("code", 250);
            garbageMap.put("message", "error");
            garbageMap.put("datalist", datalist);
        }
        return garbageMap;
    }

    @RequestMapping("/index")
    public String toindex() {
        return "index";
    }


}
