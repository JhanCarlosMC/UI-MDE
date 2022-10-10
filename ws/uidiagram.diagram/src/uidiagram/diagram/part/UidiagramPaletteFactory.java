
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
		paletteContainer.add(createCheckBox2CreationTool());
		paletteContainer.add(createComboBox3CreationTool());
		paletteContainer.add(createFrame4CreationTool());
		paletteContainer.add(createGroup5CreationTool());
		paletteContainer.add(createLabel6CreationTool());
		paletteContainer.add(createLabelFrame7CreationTool());
		paletteContainer.add(createMenuButton8CreationTool());
		paletteContainer.add(createNotebook9CreationTool());
		paletteContainer.add(createRadioButton10CreationTool());
		paletteContainer.add(createScrollBar11CreationTool());
		paletteContainer.add(createSeparator12CreationTool());
		paletteContainer.add(createSpinBox13CreationTool());
		paletteContainer.add(createTextInput14CreationTool());
		paletteContainer.add(createTreeView15CreationTool());
		paletteContainer.add(createUserInterface16CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Button_3003);
		types.add(UidiagramElementTypes.Button_3017);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Button1CreationTool_title,
				Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Button_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.CheckBox_3005);
		types.add(UidiagramElementTypes.CheckBox_3019);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CheckBox2CreationTool_title,
				Messages.CheckBox2CreationTool_desc, types);
		entry.setId("createCheckBox2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.CheckBox_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ComboBox_3013);
		types.add(UidiagramElementTypes.ComboBox_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox3CreationTool_title,
				Messages.ComboBox3CreationTool_desc, types);
		entry.setId("createComboBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFrame4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Frame_3008);
		types.add(UidiagramElementTypes.Frame_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Frame4CreationTool_title,
				Messages.Frame4CreationTool_desc, types);
		entry.setId("createFrame4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Frame_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Group_3001);
		types.add(UidiagramElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group5CreationTool_title,
				Messages.Group5CreationTool_desc, types);
		entry.setId("createGroup5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3004);
		types.add(UidiagramElementTypes.Label_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label6CreationTool_title,
				Messages.Label6CreationTool_desc, types);
		entry.setId("createLabel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabelFrame7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.LabelFrame_3009);
		types.add(UidiagramElementTypes.LabelFrame_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LabelFrame7CreationTool_title,
				Messages.LabelFrame7CreationTool_desc, types);
		entry.setId("createLabelFrame7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.LabelFrame_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMenuButton8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.MenuButton_3010);
		types.add(UidiagramElementTypes.MenuButton_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MenuButton8CreationTool_title,
				Messages.MenuButton8CreationTool_desc, types);
		entry.setId("createMenuButton8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.MenuButton_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotebook9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Notebook_3014);
		types.add(UidiagramElementTypes.Notebook_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Notebook9CreationTool_title,
				Messages.Notebook9CreationTool_desc, types);
		entry.setId("createNotebook9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Notebook_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.RadioButton_3007);
		types.add(UidiagramElementTypes.RadioButton_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton10CreationTool_title,
				Messages.RadioButton10CreationTool_desc, types);
		entry.setId("createRadioButton10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScrollBar11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ScrollBar_3011);
		types.add(UidiagramElementTypes.ScrollBar_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ScrollBar11CreationTool_title,
				Messages.ScrollBar11CreationTool_desc, types);
		entry.setId("createScrollBar11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ScrollBar_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSeparator12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Separator_3015);
		types.add(UidiagramElementTypes.Separator_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Separator12CreationTool_title,
				Messages.Separator12CreationTool_desc, types);
		entry.setId("createSeparator12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Separator_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSpinBox13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.SpinBox_3012);
		types.add(UidiagramElementTypes.SpinBox_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SpinBox13CreationTool_title,
				Messages.SpinBox13CreationTool_desc, types);
		entry.setId("createSpinBox13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.SpinBox_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TextInput_3006);
		types.add(UidiagramElementTypes.TextInput_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput14CreationTool_title,
				Messages.TextInput14CreationTool_desc, types);
		entry.setId("createTextInput14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TextInput_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTreeView15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TreeView_3016);
		types.add(UidiagramElementTypes.TreeView_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TreeView15CreationTool_title,
				Messages.TreeView15CreationTool_desc, types);
		entry.setId("createTreeView15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TreeView_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface16CreationTool_title,
				Messages.UserInterface16CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
