package co.igorski.hateoasdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Switch extends ResourceSupport {
    private int switchId;
    private String label;
    private State state;
}
