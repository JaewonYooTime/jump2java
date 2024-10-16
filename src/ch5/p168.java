package ch5;

class Updater2 {
    void update (Counter2 counter) {
        counter.count++;
    }
}

class Counter2 {
    int count = 0;
}

public class p168 {
    public static void main(String[] args){
        Counter2 myCounter = new Counter2();
        System.out.println("before update: " + myCounter.count);
        Updater2 myUpdater = new Updater2();
        myUpdater.update(myCounter);
        System.out.println("after update: " + myCounter.count);
    }
}
