package com.interfaces;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer{

    @Override
    public void play(){
        System.out.println("Play...");
    }

    @Override
    public void pause(){
        System.out.println("Pause");
    }
    @Override
    public void capture(){
        System.out.println("capture");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }
}
