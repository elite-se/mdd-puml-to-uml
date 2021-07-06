package elite.mdd.plantuml.ui;

import java.io.PrintWriter;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import elite.mdd.plantuml.serializer.SerializerWrapper;

public class PlantUMLEditor extends XtextEditor {
	
	private SerializerWrapper serializeWrapper = new SerializerWrapper();
	
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// See https://www.eclipse.org/forums/index.php/t/487828/
		// and https://www.eclipse.org/forums/index.php/m/786926/
		System.out.println("here we go");
		IXtextDocument document = super.getDocument();
		document.readOnly(new IUnitOfWork.Void<XtextResource>() {

			@Override
			public void process(XtextResource resource) throws Exception {
				String filePath = ResourcesPlugin.getWorkspace().getRoot().getRawLocation().toOSString() + resource.getURI().toPlatformString(true);
				if (resource.getContents().size() == 1 && resource.getErrors().size() == 0) {
					EObject diagram = resource.getContents().get(0);
					String serializedDiagram = serializeWrapper.serialize(diagram);
					try (PrintWriter out = new PrintWriter(filePath + ".puml")) {
					    out.println(serializedDiagram);
					}
				}
			}
		});
		
		super.doSave(progressMonitor);
	}

}
