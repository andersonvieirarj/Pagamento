package impressao;

public interface Impressora {
    // Ela vai imprimir qualquer documento, não me interessando qual tipo
    // de documento está sendo recebido
    // Todos os métodos das interfaces são abstratos e não possuem
    // implementação aqui.

    public void imprimir (Imprimivel X);

    // Este método vai servir para imprimir um documento
    // Que documento é esse? Ele vem da interface IMPRIMIVEL
}
