/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mz.domain;

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
public class BubbleChart {
    private BubbleChartModel bubbleChartModel;
    private BubbleChartModel bubbleChartModel2;
    
    @PostConstruct
    private void init(){
        createBubbleModel();
    }

    private void createBubbleModel() {
        bubbleChartModel = initBubble();
        bubbleChartModel.setTitle("Bubble Chart");
        bubbleChartModel.getAxis(AxisType.X).setLabel("Price");
        Axis axis = bubbleChartModel.getAxis(AxisType.Y);
        axis.setMin(0);
        axis.setMax(300);
        axis.setLabel("Labels");

        bubbleChartModel2 = initBubble();
        bubbleChartModel2.setTitle("Bubble Chart with Custom Options");
        bubbleChartModel2.setShadow(false);
        bubbleChartModel2.setBubbleGradients(true);
        bubbleChartModel.setBubbleAlpha(0.8);
        bubbleChartModel2.getAxis(AxisType.X).setLabel("Price");
         axis = bubbleChartModel2.getAxis(AxisType.Y);
        axis.setMin(0);
        axis.setMax(300);
        axis.setLabel("Labels");
        axis.setTickAngle(50);

               
    }

    private BubbleChartModel initBubble() {
        BubbleChartModel bubbleChartModel = new BubbleChartModel();

        bubbleChartModel.add(new BubbleChartSeries("Java", 50, 100, 120));
        bubbleChartModel.add(new BubbleChartSeries("Pythone", 100, 200, 40));
        bubbleChartModel.add(new BubbleChartSeries("Net", 75, 150, 80));
        bubbleChartModel.add(new BubbleChartSeries("Php", 305, 200, 200));
        bubbleChartModel.add(new BubbleChartSeries("C", 150, 200, 100));
        bubbleChartModel.add(new BubbleChartSeries("C++", 520, 120, 240));
        return bubbleChartModel;
    }
}
