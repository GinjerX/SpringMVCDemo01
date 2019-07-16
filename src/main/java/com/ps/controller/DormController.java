package com.ps.controller;

import com.ps.service.DormService;
import com.ps.vo.DormVO;
import com.ps.vo.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/dorm")
public class DormController {
    @Autowired
    private DormService dormService;

    @RequestMapping("/queryStu")
    @ResponseBody
    public MessageVO queryStu(){
        MessageVO mes= new MessageVO();
        List<DormVO> list = dormService.query();
        if(list!=null){

            mes.setData(list);
        }
        mes.setCode(200);

        return mes;
    }
    @RequestMapping("/add")
    @ResponseBody
    public MessageVO add(@RequestBody DormVO vo){
        System.out.println(vo);
        MessageVO mes = new MessageVO();
        if(vo!=null){
            dormService.insert(vo);
            mes.setMsg("增加成功");
        }
        return mes;
    }
    @RequestMapping("/deleteId")
    @ResponseBody
    public MessageVO delete(int id){
        MessageVO mes = new MessageVO();
        dormService.delete(id);
        mes.setMsg("删除成功");
        return mes;
    }
    @RequestMapping("/update")
    @ResponseBody
    public MessageVO updateId(@RequestBody DormVO vo){
        MessageVO mes = new MessageVO();
        if(vo !=null){
            dormService.update(vo);
            mes.setMsg("修改成功");
        }else{
            mes.setMsg("修改的数据不存在");
        }

        return mes;
    }

    /**
     * 统计宿舍人数
     * @return
     */
    @RequestMapping("/countQuery")
    @ResponseBody
    public MessageVO countQuery(){
        MessageVO mes =  new MessageVO();
        List<DormVO> dormVOS = dormService.countQuery();
        if(dormVOS!=null){
            mes.setData(dormVOS);
            mes.setMsg("查询成功");
        }
        return mes;
    }

}
