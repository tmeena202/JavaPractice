package Abstract_Interface;
// Everything is public by default
interface IF1  {
    // Interface has method but no need to write its body inside interface
    // it is used to achieve complete abstraction & multiple inheritance

    // variable are public, static , final by default
    int x = 0;
    // methods are public and abstract
    void play();
}

interface IF2{
    void pause();
}

class Main1 implements IF1, IF2{
    public void play(){
        System.out.println("music playing");
    }

    public void pause(){
        System.out.println("Music pause");
    }

    public static void main(String[] args) {
        Main1 m = new Main1();
        System.out.println(x);
        m.play();
        m.pause();
    }
}