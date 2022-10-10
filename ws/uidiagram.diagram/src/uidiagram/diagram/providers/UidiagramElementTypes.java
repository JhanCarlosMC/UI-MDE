/*
 * 
 */
package uidiagram.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import uidiagram.UidiagramPackage;
import uidiagram.diagram.edit.parts.Button2EditPart;
import uidiagram.diagram.edit.parts.ButtonEditPart;
import uidiagram.diagram.edit.parts.CheckBox2EditPart;
import uidiagram.diagram.edit.parts.CheckBoxEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.Frame2EditPart;
import uidiagram.diagram.edit.parts.FrameEditPart;
import uidiagram.diagram.edit.parts.Group2EditPart;
import uidiagram.diagram.edit.parts.GroupEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.LabelFrame2EditPart;
import uidiagram.diagram.edit.parts.LabelFrameEditPart;
import uidiagram.diagram.edit.parts.MenuButton2EditPart;
import uidiagram.diagram.edit.parts.MenuButtonEditPart;
import uidiagram.diagram.edit.parts.Notebook2EditPart;
import uidiagram.diagram.edit.parts.NotebookEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.ScrollBar2EditPart;
import uidiagram.diagram.edit.parts.ScrollBarEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.TextInput2EditPart;
import uidiagram.diagram.edit.parts.TextInputEditPart;
import uidiagram.diagram.edit.parts.TreeView2EditPart;
import uidiagram.diagram.edit.parts.TreeViewEditPart;
import uidiagram.diagram.edit.parts.UI_DiagramEditPart;
import uidiagram.diagram.edit.parts.UserInterfaceEditPart;
import uidiagram.diagram.part.UidiagramDiagramEditorPlugin;

/**
 * @generated
 */
public class UidiagramElementTypes {

	/**
	* @generated
	*/
	private UidiagramElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			UidiagramDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType UI_Diagram_1000 = getElementType("uidiagram.diagram.UI_Diagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserInterface_2001 = getElementType("uidiagram.diagram.UserInterface_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3001 = getElementType("uidiagram.diagram.Group_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Group_3002 = getElementType("uidiagram.diagram.Group_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3003 = getElementType("uidiagram.diagram.Button_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3004 = getElementType("uidiagram.diagram.Label_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3005 = getElementType("uidiagram.diagram.CheckBox_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3006 = getElementType("uidiagram.diagram.TextInput_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3007 = getElementType("uidiagram.diagram.RadioButton_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Frame_3008 = getElementType("uidiagram.diagram.Frame_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LabelFrame_3009 = getElementType("uidiagram.diagram.LabelFrame_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MenuButton_3010 = getElementType("uidiagram.diagram.MenuButton_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ScrollBar_3011 = getElementType("uidiagram.diagram.ScrollBar_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SpinBox_3012 = getElementType("uidiagram.diagram.SpinBox_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3013 = getElementType("uidiagram.diagram.ComboBox_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notebook_3014 = getElementType("uidiagram.diagram.Notebook_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Separator_3015 = getElementType("uidiagram.diagram.Separator_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TreeView_3016 = getElementType("uidiagram.diagram.TreeView_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3031 = getElementType("uidiagram.diagram.Column_3031"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Button_3017 = getElementType("uidiagram.diagram.Button_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3018 = getElementType("uidiagram.diagram.Label_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3019 = getElementType("uidiagram.diagram.CheckBox_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TextInput_3020 = getElementType("uidiagram.diagram.TextInput_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3021 = getElementType("uidiagram.diagram.RadioButton_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Frame_3022 = getElementType("uidiagram.diagram.Frame_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LabelFrame_3023 = getElementType("uidiagram.diagram.LabelFrame_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MenuButton_3024 = getElementType("uidiagram.diagram.MenuButton_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ScrollBar_3025 = getElementType("uidiagram.diagram.ScrollBar_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SpinBox_3026 = getElementType("uidiagram.diagram.SpinBox_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3027 = getElementType("uidiagram.diagram.ComboBox_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Notebook_3028 = getElementType("uidiagram.diagram.Notebook_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Separator_3029 = getElementType("uidiagram.diagram.Separator_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TreeView_3030 = getElementType("uidiagram.diagram.TreeView_3030"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Column_3032 = getElementType("uidiagram.diagram.Column_3032"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(UI_Diagram_1000, UidiagramPackage.eINSTANCE.getUI_Diagram());

			elements.put(UserInterface_2001, UidiagramPackage.eINSTANCE.getUserInterface());

			elements.put(Group_3001, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Group_3002, UidiagramPackage.eINSTANCE.getGroup());

			elements.put(Button_3003, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3004, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3005, UidiagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3006, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(RadioButton_3007, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(Frame_3008, UidiagramPackage.eINSTANCE.getFrame());

			elements.put(LabelFrame_3009, UidiagramPackage.eINSTANCE.getLabelFrame());

			elements.put(MenuButton_3010, UidiagramPackage.eINSTANCE.getMenuButton());

			elements.put(ScrollBar_3011, UidiagramPackage.eINSTANCE.getScrollBar());

			elements.put(SpinBox_3012, UidiagramPackage.eINSTANCE.getSpinBox());

			elements.put(ComboBox_3013, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(Notebook_3014, UidiagramPackage.eINSTANCE.getNotebook());

			elements.put(Separator_3015, UidiagramPackage.eINSTANCE.getSeparator());

			elements.put(TreeView_3016, UidiagramPackage.eINSTANCE.getTreeView());

			elements.put(Column_3031, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(Button_3017, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3018, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckBox_3019, UidiagramPackage.eINSTANCE.getCheckBox());

			elements.put(TextInput_3020, UidiagramPackage.eINSTANCE.getTextInput());

			elements.put(RadioButton_3021, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(Frame_3022, UidiagramPackage.eINSTANCE.getFrame());

			elements.put(LabelFrame_3023, UidiagramPackage.eINSTANCE.getLabelFrame());

			elements.put(MenuButton_3024, UidiagramPackage.eINSTANCE.getMenuButton());

			elements.put(ScrollBar_3025, UidiagramPackage.eINSTANCE.getScrollBar());

			elements.put(SpinBox_3026, UidiagramPackage.eINSTANCE.getSpinBox());

			elements.put(ComboBox_3027, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(Notebook_3028, UidiagramPackage.eINSTANCE.getNotebook());

			elements.put(Separator_3029, UidiagramPackage.eINSTANCE.getSeparator());

			elements.put(TreeView_3030, UidiagramPackage.eINSTANCE.getTreeView());

			elements.put(Column_3032, UidiagramPackage.eINSTANCE.getColumn());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(UI_Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(UserInterface_2001);
			KNOWN_ELEMENT_TYPES.add(Group_3001);
			KNOWN_ELEMENT_TYPES.add(Group_3002);
			KNOWN_ELEMENT_TYPES.add(Button_3003);
			KNOWN_ELEMENT_TYPES.add(Label_3004);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3005);
			KNOWN_ELEMENT_TYPES.add(TextInput_3006);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3007);
			KNOWN_ELEMENT_TYPES.add(Frame_3008);
			KNOWN_ELEMENT_TYPES.add(LabelFrame_3009);
			KNOWN_ELEMENT_TYPES.add(MenuButton_3010);
			KNOWN_ELEMENT_TYPES.add(ScrollBar_3011);
			KNOWN_ELEMENT_TYPES.add(SpinBox_3012);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3013);
			KNOWN_ELEMENT_TYPES.add(Notebook_3014);
			KNOWN_ELEMENT_TYPES.add(Separator_3015);
			KNOWN_ELEMENT_TYPES.add(TreeView_3016);
			KNOWN_ELEMENT_TYPES.add(Column_3031);
			KNOWN_ELEMENT_TYPES.add(Button_3017);
			KNOWN_ELEMENT_TYPES.add(Label_3018);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3019);
			KNOWN_ELEMENT_TYPES.add(TextInput_3020);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3021);
			KNOWN_ELEMENT_TYPES.add(Frame_3022);
			KNOWN_ELEMENT_TYPES.add(LabelFrame_3023);
			KNOWN_ELEMENT_TYPES.add(MenuButton_3024);
			KNOWN_ELEMENT_TYPES.add(ScrollBar_3025);
			KNOWN_ELEMENT_TYPES.add(SpinBox_3026);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3027);
			KNOWN_ELEMENT_TYPES.add(Notebook_3028);
			KNOWN_ELEMENT_TYPES.add(Separator_3029);
			KNOWN_ELEMENT_TYPES.add(TreeView_3030);
			KNOWN_ELEMENT_TYPES.add(Column_3032);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case UI_DiagramEditPart.VISUAL_ID:
			return UI_Diagram_1000;
		case UserInterfaceEditPart.VISUAL_ID:
			return UserInterface_2001;
		case GroupEditPart.VISUAL_ID:
			return Group_3001;
		case Group2EditPart.VISUAL_ID:
			return Group_3002;
		case ButtonEditPart.VISUAL_ID:
			return Button_3003;
		case LabelEditPart.VISUAL_ID:
			return Label_3004;
		case CheckBoxEditPart.VISUAL_ID:
			return CheckBox_3005;
		case TextInputEditPart.VISUAL_ID:
			return TextInput_3006;
		case RadioButtonEditPart.VISUAL_ID:
			return RadioButton_3007;
		case FrameEditPart.VISUAL_ID:
			return Frame_3008;
		case LabelFrameEditPart.VISUAL_ID:
			return LabelFrame_3009;
		case MenuButtonEditPart.VISUAL_ID:
			return MenuButton_3010;
		case ScrollBarEditPart.VISUAL_ID:
			return ScrollBar_3011;
		case SpinBoxEditPart.VISUAL_ID:
			return SpinBox_3012;
		case ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3013;
		case NotebookEditPart.VISUAL_ID:
			return Notebook_3014;
		case SeparatorEditPart.VISUAL_ID:
			return Separator_3015;
		case TreeViewEditPart.VISUAL_ID:
			return TreeView_3016;
		case ColumnEditPart.VISUAL_ID:
			return Column_3031;
		case Button2EditPart.VISUAL_ID:
			return Button_3017;
		case Label2EditPart.VISUAL_ID:
			return Label_3018;
		case CheckBox2EditPart.VISUAL_ID:
			return CheckBox_3019;
		case TextInput2EditPart.VISUAL_ID:
			return TextInput_3020;
		case RadioButton2EditPart.VISUAL_ID:
			return RadioButton_3021;
		case Frame2EditPart.VISUAL_ID:
			return Frame_3022;
		case LabelFrame2EditPart.VISUAL_ID:
			return LabelFrame_3023;
		case MenuButton2EditPart.VISUAL_ID:
			return MenuButton_3024;
		case ScrollBar2EditPart.VISUAL_ID:
			return ScrollBar_3025;
		case SpinBox2EditPart.VISUAL_ID:
			return SpinBox_3026;
		case ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3027;
		case Notebook2EditPart.VISUAL_ID:
			return Notebook_3028;
		case Separator2EditPart.VISUAL_ID:
			return Separator_3029;
		case TreeView2EditPart.VISUAL_ID:
			return TreeView_3030;
		case Column2EditPart.VISUAL_ID:
			return Column_3032;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return uidiagram.diagram.providers.UidiagramElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return uidiagram.diagram.providers.UidiagramElementTypes.getElement(elementTypeAdapter);
		}
	};

}
