package observerPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubjectImpl implements Subject{

    private String state;
    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void setStatus(String status) {
        this.state= status;
        notifyObservers();
    }

    @Override
    public String getStatus() {
        return this.state;
    }

    //Notify method
    public void notifyObservers(){
        Iterator<Observer> iterator = observerList.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer)iterator.next();
            observer.update(this);
        }
    }
}
