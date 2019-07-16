package com.ps.controller;

import com.ps.service.TowerService;
import com.ps.vo.MessageVO;
import com.ps.vo.TowerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tower")
public class TowerController {
    @Autowired
    private TowerService towerService;

    @RequestMapping("/query")
    @ResponseBody
    public MessageVO queryStu(){
        MessageVO mes= new MessageVO();
        List<TowerVO> list = towerService.query();
        mes.setCode(200);
        mes.setData(list);
        System.out.println(list);
        return mes;
    }
    @RequestMapping("/add")
    @ResponseBody
    public MessageVO add(@RequestBody TowerVO vo){
        System.out.println(vo);
        MessageVO mes = new MessageVO();
        towerService.insert(vo);
        mes.setMsg("增加成功");
        return mes;
    }
    @RequestMapping("/deleteId")
    @ResponseBody
    public MessageVO delete(int id){
        MessageVO mes = new MessageVO();
        towerService.delete(id);
        mes.setMsg("删除成功");
        return mes;
    }
    @RequestMapping("/update")
    @ResponseBody
    public MessageVO updateId(@RequestBody TowerVO vo){
        MessageVO mes = new MessageVO();
        towerService.update(vo);
        mes.setMsg("修改成功");
        return mes;
    }
}
