/**
 * @(#) MyObservable.java
 */

package fr.cnam.mydesignpatterns.observer;

public interface MyObservable
{
	void registerObserver( MyObserver a_My_observer);
	
	void unregisterObserver( MyObserver a_My_observer);
	
	void notifyObservers( );
	
	
}
