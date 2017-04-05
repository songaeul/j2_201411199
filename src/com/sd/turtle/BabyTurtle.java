package com.sd.turtle;

import java.util.Observable;//����������.
import java.util.Observer;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class BabyTurtle extends Observable{
  Turtle baby;//��������� ���,Turtle�� ����̾ƴ� �Ӽ����� ���
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
    o.update(this,1);//1�� �ƹ��ǹ̰� ����.
  }   
  protected void setChanged(){//����(�µ�)�� �ٲ� �θ��� �Լ�
    myCurpos=baby.getPos();//������ ��ġ�� �޾ƿ��� ��.
    //notifyObservers(); main�Լ����� �θ��ڴ�.
  }
  public void move(int x, int y){//Turtle�� moveto�� ������ ���������� �̰� ����
    baby.moveTo(x,y);
  }
}