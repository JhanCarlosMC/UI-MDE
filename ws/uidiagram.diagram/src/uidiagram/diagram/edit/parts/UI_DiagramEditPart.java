/*
 * 
 */
package uidiagram.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.FontStyleImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import uidiagram.ModelElement;
import uidiagram.diagram.edit.commands.UidiagramCreateShortcutDecorationsCommand;
import uidiagram.diagram.edit.policies.UI_DiagramCanonicalEditPolicy;
import uidiagram.diagram.edit.policies.UI_DiagramItemSemanticEditPolicy;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UI_DiagramEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "Uidiagram"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1000;

	/**
	* @generated
	*/
	public UI_DiagramEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new UI_DiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new UI_DiagramCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(UidiagramVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DiagramDragDropEditPolicy() {
			public Command getDropObjectsCommand(DropObjectsRequest dropRequest) {
				ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();
				for (Iterator<?> it = dropRequest.getObjects().iterator(); it.hasNext();) {
					Object nextObject = it.next();
					if (false == nextObject instanceof EObject) {
						continue;
					}
					viewDescriptors.add(new CreateViewRequest.ViewDescriptor(new EObjectAdapter((EObject) nextObject),
							Node.class, null, getDiagramPreferencesHint()));
				}
				return createShortcutsCommand(dropRequest, viewDescriptors);
			}

			private Command createShortcutsCommand(DropObjectsRequest dropRequest,
					List<CreateViewRequest.ViewDescriptor> viewDescriptors) {
				Command command = createViewsAndArrangeCommand(dropRequest, viewDescriptors);
				if (command != null) {
					return command
							.chain(new ICommandProxy(new UidiagramCreateShortcutDecorationsCommand(getEditingDomain(),
									(View) getModel(), viewDescriptors)));
				}
				return null;
			}
		});
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}
	protected void handleNotificationEvent(Notification arg0) {
		// SET was the type i need
		if (arg0.getEventType() == Notification.SET) {
			// the notifier sends his new Bounds ...
			if (arg0.getNotifier() instanceof BoundsImpl) {
				BoundsImpl notifier = (BoundsImpl) arg0.getNotifier();
				// for my special coordinate mapping i also need the node,
				// so i save it in this variable ...
				NodeImpl node = (NodeImpl) this.getModel();
				// get the corresponding FieldLabel Object from the model
				ModelElement model = (ModelElement) node.getElement();

				if (arg0.getFeature() instanceof EAttributeImpl) {
					// Get the attribute that has changed
					EAttributeImpl attribute = (EAttributeImpl) arg0.getFeature();
					// set the values for x and y in the model

					if (notifier.getWidth() == -1) {
						model.setWidth(120);
					} else {
						model.setWidth(notifier.getWidth());
					}
					if (notifier.getHeight() == -1) {
						model.setHeight(20);
					} else {
						model.setHeight(notifier.getHeight());
					}

					model.setPositionX(notifier.getX());
					model.setPositionY(notifier.getY());

				}
			}

			if (arg0.getNotifier() instanceof FontStyleImpl) {
				FontStyleImpl fontStyleImpl = (FontStyleImpl) arg0.getNotifier();
				int fontColor = fontStyleImpl.getFontColor();
				int fontHeight = fontStyleImpl.getFontHeight();
				String fontName = fontStyleImpl.getFontName();
				boolean bold = fontStyleImpl.isBold();
				NodeImpl node = (NodeImpl) this.getModel();
				ModelElement model = (ModelElement) node.getElement();

				model.setTitleFont("" + fontName);
				model.setStyle("" + bold);
				model.setColor("" + fontColor);
				model.setTitleFontSize("" + fontHeight);

				System.out.println();
			}

		}

		super.handleNotificationEvent(arg0);
	}
}
