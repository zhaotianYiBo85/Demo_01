package com.ityuan.service.impl;

import com.ityuan.dao.RecycleDao;
import com.ityuan.pojo.Recycle;
import com.ityuan.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recycleService")
public class RecycleServiceImpl implements RecycleService {

    @Autowired
    private RecycleDao recycleDao;

    public List<Recycle> findRecycle(Recycle recycle){
        return recycleDao.findRecycle(recycle);
    }

    @Override
    public int addRecycle(Recycle recycle) {
        return recycleDao.addRecycle(recycle);
    }

    @Override
    public int deleteRecycle(Integer id) {
        return recycleDao.deleteRecycle(id);
    }

    @Override
    public int updateRecycle(Recycle recycle) {
        return recycleDao.updateRecycle(recycle);
    }

    @Override
    public List<Recycle> findRecycleByUid(int user_id) {
        return recycleDao.findRecycleByUid(user_id);
    }
}
