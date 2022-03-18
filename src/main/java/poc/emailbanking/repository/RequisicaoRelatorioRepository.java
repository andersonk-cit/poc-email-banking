package poc.emailbanking.repository;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import poc.emailbanking.model.RequisicaoRelatorio;

import java.util.List;

@UseClasspathSqlLocator
public interface RequisicaoRelatorioRepository {
    @SqlQuery
    @RegisterBeanMapper(RequisicaoRelatorio.class)
    List<RequisicaoRelatorio> getAll();
}
