package com.ityuan.controller;

import com.ityuan.pojo.ImagesPath;
import com.ityuan.service.ImagesPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/images")
public class ImagesPathController {

    @Autowired
    private ImagesPathService imagesPathService;

    /*
    * 根据商品id 查看图片地址
    * */
    @ResponseBody
    @RequestMapping("/imagesPathByPid")
    public Map<String,Object> selectByPid(int pro_id){
        Map<String,Object> imagesPathInfo=new HashMap<>();
        List<ImagesPath> imagesPaths=imagesPathService.selectByPid(pro_id);

        imagesPathInfo.put("code",200);
        imagesPathInfo.put("msg","查询成功");
        imagesPathInfo.put("imagesPath",imagesPaths);

        return imagesPathInfo;
    }

    /*
    * 上传图片
    * */
    @RequestMapping("/upload")
    public /*Map<String,Object>*/String fileuoload2(HttpServletRequest request, MultipartFile upload,ImagesPath imagesPath) throws Exception {
        System.out.println("springmvc文件上传...");

        Map<String,Object> imagesPathInfo=new HashMap<>();
        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/imagesupload/");
        System.out.println(path);

        // 判断，该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }

        // 说明上传文件项
        // 获取上传文件的名称
        String filename = upload.getOriginalFilename();
        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;
        // 完成文件上传
        upload.transferTo(new File(path,filename));

        imagesPath.setImgPath(path);
        imagesPath.setImgName(filename);
        imagesPath.setPro_id(1);
        int rows=imagesPathService.addImagesPath(imagesPath);

      /*  if (rows>0){
            imagesPathInfo.put("code",200);
            imagesPathInfo.put("msg","上传图片成功");
        }*/
        return "uploadSuccess";
    }

}
