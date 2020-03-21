package com.ityuan.dao;

import com.ityuan.pojo.Evaluate;

import java.util.List;

public interface EvaluateDao {
    //根据用户id查询评价详情
    List<Evaluate> findEvaluateById(Integer user_id);

    //根据商品id查询评价详情
    List<Evaluate> findEvaluateByProId(Integer pro_id);

    int deleteEvaluate(Integer eva_id);

    int addEvaluate(Evaluate evaluate);

    int updataEvaluate(Evaluate evaluate);
}
