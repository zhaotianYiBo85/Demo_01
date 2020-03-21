package com.ityuan.service.impl;

import com.ityuan.dao.EvaluateDao;
import com.ityuan.pojo.Evaluate;
import com.ityuan.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("evaluateService")
public class EvaluateServiceImpl implements EvaluateService {

    @Autowired
    private EvaluateDao evaluateDao;
    //根据用户id查询评价详情
    @Override
    public List<Evaluate> findEvaluateById(Integer user_id) {
        return evaluateDao.findEvaluateById(user_id);
    }
    //根据商品id查询评价详情
    @Override
    public List<Evaluate> findEvaluateByProId(Integer pro_id) {
        return evaluateDao.findEvaluateByProId(pro_id);
    }

    @Override
    public int deleteEvaluate(Integer eva_id) {
        return evaluateDao.deleteEvaluate(eva_id);
    }

    @Override
    public int addEvaluate(Evaluate evaluate) {
        return evaluateDao.addEvaluate(evaluate);
    }

    @Override
    public int updataEvaluate(Evaluate evaluate) {
        return evaluateDao.updataEvaluate(evaluate);
    }
}
