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
@Named
public class TechnologyList {
    
    private List<Technology> technology;
    
    @PostConstruct
    public void init(){
        technology = new ArrayList<>();
        
        technology.add(new Technology("C Programing Language", "Denis Riche", "1972"));
        technology.add(new Technology("C++ Programing Language", "Bjarme Stroutsoupe", "1985"));
        technology.add(new Technology("Java Programing Language", "James Gosling", "1995"));
        technology.add(new Technology("Pythone Programing Language", "Guido van Rosum", "1991"));
        
        technology.add(new Technology("C Programing Language", "Denis Riche", "1972"));
        technology.add(new Technology("C++ Programing Language", "Bjarme Stroutsoupe", "1985"));
        technology.add(new Technology("Java Programing Language", "James Gosling", "1995"));
        technology.add(new Technology("Pythone Programing Language", "Guido van Rosum", "1991"));
        
        technology.add(new Technology("C Programing Language", "Denis Riche", "1972"));
        technology.add(new Technology("C++ Programing Language", "Bjarme Stroutsoupe", "1985"));
        technology.add(new Technology("Java Programing Language", "James Gosling", "1995"));
        technology.add(new Technology("Pythone Programing Language", "Guido van Rosum", "1991"));
               
    }
    
}
