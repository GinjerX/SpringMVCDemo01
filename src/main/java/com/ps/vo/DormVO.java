package com.ps.vo;

public class DormVO {
    private Integer id;
    private Integer number;
    private Integer tomerId;//所属宿舍楼
    private String towerName;//所属宿舍楼说的名字
    private Integer studentCount;//学生id  （用于统计一个宿舍有多少学生）


    public DormVO() {
    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTomerId() {
        return tomerId;
    }

    public void setTomerId(Integer tomerId) {
        this.tomerId = tomerId;
    }
}
