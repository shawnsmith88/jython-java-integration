import org.python.util.PythonInterpreter;

import java.io.StringWriter;

public class PythonActions {
    public void script() {
        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        StringWriter output = new StringWriter();
        pythonInterpreter.setOut(output);
        pythonInterpreter.execfile("/home/smitty/Documents/pythonJava/src/main/python/test.py");
    }
    public Foo object() {
        JythonObjectFactory jythonObjectFactory = JythonObjectFactory.getInstance();
        Foo foo = (Foo) jythonObjectFactory.createObject(Foo.class, "Bar");
        return foo;
    }

    public void hardcoded() {
        PythonInterpreter pythonInterpreter = new PythonInterpreter();
        StringWriter output = new StringWriter();
        pythonInterpreter.setOut(output);
        pythonInterpreter.exec("print('hello world from python hardcoded in java')");
    }
}
