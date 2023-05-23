class Registro {
    int dado;
    Registro anterior;
    Registro proximo;

    public Registro(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
