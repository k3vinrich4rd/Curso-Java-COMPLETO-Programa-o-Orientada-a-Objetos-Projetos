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

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);

            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

            contract.addInstallment(new Installment(dueDate, fullQuota));
        }
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
}
