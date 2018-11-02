package co.igorski.hateoasdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.Identifiable;

import java.util.HashMap;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ControlPanel implements Identifiable<Integer> {
    private Integer id;
    private HashMap<Integer, Switch> switches;
    private State state;

}
