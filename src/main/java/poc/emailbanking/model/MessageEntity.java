package poc.emailbanking.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MessageEntity {

//    private final LocalDateTime timestamp;
    private final RequisicaoRelatorio message;
}
