/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
@Data
public class SelectManyCheckBox {
   
   private String[] courses, countries, mobiles;
   private List<String> countryList;
   private List<SelectItem> mobileList;
   
   
   @PostConstruct
   public void init(){
       countryList = new ArrayList<>();
       
       countryList.add("Poland");
       countryList.add("German");
       countryList.add("USA");
       countryList.add("Chile");
       countryList.add("China");
       countryList.add("Denmark");
       countryList.add("Sweden");
       countryList.add("France");
       
       SelectItemGroup samsung = new SelectItemGroup("Samsung");
       SelectItemGroup sony = new SelectItemGroup("Sony");
       
       SelectItem samsung1 = new SelectItem("Samsung S1", "Samsung S1");
       SelectItem samsung2 = new SelectItem("Samsung S2", "Samsung S2");
       SelectItem samsung3 = new SelectItem("Samsung S3", "Samsung S3");
       
       SelectItem sony1 = new SelectItem("Sony S1", "Sony S1");
       SelectItem sony2 = new SelectItem("Sony S2", "Sony S2");
       SelectItem sony3 = new SelectItem("Sony S3", "Sony S3");
       
       samsung.setSelectItems(new SelectItem[]{ samsung1, samsung2, samsung3});
       
       sony.setSelectItems(new SelectItem[]{sony1, sony2, sony3});
       
       mobileList = new ArrayList<>();
       mobileList.add(samsung);
       mobileList.add(sony);
              
       
            
   }
}
