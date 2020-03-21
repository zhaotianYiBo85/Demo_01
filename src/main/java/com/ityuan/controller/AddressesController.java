package com.ityuan.controller;

import com.ityuan.pojo.Addresses;
import com.ityuan.pojo.User;
import com.ityuan.service.AddressesService;
import com.ityuan.service.UserService;
import com.ityuan.utils.JsonMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/address")
public class AddressesController {

    @Autowired
    private AddressesService addressesService;

    @Autowired
    private UserService userService;

    @RequestMapping("/addAddress")
    @ResponseBody
    public JsonMessage addAddress(Addresses addresses, String token){
        try {
            return addressesService.addAddress(addresses,token);
        }catch (Exception ex){
            ex.printStackTrace();
            return JsonMessage.exception();
        }
    }

    @RequestMapping("/deleteAddress")
    @ResponseBody
    public JsonMessage deleteAddress(int addr_id,String token){
        try {
            return addressesService.deleteAddress(addr_id,token);
        }catch (Exception ex){
            ex.printStackTrace();
            return JsonMessage.exception();
        }
    }

    @RequestMapping("/updateAddress")
    @ResponseBody
    public JsonMessage updateAddress(Addresses addresses,String token){
        try {
            return addressesService.updateAddress(addresses,token);
        }catch (Exception ex){
            ex.printStackTrace();
            return JsonMessage.exception();
        }
    }

    @RequestMapping("/selectAddress")
    @ResponseBody
    public JsonMessage selectAddress(String token){
        try {
            User user = userService.selectUserByToken(token);
            return addressesService.selectAddrByUid(user.getUser_id());
        }catch (Exception ex){
            ex.printStackTrace();
            return JsonMessage.exception();
        }
    }
}
