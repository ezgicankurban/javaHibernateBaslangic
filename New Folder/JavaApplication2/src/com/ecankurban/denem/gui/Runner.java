/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecankurban.denem.gui;

import com.ecankurban.denem.util.hbUtil;
import com.ecankurban.deneme.model.Ogrenci;
import com.ecankurban.deneme.model.kullanici;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author vektorel
 */
public class Runner {
    
    public static void main(String[] args) {
        Session ss=hbUtil.getSessionFactory().openSession();
        Transaction tt=ss.beginTransaction();
        //Ogrenci temo=new Ogrenci();
        kullanici temp=new kullanici();
        temp.setId(5);
        temp.setKadi("beste");
        temp.setKsoyadi("cankurban");
        
        ss.save(temp);
        tt.commit();
         ss.close();
        
         ss=hbUtil.getSessionFactory().openSession();
        Criteria cr=ss.createCriteria(kullanici.class);
        cr.add(Restrictions.eq("id", 3));
        List<kullanici> liste= cr.list();
        for(kullanici obj : liste){
            System.out.println("" +obj.getKadi() + "    :" + obj.getKsoyadi());
        }
        
        
        
       
    }
    
}
