package observerPattern;

public class ObserverImpl implements Observer{

    private String id;
    private String state;

    public ObserverImpl(String id) {
        this.id = id;
    }

    @Override
    public void update(Subject subject) {
        this.state = subject.getStatus();
        System.out.println("Observer Received state changed of subject ID is = "
                + this.id + " Subject = " + this.state);

    }
}
