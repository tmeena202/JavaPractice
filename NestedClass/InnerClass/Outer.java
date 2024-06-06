package NestedClass.InnerClass;

class Outer {
    // instance variable
    int a;
    //methods
    void get(int a){
        this.a = a;
        System.out.println(this.a);
    }

    class Inner {
        void get1()
        {
            System.out.println(a);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        o.get(10);
        i.get1();
    }
}