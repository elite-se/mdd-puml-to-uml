# Xtext Domain Specific Language (DSL)

## Installation
Install Xtext as descripted [on the Xtext Download page.](https://www.eclipse.org/Xtext/download.html)
- Choose Help -> Install New Software... from the menu bar and Add....
- Insert `http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/` as URL. This site aggregates all the necessary and optional components and dependencies of Xtext.
- Select the Xtext SDK from the category Xtext and complete the wizard by clicking the Next button until you can click Finish.
- After a quick download and a restart of Eclipse, Xtext is ready to use.

## Run the DSL Editor
1. Import this project into your eclipse workspace
    1. Select Import... -> Existing Projects into Workspace
    2. Navigate to this folder.
    3. Check the "Search for nested Projects" Checkbox and make sure that all 4 sub-projects are checked
    4. Import the projects
2. Generate the Xtext Artifacts by running the mwe2 workflow
    1. Open PlanUML.xtext
    2. Right Click the Editor and choose Run as... -> Generate Xtext Artifacts
3. Run a new Eclipse Instance with the DSL Editor
    1. Right click the root project `elite.mdd.plantuml` in the project explorer
    2. Choose Run as... -> Eclipse Application
4. Create a new generic project and a new File with the extension .plantuml
5. The new file will be opened with the PlantUML Editor and will validate the PlantUML-DSL
