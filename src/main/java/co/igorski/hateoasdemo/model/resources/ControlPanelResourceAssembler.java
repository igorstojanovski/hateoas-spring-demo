package co.igorski.hateoasdemo.model.resources;

import co.igorski.hateoasdemo.model.ControlPanel;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.stream.Collectors;

public class ControlPanelResourceAssembler extends ResourceAssemblerSupport<ControlPanel, ControlPanelResource> {
    /**
     * Creates a new {@link ResourceAssemblerSupport} using the given controller class and resource type.
     *
     * @param controllerClass must not be {@literal null}.
     * @param resourceType    must not be {@literal null}.
     */
    public ControlPanelResourceAssembler(Class<?> controllerClass, Class<ControlPanelResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    public ControlPanelResource toResource(ControlPanel entity) {
        ControlPanelResource resource = createResourceWithId(entity.getId(), entity);
        resource.setState(entity.getState());

        Iterable<SwitchResource> switches = entity.getSwitches().values().
                stream()
                .map(s -> new SwitchResource(s, entity.getId()))
                .collect(Collectors.toList());

        Resources<SwitchResource> switchResources = new Resources<>(switches);
        resource.setSwitches(switchResources);

        return resource;
    }
}
