package com.ps.service.impl;

import com.ps.mapper.DormMapper;
import com.ps.service.DormService;
import com.ps.vo.DormVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormServiceImpl implements DormService {

    @Autowired
    private DormMapper dormMapper;

    @Override
    public void insert(DormVO vo) {
        dormMapper.insert(vo);
    }

    @Override
    public void update(DormVO vo) {
        dormMapper.update(vo);
    }

    @Override
    public List<DormVO> query() {
        return dormMapper.query();
    }

    @Override
    public void delete(Integer id) {
        dormMapper.delete(id);
    }
    @Override
    public List<DormVO> countQuery(){
        //PageHelper.startPage(1,5);
        return dormMapper.countQuery();
    }
}
