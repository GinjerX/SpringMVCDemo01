package com.ps.controller;
import com.ps.service.StudentService;
import com.ps.vo.MessageVO;
import com.ps.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryStu")
    public MessageVO queryStu(){
        MessageVO mes= new MessageVO();
        System.out.println("studentService "+studentService);
        List<StudentVO> list = studentService.queryStu();
        mes.setCode(200);
        mes.setData(list);
        System.out.println(list);
        return mes;
    }
    @RequestMapping("/add")
    public MessageVO add(@RequestBody StudentVO stuvo){
        System.out.println(stuvo);
        MessageVO mes = new MessageVO();
        studentService.insert(stuvo);
        mes.setMsg("增加成功");
        return mes;
    }
    @RequestMapping("/deleteId")
    public MessageVO delete(int id){
        MessageVO mes = new MessageVO();
        studentService.delete(id);
        mes.setMsg("删除成功");
        return mes;
    }
    @RequestMapping("/update")
    public MessageVO updateId(@RequestBody StudentVO vo){
        MessageVO mes = new MessageVO();
        studentService.update(vo);
        mes.setMsg("修改成功");
        return mes;
    }

    /**
     * 统计爱好
     * @return
     */
    @RequestMapping("/hobby")
    public MessageVO hobby(){
        MessageVO mes = new MessageVO();
        studentService.hobbyStu();
        mes.setMsg("查询成功");
        return mes;
    }
    @RequestMapping("/likes")
    public MessageVO likes(){
        MessageVO objectMessageVO = new MessageVO<>();
        List<StudentVO> studentVOS = studentService.listQueryhabby();
        objectMessageVO.setMsg("查询成功");
        objectMessageVO.setCode(200);
        objectMessageVO.setData(studentVOS);
        return objectMessageVO;
    }
}
