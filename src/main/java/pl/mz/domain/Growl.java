/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.io.Serializable;
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
@Named(value = "user")
public class Growl implements Serializable{
    
    private String username, password;
    
    public void displayMessage(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " ,username));
    }
    
}
