/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import lombok.Data;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Mateusz
 */
@Data
@RequestScoped
@Named
public class DatePicker {
    
    private Date date, minDate, maxDate;
    private List<Date> multiDate, disabledDate;
    private List<Integer> disabledDays;
    private Date value = new Date();
    
    
    public void displayDate(SelectEvent<Date> event){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piecked Date", format.format(event.getObject())));
    }
    public void displayDateTime(SelectEvent<Date> event) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piecked Date", format.format(event.getObject())));
    }
    public void displayTime(SelectEvent<Date> event) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piecked Date", format.format(event.getObject())));
    }
    public void displayMultiDate(SelectEvent<List<Date>> event) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for(Date date: event.getObject()){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Piecked Date", format.format(date)));
        }
        
    }
    
    @PostConstruct
    public void init(){
        disabledDate = new ArrayList<>();
        Date today = new Date();
        disabledDate.add(today);
        long oneDay = 24*60*60*1000;
        for(int i = 0; i<3; i++){
            disabledDate.add(new Date(disabledDate.get(i).getTime() + oneDay));
        }
         disabledDays = new ArrayList<>();
        disabledDays.add(0);
        disabledDays.add(3);
        
        minDate = new Date(today.getTime() - oneDay * 30);
        maxDate = new Date(today.getTime() + oneDay * 30);
       
    }
    
}
