package com.ps.mapper;

import com.ps.vo.StuHobbyVO;
import com.ps.vo.StudentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    //新增
    void insert(StudentVO studentVO);
    //修改
    void update(StudentVO studentVO);
    //查询
    List<StudentVO> studentQuery();
    //删除
    void delete(Integer id);
    //爱好查询
    List<StuHobbyVO> hobbyStu();

    List<StudentVO> listQueryhabby();

}
