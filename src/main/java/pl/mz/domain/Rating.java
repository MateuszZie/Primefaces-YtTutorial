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
import org.primefaces.event.RateEvent;

/**
 *
 * @author Mateusz
 */
@Named
@RequestScoped
@Data
public class Rating {
   private Integer basic, callback, ajax;
   private Integer readonly = 3;
   
   public void rate(RateEvent<Integer> event){
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You rate", event.getRating() + " star" ));
   }
   
    public void cancel() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cancel Rating", "your rate was deleted"));
    }
}
