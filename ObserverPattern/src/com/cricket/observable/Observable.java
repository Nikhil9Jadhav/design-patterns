package com.cricket.observable;

import com.cricket.observer.Observer;

public interface Observable {
	void registerObeserver(Observer object);
	void deRegisterObserver(Observer object);
	void notifyObservers();
}
