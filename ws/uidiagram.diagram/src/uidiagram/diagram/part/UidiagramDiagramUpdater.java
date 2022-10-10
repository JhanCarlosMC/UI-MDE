/*
* 
*/
package uidiagram.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import uidiagram.Group;
import uidiagram.ModelElement;
import uidiagram.UI_Diagram;
import uidiagram.UserInterface;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.Frame2EditPart;
import uidiagram.diagram.edit.parts.FrameEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelFrame2EditPart;
import uidiagram.diagram.edit.parts.LabelFrameEditPart;
import uidiagram.diagram.edit.parts.MenuButton2EditPart;
import uidiagram.diagram.edit.parts.MenuButtonEditPart;
import uidiagram.diagram.edit.parts.Notebook2EditPart;
import uidiagram.diagram.edit.parts.NotebookEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.ScrollBar2EditPart;
import uidiagram.diagram.edit.parts.ScrollBarEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TreeView2EditPart;
import uidiagram.diagram.edit.parts.TreeViewEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart;

/**
 * @generated
 */
public class UidiagramDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000SemanticChildren(view);
		case UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(view);
		case GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(view);
		case GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUI_Diagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		UI_Diagram modelElement = (UI_Diagram) view.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListUserInterface().iterator(); it.hasNext();) {
			UserInterface childElement = (UserInterface) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == UserInterfaceEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		UserInterface modelElement = (UserInterface) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Button2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Label2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInput2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Frame2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelFrame2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScrollBar2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpinBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBox2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Notebook2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Separator2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeView2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Column2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FrameEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelFrameEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScrollBarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpinBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotebookEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SeparatorEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CheckBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TextInputEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FrameEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == LabelFrameEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MenuButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ScrollBarEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SpinBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ComboBoxEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == NotebookEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SeparatorEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TreeViewEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ColumnEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getContainedLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000ContainedLinks(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004ContainedLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005ContainedLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006ContainedLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3007ContainedLinks(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_3008ContainedLinks(view);
		case LabelFrameEditPart.VISUAL_ID:
			return getLabelFrame_3009ContainedLinks(view);
		case MenuButtonEditPart.VISUAL_ID:
			return getMenuButton_3010ContainedLinks(view);
		case ScrollBarEditPart.VISUAL_ID:
			return getScrollBar_3011ContainedLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3012ContainedLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013ContainedLinks(view);
		case NotebookEditPart.VISUAL_ID:
			return getNotebook_3014ContainedLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3015ContainedLinks(view);
		case TreeViewEditPart.VISUAL_ID:
			return getTreeView_3016ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3031ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018ContainedLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3019ContainedLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3020ContainedLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021ContainedLinks(view);
		case Frame2EditPart.VISUAL_ID:
			return getFrame_3022ContainedLinks(view);
		case LabelFrame2EditPart.VISUAL_ID:
			return getLabelFrame_3023ContainedLinks(view);
		case MenuButton2EditPart.VISUAL_ID:
			return getMenuButton_3024ContainedLinks(view);
		case ScrollBar2EditPart.VISUAL_ID:
			return getScrollBar_3025ContainedLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026ContainedLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027ContainedLinks(view);
		case Notebook2EditPart.VISUAL_ID:
			return getNotebook_3028ContainedLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029ContainedLinks(view);
		case TreeView2EditPart.VISUAL_ID:
			return getTreeView_3030ContainedLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3032ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004IncomingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005IncomingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006IncomingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3007IncomingLinks(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_3008IncomingLinks(view);
		case LabelFrameEditPart.VISUAL_ID:
			return getLabelFrame_3009IncomingLinks(view);
		case MenuButtonEditPart.VISUAL_ID:
			return getMenuButton_3010IncomingLinks(view);
		case ScrollBarEditPart.VISUAL_ID:
			return getScrollBar_3011IncomingLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3012IncomingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013IncomingLinks(view);
		case NotebookEditPart.VISUAL_ID:
			return getNotebook_3014IncomingLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3015IncomingLinks(view);
		case TreeViewEditPart.VISUAL_ID:
			return getTreeView_3016IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3031IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018IncomingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3019IncomingLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3020IncomingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021IncomingLinks(view);
		case Frame2EditPart.VISUAL_ID:
			return getFrame_3022IncomingLinks(view);
		case LabelFrame2EditPart.VISUAL_ID:
			return getLabelFrame_3023IncomingLinks(view);
		case MenuButton2EditPart.VISUAL_ID:
			return getMenuButton_3024IncomingLinks(view);
		case ScrollBar2EditPart.VISUAL_ID:
			return getScrollBar_3025IncomingLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026IncomingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027IncomingLinks(view);
		case Notebook2EditPart.VISUAL_ID:
			return getNotebook_3028IncomingLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029IncomingLinks(view);
		case TreeView2EditPart.VISUAL_ID:
			return getTreeView_3030IncomingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3032IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004OutgoingLinks(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005OutgoingLinks(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006OutgoingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3007OutgoingLinks(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_3008OutgoingLinks(view);
		case LabelFrameEditPart.VISUAL_ID:
			return getLabelFrame_3009OutgoingLinks(view);
		case MenuButtonEditPart.VISUAL_ID:
			return getMenuButton_3010OutgoingLinks(view);
		case ScrollBarEditPart.VISUAL_ID:
			return getScrollBar_3011OutgoingLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3012OutgoingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013OutgoingLinks(view);
		case NotebookEditPart.VISUAL_ID:
			return getNotebook_3014OutgoingLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3015OutgoingLinks(view);
		case TreeViewEditPart.VISUAL_ID:
			return getTreeView_3016OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3031OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018OutgoingLinks(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3019OutgoingLinks(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3020OutgoingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021OutgoingLinks(view);
		case Frame2EditPart.VISUAL_ID:
			return getFrame_3022OutgoingLinks(view);
		case LabelFrame2EditPart.VISUAL_ID:
			return getLabelFrame_3023OutgoingLinks(view);
		case MenuButton2EditPart.VISUAL_ID:
			return getMenuButton_3024OutgoingLinks(view);
		case ScrollBar2EditPart.VISUAL_ID:
			return getScrollBar_3025OutgoingLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026OutgoingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027OutgoingLinks(view);
		case Notebook2EditPart.VISUAL_ID:
			return getNotebook_3028OutgoingLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029OutgoingLinks(view);
		case TreeView2EditPart.VISUAL_ID:
			return getTreeView_3030OutgoingLinks(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3032OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUI_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3031ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3019ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3020ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3021ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3022ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3023ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3024ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3025ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3026ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3027ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3030ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3032ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3031IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3019IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3020IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3021IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3022IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3023IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3024IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3025IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3027IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3030IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3032IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getUserInterface_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3031OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckBox_3019OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTextInput_3020OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3021OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getFrame_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabelFrame_3023OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getMenuButton_3024OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getScrollBar_3025OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3027OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getNotebook_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeView_3030OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<UidiagramLinkDescriptor> getColumn_3032OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<UidiagramNodeDescriptor> getSemanticChildren(View view) {
			return UidiagramDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getContainedLinks(View view) {
			return UidiagramDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getIncomingLinks(View view) {
			return UidiagramDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<UidiagramLinkDescriptor> getOutgoingLinks(View view) {
			return UidiagramDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
