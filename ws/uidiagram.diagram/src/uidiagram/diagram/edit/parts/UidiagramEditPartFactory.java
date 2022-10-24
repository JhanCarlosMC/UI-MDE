/*
 * 
 */
package uidiagram.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UidiagramVisualIDRegistry.getVisualID(view)) {

			case UI_DiagramEditPart.VISUAL_ID:
				return new UI_DiagramEditPart(view);

			case UserInterfaceEditPart.VISUAL_ID:
				return new UserInterfaceEditPart(view);

			case UserInterfaceNameEditPart.VISUAL_ID:
				return new UserInterfaceNameEditPart(view);

			case TreeviewEditPart.VISUAL_ID:
				return new TreeviewEditPart(view);

			case TreeviewNameEditPart.VISUAL_ID:
				return new TreeviewNameEditPart(view);

			case Treeview2EditPart.VISUAL_ID:
				return new Treeview2EditPart(view);

			case TreeviewName2EditPart.VISUAL_ID:
				return new TreeviewName2EditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case CheckButtonEditPart.VISUAL_ID:
				return new CheckButtonEditPart(view);

			case CheckButtonNameEditPart.VISUAL_ID:
				return new CheckButtonNameEditPart(view);

			case EntryEditPart.VISUAL_ID:
				return new EntryEditPart(view);

			case EntryNameEditPart.VISUAL_ID:
				return new EntryNameEditPart(view);

			case RadioButtonEditPart.VISUAL_ID:
				return new RadioButtonEditPart(view);

			case RadioButtonNameEditPart.VISUAL_ID:
				return new RadioButtonNameEditPart(view);

			case SpinBoxEditPart.VISUAL_ID:
				return new SpinBoxEditPart(view);

			case SpinBoxNameEditPart.VISUAL_ID:
				return new SpinBoxNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case SeparatorEditPart.VISUAL_ID:
				return new SeparatorEditPart(view);

			case SeparatorNameEditPart.VISUAL_ID:
				return new SeparatorNameEditPart(view);

			case ColumnEditPart.VISUAL_ID:
				return new ColumnEditPart(view);

			case ColumnNameEditPart.VISUAL_ID:
				return new ColumnNameEditPart(view);

			case Button2EditPart.VISUAL_ID:
				return new Button2EditPart(view);

			case ButtonName2EditPart.VISUAL_ID:
				return new ButtonName2EditPart(view);

			case Label2EditPart.VISUAL_ID:
				return new Label2EditPart(view);

			case LabelName2EditPart.VISUAL_ID:
				return new LabelName2EditPart(view);

			case CheckButton2EditPart.VISUAL_ID:
				return new CheckButton2EditPart(view);

			case CheckButtonName2EditPart.VISUAL_ID:
				return new CheckButtonName2EditPart(view);

			case Entry2EditPart.VISUAL_ID:
				return new Entry2EditPart(view);

			case EntryName2EditPart.VISUAL_ID:
				return new EntryName2EditPart(view);

			case RadioButton2EditPart.VISUAL_ID:
				return new RadioButton2EditPart(view);

			case RadioButtonName2EditPart.VISUAL_ID:
				return new RadioButtonName2EditPart(view);

			case SpinBox2EditPart.VISUAL_ID:
				return new SpinBox2EditPart(view);

			case SpinBoxName2EditPart.VISUAL_ID:
				return new SpinBoxName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case Separator2EditPart.VISUAL_ID:
				return new Separator2EditPart(view);

			case SeparatorName2EditPart.VISUAL_ID:
				return new SeparatorName2EditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnName2EditPart.VISUAL_ID:
				return new ColumnName2EditPart(view);

			case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(view);

			case TreeviewTreeviewLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new TreeviewTreeviewLstChildModelElementsCompartmentEditPart(view);

			case TreeviewTreeviewLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new TreeviewTreeviewLstChildModelElementsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
