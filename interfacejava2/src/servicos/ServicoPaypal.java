package servicos;

public class ServicoPaypal implements ServicoDePagamentoOnline {

    private static final double porcentagemDaTaxa = 0.02; 
    private static final double jurosMesal = 0.01; 
    /*Você pode ter uma declaração de campo que seja estático e final
     ao mesmo tempo. Neste caso temos um campo constante(variável de classe). 
     Já que você tem uma valor único para toda a aplicação e ele não pode 
     ser modificado. Com static final o compilador Java pode substituir 
     o uso do campo pelo seu valor  em tempo de compilação alcançando uma otimização.
    */
    @Override
    public double taxaDeJuros(double valor) {
        
        return valor * porcentagemDaTaxa;
    }

    @Override
    public double juros(double valor, int meses) {
        
        return valor * jurosMesal * meses;
    }

    
}