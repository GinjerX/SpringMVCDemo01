package com.ps.mapper;

import com.ps.vo.DormVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DormMapper {
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
