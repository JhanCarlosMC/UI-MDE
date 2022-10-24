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
import uidiagram.diagram.edit.parts.CheckButtonName2EditPart;
import uidiagram.diagram.edit.parts.CheckButtonNameEditPart;
import uidiagram.diagram.edit.parts.ColumnName2EditPart;
import uidiagram.diagram.edit.parts.ColumnNameEditPart;
import uidiagram.diagram.edit.parts.ComboBoxName2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxNameEditPart;
import uidiagram.diagram.edit.parts.EntryName2EditPart;
import uidiagram.diagram.edit.parts.EntryNameEditPart;
import uidiagram.diagram.edit.parts.LabelName2EditPart;
import uidiagram.diagram.edit.parts.LabelNameEditPart;
import uidiagram.diagram.edit.parts.RadioButtonName2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonNameEditPart;
import uidiagram.diagram.edit.parts.SeparatorName2EditPart;
import uidiagram.diagram.edit.parts.SeparatorNameEditPart;
import uidiagram.diagram.edit.parts.SpinBoxName2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxNameEditPart;
import uidiagram.diagram.edit.parts.TreeviewName2EditPart;
import uidiagram.diagram.edit.parts.TreeviewNameEditPart;
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
	private IParser treeviewName_5038Parser;

	/**
	* @generated
	*/
	private IParser getTreeviewName_5038Parser() {
		if (treeviewName_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeviewName_5038Parser = parser;
		}
		return treeviewName_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser treeviewName_5050Parser;

	/**
	* @generated
	*/
	private IParser getTreeviewName_5050Parser() {
		if (treeviewName_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeviewName_5050Parser = parser;
		}
		return treeviewName_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonName_5041Parser;

	/**
	* @generated
	*/
	private IParser getButtonName_5041Parser() {
		if (buttonName_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonName_5041Parser = parser;
		}
		return buttonName_5041Parser;
	}

	/**
	* @generated
	*/
	private IParser labelName_5042Parser;

	/**
	* @generated
	*/
	private IParser getLabelName_5042Parser() {
		if (labelName_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelName_5042Parser = parser;
		}
		return labelName_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser checkButtonName_5043Parser;

	/**
	* @generated
	*/
	private IParser getCheckButtonName_5043Parser() {
		if (checkButtonName_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkButtonName_5043Parser = parser;
		}
		return checkButtonName_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser entryName_5044Parser;

	/**
	* @generated
	*/
	private IParser getEntryName_5044Parser() {
		if (entryName_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entryName_5044Parser = parser;
		}
		return entryName_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonName_5045Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonName_5045Parser() {
		if (radioButtonName_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			radioButtonName_5045Parser = parser;
		}
		return radioButtonName_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser spinBoxName_5046Parser;

	/**
	* @generated
	*/
	private IParser getSpinBoxName_5046Parser() {
		if (spinBoxName_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			spinBoxName_5046Parser = parser;
		}
		return spinBoxName_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser comboBoxName_5047Parser;

	/**
	* @generated
	*/
	private IParser getComboBoxName_5047Parser() {
		if (comboBoxName_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			comboBoxName_5047Parser = parser;
		}
		return comboBoxName_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser separatorName_5048Parser;

	/**
	* @generated
	*/
	private IParser getSeparatorName_5048Parser() {
		if (separatorName_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			separatorName_5048Parser = parser;
		}
		return separatorName_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser columnName_5049Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5049Parser() {
		if (columnName_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5049Parser = parser;
		}
		return columnName_5049Parser;
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
	private IParser checkButtonName_5039Parser;

	/**
	* @generated
	*/
	private IParser getCheckButtonName_5039Parser() {
		if (checkButtonName_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			checkButtonName_5039Parser = parser;
		}
		return checkButtonName_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser entryName_5040Parser;

	/**
	* @generated
	*/
	private IParser getEntryName_5040Parser() {
		if (entryName_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			entryName_5040Parser = parser;
		}
		return entryName_5040Parser;
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
	private IParser columnName_5033Parser;

	/**
	* @generated
	*/
	private IParser getColumnName_5033Parser() {
		if (columnName_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { UidiagramPackage.eINSTANCE.getModelElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnName_5033Parser = parser;
		}
		return columnName_5033Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case UserInterfaceNameEditPart.VISUAL_ID:
			return getUserInterfaceName_5031Parser();
		case TreeviewNameEditPart.VISUAL_ID:
			return getTreeviewName_5038Parser();
		case TreeviewName2EditPart.VISUAL_ID:
			return getTreeviewName_5050Parser();
		case ButtonNameEditPart.VISUAL_ID:
			return getButtonName_5041Parser();
		case LabelNameEditPart.VISUAL_ID:
			return getLabelName_5042Parser();
		case CheckButtonNameEditPart.VISUAL_ID:
			return getCheckButtonName_5043Parser();
		case EntryNameEditPart.VISUAL_ID:
			return getEntryName_5044Parser();
		case RadioButtonNameEditPart.VISUAL_ID:
			return getRadioButtonName_5045Parser();
		case SpinBoxNameEditPart.VISUAL_ID:
			return getSpinBoxName_5046Parser();
		case ComboBoxNameEditPart.VISUAL_ID:
			return getComboBoxName_5047Parser();
		case SeparatorNameEditPart.VISUAL_ID:
			return getSeparatorName_5048Parser();
		case ColumnNameEditPart.VISUAL_ID:
			return getColumnName_5049Parser();
		case ButtonName2EditPart.VISUAL_ID:
			return getButtonName_5017Parser();
		case LabelName2EditPart.VISUAL_ID:
			return getLabelName_5018Parser();
		case CheckButtonName2EditPart.VISUAL_ID:
			return getCheckButtonName_5039Parser();
		case EntryName2EditPart.VISUAL_ID:
			return getEntryName_5040Parser();
		case RadioButtonName2EditPart.VISUAL_ID:
			return getRadioButtonName_5021Parser();
		case SpinBoxName2EditPart.VISUAL_ID:
			return getSpinBoxName_5026Parser();
		case ComboBoxName2EditPart.VISUAL_ID:
			return getComboBoxName_5027Parser();
		case SeparatorName2EditPart.VISUAL_ID:
			return getSeparatorName_5029Parser();
		case ColumnName2EditPart.VISUAL_ID:
			return getColumnName_5033Parser();
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
