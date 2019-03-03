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
@Table(name="kullanicii")
public class kullanici {
    private int id;
    private String kadi;
    private String ksoyadi;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 200,name="ad")
    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    @Column(length = 200,name="soyad")
    public String getKsoyadi() {
        return ksoyadi;
    }

    public void setKsoyadi(String ksoyadi) {
        this.ksoyadi = ksoyadi;
    }
    
}
