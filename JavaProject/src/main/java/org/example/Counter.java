package org.example;

public class Counter implements AutoCloseable{
    public int getCounter() {
        return counter;
    }

    private int counter = 0;

    public Counter(){
        this.counter = 0;
    }

    public void increment(){
        this.counter++;
        System.out.println("Завели питомца. Текущее значение счетчика: "+this.counter);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Ресурс закрыт.");
    }
}
