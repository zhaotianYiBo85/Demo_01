package com.ityuan.controller;

import com.ityuan.pojo.Recycle;
import com.ityuan.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/recycle")
public class RecycleController {
    @Autowired
    private RecycleService recycleService;

    /*
    * 管理员查询所有预约回收垃圾记录
    * */
    @ResponseBody
    @RequestMapping("/findRecycle")
    public Map<String,Object> findRecycle(Recycle recycle){
        Map<String,Object> recycleInfo=new HashMap<>();
        List<Recycle> recycles=recycleService.findRecycle(recycle);
        recycleInfo.put("code",200);
        recycleInfo.put("msg","查询成功");
        recycleInfo.put("recycle",recycles);
        return recycleInfo;
    }

    /*
    * 根据用户id查询用户过有的预约回收垃圾记录
    * */
    @ResponseBody
    @RequestMapping("/userFindRecycle")
    public Map<String,Object> findRecycleByUid(int user_id){
        Map<String,Object> recycleInfo=new HashMap<>();
        List<Recycle> recycles=recycleService.findRecycleByUid(user_id);
        recycleInfo.put("code",200);
        recycleInfo.put("msg","查询成功");
        recycleInfo.put("recycle",recycles);
        return recycleInfo;
    }
    /*
    * 用户新增垃圾回收服务预约
    * */
    @ResponseBody
    @RequestMapping("/addRecycle")
    public Map<String,Object> addRecycle(Recycle recycle){
        Map<String,Object> recycleInfo=new HashMap<>();
        int rows=recycleService.addRecycle(recycle);
        if (rows>0){
            recycleInfo.put("code",200);
            recycleInfo.put("msg","新增预约垃圾回收服务成功");
        }
        return recycleInfo;

        //return recycleService.addRecycle(recycle);
    }

    /*
    * 用户删除预约（取消）
    * */
    @ResponseBody
    @RequestMapping("/deleteRecycle")
    public Map<String,Object> deleteRecycle(Integer id){
        Map<String,Object> recycleInfo=new HashMap<>();
        int rows=recycleService.deleteRecycle(id);
        if (rows>0){
            recycleInfo.put("code",200);
            recycleInfo.put("msg","删除预约垃圾回收服务成功");
        }
        return recycleInfo;
    }

    /*
    * 用户修改预约信息
    * */
    @ResponseBody
    @RequestMapping("/updateRecycle")
    public Map<String,Object> updateRecycle(Recycle recycle){
        Map<String,Object> recycleInfo=new HashMap<>();
        int rows=recycleService.updateRecycle(recycle);
        if (rows>0){
            recycleInfo.put("code",200);
            recycleInfo.put("msg","修改预约垃圾回收服务信息成功");
        }
        return recycleInfo;
    }

}
