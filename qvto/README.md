# PlantUML to UML Transformation

## Installation

1. Install the [Eclipse Modelling Framework](https://www.eclipse.org/modeling/)
1. Install [QVT Operational](https://marketplace.eclipse.org/content/qvt-operational) via the marketplace
1. Open this folder in an Eclipse instance where the PlantUML DSL is installed! For example:
    1. Run the XText Project in its own Eclipse Application as detailed in the [XText Readme](../xtext/README.md)
1. Set up a run configuration like this:
    1. In (source): `platform:/resource/plantuml-to-uml/models/example.plantuml`
    1. In (primitives): `pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml`
    1. Out (target): `platform:/resource/plantuml-to-uml/models/example.uml`
    [Run Configuration Image](../docs/run-configuration.png)
1. Run the transformation