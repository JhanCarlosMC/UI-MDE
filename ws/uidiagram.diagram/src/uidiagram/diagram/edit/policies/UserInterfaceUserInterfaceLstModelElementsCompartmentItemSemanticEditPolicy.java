/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.Button2CreateCommand;
import uidiagram.diagram.edit.commands.CheckBox2CreateCommand;
import uidiagram.diagram.edit.commands.ComboBox2CreateCommand;
import uidiagram.diagram.edit.commands.Frame2CreateCommand;
import uidiagram.diagram.edit.commands.GroupCreateCommand;
import uidiagram.diagram.edit.commands.Label2CreateCommand;
import uidiagram.diagram.edit.commands.LabelFrame2CreateCommand;
import uidiagram.diagram.edit.commands.MenuButton2CreateCommand;
import uidiagram.diagram.edit.commands.Notebook2CreateCommand;
import uidiagram.diagram.edit.commands.RadioButton2CreateCommand;
import uidiagram.diagram.edit.commands.ScrollBar2CreateCommand;
import uidiagram.diagram.edit.commands.Separator2CreateCommand;
import uidiagram.diagram.edit.commands.SpinBox2CreateCommand;
import uidiagram.diagram.edit.commands.TextInput2CreateCommand;
import uidiagram.diagram.edit.commands.TreeView2CreateCommand;
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
		if (UidiagramElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3017 == req.getElementType()) {
			return getGEFWrapper(new Button2CreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3018 == req.getElementType()) {
			return getGEFWrapper(new Label2CreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3019 == req.getElementType()) {
			return getGEFWrapper(new CheckBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3020 == req.getElementType()) {
			return getGEFWrapper(new TextInput2CreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3021 == req.getElementType()) {
			return getGEFWrapper(new RadioButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.Frame_3022 == req.getElementType()) {
			return getGEFWrapper(new Frame2CreateCommand(req));
		}
		if (UidiagramElementTypes.LabelFrame_3023 == req.getElementType()) {
			return getGEFWrapper(new LabelFrame2CreateCommand(req));
		}
		if (UidiagramElementTypes.MenuButton_3024 == req.getElementType()) {
			return getGEFWrapper(new MenuButton2CreateCommand(req));
		}
		if (UidiagramElementTypes.ScrollBar_3025 == req.getElementType()) {
			return getGEFWrapper(new ScrollBar2CreateCommand(req));
		}
		if (UidiagramElementTypes.SpinBox_3026 == req.getElementType()) {
			return getGEFWrapper(new SpinBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3027 == req.getElementType()) {
			return getGEFWrapper(new ComboBox2CreateCommand(req));
		}
		if (UidiagramElementTypes.Notebook_3028 == req.getElementType()) {
			return getGEFWrapper(new Notebook2CreateCommand(req));
		}
		if (UidiagramElementTypes.Separator_3029 == req.getElementType()) {
			return getGEFWrapper(new Separator2CreateCommand(req));
		}
		if (UidiagramElementTypes.TreeView_3030 == req.getElementType()) {
			return getGEFWrapper(new TreeView2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
