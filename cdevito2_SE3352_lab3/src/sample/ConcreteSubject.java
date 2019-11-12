package sample;

public class ConcreteSubject extends Subject {
    private int state1;
    private int state2;

    public void setState(int x, int y)
    {
        state1 =x;
        state2 = y;
        Notify();
    }

    public int getAdditionState()
    {
        return state1 + state2;
    }
    public int getMultiplicationState()
    {
        return state1 * state2;
    }
    public int getDivisionState()
    {
        return state1 / state2;
    }
}
