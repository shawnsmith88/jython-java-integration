public class Driver {
    public static void main(String[] args) {
        System.out.println("Hello world from inside Java");
        PythonActions pythonActions = new PythonActions();
        pythonActions.script();
        System.out.println("run directly from a python file:");
        Foo foo = pythonActions.object();
        System.out.println("called from a python object:");
        System.out.println(foo.getBar());
        System.out.println("hardcoded python into java:");
        pythonActions.hardcoded();
    }


}
