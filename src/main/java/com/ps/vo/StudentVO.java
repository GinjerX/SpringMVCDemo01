package com.ps.vo;

import java.util.List;

public class StudentVO {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private StuHobbyVO stuHobbyVO;

    private Integer number;//宿舍编号
    private String address;//宿舍楼地址
    private Integer dormId;//宿舍id
    private List<StuHobbyVO> hobbylist;//爱好列表
    private String [] hobbys;//

    public StudentVO(Integer id, String name, Integer age, String sex, StuHobbyVO stuHobbyVO, Integer number, String address, Integer dormId, List<StuHobbyVO> hobbylist, String[] hobbys) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuHobbyVO = stuHobbyVO;
        this.number = number;
        this.address = address;
        this.dormId = dormId;
        this.hobbylist = hobbylist;
        this.hobbys = hobbys;
    }

    public StudentVO() {
    }

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public StuHobbyVO getStuHobbyVO() {
        return stuHobbyVO;
    }

    public void setStuHobbyVO(StuHobbyVO stuHobbyVO) {
        this.stuHobbyVO = stuHobbyVO;
    }

    public List<StuHobbyVO> getHobbylist() {
        return hobbylist;
    }

    public void setHobbylist(List<StuHobbyVO> hobbylist) {
        this.hobbylist = hobbylist;
    }

    public Integer getDormId() {
        return dormId;
    }

    public void setDormId(Integer dormId) {
        this.dormId = dormId;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
