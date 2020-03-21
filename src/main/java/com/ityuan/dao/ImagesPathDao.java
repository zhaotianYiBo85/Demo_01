package com.ityuan.dao;

import com.ityuan.pojo.ImagesPath;

import java.util.List;

public interface ImagesPathDao {
    List<ImagesPath> selectByPid(int pro_id);

    int addImagesPath(ImagesPath imagesPath);
}
