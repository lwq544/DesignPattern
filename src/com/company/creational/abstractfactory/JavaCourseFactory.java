package com.company.creational.abstractfactory;
/*
    产品族工厂
 */
public class JavaCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
