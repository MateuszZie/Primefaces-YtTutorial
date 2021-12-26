/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Mateusz
 */
@Named
@ViewScoped
@Data
public class AjaxDropDown implements Serializable {

    private Map<String, Map<String, String>> data;
    private String model, brand;
    private Map<String, String> allModel, allBrand;

    @PostConstruct
    public void init() {
        data = new HashMap<>();
        
        allBrand = new HashMap<>();
        allBrand.put("Samsung", "Samsung");
        allBrand.put("Sony", "Sony");
        allBrand.put("Oppo", "Oppo");
        
        Map<String, String> map = new HashMap<>();
        map.put("Samsung S1","Samsung S1");
        map.put("Samsung S2", "Samsung S2");
        map.put("Samsung S3", "Samsung S3");
        data.put("Samsung", map);

        map = new HashMap<>();
        map.put("Sony S1", "Sony S1");
        map.put("Sony S2", "Sony S2");
        map.put("Sony S3", "Sony S3");
        data.put("Sony", map);

        map = new HashMap<>();
        map.put("Oppo S1", "Oppo S1");
        map.put("Oppo S2", "Oppo S2");
        map.put("Oppo S3", "Oppo S3");
        data.put("Oppo", map);          
     
    }
    
    public void setModels(){
        if(StringUtils.isNotBlank(brand)){
            allModel = data.get(brand);
        }else{
            allModel = new HashMap<>();
        }
    }
    public void display(){
        FacesMessage msg;
        if(StringUtils.isBlank(brand)){
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Selected", "Brand not Selected");
        }else if(StringUtils.isBlank(model)){
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Selected", "Model not Selected");   
        }
        else {
            msg = new FacesMessage("Selected", "You choose " + model);
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
