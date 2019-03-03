/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecankurban.denem.util;

import java.util.List;

/**
 *
 * @author vektorel
 */
public interface IDatabase<T> {
    
    
    public boolean kaydet(T temp);
    public boolean guncelle(T temp);
    public boolean sil(T temp);
    public List<T> tumKayitlariGetir(T,temp);
    
    
    
}
