/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecankurban.deneme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name="student")
public class Ogrenci {
    
    private int id;
    private String adi;
    private String okulNo;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(length = 200,name="name")
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Column(length = 200,name="schoolnumber")
    public String getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(String okulNo) {
        this.okulNo = okulNo;
    }
    
    
}
