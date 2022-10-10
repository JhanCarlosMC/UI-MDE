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

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupNameEditPart.VISUAL_ID:
				return new GroupNameEditPart(view);

			case Group2EditPart.VISUAL_ID:
				return new Group2EditPart(view);

			case GroupName2EditPart.VISUAL_ID:
				return new GroupName2EditPart(view);

			case ButtonEditPart.VISUAL_ID:
				return new ButtonEditPart(view);

			case ButtonNameEditPart.VISUAL_ID:
				return new ButtonNameEditPart(view);

			case LabelEditPart.VISUAL_ID:
				return new LabelEditPart(view);

			case LabelNameEditPart.VISUAL_ID:
				return new LabelNameEditPart(view);

			case CheckBoxEditPart.VISUAL_ID:
				return new CheckBoxEditPart(view);

			case CheckBoxNameEditPart.VISUAL_ID:
				return new CheckBoxNameEditPart(view);

			case TextInputEditPart.VISUAL_ID:
				return new TextInputEditPart(view);

			case TextInputNameEditPart.VISUAL_ID:
				return new TextInputNameEditPart(view);

			case RadioButtonEditPart.VISUAL_ID:
				return new RadioButtonEditPart(view);

			case RadioButtonNameEditPart.VISUAL_ID:
				return new RadioButtonNameEditPart(view);

			case FrameEditPart.VISUAL_ID:
				return new FrameEditPart(view);

			case FrameNameEditPart.VISUAL_ID:
				return new FrameNameEditPart(view);

			case LabelFrameEditPart.VISUAL_ID:
				return new LabelFrameEditPart(view);

			case LabelFrameNameEditPart.VISUAL_ID:
				return new LabelFrameNameEditPart(view);

			case MenuButtonEditPart.VISUAL_ID:
				return new MenuButtonEditPart(view);

			case MenuButtonNameEditPart.VISUAL_ID:
				return new MenuButtonNameEditPart(view);

			case ScrollBarEditPart.VISUAL_ID:
				return new ScrollBarEditPart(view);

			case ScrollBarNameEditPart.VISUAL_ID:
				return new ScrollBarNameEditPart(view);

			case SpinBoxEditPart.VISUAL_ID:
				return new SpinBoxEditPart(view);

			case SpinBoxNameEditPart.VISUAL_ID:
				return new SpinBoxNameEditPart(view);

			case ComboBoxEditPart.VISUAL_ID:
				return new ComboBoxEditPart(view);

			case ComboBoxNameEditPart.VISUAL_ID:
				return new ComboBoxNameEditPart(view);

			case NotebookEditPart.VISUAL_ID:
				return new NotebookEditPart(view);

			case NotebookNameEditPart.VISUAL_ID:
				return new NotebookNameEditPart(view);

			case SeparatorEditPart.VISUAL_ID:
				return new SeparatorEditPart(view);

			case SeparatorNameEditPart.VISUAL_ID:
				return new SeparatorNameEditPart(view);

			case TreeViewEditPart.VISUAL_ID:
				return new TreeViewEditPart(view);

			case TreeViewNameEditPart.VISUAL_ID:
				return new TreeViewNameEditPart(view);

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

			case CheckBox2EditPart.VISUAL_ID:
				return new CheckBox2EditPart(view);

			case CheckBoxName2EditPart.VISUAL_ID:
				return new CheckBoxName2EditPart(view);

			case TextInput2EditPart.VISUAL_ID:
				return new TextInput2EditPart(view);

			case TextInputName2EditPart.VISUAL_ID:
				return new TextInputName2EditPart(view);

			case RadioButton2EditPart.VISUAL_ID:
				return new RadioButton2EditPart(view);

			case RadioButtonName2EditPart.VISUAL_ID:
				return new RadioButtonName2EditPart(view);

			case Frame2EditPart.VISUAL_ID:
				return new Frame2EditPart(view);

			case FrameName2EditPart.VISUAL_ID:
				return new FrameName2EditPart(view);

			case LabelFrame2EditPart.VISUAL_ID:
				return new LabelFrame2EditPart(view);

			case LabelFrameName2EditPart.VISUAL_ID:
				return new LabelFrameName2EditPart(view);

			case MenuButton2EditPart.VISUAL_ID:
				return new MenuButton2EditPart(view);

			case MenuButtonName2EditPart.VISUAL_ID:
				return new MenuButtonName2EditPart(view);

			case ScrollBar2EditPart.VISUAL_ID:
				return new ScrollBar2EditPart(view);

			case ScrollBarName2EditPart.VISUAL_ID:
				return new ScrollBarName2EditPart(view);

			case SpinBox2EditPart.VISUAL_ID:
				return new SpinBox2EditPart(view);

			case SpinBoxName2EditPart.VISUAL_ID:
				return new SpinBoxName2EditPart(view);

			case ComboBox2EditPart.VISUAL_ID:
				return new ComboBox2EditPart(view);

			case ComboBoxName2EditPart.VISUAL_ID:
				return new ComboBoxName2EditPart(view);

			case Notebook2EditPart.VISUAL_ID:
				return new Notebook2EditPart(view);

			case NotebookName2EditPart.VISUAL_ID:
				return new NotebookName2EditPart(view);

			case Separator2EditPart.VISUAL_ID:
				return new Separator2EditPart(view);

			case SeparatorName2EditPart.VISUAL_ID:
				return new SeparatorName2EditPart(view);

			case TreeView2EditPart.VISUAL_ID:
				return new TreeView2EditPart(view);

			case TreeViewName2EditPart.VISUAL_ID:
				return new TreeViewName2EditPart(view);

			case Column2EditPart.VISUAL_ID:
				return new Column2EditPart(view);

			case ColumnName2EditPart.VISUAL_ID:
				return new ColumnName2EditPart(view);

			case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(view);

			case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new GroupGroupLstChildModelElementsCompartmentEditPart(view);

			case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new GroupGroupLstChildModelElementsCompartment2EditPart(view);
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
