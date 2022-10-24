/*
* 
*/
package uidiagram.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckButton2EditPart;
import uidiagram.diagram.edit.parts.CheckButtonEditPart;
import uidiagram.diagram.edit.parts.CheckButtonName2EditPart;
import uidiagram.diagram.edit.parts.CheckButtonNameEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ColumnName2EditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.Entry2EditPart;
import uidiagram.diagram.edit.parts.EntryEditPart;
import uidiagram.diagram.edit.parts.EntryName2EditPart;
import uidiagram.diagram.edit.parts.EntryNameEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SeparatorName2EditPart;
import uidiagram.diagram.edit.parts.SeparatorNameEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.SpinBoxName2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxNameEditPart;
import uidiagram.diagram.edit.parts.Treeview2EditPart;
import uidiagram.diagram.edit.parts.TreeviewEditPart;
import uidiagram.diagram.edit.parts.TreeviewName2EditPart;
import uidiagram.diagram.edit.parts.TreeviewNameEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;
import uidiagram.diagram.providers.UidiagramElementTypes;
import uidiagram.diagram.providers.UidiagramParserProvider;

/**
 * @generated
 */
public class UidiagramNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		UidiagramDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof UidiagramNavigatorItem && !isOwnView(((UidiagramNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return UidiagramDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://uidiagram?UI_Diagram", UidiagramElementTypes.UI_Diagram_1000); //$NON-NLS-1$
		case UserInterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://uidiagram?UserInterface", //$NON-NLS-1$
					UidiagramElementTypes.UserInterface_2001);
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3017); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3018); //$NON-NLS-1$
		case RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3021); //$NON-NLS-1$
		case SpinBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?SpinBox", UidiagramElementTypes.SpinBox_3026); //$NON-NLS-1$
		case ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3027); //$NON-NLS-1$
		case Separator2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Separator", UidiagramElementTypes.Separator_3029); //$NON-NLS-1$
		case Column2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3032); //$NON-NLS-1$
		case TreeviewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Treeview", UidiagramElementTypes.Treeview_3033); //$NON-NLS-1$
		case CheckButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckButton", UidiagramElementTypes.CheckButton_3038); //$NON-NLS-1$
		case Entry2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Entry", UidiagramElementTypes.Entry_3039); //$NON-NLS-1$
		case Treeview2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Treeview", UidiagramElementTypes.Treeview_3040); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3041); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3042); //$NON-NLS-1$
		case CheckButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckButton", UidiagramElementTypes.CheckButton_3043); //$NON-NLS-1$
		case EntryEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Entry", UidiagramElementTypes.Entry_3044); //$NON-NLS-1$
		case RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3045); //$NON-NLS-1$
		case SpinBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?SpinBox", UidiagramElementTypes.SpinBox_3046); //$NON-NLS-1$
		case ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3047); //$NON-NLS-1$
		case SeparatorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Separator", UidiagramElementTypes.Separator_3048); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3049); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = UidiagramDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && UidiagramElementTypes.isKnownElementType(elementType)) {
			image = UidiagramElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof UidiagramNavigatorGroup) {
			UidiagramNavigatorGroup group = (UidiagramNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof UidiagramNavigatorItem) {
			UidiagramNavigatorItem navigatorItem = (UidiagramNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (UidiagramVisualIDRegistry.getVisualID(view)) {
		case UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000Text(view);
		case UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018Text(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021Text(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026Text(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027Text(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029Text(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3032Text(view);
		case TreeviewEditPart.VISUAL_ID:
			return getTreeview_3033Text(view);
		case CheckButton2EditPart.VISUAL_ID:
			return getCheckButton_3038Text(view);
		case Entry2EditPart.VISUAL_ID:
			return getEntry_3039Text(view);
		case Treeview2EditPart.VISUAL_ID:
			return getTreeview_3040Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3041Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3042Text(view);
		case CheckButtonEditPart.VISUAL_ID:
			return getCheckButton_3043Text(view);
		case EntryEditPart.VISUAL_ID:
			return getEntry_3044Text(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3045Text(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3046Text(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3047Text(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3048Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3049Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getUI_Diagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUserInterface_2001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.UserInterface_2001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(UserInterfaceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3017Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3017,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3018Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3018,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3021Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3021,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpinBox_3026Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.SpinBox_3026,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SpinBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3027Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3027,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSeparator_3029Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Separator_3029,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SeparatorName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3032Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3032,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTreeview_3033Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Treeview_3033,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TreeviewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckButton_3038Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckButton_3038,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntry_3039Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Entry_3039,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(EntryName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTreeview_3040Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Treeview_3040,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TreeviewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3041Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3041,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3042Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3042,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckButton_3043Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckButton_3043,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntry_3044Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Entry_3044,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(EntryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3045Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3045,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpinBox_3046Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.SpinBox_3046,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SpinBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3047Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3047,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSeparator_3048Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Separator_3048,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SeparatorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3049Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3049,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return UI_DiagramEditPart.MODEL_ID.equals(UidiagramVisualIDRegistry.getModelID(view));
	}

}
