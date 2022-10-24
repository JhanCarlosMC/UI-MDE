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

import uidiagram.ModelElement;
import uidiagram.Treeview;
import uidiagram.UI_Diagram;
import uidiagram.UserInterface;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.CheckButton2EditPart;
import uidiagram.diagram.edit.parts.CheckButtonEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.Entry2EditPart;
import uidiagram.diagram.edit.parts.EntryEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.Treeview2EditPart;
import uidiagram.diagram.edit.parts.TreeviewEditPart;
import uidiagram.diagram.edit.parts.TreeviewTreeviewLstChildModelElementsCompartment2EditPart;
import uidiagram.diagram.edit.parts.TreeviewTreeviewLstChildModelElementsCompartmentEditPart;
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
		case TreeviewTreeviewLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getTreeviewTreeviewLstChildModelElementsCompartment_7004SemanticChildren(view);
		case TreeviewTreeviewLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getTreeviewTreeviewLstChildModelElementsCompartment_7005SemanticChildren(view);
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
			if (visualID == TreeviewEditPart.VISUAL_ID) {
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
			if (visualID == CheckButton2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Entry2EditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButton2EditPart.VISUAL_ID) {
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
			if (visualID == Separator2EditPart.VISUAL_ID) {
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
	public static List<UidiagramNodeDescriptor> getTreeviewTreeviewLstChildModelElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Treeview modelElement = (Treeview) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Treeview2EditPart.VISUAL_ID) {
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
			if (visualID == CheckButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntryEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
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
			if (visualID == SeparatorEditPart.VISUAL_ID) {
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
	public static List<UidiagramNodeDescriptor> getTreeviewTreeviewLstChildModelElementsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Treeview modelElement = (Treeview) containerView.getElement();
		LinkedList<UidiagramNodeDescriptor> result = new LinkedList<UidiagramNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ModelElement childElement = (ModelElement) it.next();
			int visualID = UidiagramVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Treeview2EditPart.VISUAL_ID) {
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
			if (visualID == CheckButtonEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EntryEditPart.VISUAL_ID) {
				result.add(new UidiagramNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RadioButtonEditPart.VISUAL_ID) {
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
			if (visualID == SeparatorEditPart.VISUAL_ID) {
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
		case TreeviewEditPart.VISUAL_ID:
			return getTreeview_3033ContainedLinks(view);
		case Treeview2EditPart.VISUAL_ID:
			return getTreeview_3040ContainedLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3041ContainedLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3042ContainedLinks(view);
		case CheckButtonEditPart.VISUAL_ID:
			return getCheckButton_3043ContainedLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_3044ContainedLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3045ContainedLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3046ContainedLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3047ContainedLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3048ContainedLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3049ContainedLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017ContainedLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018ContainedLinks(view);
		case CheckButton2EditPart.VISUAL_ID:
			return getCheckButton_3038ContainedLinks(view);
		case Entry2EditPart.VISUAL_ID:
			return getEntry_3039ContainedLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021ContainedLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026ContainedLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027ContainedLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029ContainedLinks(view);
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
		case TreeviewEditPart.VISUAL_ID:
			return getTreeview_3033IncomingLinks(view);
		case Treeview2EditPart.VISUAL_ID:
			return getTreeview_3040IncomingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3041IncomingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3042IncomingLinks(view);
		case CheckButtonEditPart.VISUAL_ID:
			return getCheckButton_3043IncomingLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_3044IncomingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3045IncomingLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3046IncomingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3047IncomingLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3048IncomingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3049IncomingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017IncomingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018IncomingLinks(view);
		case CheckButton2EditPart.VISUAL_ID:
			return getCheckButton_3038IncomingLinks(view);
		case Entry2EditPart.VISUAL_ID:
			return getEntry_3039IncomingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021IncomingLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026IncomingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027IncomingLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029IncomingLinks(view);
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
		case TreeviewEditPart.VISUAL_ID:
			return getTreeview_3033OutgoingLinks(view);
		case Treeview2EditPart.VISUAL_ID:
			return getTreeview_3040OutgoingLinks(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3041OutgoingLinks(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3042OutgoingLinks(view);
		case CheckButtonEditPart.VISUAL_ID:
			return getCheckButton_3043OutgoingLinks(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_3044OutgoingLinks(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3045OutgoingLinks(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3046OutgoingLinks(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3047OutgoingLinks(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3048OutgoingLinks(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3049OutgoingLinks(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017OutgoingLinks(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018OutgoingLinks(view);
		case CheckButton2EditPart.VISUAL_ID:
			return getCheckButton_3038OutgoingLinks(view);
		case Entry2EditPart.VISUAL_ID:
			return getEntry_3039OutgoingLinks(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021OutgoingLinks(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026OutgoingLinks(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027OutgoingLinks(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029OutgoingLinks(view);
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
	public static List<UidiagramLinkDescriptor> getTreeview_3033ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeview_3040ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckButton_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3046ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3047ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3049ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getCheckButton_3038ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3039ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getSeparator_3029ContainedLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getTreeview_3033IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeview_3040IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3041IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3042IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckButton_3043IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3044IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3045IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3046IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3047IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3049IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getCheckButton_3038IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3039IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getSeparator_3029IncomingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getTreeview_3033OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getTreeview_3040OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getButton_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getLabel_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getCheckButton_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getRadioButton_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSpinBox_3046OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getComboBox_3047OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getSeparator_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getColumn_3049OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getCheckButton_3038OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<UidiagramLinkDescriptor> getEntry_3039OutgoingLinks(View view) {
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
	public static List<UidiagramLinkDescriptor> getSeparator_3029OutgoingLinks(View view) {
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
