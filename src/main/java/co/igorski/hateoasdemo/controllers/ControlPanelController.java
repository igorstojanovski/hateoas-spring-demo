package co.igorski.hateoasdemo.controllers;

import co.igorski.hateoasdemo.model.resources.ControlPanelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlPanel")
public class ControlPanelController {

    @GetMapping("/{id}")
    public ControlPanelResource getControlPanel(@PathVariable int id) {

        return null;
    }

}
