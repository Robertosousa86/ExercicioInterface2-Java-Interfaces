package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;
    private Date dataDoContrato;
    private Double valorTotal;

    private List<Prestacoes> prestacoes = new ArrayList<>();

    public Contrato() {

    }

    public Contrato(Integer numeroContrato, Date dataDoContrato, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.dataDoContrato = dataDoContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return this.numeroContrato;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataDoContrato() {
        return this.dataDoContrato;
    }

    public void setDataDoContrato(Date dataDoContrato) {
        this.dataDoContrato = dataDoContrato;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prestacoes> getPrestacoes() {
        return prestacoes;
    }

    public void adicionaPrestacoes(Prestacoes prestacao) {
        prestacoes.add(prestacao);
    }

    public void removePrestacoes(Prestacoes prestacao) {
        prestacoes.add(prestacao);
    }
}
