class Pessoa {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getPrioridade() {
        if (idade >= 60) {
            return 1;
        } else if (necessidadeEspecial) {
            return 2;
        } else if (gestante || lactante) {
            return 3;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Sexo: " + sexo + ", Idade: " + idade +
                ", Gestante: " + (gestante ? "Sim" : "Não") +
                ", Lactante: " + (lactante ? "Sim" : "Não") +
                ", Necessidade Especial: " + (necessidadeEspecial ? "Sim" : "Não");
    }
}