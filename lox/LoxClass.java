package lox;

import java.util.List;
import java.util.Map;

class LoxClass implements LoxCallable {
    final String name;
    
    LoxClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Object call(Interpreter interpreter, List<Object> arguments) {
        // Create a new instance of the class
        LoxInstance instance = new LoxInstance(this);
        return instance;
    }

    @Override
    public int arity() {
        // Assuming classes have no parameters for now
        return 0;
    }

}
