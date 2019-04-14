// Use inheritance: static

// A is the core object.
class A {
    public void doIt() {
        System.out.print("A");
    }
}

class AB extends A {
    public void doIt() {
        super.doIt();
        doB();
    }

    private void doB() {
        System.out.print("B");
    }
}

class ABC extends AB {
    public void doIt() {
        super.doIt();
        doC();
    }

    private void doC() {
        System.out.print("C");
    }
}

interface I {
    void doIt();
}

abstract class Abs implements I {
    private I core;
    
    public Abs(I core) {
        this.core = core;
    }

    public void doIt() {
        core.doIt();
    }
}

// X is the core functionality
class X implements I {
    public void doIt() {
        System.out.print("X");
    }
}

class Y extends Abs {
    public Y(I core) {
        super(core);
    }

    public void doIt() {
        super.doIt();
        doY();
    }

    private void doY() {
        System.out.print("Y");
    }
}

class Z extends Abs {
    public Z(I core) {
        super(core);
    }

    public void doIt() {
        super.doIt();
        doZ();
    }

    private void doZ() {
        System.out.print("Z");
    }
}



public class DecoratorDemo {
    public static void main(String[] args) {
        System.out.println("============Inheritance Based===========");
        ABC abc = new ABC();
        abc.doIt();
        System.out.println();

        System.out.println("============Decorator Pattern===========");
        Z z = new Z(new Y(new X()));
        z.doIt();
        System.out.println();
    }
}