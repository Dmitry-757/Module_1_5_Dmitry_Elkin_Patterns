package com.Dmitry_Elkin.Patterns.behavioral.iterator;

public class ConcreteAggregate implements IAggregate{
    String[] collection = {"item1", "item2", "item3"};


    @Override
    public IIterator getIterator() {
        return new MyIterator();
    }

    //создадим внутренний класс - потому что
    // 1) он больше нафиг ни где не нужен 2) должен иметь доступ к итерируемой коллекции
    private class MyIterator implements IIterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return (index < collection.length);
        }

        @Override
        public Object next() {
            if (index<=(collection.length-1)){
                return collection[index++];
            }
            return null;
        }
    }
}
