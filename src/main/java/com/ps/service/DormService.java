package com.ps.service;

import com.ps.vo.DormVO;

import java.util.List;

public interface DormService {
    //新增
    void insert(DormVO vo);
    //修改
    void update(DormVO vo);
    //查询
    List<DormVO> query();
    //删除
    void delete(Integer id);

    List<DormVO> countQuery();
}
