package com.ityuan.service.impl;

import com.ityuan.dao.ImagesPathDao;
import com.ityuan.pojo.ImagesPath;
import com.ityuan.service.ImagesPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("imagesPathService")
public class ImagesPathServiceImpl implements ImagesPathService {


    @Autowired
    private ImagesPathDao imagesPathDao;

    /*
    * 根据商品id查询图片
    * */
    @Override
    public List<ImagesPath> selectByPid(int pro_id) {
        return imagesPathDao.selectByPid(pro_id);
    }

    /*
    * 新增图片
    * */
    @Override
    public int addImagesPath(ImagesPath imagesPath) {
        return imagesPathDao.addImagesPath(imagesPath);
    }
}
