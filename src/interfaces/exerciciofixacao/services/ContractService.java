package interfaces.exerciciofixacao.services;

import interfaces.exerciciofixacao.entities.Contract;
import interfaces.exerciciofixacao.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    //Injeção de dependencia
    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i < months; i++) {
            // 1) data de vencimento: i meses depois da data do contrato
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // 2) aplica juros (1% ao mês * i meses)
            double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);

            // 3) aplica taxa de pagamento (2% em cima do valor com juros)
            double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);

            // 4) cria a parcela e adiciona ao contract
            Installment installment = new Installment(dueDate, fullQuota);
            contract.addInstallment(installment);
        }

    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
}
