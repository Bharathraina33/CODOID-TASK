package Programmings;

interface Interface1 {
    void doSomething();
}

interface Interface2 {
    void doSomething();
}

public class MyClass implements Interface1, Interface2 {
    @Override
    public void doSomething() {
        // Implementation for both Interface1 and Interface2 methods
    }
}

