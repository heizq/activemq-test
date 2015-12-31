package hei.activemq.alerts.domain;

import java.io.Serializable;

/**
 * Created by heizhiqiang on 2015/12/31 0031.
 */
public class Person implements Serializable{

    private String id;

    private String name;

    private String cellphone;

    private String addr;

    private int star;

    public Person(){

    }

    public Person(String id, String name, String cellphone, String addr) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
        this.addr = addr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", addr='" + addr + '\'' +
                ", star=" + star +
                '}';
    }
}
