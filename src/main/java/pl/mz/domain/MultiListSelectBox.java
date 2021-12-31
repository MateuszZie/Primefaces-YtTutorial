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
public class MultiListSelectBox {
 private List<SelectItem> items;
 private String selection = "";
 
 @PostConstruct
 public void init(){
     items = new ArrayList<>();
     
     SelectItemGroup mobile = new SelectItemGroup("Mobile");
     SelectItemGroup tv = new SelectItemGroup("Tv");
     
     SelectItemGroup samsung = new SelectItemGroup("Samsung");
     SelectItemGroup oppo = new SelectItemGroup("Oppo");
     
     SelectItemGroup lg = new SelectItemGroup("Lg");
     
     SelectItem s1 = new SelectItem("Samsung S1");
     SelectItem s2 = new SelectItem("Samsung S2");
     SelectItem s3 = new SelectItem("Samsung S3");
     
     SelectItem o1 = new SelectItem("Oppo X1");
     SelectItem o2 = new SelectItem("Oppo X2");
     SelectItem o3 = new SelectItem("Oppo X3");
     
     SelectItem l1 = new SelectItem("Lg L1");
     SelectItem l2 = new SelectItem("Lg L2");
     
     lg.setSelectItems(new SelectItem[] { l1, l2 });
     
     oppo.setSelectItems(new SelectItem[]{o1, o2, o3});
     
     samsung.setSelectItems(new SelectItem[]{s1, s2, s3});
     
     tv.setSelectItems(new SelectItem[] {lg});
     
     mobile.setSelectItems(new SelectItem[] {samsung, oppo});
     
     items.add(tv);
     
     items.add(mobile);
     
 }
}
