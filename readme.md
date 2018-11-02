Response before adding extends ResourceSupport:

        {
            "1": {
                "id": 1,
                "switches": {
                    "1": {
                        "id": 1,
                        "label": "Bedroom",
                        "state": "OFF"
                    },
                    "2": {
                        "id": 2,
                        "label": "Living Room",
                        "state": "OFF"
                    },
                    "3": {
                        "id": 3,
                        "label": "Bathroom",
                        "state": "OFF"
                    }
                },
                "state": "OFF"
            },
            "2": {
                "id": 1,
                "switches": {
                    "1": {
                        "id": 1,
                        "label": "Fridge",
                        "state": "ON"
                    },
                    "2": {
                        "id": 2,
                        "label": "Coffee Maker",
                        "state": "OFF"
                    },
                    "3": {
                        "id": 3,
                        "label": "Oven",
                        "state": "OFF"
                    }
                },
                "state": "ON"
            }
        }

After adding extends ResourceSupport there was an exception:

Error:(16, 18) java: getId() in co.igorski.hateoasdemo.model.ControlPanel cannot implement getId() in org.springframework.hateoas.Identifiable
  return type java.lang.Long is not compatible with org.springframework.hateoas.Link
    - clash with the field called id in the models
    response after: 

    {
    "1": {
        "panelId": 1,
        "switches": {
            "1": {
                "switchId": 1,
                "label": "Bedroom",
                "state": "OFF",
                "links": []
            },
            "2": {
                "switchId": 2,
                "label": "Living Room",
                "state": "OFF",
                "links": []
            },
            "3": {
                "switchId": 3,
                "label": "Bathroom",
                "state": "OFF",
                "links": []
            }
        },
        "state": "OFF",
        "links": []
    },
    "2": {
        "panelId": 1,
        "switches": {
            "1": {
                "switchId": 1,
                "label": "Fridge",
                "state": "ON",
                "links": []
            },
            "2": {
                "switchId": 2,
                "label": "Coffee Maker",
                "state": "OFF",
                "links": []
            },
            "3": {
                "switchId": 3,
                "label": "Oven",
                "state": "OFF",
                "links": []
            }
        },
        "state": "ON",
        "links": []
    }
}


