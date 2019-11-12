package sample;

public abstract class Subject {
    private Observer[] _observers = new Observer[7];
    private int totalObs =0;
    public void attach(Observer o){
        _observers[totalObs++] = o;
    }
    public void Notify(){
        for (int i=0;i<totalObs;i++){
            _observers[i].update();
        }
    }
    public int getMultiplicationState(){return 0;}
    public int getAdditionState(){return 0;}
    public int getDivisionState(){return 0;}

    public void setState(int x, int y){}//this may cause issues

}
