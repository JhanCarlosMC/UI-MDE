/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckBoxCreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.FrameCreateCommand;
import uidiagram.diagram.edit.commands.Group2CreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.LabelFrameCreateCommand;
import uidiagram.diagram.edit.commands.MenuButtonCreateCommand;
import uidiagram.diagram.edit.commands.NotebookCreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.ScrollBarCreateCommand;
import uidiagram.diagram.edit.commands.SeparatorCreateCommand;
import uidiagram.diagram.edit.commands.SpinBoxCreateCommand;
import uidiagram.diagram.edit.commands.TextInputCreateCommand;
import uidiagram.diagram.edit.commands.TreeViewCreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class GroupGroupLstChildModelElementsCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstChildModelElementsCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Group_3002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new Group2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new CheckBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.TextInput_3006 == req.getElementType()) {
			return getGEFWrapper(new TextInputCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3007 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Frame_3008 == req.getElementType()) {
			return getGEFWrapper(new FrameCreateCommand(req));
		}
		if (UidiagramElementTypes.LabelFrame_3009 == req.getElementType()) {
			return getGEFWrapper(new LabelFrameCreateCommand(req));
		}
		if (UidiagramElementTypes.MenuButton_3010 == req.getElementType()) {
			return getGEFWrapper(new MenuButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.ScrollBar_3011 == req.getElementType()) {
			return getGEFWrapper(new ScrollBarCreateCommand(req));
		}
		if (UidiagramElementTypes.SpinBox_3012 == req.getElementType()) {
			return getGEFWrapper(new SpinBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3013 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.Notebook_3014 == req.getElementType()) {
			return getGEFWrapper(new NotebookCreateCommand(req));
		}
		if (UidiagramElementTypes.Separator_3015 == req.getElementType()) {
			return getGEFWrapper(new SeparatorCreateCommand(req));
		}
		if (UidiagramElementTypes.TreeView_3016 == req.getElementType()) {
			return getGEFWrapper(new TreeViewCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
