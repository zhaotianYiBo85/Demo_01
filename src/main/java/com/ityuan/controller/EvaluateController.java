package com.ityuan.controller;

import com.ityuan.pojo.Evaluate;
import com.ityuan.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/evaluate")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    /*
    * 根据用户id 查询评价
    * */
    @ResponseBody
    @RequestMapping("/detailsByuid")
    public Map<String,Object> findEvaluateById(int user_id){
        Map<String,Object> evaluateInfo=new HashMap<>();
        List<Evaluate> evaluates=evaluateService.findEvaluateById(user_id);

        evaluateInfo.put("code",200);
        evaluateInfo.put("msg","查询成功");
        evaluateInfo.put("evaluate",evaluates);

        return evaluateInfo;
    }

    /*
    * 根据商品id查询评价信息
    * */
    @ResponseBody
    @RequestMapping("/udetailsBypid")
    public Map<String,Object> findEvaluateByProId(int pro_id){
        Map<String,Object> evaluateInfo=new HashMap<>();
        List<Evaluate> evaluates=evaluateService.findEvaluateByProId(pro_id);
        evaluateInfo.put("code",200);
        evaluateInfo.put("msg","查询成功");
        evaluateInfo.put("evaluate",evaluates);

        return evaluateInfo;

    }

    /*
    * 用户根据评价id 删除评价信息
    * */
    @ResponseBody
    @RequestMapping("/deleEva")
    public Map<String,Object> deleteEvaluate(Integer eva_id){

        Map<String,Object> evaluateInfo=new HashMap<>();
        int rows =evaluateService.deleteEvaluate(eva_id);

        if (rows>0){
            evaluateInfo.put("code",200);
            evaluateInfo.put("msg","删除评价成功");
        }
        return evaluateInfo;
    }

    /*
    * 用户新增评价
    * */
    @ResponseBody
    @RequestMapping("/addEva")
    public Map<String,Object> addEvaluate(Evaluate evaluate){
        Map<String,Object> evaluateInfo=new HashMap<>();
        int rows=evaluateService.addEvaluate(evaluate);

        if (rows>0){
            evaluateInfo.put("code",200);
            evaluateInfo.put("msg","新增评价成功");
        }
        return evaluateInfo;
    }

    /*
    * 用户修改评价信息
    * */
    @ResponseBody
    @RequestMapping("/updataEva")
    public Map<String,Object> updataEvaluate(Evaluate evaluate){
        Map<String,Object> evaluateInfo=new HashMap<>();
        int rows=evaluateService.updataEvaluate(evaluate);

        if(rows>0){
            evaluateInfo.put("code",200);
            evaluateInfo.put("msg","修改评价信息成功");
        }
        return evaluateInfo;
    }

}
