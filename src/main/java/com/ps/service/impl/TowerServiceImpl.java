package com.ps.service.impl;

import com.ps.mapper.TowerMapper;
import com.ps.service.TowerService;
import com.ps.vo.TowerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TowerServiceImpl implements TowerService {
    @Autowired
    private TowerMapper towerMapper;

    @Override
    public void insert(TowerVO vo) {
        towerMapper.insert(vo);
    }

    @Override
    public void update(TowerVO vo) {
        towerMapper.update(vo);
    }

    @Override
    public List<TowerVO> query() {
        return towerMapper.query();
    }

    @Override
    public void delete(Integer id) {
        towerMapper.delete(id);
    }
}
