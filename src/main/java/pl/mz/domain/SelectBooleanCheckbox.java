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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mateusz
 */
@Getter
@Setter
@RequestScoped
@Named(value = "sbc")
public class SelectBooleanCheckbox {
    
    private boolean check;
    
    public void addMessage(){
        String message = check ? "Accepted": "Not Accepted";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
    }
}
