package com.ityuan.service;

import com.ityuan.pojo.Recycle;

import java.util.List;

public interface RecycleService {

     List<Recycle> findRecycle(Recycle recycle);

    int addRecycle(Recycle recycle);

    int deleteRecycle(Integer id);

    int updateRecycle(Recycle recycle);

    List<Recycle> findRecycleByUid(int user_id);
}
