package com.ehi.designPattren.CreatePattern.FactoryPattern.abstractFactory.shap;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 15:40
 * @Description: TODO
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
