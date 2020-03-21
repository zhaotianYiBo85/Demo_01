package com.ityuan.service;

import com.ityuan.pojo.ImagesPath;

import java.util.List;

public interface ImagesPathService {

    public List<ImagesPath> selectByPid(int pro_id);

    int addImagesPath(ImagesPath imagesPath);
}
