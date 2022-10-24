/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckButton2CreateCommand;
import uidiagram.diagram.edit.commands.CheckButtonCreateCommand;
import uidiagram.diagram.edit.commands.Column2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.Entry2CreateCommand;
import uidiagram.diagram.edit.commands.EntryCreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.Separator2CreateCommand;
import uidiagram.diagram.edit.commands.SeparatorCreateCommand;
import uidiagram.diagram.edit.commands.SpinBox2CreateCommand;
import uidiagram.diagram.edit.commands.SpinBoxCreateCommand;
import uidiagram.diagram.edit.commands.TreeviewCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy() {
		super(UidiagramElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Treeview_3033 == req.getElementType()) {
			return getGEFWrapper(new TreeviewCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3017 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3018 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.CheckButton_3038 == req.getElementType()) {
			return getGEFWrapper(new CheckButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.Entry_3039 == req.getElementType()) {
			return getGEFWrapper(new Entry2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3021 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.SpinBox_3026 == req.getElementType()) {
			return getGEFWrapper(new SpinBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3027 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.Separator_3029 == req.getElementType()) {
			return getGEFWrapper(new Separator2CreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3032 == req.getElementType()) {
			return getGEFWrapper(new Column2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
