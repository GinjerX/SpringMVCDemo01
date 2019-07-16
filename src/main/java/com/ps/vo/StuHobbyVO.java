package com.ps.vo;

import java.util.List;

public class StuHobbyVO {
    private Integer id;
    private String likes;
    private Integer count;
    private List<StudentVO> studentVOS;

    public StuHobbyVO() {
    }

    public StuHobbyVO(Integer id, String likes, Integer count, List<StudentVO> studentVOS) {
        this.id = id;
        this.likes = likes;
        this.count = count;
        this.studentVOS = studentVOS;
    }

    public List<StudentVO> getStudentVOS() {
        return studentVOS;
    }

    public void setStudentVOS(List<StudentVO> studentVOS) {
        this.studentVOS = studentVOS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
