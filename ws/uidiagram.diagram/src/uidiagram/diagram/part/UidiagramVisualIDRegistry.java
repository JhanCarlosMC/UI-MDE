/*
* 
*/
package uidiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import uidiagram.UI_Diagram;
import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnName2EditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.Frame2EditPart;
import uidiagram.diagram.edit.parts.FrameEditPart;
import uidiagram.diagram.edit.parts.FrameName2EditPart;
import uidiagram.diagram.edit.parts.FrameNameEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelFrame2EditPart;
import uidiagram.diagram.edit.parts.LabelFrameEditPart;
import uidiagram.diagram.edit.parts.LabelFrameName2EditPart;
import uidiagram.diagram.edit.parts.LabelFrameNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.MenuButton2EditPart;
import uidiagram.diagram.edit.parts.MenuButtonEditPart;
import uidiagram.diagram.edit.parts.MenuButtonName2EditPart;
import uidiagram.diagram.edit.parts.MenuButtonNameEditPart;
import uidiagram.diagram.edit.parts.Notebook2EditPart;
import uidiagram.diagram.edit.parts.NotebookEditPart;
import uidiagram.diagram.edit.parts.NotebookName2EditPart;
import uidiagram.diagram.edit.parts.NotebookNameEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.ScrollBar2EditPart;
import uidiagram.diagram.edit.parts.ScrollBarEditPart;
import uidiagram.diagram.edit.parts.ScrollBarName2EditPart;
import uidiagram.diagram.edit.parts.ScrollBarNameEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SeparatorName2EditPart;
import uidiagram.diagram.edit.parts.SeparatorNameEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.SpinBoxName2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxNameEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.TreeView2EditPart;
import uidiagram.diagram.edit.parts.TreeViewEditPart;
import uidiagram.diagram.edit.parts.TreeViewName2EditPart;
import uidiagram.diagram.edit.parts.TreeViewNameEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UidiagramVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "uidiagram.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UI_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UidiagramDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UidiagramPackage.eINSTANCE.getUI_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((UI_Diagram) domainElement)) {
			return UI_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UI_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return UserInterfaceEditPart.VISUAL_ID;
			}
			break;
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return Button2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return Label2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInput2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFrame().isSuperTypeOf(domainElement.eClass())) {
				return Frame2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabelFrame().isSuperTypeOf(domainElement.eClass())) {
				return LabelFrame2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuButton().isSuperTypeOf(domainElement.eClass())) {
				return MenuButton2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getScrollBar().isSuperTypeOf(domainElement.eClass())) {
				return ScrollBar2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSpinBox().isSuperTypeOf(domainElement.eClass())) {
				return SpinBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBox2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getNotebook().isSuperTypeOf(domainElement.eClass())) {
				return Notebook2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSeparator().isSuperTypeOf(domainElement.eClass())) {
				return Separator2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTreeView().isSuperTypeOf(domainElement.eClass())) {
				return TreeView2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return Column2EditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFrame().isSuperTypeOf(domainElement.eClass())) {
				return FrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabelFrame().isSuperTypeOf(domainElement.eClass())) {
				return LabelFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuButton().isSuperTypeOf(domainElement.eClass())) {
				return MenuButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getScrollBar().isSuperTypeOf(domainElement.eClass())) {
				return ScrollBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSpinBox().isSuperTypeOf(domainElement.eClass())) {
				return SpinBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getNotebook().isSuperTypeOf(domainElement.eClass())) {
				return NotebookEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSeparator().isSuperTypeOf(domainElement.eClass())) {
				return SeparatorEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTreeView().isSuperTypeOf(domainElement.eClass())) {
				return TreeViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (UidiagramPackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return Group2EditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return LabelEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return CheckBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return TextInputEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return RadioButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getFrame().isSuperTypeOf(domainElement.eClass())) {
				return FrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getLabelFrame().isSuperTypeOf(domainElement.eClass())) {
				return LabelFrameEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getMenuButton().isSuperTypeOf(domainElement.eClass())) {
				return MenuButtonEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getScrollBar().isSuperTypeOf(domainElement.eClass())) {
				return ScrollBarEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSpinBox().isSuperTypeOf(domainElement.eClass())) {
				return SpinBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getComboBox().isSuperTypeOf(domainElement.eClass())) {
				return ComboBoxEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getNotebook().isSuperTypeOf(domainElement.eClass())) {
				return NotebookEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getSeparator().isSuperTypeOf(domainElement.eClass())) {
				return SeparatorEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getTreeView().isSuperTypeOf(domainElement.eClass())) {
				return TreeViewEditPart.VISUAL_ID;
			}
			if (UidiagramPackage.eINSTANCE.getColumn().isSuperTypeOf(domainElement.eClass())) {
				return ColumnEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(containerView);
		if (!UI_DiagramEditPart.MODEL_ID.equals(containerModelID) && !"uidiagram".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UI_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			if (UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceEditPart.VISUAL_ID:
			if (UserInterfaceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Group2EditPart.VISUAL_ID:
			if (GroupName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ButtonEditPart.VISUAL_ID:
			if (ButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelEditPart.VISUAL_ID:
			if (LabelNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBoxEditPart.VISUAL_ID:
			if (CheckBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInputEditPart.VISUAL_ID:
			if (TextInputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButtonEditPart.VISUAL_ID:
			if (RadioButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FrameEditPart.VISUAL_ID:
			if (FrameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelFrameEditPart.VISUAL_ID:
			if (LabelFrameNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuButtonEditPart.VISUAL_ID:
			if (MenuButtonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScrollBarEditPart.VISUAL_ID:
			if (ScrollBarNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpinBoxEditPart.VISUAL_ID:
			if (SpinBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBoxEditPart.VISUAL_ID:
			if (ComboBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NotebookEditPart.VISUAL_ID:
			if (NotebookNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SeparatorEditPart.VISUAL_ID:
			if (SeparatorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TreeViewEditPart.VISUAL_ID:
			if (TreeViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ColumnEditPart.VISUAL_ID:
			if (ColumnNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Button2EditPart.VISUAL_ID:
			if (ButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Label2EditPart.VISUAL_ID:
			if (LabelName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CheckBox2EditPart.VISUAL_ID:
			if (CheckBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TextInput2EditPart.VISUAL_ID:
			if (TextInputName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RadioButton2EditPart.VISUAL_ID:
			if (RadioButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Frame2EditPart.VISUAL_ID:
			if (FrameName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LabelFrame2EditPart.VISUAL_ID:
			if (LabelFrameName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MenuButton2EditPart.VISUAL_ID:
			if (MenuButtonName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ScrollBar2EditPart.VISUAL_ID:
			if (ScrollBarName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpinBox2EditPart.VISUAL_ID:
			if (SpinBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComboBox2EditPart.VISUAL_ID:
			if (ComboBoxName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Notebook2EditPart.VISUAL_ID:
			if (NotebookName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Separator2EditPart.VISUAL_ID:
			if (SeparatorName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TreeView2EditPart.VISUAL_ID:
			if (TreeViewName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Column2EditPart.VISUAL_ID:
			if (ColumnName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Frame2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelFrame2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScrollBar2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpinBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Notebook2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Separator2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeView2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Column2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScrollBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpinBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotebookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SeparatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LabelFrameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MenuButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ScrollBarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SpinBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComboBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NotebookEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SeparatorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TreeViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ColumnEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(UI_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
		case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			return false;
		case ButtonEditPart.VISUAL_ID:
		case LabelEditPart.VISUAL_ID:
		case CheckBoxEditPart.VISUAL_ID:
		case TextInputEditPart.VISUAL_ID:
		case RadioButtonEditPart.VISUAL_ID:
		case FrameEditPart.VISUAL_ID:
		case LabelFrameEditPart.VISUAL_ID:
		case MenuButtonEditPart.VISUAL_ID:
		case ScrollBarEditPart.VISUAL_ID:
		case SpinBoxEditPart.VISUAL_ID:
		case ComboBoxEditPart.VISUAL_ID:
		case NotebookEditPart.VISUAL_ID:
		case SeparatorEditPart.VISUAL_ID:
		case TreeViewEditPart.VISUAL_ID:
		case Button2EditPart.VISUAL_ID:
		case Label2EditPart.VISUAL_ID:
		case CheckBox2EditPart.VISUAL_ID:
		case TextInput2EditPart.VISUAL_ID:
		case RadioButton2EditPart.VISUAL_ID:
		case Frame2EditPart.VISUAL_ID:
		case LabelFrame2EditPart.VISUAL_ID:
		case MenuButton2EditPart.VISUAL_ID:
		case ScrollBar2EditPart.VISUAL_ID:
		case SpinBox2EditPart.VISUAL_ID:
		case ComboBox2EditPart.VISUAL_ID:
		case Notebook2EditPart.VISUAL_ID:
		case Separator2EditPart.VISUAL_ID:
		case TreeView2EditPart.VISUAL_ID:
		case ColumnEditPart.VISUAL_ID:
		case Column2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return uidiagram.diagram.part.UidiagramVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
