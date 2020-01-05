package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Prestacoes;
import servicos.ContratoDeServico;
import servicos.ServicoPaypal;

public class Principal {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE AS INFORMAÇÕES DO CONTRATO: ");
        System.out.print("Digite o número do contrato: ");
        int numeroContrato = sc.nextInt();
        System.out.print("Digite a data do contrato: (dd/mm/aaaa): ");
        Date dataDoContrato = sdf.parse(sc.next());
        System.out.print("Digite o valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numeroContrato, dataDoContrato, valorTotal);

        System.out.print("Digite o número de contrato(s): ");
        int n = sc.nextInt();

        ContratoDeServico contratoDeServico = new ContratoDeServico(new ServicoPaypal());
        contratoDeServico.contratoEmProcesso(contrato, n);
        
        if (n == 1) {
            System.out.println("PRESTAÇÃO: ");
        } else {
            System.out.println("PRESTAÇÕES: ");
        }

        for (Prestacoes prs : contrato.getPrestacoes()) {
            System.out.println(prs);
        }
        sc.close();

    }
}