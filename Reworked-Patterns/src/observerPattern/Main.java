package observerPattern;

public class Main {
    public static void main(String[] args) {
        //Creating Observers.
        Observer observerOne = new ObserverImpl("Observer 1");
        Observer observerTwo = new ObserverImpl("Observer 2");
        Observer observerThree = new ObserverImpl("Observer 3");
        Observer observerFour = new ObserverImpl("Observer 4");

        //Creating subject
        Subject subject = new SubjectImpl();

        //Registering the created observers.
        subject.registerObserver(observerOne);
        subject.registerObserver(observerTwo);
        subject.registerObserver(observerThree);
        subject.registerObserver(observerFour);

        //Setting State to the subject
        subject.setStatus("New state");
    }
}
