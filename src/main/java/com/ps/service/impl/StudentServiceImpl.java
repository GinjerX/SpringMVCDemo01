package com.ps.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ps.mapper.StudentMapper;
import com.ps.service.StudentService;
import com.ps.vo.StuHobbyVO;
import com.ps.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;
    //学生修改
    public void update(StudentVO studentVO){
        studentMapper.update(studentVO);
    }
    //学生查询
    public List<StudentVO> queryStu(){

        PageHelper.startPage(1,5);
        List<StudentVO> studentVOS = studentMapper.studentQuery();
        PageInfo pageInfo = new PageInfo(studentVOS);
        pageInfo.getTotal();//总数
        pageInfo.getPages();//页数

        return studentVOS;

    }
    //学生删除
    public void delete(Integer id){
        studentMapper.delete(id);
    }

    @Override
    public List<StuHobbyVO> hobbyStu() {
        List<StuHobbyVO> stuHobbyVOS = studentMapper.hobbyStu();
        return stuHobbyVOS;
    }

    //学生新增
    public void insert(StudentVO studentVO){

        studentMapper.insert(studentVO);
    }
    public List<StudentVO> listQueryhabby(){
        List<StudentVO> studentVOS = studentMapper.listQueryhabby();
        return studentVOS;
    }
}
