package fr.cnam.mydesignpatterns.observer;

import java.util.Vector;

public class MyObservervableImp1 implements MyObservable {

    private Vector <MyObserver> observers;

    public MyObservervableImp1() {
        this.observers=new Vector<MyObserver>();
    }

    @Override
    public void registerObserver(MyObserver a_My_observer) {
        this.observers.add(a_My_observer);
    }

    @Override
    public void unregisterObserver(MyObserver a_My_observer) {
        this.observers.remove(a_My_observer);
    }

    @Override
    public void notifyObservers() {

        for (MyObserver obs:this.observers) {
            obs.notifyMe();
        }
    }
}
