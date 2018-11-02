package co.igorski.hateoasdemo.model.events;

import co.igorski.hateoasdemo.model.State;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ChangeState {
    State newState;
}
