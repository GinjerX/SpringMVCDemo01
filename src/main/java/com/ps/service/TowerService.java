package com.ps.service;

import com.ps.vo.TowerVO;

import java.util.List;

public interface TowerService {
    //新增
    void insert(TowerVO vo);
    //修改
    void update(TowerVO vo);
    //查询
    List<TowerVO> query();
    //删除
    void delete(Integer id);
}
