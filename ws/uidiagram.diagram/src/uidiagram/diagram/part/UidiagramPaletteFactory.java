
/*
 * 
 */
package uidiagram.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import uidiagram.diagram.providers.UidiagramElementTypes;

/**
 * @generated
 */
public class UidiagramPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createCheckButton2CreationTool());
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createComboBox4CreationTool());
		paletteContainer.add(createEntry5CreationTool());
		paletteContainer.add(createLabel6CreationTool());
		paletteContainer.add(createRadioButton7CreationTool());
		paletteContainer.add(createSeparator8CreationTool());
		paletteContainer.add(createSpinBox9CreationTool());
		paletteContainer.add(createTreeview10CreationTool());
		paletteContainer.add(createUserInterface11CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3041);
		types.add(UidiagramElementTypes.Button_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckButton2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.CheckButton_3043);
		types.add(UidiagramElementTypes.CheckButton_3038);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckButton2CreationTool_title,
				Messages.CheckButton2CreationTool_desc, types);
		entry.setId("createCheckButton2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.CheckButton_3043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createColumn3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Column_3049);
		types.add(UidiagramElementTypes.Column_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc, types);
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3049));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ComboBox_3047);
		types.add(UidiagramElementTypes.ComboBox_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox4CreationTool_title,
				Messages.ComboBox4CreationTool_desc, types);
		entry.setId("createComboBox4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntry5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Entry_3044);
		types.add(UidiagramElementTypes.Entry_3039);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entry5CreationTool_title,
				Messages.Entry5CreationTool_desc, types);
		entry.setId("createEntry5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Entry_3044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3042);
		types.add(UidiagramElementTypes.Label_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label6CreationTool_title,
				Messages.Label6CreationTool_desc, types);
		entry.setId("createLabel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.RadioButton_3045);
		types.add(UidiagramElementTypes.RadioButton_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton7CreationTool_title,
				Messages.RadioButton7CreationTool_desc, types);
		entry.setId("createRadioButton7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSeparator8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Separator_3048);
		types.add(UidiagramElementTypes.Separator_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Separator8CreationTool_title,
				Messages.Separator8CreationTool_desc, types);
		entry.setId("createSeparator8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Separator_3048));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSpinBox9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.SpinBox_3046);
		types.add(UidiagramElementTypes.SpinBox_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SpinBox9CreationTool_title,
				Messages.SpinBox9CreationTool_desc, types);
		entry.setId("createSpinBox9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.SpinBox_3046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTreeview10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Treeview_3033);
		types.add(UidiagramElementTypes.Treeview_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Treeview10CreationTool_title,
				Messages.Treeview10CreationTool_desc, types);
		entry.setId("createTreeview10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Treeview_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface11CreationTool_title,
				Messages.UserInterface11CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
