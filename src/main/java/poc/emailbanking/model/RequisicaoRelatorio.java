package poc.emailbanking.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequisicaoRelatorio {
    private LocalDateTime dtRequisicaoRelatorio;
    private int cdRequisicaoRelatorio;
    private int cdSistemaProdutoOrigem;
    private char flAtivo;
    private double cdUsuarioCanalCliente;
    private String nuCpf;
    private int cdTipoConta;
    private double nuContaCorrente;
    private int cdBanco;
    private String nmProduto;
    private String nmGrupoRelatorio;
    private String nmRelatorio;
    private String sgTipoFormatoRelatorio;
    private String nmServicoGeracaoRelatorio;
}
