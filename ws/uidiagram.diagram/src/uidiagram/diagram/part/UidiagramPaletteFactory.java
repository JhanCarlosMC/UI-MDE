
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
		paletteContainer.add(createColumn3CreationTool());
		paletteContainer.add(createComboBox4CreationTool());
		paletteContainer.add(createFrame5CreationTool());
		paletteContainer.add(createGroup6CreationTool());
		paletteContainer.add(createLabel7CreationTool());
		paletteContainer.add(createLabelFrame8CreationTool());
		paletteContainer.add(createMenuButton9CreationTool());
		paletteContainer.add(createNotebook10CreationTool());
		paletteContainer.add(createRadioButton11CreationTool());
		paletteContainer.add(createScrollBar12CreationTool());
		paletteContainer.add(createSeparator13CreationTool());
		paletteContainer.add(createSpinBox14CreationTool());
		paletteContainer.add(createTextInput15CreationTool());
		paletteContainer.add(createTreeView16CreationTool());
		paletteContainer.add(createUserInterface17CreationTool());
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
	private ToolEntry createColumn3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Column_3031);
		types.add(UidiagramElementTypes.Column_3032);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Column3CreationTool_title,
				Messages.Column3CreationTool_desc, types);
		entry.setId("createColumn3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Column_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComboBox4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ComboBox_3013);
		types.add(UidiagramElementTypes.ComboBox_3027);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ComboBox4CreationTool_title,
				Messages.ComboBox4CreationTool_desc, types);
		entry.setId("createComboBox4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ComboBox_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFrame5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Frame_3008);
		types.add(UidiagramElementTypes.Frame_3022);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Frame5CreationTool_title,
				Messages.Frame5CreationTool_desc, types);
		entry.setId("createFrame5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Frame_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Group_3001);
		types.add(UidiagramElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Group6CreationTool_title,
				Messages.Group6CreationTool_desc, types);
		entry.setId("createGroup6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Label_3004);
		types.add(UidiagramElementTypes.Label_3018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Label7CreationTool_title,
				Messages.Label7CreationTool_desc, types);
		entry.setId("createLabel7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabelFrame8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.LabelFrame_3009);
		types.add(UidiagramElementTypes.LabelFrame_3023);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.LabelFrame8CreationTool_title,
				Messages.LabelFrame8CreationTool_desc, types);
		entry.setId("createLabelFrame8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.LabelFrame_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMenuButton9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.MenuButton_3010);
		types.add(UidiagramElementTypes.MenuButton_3024);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MenuButton9CreationTool_title,
				Messages.MenuButton9CreationTool_desc, types);
		entry.setId("createMenuButton9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.MenuButton_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNotebook10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Notebook_3014);
		types.add(UidiagramElementTypes.Notebook_3028);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Notebook10CreationTool_title,
				Messages.Notebook10CreationTool_desc, types);
		entry.setId("createNotebook10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Notebook_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.RadioButton_3007);
		types.add(UidiagramElementTypes.RadioButton_3021);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RadioButton11CreationTool_title,
				Messages.RadioButton11CreationTool_desc, types);
		entry.setId("createRadioButton11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.RadioButton_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createScrollBar12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.ScrollBar_3011);
		types.add(UidiagramElementTypes.ScrollBar_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ScrollBar12CreationTool_title,
				Messages.ScrollBar12CreationTool_desc, types);
		entry.setId("createScrollBar12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.ScrollBar_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSeparator13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.Separator_3015);
		types.add(UidiagramElementTypes.Separator_3029);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Separator13CreationTool_title,
				Messages.Separator13CreationTool_desc, types);
		entry.setId("createSeparator13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.Separator_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSpinBox14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.SpinBox_3012);
		types.add(UidiagramElementTypes.SpinBox_3026);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SpinBox14CreationTool_title,
				Messages.SpinBox14CreationTool_desc, types);
		entry.setId("createSpinBox14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.SpinBox_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TextInput_3006);
		types.add(UidiagramElementTypes.TextInput_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextInput15CreationTool_title,
				Messages.TextInput15CreationTool_desc, types);
		entry.setId("createTextInput15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TextInput_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTreeView16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UidiagramElementTypes.TreeView_3016);
		types.add(UidiagramElementTypes.TreeView_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TreeView16CreationTool_title,
				Messages.TreeView16CreationTool_desc, types);
		entry.setId("createTreeView16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.TreeView_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.UserInterface17CreationTool_title,
				Messages.UserInterface17CreationTool_desc,
				Collections.singletonList(UidiagramElementTypes.UserInterface_2001));
		entry.setId("createUserInterface17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(UidiagramElementTypes.getImageDescriptor(UidiagramElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
