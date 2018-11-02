package co.igorski.hateoasdemo.model.resources;

import co.igorski.hateoasdemo.controllers.ControlPanelController;
import co.igorski.hateoasdemo.model.ControlPanel;
import co.igorski.hateoasdemo.model.State;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.Resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Getter
@Setter
@AllArgsConstructor
public class ControlPanelResource extends ResourceSupport {
    private State state;
    private Resources<SwitchResource> switches;

    public ControlPanelResource(ControlPanel controlPanel) {
        this.state = controlPanel.getState();

        add(linkTo(ControlPanelController.class).slash(controlPanel.getId()).withSelfRel());
    }
}
