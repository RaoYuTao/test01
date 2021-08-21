package com.bjpowernode.vo;

/**
 * @ClassName StudentAndClassVo2
 * @Description TODO
 * @Author Eelit
 * @Date 2021/8/21 16:25
 * @Version 1.0
 */
public class StudentAndClassVo2 {
    //学生
    private Integer sno;
    private String sname;
    private Integer scno;
    private String sclassname;

    //班级
    private Integer ccno;
    private String cclassname;

    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getScno() {
        return scno;
    }

    public void setScno(Integer scno) {
        this.scno = scno;
    }

    public String getSclassname() {
        return sclassname;
    }

    public void setSclassname(String sclassname) {
        this.sclassname = sclassname;
    }

    public Integer getCcno() {
        return ccno;
    }

    public void setCcno(Integer ccno) {
        this.ccno = ccno;
    }

    public String getCclassname() {
        return cclassname;
    }

    public void setCclassname(String cclassname) {
        this.cclassname = cclassname;
    }

    @Override
    public String toString() {
        return "vo2{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", scno=" + scno +
                ", sclassname='" + sclassname + '\'' +
                ", ccno=" + ccno +
                ", cclassname='" + cclassname + '\'' +
                '}';
    }
}
