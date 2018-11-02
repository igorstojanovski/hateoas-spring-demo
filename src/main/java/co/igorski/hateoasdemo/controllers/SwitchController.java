package co.igorski.hateoasdemo.controllers;

import co.igorski.hateoasdemo.HateoasDemoApplication;
import co.igorski.hateoasdemo.model.State;
import co.igorski.hateoasdemo.model.Switch;
import co.igorski.hateoasdemo.model.resources.SwitchResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlPanel/{controlPanelId}/switch")
public class SwitchController {

    @GetMapping("/{switchId}/on")
    public SwitchResource turnOn(@PathVariable int controlPanelId, @PathVariable int switchId) {
        Switch aSwitch = HateoasDemoApplication.CONTROL_PANELS.get(controlPanelId).getSwitches().get(switchId);
        changeState(State.ON, aSwitch);
        return new SwitchResource(aSwitch, controlPanelId);
    }

    @GetMapping("/{switchId}/off")
    public SwitchResource turnOff(@PathVariable int controlPanelId, @PathVariable int switchId) {
        Switch aSwitch = HateoasDemoApplication.CONTROL_PANELS.get(controlPanelId).getSwitches().get(switchId);
        changeState(State.OFF, aSwitch);
        return new SwitchResource(aSwitch, controlPanelId);
    }

    private void changeState(State off, Switch aSwitch) {
        aSwitch.setState(off);
    }
}
