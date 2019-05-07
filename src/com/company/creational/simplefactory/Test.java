package com.company.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        VideoFactory videoFactory=new VideoFactory();
//
//        Video video=videoFactory.getVideo("java");
//        if (video==null){
//            return;//如果为控return掉，防止报空指针
//        }
//        video.produce();

        VideoFactory videoFactory=new VideoFactory();

        Video video=videoFactory.getVideo(JavaVideo.class);
        if (video==null){
            return;//如果为控return掉，防止报空指针
        }
        video.produce();



    }
}
