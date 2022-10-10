/*
 * 
 */
package uidiagram.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.ButtonName2EditPart;
import uidiagram.diagram.edit.parts.ButtonNameEditPart;
import uidiagram.diagram.edit.parts.CheckBoxName2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxNameEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.FrameName2EditPart;
import uidiagram.diagram.edit.parts.FrameNameEditPart;
import uidiagram.diagram.edit.parts.GroupName2EditPart;
import uidiagram.diagram.edit.parts.GroupNameEditPart;
import uidiagram.diagram.edit.parts.LabelFrameName2EditPart;
import uidiagram.diagram.edit.parts.LabelFrameNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.MenuButtonName2EditPart;
import uidiagram.diagram.edit.parts.MenuButtonNameEditPart;
import uidiagram.diagram.edit.parts.NotebookName2EditPart;
import uidiagram.diagram.edit.parts.NotebookNameEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.ScrollBarName2EditPart;
import uidiagram.diagram.edit.parts.ScrollBarNameEditPart;
import uidiagram.diagram.edit.parts.SeparatorName2EditPart;
import uidiagram.diagram.edit.parts.SeparatorNameEditPart;
import uidiagram.diagram.edit.parts.SpinBoxName2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxNameEditPart;
import uidiagram.diagram.edit.parts.TextInputName2EditPart;
import uidiagram.diagram.edit.parts.TextInputNameEditPart;
import uidiagram.diagram.edit.parts.TreeViewName2EditPart;
import uidiagram.diagram.edit.parts.TreeViewNameEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceNameEditPart;
import uidiagram.diagram.parsers.MessageFormatParser;
import uidiagram.diagram.part.UidiagramVisualIDRegistry;

/**
 * @generated
 */
public class UidiagramParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser userInterfaceName_5031Parser;

	/**
	* @generated
	*/
	private IParser getUserInterfaceName_5031Parser() {
		if (userInterfaceName_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getUserInterface_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			userInterfaceName_5031Parser = parser;
		}
		return userInterfaceName_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5016Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5016Parser() {
		if (groupName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5016Parser = parser;
		}
		return groupName_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser groupName_5015Parser;

	/**
	* @generated
	*/
	private IParser getGroupName_5015Parser() {
		if (groupName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			groupName_5015Parser = parser;
		}
		return groupName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5001Parser() {
		if (buttonName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5001Parser = parser;
		}
		return buttonName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5002Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5002Parser() {
		if (labelName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5002Parser = parser;
		}
		return labelName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5003Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5003Parser() {
		if (checkBoxName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5003Parser = parser;
		}
		return checkBoxName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5004Parser() {
		if (textInputName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5004Parser = parser;
		}
		return textInputName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5005Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5005Parser() {
		if (radioButtonName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5005Parser = parser;
		}
		return radioButtonName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser frameName_5006Parser;

	/**
	* @generated
	*/
	private IParser getFrameName_5006Parser() {
		if (frameName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			frameName_5006Parser = parser;
		}
		return frameName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser labelFrameName_5007Parser;

	/**
	* @generated
	*/
	private IParser getLabelFrameName_5007Parser() {
		if (labelFrameName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelFrameName_5007Parser = parser;
		}
		return labelFrameName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser menuButtonName_5008Parser;

	/**
	* @generated
	*/
	private IParser getMenuButtonName_5008Parser() {
		if (menuButtonName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuButtonName_5008Parser = parser;
		}
		return menuButtonName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser scrollBarName_5009Parser;

	/**
	* @generated
	*/
	private IParser getScrollBarName_5009Parser() {
		if (scrollBarName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scrollBarName_5009Parser = parser;
		}
		return scrollBarName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser spinBoxName_5010Parser;

	/**
	* @generated
	*/
	private IParser getSpinBoxName_5010Parser() {
		if (spinBoxName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			spinBoxName_5010Parser = parser;
		}
		return spinBoxName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5011Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5011Parser() {
		if (comboBoxName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5011Parser = parser;
		}
		return comboBoxName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser notebookName_5012Parser;

	/**
	* @generated
	*/
	private IParser getNotebookName_5012Parser() {
		if (notebookName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notebookName_5012Parser = parser;
		}
		return notebookName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser separatorName_5013Parser;

	/**
	* @generated
	*/
	private IParser getSeparatorName_5013Parser() {
		if (separatorName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			separatorName_5013Parser = parser;
		}
		return separatorName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser treeViewName_5014Parser;

	/**
	* @generated
	*/
	private IParser getTreeViewName_5014Parser() {
		if (treeViewName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeViewName_5014Parser = parser;
		}
		return treeViewName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5017Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5017Parser() {
		if (buttonName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5017Parser = parser;
		}
		return buttonName_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5018Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5018Parser() {
		if (labelName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5018Parser = parser;
		}
		return labelName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxName_5019Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxName_5019Parser() {
		if (checkBoxName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkBoxName_5019Parser = parser;
		}
		return checkBoxName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputName_5020Parser;

	/**
	* @generated
	*/
	private IParser getTextInputName_5020Parser() {
		if (textInputName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			textInputName_5020Parser = parser;
		}
		return textInputName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5021Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5021Parser() {
		if (radioButtonName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5021Parser = parser;
		}
		return radioButtonName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser frameName_5022Parser;

	/**
	* @generated
	*/
	private IParser getFrameName_5022Parser() {
		if (frameName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			frameName_5022Parser = parser;
		}
		return frameName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser labelFrameName_5023Parser;

	/**
	* @generated
	*/
	private IParser getLabelFrameName_5023Parser() {
		if (labelFrameName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelFrameName_5023Parser = parser;
		}
		return labelFrameName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser menuButtonName_5024Parser;

	/**
	* @generated
	*/
	private IParser getMenuButtonName_5024Parser() {
		if (menuButtonName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuButtonName_5024Parser = parser;
		}
		return menuButtonName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser scrollBarName_5025Parser;

	/**
	* @generated
	*/
	private IParser getScrollBarName_5025Parser() {
		if (scrollBarName_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			scrollBarName_5025Parser = parser;
		}
		return scrollBarName_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser spinBoxName_5026Parser;

	/**
	* @generated
	*/
	private IParser getSpinBoxName_5026Parser() {
		if (spinBoxName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			spinBoxName_5026Parser = parser;
		}
		return spinBoxName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5027Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5027Parser() {
		if (comboBoxName_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5027Parser = parser;
		}
		return comboBoxName_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser notebookName_5028Parser;

	/**
	* @generated
	*/
	private IParser getNotebookName_5028Parser() {
		if (notebookName_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			notebookName_5028Parser = parser;
		}
		return notebookName_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser separatorName_5029Parser;

	/**
	* @generated
	*/
	private IParser getSeparatorName_5029Parser() {
		if (separatorName_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			separatorName_5029Parser = parser;
		}
		return separatorName_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser treeViewName_5030Parser;

	/**
	* @generated
	*/
	private IParser getTreeViewName_5030Parser() {
		if (treeViewName_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeViewName_5030Parser = parser;
		}
		return treeViewName_5030Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5031Parser();
		case GroupNameEditPart.VISUAL_ID:
			return getGroupName_5016Parser();
		case GroupName2EditPart.VISUAL_ID:
			return getGroupName_5015Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5001Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5002Parser();
		case CheckBoxNameEditPart.VISUAL_ID:
			return getCheckBoxName_5003Parser();
		case TextInputNameEditPart.VISUAL_ID:
			return getTextInputName_5004Parser();
		case RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5005Parser();
		case FrameNameEditPart.VISUAL_ID:
			return getFrameName_5006Parser();
		case LabelFrameNameEditPart.VISUAL_ID:
			return getLabelFrameName_5007Parser();
		case MenuButtonNameEditPart.VISUAL_ID:
			return getMenuButtonName_5008Parser();
		case ScrollBarNameEditPart.VISUAL_ID:
			return getScrollBarName_5009Parser();
		case SpinBoxNameEditPart.VISUAL_ID:
			return getSpinBoxName_5010Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5011Parser();
		case NotebookNameEditPart.VISUAL_ID:
			return getNotebookName_5012Parser();
		case SeparatorNameEditPart.VISUAL_ID:
			return getSeparatorName_5013Parser();
		case TreeViewNameEditPart.VISUAL_ID:
			return getTreeViewName_5014Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5017Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5018Parser();
		case CheckBoxName2EditPart.VISUAL_ID:
			return getCheckBoxName_5019Parser();
		case TextInputName2EditPart.VISUAL_ID:
			return getTextInputName_5020Parser();
		case RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5021Parser();
		case FrameName2EditPart.VISUAL_ID:
			return getFrameName_5022Parser();
		case LabelFrameName2EditPart.VISUAL_ID:
			return getLabelFrameName_5023Parser();
		case MenuButtonName2EditPart.VISUAL_ID:
			return getMenuButtonName_5024Parser();
		case ScrollBarName2EditPart.VISUAL_ID:
			return getScrollBarName_5025Parser();
		case SpinBoxName2EditPart.VISUAL_ID:
			return getSpinBoxName_5026Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5027Parser();
		case NotebookName2EditPart.VISUAL_ID:
			return getNotebookName_5028Parser();
		case SeparatorName2EditPart.VISUAL_ID:
			return getSeparatorName_5029Parser();
		case TreeViewName2EditPart.VISUAL_ID:
			return getTreeViewName_5030Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(UidiagramVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (UidiagramElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
