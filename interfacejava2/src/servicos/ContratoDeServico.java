package servicos;

import java.util.Date;
import java.util.Calendar;

import entidades.Contrato;
import entidades.Prestacoes;

public class ContratoDeServico {

    private ServicoDePagamentoOnline servicoDePagamentoOnline;

    public ContratoDeServico(ServicoDePagamentoOnline servicoDePagamentoOnline) { // Injeção de depêndecia porConstrutor

        this.servicoDePagamentoOnline = servicoDePagamentoOnline; // (Constructor Injection)
    }

    private Date adicionaMeses(Date data, int n) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

    public void contratoEmProcesso(Contrato contrato, int meses) {

        double cotaBasica = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            Date data = adicionaMeses(contrato.getDataDoContrato(), i);
            double cotaAtualizada = cotaBasica + servicoDePagamentoOnline.juros(cotaBasica, i);
            double cotaTotal = cotaAtualizada + servicoDePagamentoOnline.taxaDeJuros(cotaAtualizada);
            contrato.adicionaPrestacoes(new Prestacoes(data, cotaTotal));
        }

    }

}