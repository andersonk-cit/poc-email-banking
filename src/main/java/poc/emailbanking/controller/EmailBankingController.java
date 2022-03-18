package poc.emailbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import poc.emailbanking.model.RequisicaoRelatorio;
import poc.emailbanking.publisher.ExamplePublisher;
import poc.emailbanking.repository.RequisicaoRelatorioRepository;

import java.util.List;

@RestController
public class EmailBankingController {
    @Autowired
    private RequisicaoRelatorioRepository repository;

    @Autowired
    private ExamplePublisher publisher;

    @GetMapping()
    public void publish() {
        List<RequisicaoRelatorio> relatorios = repository.getAll();

        relatorios.forEach(relatorio -> publisher.publish(relatorio.toString()));
    }

}
