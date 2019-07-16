package com.ps.mapper;

import com.ps.vo.TowerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TowerMapper {
    //新增
    void insert(TowerVO vo);
    //修改
    void update(TowerVO vo);
    //查询
    List<TowerVO> query();
    //删除
    void delete(Integer id);
}
