package com.sd.turtle;

import java.util.Observable;//정보공급자.
import java.util.Observer;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class BabyTurtle extends Observable{
  Turtle baby;//연관관계로 사용,Turtle을 상속이아닌 속성으로 사용
  ArrayList<Observer> obs;
  Double myCurpos;
  public BabyTurtle(){
    baby = new Turtle();
    myCurpos=baby.getPos();
    obs=new ArrayList<Observer>();
  }
  public void addObserver(Observer o){
    obs.add(o);
  }
  public void notifyObservers(){
    for(Observer o:obs)
    o.update(this,1);//1은 아무의미가 없다.
  }   
  protected void setChanged(){//날씨(온도)가 바뀔때 부르는 함수
    myCurpos=baby.getPos();//현재의 위치를 받아오는 것.
    //notifyObservers(); main함수에서 부르겠다.
  }
  public void move(int x, int y){//Turtle에 moveto가 있지만 교육목적상 이것 쓴다
    baby.moveTo(x,y);
  }
}