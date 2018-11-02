package co.igorski.hateoasdemo;

import co.igorski.hateoasdemo.model.ControlPanel;
import co.igorski.hateoasdemo.model.State;
import co.igorski.hateoasdemo.model.Switch;
import co.igorski.hateoasdemo.model.resources.ControlPanelResource;
import co.igorski.hateoasdemo.model.resources.SwitchResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class HateoasDemoApplication {

	public static final HashMap<Integer, ControlPanel> CONTROL_PANELS = new HashMap<>();
	public static void main(String[] args) {
		SpringApplication.run(HateoasDemoApplication.class, args);
	}

	@PostConstruct
	public void createControlPanels() {
		HashMap<Integer, Switch> lightSwitches = new HashMap<>();

		lightSwitches.put(1, new Switch(1, "Bedroom", State.OFF));
		lightSwitches.put(2, new Switch(2, "Living Room", State.OFF));
		lightSwitches.put(3, new Switch(3, "Bathroom", State.OFF));

		ControlPanel lightControlPanel = new ControlPanel(1, lightSwitches, State.OFF);

		HashMap<Integer, Switch> appliancesControls = new HashMap<>();

		appliancesControls.put(1, new Switch(1, "Fridge", State.ON));
		appliancesControls.put(2, new Switch(2, "Coffee Maker", State.OFF));
		appliancesControls.put(3, new Switch(3, "Oven", State.OFF));

		ControlPanel appliancesControlPanel = new ControlPanel(2, appliancesControls, State.ON);

		CONTROL_PANELS.put(1, lightControlPanel);
		CONTROL_PANELS.put(2, appliancesControlPanel);
	}

}
