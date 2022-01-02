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

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
public class IdleMonitor {
    
    public void onIdle(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Start Work!!", "If you want stll work here"));
    }
    
    public void onActive() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You are Active", "Good for you"));
    }
}
