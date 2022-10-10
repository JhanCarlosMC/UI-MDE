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
		case GroupEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Group", UidiagramElementTypes.Group_3001); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Group", UidiagramElementTypes.Group_3002); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3003); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3004); //$NON-NLS-1$
		case CheckBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckBox", UidiagramElementTypes.CheckBox_3005); //$NON-NLS-1$
		case TextInputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TextInput", UidiagramElementTypes.TextInput_3006); //$NON-NLS-1$
		case RadioButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3007); //$NON-NLS-1$
		case FrameEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Frame", UidiagramElementTypes.Frame_3008); //$NON-NLS-1$
		case LabelFrameEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?LabelFrame", UidiagramElementTypes.LabelFrame_3009); //$NON-NLS-1$
		case MenuButtonEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?MenuButton", UidiagramElementTypes.MenuButton_3010); //$NON-NLS-1$
		case ScrollBarEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ScrollBar", UidiagramElementTypes.ScrollBar_3011); //$NON-NLS-1$
		case SpinBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?SpinBox", UidiagramElementTypes.SpinBox_3012); //$NON-NLS-1$
		case ComboBoxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3013); //$NON-NLS-1$
		case NotebookEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Notebook", UidiagramElementTypes.Notebook_3014); //$NON-NLS-1$
		case SeparatorEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Separator", UidiagramElementTypes.Separator_3015); //$NON-NLS-1$
		case TreeViewEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TreeView", UidiagramElementTypes.TreeView_3016); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Button", UidiagramElementTypes.Button_3017); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Label", UidiagramElementTypes.Label_3018); //$NON-NLS-1$
		case CheckBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?CheckBox", UidiagramElementTypes.CheckBox_3019); //$NON-NLS-1$
		case TextInput2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TextInput", UidiagramElementTypes.TextInput_3020); //$NON-NLS-1$
		case RadioButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?RadioButton", UidiagramElementTypes.RadioButton_3021); //$NON-NLS-1$
		case Frame2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Frame", UidiagramElementTypes.Frame_3022); //$NON-NLS-1$
		case LabelFrame2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?LabelFrame", UidiagramElementTypes.LabelFrame_3023); //$NON-NLS-1$
		case MenuButton2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?MenuButton", UidiagramElementTypes.MenuButton_3024); //$NON-NLS-1$
		case ScrollBar2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ScrollBar", UidiagramElementTypes.ScrollBar_3025); //$NON-NLS-1$
		case SpinBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?SpinBox", UidiagramElementTypes.SpinBox_3026); //$NON-NLS-1$
		case ComboBox2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?ComboBox", UidiagramElementTypes.ComboBox_3027); //$NON-NLS-1$
		case Notebook2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Notebook", UidiagramElementTypes.Notebook_3028); //$NON-NLS-1$
		case Separator2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Separator", UidiagramElementTypes.Separator_3029); //$NON-NLS-1$
		case TreeView2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?TreeView", UidiagramElementTypes.TreeView_3030); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3031); //$NON-NLS-1$
		case Column2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://uidiagram?Column", UidiagramElementTypes.Column_3032); //$NON-NLS-1$
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
		case GroupEditPart.VISUAL_ID:
			return getGroup_3001Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3002Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3003Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_3004Text(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005Text(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3006Text(view);
		case RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3007Text(view);
		case FrameEditPart.VISUAL_ID:
			return getFrame_3008Text(view);
		case LabelFrameEditPart.VISUAL_ID:
			return getLabelFrame_3009Text(view);
		case MenuButtonEditPart.VISUAL_ID:
			return getMenuButton_3010Text(view);
		case ScrollBarEditPart.VISUAL_ID:
			return getScrollBar_3011Text(view);
		case SpinBoxEditPart.VISUAL_ID:
			return getSpinBox_3012Text(view);
		case ComboBoxEditPart.VISUAL_ID:
			return getComboBox_3013Text(view);
		case NotebookEditPart.VISUAL_ID:
			return getNotebook_3014Text(view);
		case SeparatorEditPart.VISUAL_ID:
			return getSeparator_3015Text(view);
		case TreeViewEditPart.VISUAL_ID:
			return getTreeView_3016Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3017Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_3018Text(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3019Text(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3020Text(view);
		case RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3021Text(view);
		case Frame2EditPart.VISUAL_ID:
			return getFrame_3022Text(view);
		case LabelFrame2EditPart.VISUAL_ID:
			return getLabelFrame_3023Text(view);
		case MenuButton2EditPart.VISUAL_ID:
			return getMenuButton_3024Text(view);
		case ScrollBar2EditPart.VISUAL_ID:
			return getScrollBar_3025Text(view);
		case SpinBox2EditPart.VISUAL_ID:
			return getSpinBox_3026Text(view);
		case ComboBox2EditPart.VISUAL_ID:
			return getComboBox_3027Text(view);
		case Notebook2EditPart.VISUAL_ID:
			return getNotebook_3028Text(view);
		case Separator2EditPart.VISUAL_ID:
			return getSeparator_3029Text(view);
		case TreeView2EditPart.VISUAL_ID:
			return getTreeView_3030Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_3031Text(view);
		case Column2EditPart.VISUAL_ID:
			return getColumn_3032Text(view);
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
	private String getGroup_3001Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3001,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getGroup_3002Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Group_3002,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_3003Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Button_3003,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabel_3004Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Label_3004,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCheckBox_3005Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckBox_3005,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3006Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TextInput_3006,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TextInputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRadioButton_3007Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.RadioButton_3007,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(RadioButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFrame_3008Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Frame_3008,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(FrameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabelFrame_3009Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.LabelFrame_3009,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelFrameNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMenuButton_3010Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.MenuButton_3010,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(MenuButtonNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getScrollBar_3011Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ScrollBar_3011,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ScrollBarNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSpinBox_3012Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.SpinBox_3012,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SpinBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getComboBox_3013Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ComboBox_3013,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ComboBoxNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNotebook_3014Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Notebook_3014,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(NotebookNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSeparator_3015Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Separator_3015,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(SeparatorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTreeView_3016Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TreeView_3016,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TreeViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
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
	private String getCheckBox_3019Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.CheckBox_3019,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(CheckBoxName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTextInput_3020Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TextInput_3020,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TextInputName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
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
	private String getFrame_3022Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Frame_3022,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(FrameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLabelFrame_3023Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.LabelFrame_3023,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(LabelFrameName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMenuButton_3024Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.MenuButton_3024,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(MenuButtonName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getScrollBar_3025Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.ScrollBar_3025,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ScrollBarName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
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
	private String getNotebook_3028Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Notebook_3028,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(NotebookName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
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
	private String getTreeView_3030Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.TreeView_3030,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(TreeViewName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getColumn_3031Text(View view) {
		IParser parser = UidiagramParserProvider.getParser(UidiagramElementTypes.Column_3031,
				view.getElement() != null ? view.getElement() : view,
				UidiagramVisualIDRegistry.getType(ColumnNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			UidiagramDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
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
