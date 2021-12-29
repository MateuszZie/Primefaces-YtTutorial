/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Mateusz
 */
@Data
@Named
@RequestScoped
public class ToggleSwith {
    
    private Boolean flag = false;
    
    public void message(){
        String check = flag ? "checked" : "unchecked";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(check));
    }
    
}
