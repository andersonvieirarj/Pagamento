package impressao;

public class HP implements Impressora{

    @Override
    public void imprimir(Imprimivel X) {
        System.out.println("***********************");
        System.out.println("Nota Fiscal - Loja XPTO");
        System.out.println(X.getCabecalhoNF());
        System.out.println(X.getCorpoNF());
        System.out.println("Impresso na HP");
    }
}
