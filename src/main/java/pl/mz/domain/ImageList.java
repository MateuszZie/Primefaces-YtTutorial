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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Mateusz
 */
@Getter
@Setter
@RequestScoped
@Named
@AllArgsConstructor
@NoArgsConstructor
public class ImageList {
    
    private List<String> images;
    
    @PostConstruct
    public void init(){
        images = new ArrayList<>();
        images.add("largeStar.png");
        images.add("smallStar.png");
        images.add("star.png");
    }
    
}
