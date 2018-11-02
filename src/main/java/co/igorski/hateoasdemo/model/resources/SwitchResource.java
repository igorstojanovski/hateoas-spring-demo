package co.igorski.hateoasdemo.model.resources;

import co.igorski.hateoasdemo.controllers.SwitchController;
import co.igorski.hateoasdemo.model.Switch;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

public class SwitchResource extends ResourceSupport {

    private final Switch controlSwitch;

    public SwitchResource(Switch controlSwitch, int controlPanelId) {
        this.controlSwitch = controlSwitch;
        ControllerLinkBuilder onLinkBuilder = linkTo(methodOn(SwitchController.class).turnOn(controlPanelId, controlSwitch.getSwitchId()));
        ControllerLinkBuilder offLinkBuilder = linkTo(methodOn(SwitchController.class).turnOff(controlPanelId, controlSwitch.getSwitchId()));
        add(onLinkBuilder.withRel("on"));
        add(offLinkBuilder.withRel("off"));
    }
}
