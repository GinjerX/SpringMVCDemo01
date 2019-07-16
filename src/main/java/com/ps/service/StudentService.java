package com.ps.service;

import com.ps.vo.StuHobbyVO;
import com.ps.vo.StudentVO;

import java.util.List;

public interface StudentService {
    //新增
    void insert(StudentVO studentVO);
    //修改
    void update(StudentVO studentVO);
    //查询
    List<StudentVO> queryStu();
    //删除
    void delete(Integer id);
    //统计爱好的人数
    List<StuHobbyVO> hobbyStu();

    List<StudentVO> listQueryhabby();
}
