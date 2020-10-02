package com.example.designpattern.sample.method;

public abstract class Game {

    public final void play() {
//        初始化游戏
        initialize();
//        加载地图
        loadMap();
//        记载角色
        loadRole();
//        开始游戏
        startPlay();
//        结束游戏
        endPlay();
    }

    protected abstract void initialize();
    protected abstract void loadMap();
    protected abstract void loadRole();
    protected abstract void startPlay();
    protected abstract void endPlay();


}
