package lox;

class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        super(null, null, false, false); // Disable stack trace
        this.value = value;
    }

}
