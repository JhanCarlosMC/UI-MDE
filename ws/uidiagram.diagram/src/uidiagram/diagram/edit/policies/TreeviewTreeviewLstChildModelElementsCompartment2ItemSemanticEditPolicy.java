/*
* 
*/
package uidiagram.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uidiagram.diagram.edit.commands.ButtonCreateCommand;
import uidiagram.diagram.edit.commands.CheckButtonCreateCommand;
import uidiagram.diagram.edit.commands.ColumnCreateCommand;
import uidiagram.diagram.edit.commands.ComboBoxCreateCommand;
import uidiagram.diagram.edit.commands.EntryCreateCommand;
import uidiagram.diagram.edit.commands.LabelCreateCommand;
import uidiagram.diagram.edit.commands.RadioButtonCreateCommand;
import uidiagram.diagram.edit.commands.SeparatorCreateCommand;
import uidiagram.diagram.edit.commands.SpinBoxCreateCommand;
import uidiagram.diagram.edit.commands.Treeview2CreateCommand;
import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class TreeviewTreeviewLstChildModelElementsCompartment2ItemSemanticEditPolicy
		extends UidiagramBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TreeviewTreeviewLstChildModelElementsCompartment2ItemSemanticEditPolicy() {
		super(UidiagramElementTypes.Treeview_3040);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UidiagramElementTypes.Treeview_3040 == req.getElementType()) {
			return getGEFWrapper(new Treeview2CreateCommand(req));
		}
		if (UidiagramElementTypes.Button_3041 == req.getElementType()) {
			return getGEFWrapper(new ButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Label_3042 == req.getElementType()) {
			return getGEFWrapper(new LabelCreateCommand(req));
		}
		if (UidiagramElementTypes.CheckButton_3043 == req.getElementType()) {
			return getGEFWrapper(new CheckButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.Entry_3044 == req.getElementType()) {
			return getGEFWrapper(new EntryCreateCommand(req));
		}
		if (UidiagramElementTypes.RadioButton_3045 == req.getElementType()) {
			return getGEFWrapper(new RadioButtonCreateCommand(req));
		}
		if (UidiagramElementTypes.SpinBox_3046 == req.getElementType()) {
			return getGEFWrapper(new SpinBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.ComboBox_3047 == req.getElementType()) {
			return getGEFWrapper(new ComboBoxCreateCommand(req));
		}
		if (UidiagramElementTypes.Separator_3048 == req.getElementType()) {
			return getGEFWrapper(new SeparatorCreateCommand(req));
		}
		if (UidiagramElementTypes.Column_3049 == req.getElementType()) {
			return getGEFWrapper(new ColumnCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
