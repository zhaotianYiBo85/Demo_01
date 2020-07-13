package com.ityuan.controller;

import com.alibaba.fastjson.JSON;
import com.ityuan.pojo.Order;
import com.ityuan.pojo.OrderSimple;
import com.ityuan.pojo.User;
import com.ityuan.service.OrderService;
import com.ityuan.service.ProductService;
import com.ityuan.service.UserService;
import com.ityuan.utils.JsonMessage;
import com.ityuan.utils.TokenProccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/findOrderDetails")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;

    /*
    * 用户新增订单
    * */
    @ResponseBody
    @RequestMapping(value = "/insertOrder",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public JsonMessage insertOrder(@RequestParam(value = "orderSimples",required = false) String  orderSimples,int addr_id, String token){
        List<OrderSimple> list= JSON.parseArray(orderSimples,OrderSimple.class);
        User user = userService.selectUserByToken(token);
        Order order=new Order();
        int cons=0;//执行成功条数
        try{
            for(int i=0;i<list.size();i++){
                String genId= TokenProccessor.genId();
                order.setOd_id(genId);
                order.setAddr_id(addr_id);
                order.setUser_id(user.getUser_id());
                order.setPro_id(list.get(i).getPro_id());
                order.setPro_num(list.get(i).getOd_num());
                order.setOd_price(productService.selectByProId(list.get(i).getPro_id()).getPro_price()*list.get(i).getOd_num());
                order.setOd_statusStr("待发货");
                /*
                * 根据订单当时状态，储存所需时间
                * */
                order.getOd_statusStr();
                order.setOd_creation_timeStr(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                //  订单状态 0未支付 1已支付 2待发货 3 已发货 4 已完成

               cons= orderService.insertOrder(order,token);
            }

            if(cons>0){
                return JsonMessage.success().add("success", "操作成功");
            }else {
                return JsonMessage.fail().add("fail","操作失败！");
            }

        }catch (Exception e){
            return JsonMessage.exception();
        }

    }

    /*
     * 用户查询自己所有的购物订单记录
     * */
    @ResponseBody
    @RequestMapping(value = "/orderByUId")
    public JsonMessage findOrderByUId(int user_id ){
        try {
            List<Order> order = orderService.findOrderByUId(user_id);
            System.out.println(order);
            return JsonMessage.success().add("order", order);
        } catch (Exception e) {
            return JsonMessage.exception();
        }
    }
    /*
    * 根据订单id查询订单
    * */
    @RequestMapping("/selectByOdId")
    @ResponseBody
    public JsonMessage selectByOid(String od_id) {
        try {
            List<Order> order = orderService.selectByOid(od_id);
            return JsonMessage.success().add("order", order);
        } catch (Exception e) {
            return JsonMessage.exception();
        }
    }
    /*
     * 管理员查询平台所有的购物订单记录
     * */
    @ResponseBody
    @RequestMapping(value = "/order")
    public JsonMessage findOrder(Order order ){
        try {
            List<Order> orders=orderService.findOrder(order);
            return JsonMessage.success().add("orders", orders);
        } catch (Exception e) {
            return JsonMessage.exception();
        }
    }

}
