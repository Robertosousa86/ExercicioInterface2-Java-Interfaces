package entidades;

import java.text.SimpleDateFormat;

import java.util.Date;


public class Prestacoes {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataDeVencimento;
    private Double valorDaPrestacao;

    public Prestacoes() {
    }

    public Prestacoes(Date dataDeVencimento, Double valorDaPrestacao) {
        this.dataDeVencimento = dataDeVencimento;
        this.valorDaPrestacao = valorDaPrestacao;
    }

    public Date getDataDeVencimento() {
        return this.dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Double getValorDaPrestacao() {
        return this.valorDaPrestacao;
    }

    public void setValorDaPrestacao(Double valorDaPrestacao) {
        this.valorDaPrestacao = valorDaPrestacao;
    }

    @Override
    public String toString() {
        return sdf.format(dataDeVencimento) + " - " + String.format("%.2f", valorDaPrestacao);
    }

    
    
    
}