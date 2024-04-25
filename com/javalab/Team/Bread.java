package com.javalab.Team;

public class Bread {
    // 멤버 변수(속성)
    String store; // 빵가게(상호)
    String type; // 빵의 종류(ex:단팥빵)
    String storegion; // 빵가게 위치
    int price; // 빵의 가격
    boolean choco; // 초코가 있는 빵이면 트루
    boolean cream; // 생크림이 있는 빵이면 트루
    double starpoint; // 별점

    // 생성자
    public Bread(String store, String type, String storegion, int price, boolean choco, boolean cream,double starpoint) {
        this.store = store;
        this.type = type;
        this.storegion = storegion;
        this.price = price;
        this.choco = choco;
        this.cream = cream;
        this.starpoint = starpoint;
    }

}