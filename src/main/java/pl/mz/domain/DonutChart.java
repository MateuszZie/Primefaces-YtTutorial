/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.chart.*;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Mateusz
 */
@Named
@Getter
@Setter
@RequestScoped
public class DonutChart {
    private DonutChartModel donutChartModel;
    private DonutChartModel donutChartModel2;
    
    @PostConstruct
    private void init(){
        createDonutModel();
    }

    private void createDonutModel() {
        donutChartModel = initDonut();
        donutChartModel.setTitle("Donut Chart");
        donutChartModel.setLegendPosition("w");

        donutChartModel2 = initDonut();
        donutChartModel2.setTitle("Donut Custom Chart");
        donutChartModel2.setLegendPosition("ne");
        donutChartModel2.setShadow(false);
        donutChartModel2.setSliceMargin(2);
        donutChartModel2.setShowDataLabels(true);
        donutChartModel2.setDataFormat("value");
               
    }

    private DonutChartModel initDonut() {
        DonutChartModel donutChartModel = new DonutChartModel();

        Map<String, Number> data = new LinkedHashMap<>();
        
        data.put("JAVA", 200);
        data.put("PYTHON", 220);
        data.put("PHP", 180);
        data.put("C++", 170);
        
        donutChartModel.addCircle(data);
        
        data = new LinkedHashMap<>();
        
        data.put("JAVA", 230);
        data.put("PYTHON", 240);
        data.put("PHP", 160);
        data.put("C++", 140);

        donutChartModel.addCircle(data);
        
        data = new LinkedHashMap<>();
        
        data.put("JAVA", 350);
        data.put("PYTHON", 250);
        data.put("PHP", 140);
        data.put("C++", 110);

        donutChartModel.addCircle(data);
        return donutChartModel;
    }
}
