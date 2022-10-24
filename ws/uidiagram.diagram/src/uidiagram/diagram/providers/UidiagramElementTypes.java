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
import uidiagram.diagram.edit.parts.CheckButton2EditPart;
import uidiagram.diagram.edit.parts.CheckButtonEditPart;
import uidiagram.diagram.edit.parts.Column2EditPart;
import uidiagram.diagram.edit.parts.ColumnEditPart;
import uidiagram.diagram.edit.parts.ComboBox2EditPart;
import uidiagram.diagram.edit.parts.ComboBoxEditPart;
import uidiagram.diagram.edit.parts.Entry2EditPart;
import uidiagram.diagram.edit.parts.EntryEditPart;
import uidiagram.diagram.edit.parts.Label2EditPart;
import uidiagram.diagram.edit.parts.LabelEditPart;
import uidiagram.diagram.edit.parts.RadioButton2EditPart;
import uidiagram.diagram.edit.parts.RadioButtonEditPart;
import uidiagram.diagram.edit.parts.Separator2EditPart;
import uidiagram.diagram.edit.parts.SeparatorEditPart;
import uidiagram.diagram.edit.parts.SpinBox2EditPart;
import uidiagram.diagram.edit.parts.SpinBoxEditPart;
import uidiagram.diagram.edit.parts.Treeview2EditPart;
import uidiagram.diagram.edit.parts.TreeviewEditPart;
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
	public static final IElementType Treeview_3033 = getElementType("uidiagram.diagram.Treeview_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Treeview_3040 = getElementType("uidiagram.diagram.Treeview_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_3041 = getElementType("uidiagram.diagram.Button_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3042 = getElementType("uidiagram.diagram.Label_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckButton_3043 = getElementType("uidiagram.diagram.CheckButton_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entry_3044 = getElementType("uidiagram.diagram.Entry_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3045 = getElementType("uidiagram.diagram.RadioButton_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SpinBox_3046 = getElementType("uidiagram.diagram.SpinBox_3046"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ComboBox_3047 = getElementType("uidiagram.diagram.ComboBox_3047"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Separator_3048 = getElementType("uidiagram.diagram.Separator_3048"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Column_3049 = getElementType("uidiagram.diagram.Column_3049"); //$NON-NLS-1$
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
	public static final IElementType CheckButton_3038 = getElementType("uidiagram.diagram.CheckButton_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entry_3039 = getElementType("uidiagram.diagram.Entry_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RadioButton_3021 = getElementType("uidiagram.diagram.RadioButton_3021"); //$NON-NLS-1$
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
	public static final IElementType Separator_3029 = getElementType("uidiagram.diagram.Separator_3029"); //$NON-NLS-1$
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

			elements.put(Treeview_3033, UidiagramPackage.eINSTANCE.getTreeview());

			elements.put(Treeview_3040, UidiagramPackage.eINSTANCE.getTreeview());

			elements.put(Button_3041, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3042, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckButton_3043, UidiagramPackage.eINSTANCE.getCheckButton());

			elements.put(Entry_3044, UidiagramPackage.eINSTANCE.getEntry());

			elements.put(RadioButton_3045, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(SpinBox_3046, UidiagramPackage.eINSTANCE.getSpinBox());

			elements.put(ComboBox_3047, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(Separator_3048, UidiagramPackage.eINSTANCE.getSeparator());

			elements.put(Column_3049, UidiagramPackage.eINSTANCE.getColumn());

			elements.put(Button_3017, UidiagramPackage.eINSTANCE.getButton());

			elements.put(Label_3018, UidiagramPackage.eINSTANCE.getLabel());

			elements.put(CheckButton_3038, UidiagramPackage.eINSTANCE.getCheckButton());

			elements.put(Entry_3039, UidiagramPackage.eINSTANCE.getEntry());

			elements.put(RadioButton_3021, UidiagramPackage.eINSTANCE.getRadioButton());

			elements.put(SpinBox_3026, UidiagramPackage.eINSTANCE.getSpinBox());

			elements.put(ComboBox_3027, UidiagramPackage.eINSTANCE.getComboBox());

			elements.put(Separator_3029, UidiagramPackage.eINSTANCE.getSeparator());

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
			KNOWN_ELEMENT_TYPES.add(Treeview_3033);
			KNOWN_ELEMENT_TYPES.add(Treeview_3040);
			KNOWN_ELEMENT_TYPES.add(Button_3041);
			KNOWN_ELEMENT_TYPES.add(Label_3042);
			KNOWN_ELEMENT_TYPES.add(CheckButton_3043);
			KNOWN_ELEMENT_TYPES.add(Entry_3044);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3045);
			KNOWN_ELEMENT_TYPES.add(SpinBox_3046);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3047);
			KNOWN_ELEMENT_TYPES.add(Separator_3048);
			KNOWN_ELEMENT_TYPES.add(Column_3049);
			KNOWN_ELEMENT_TYPES.add(Button_3017);
			KNOWN_ELEMENT_TYPES.add(Label_3018);
			KNOWN_ELEMENT_TYPES.add(CheckButton_3038);
			KNOWN_ELEMENT_TYPES.add(Entry_3039);
			KNOWN_ELEMENT_TYPES.add(RadioButton_3021);
			KNOWN_ELEMENT_TYPES.add(SpinBox_3026);
			KNOWN_ELEMENT_TYPES.add(ComboBox_3027);
			KNOWN_ELEMENT_TYPES.add(Separator_3029);
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
		case TreeviewEditPart.VISUAL_ID:
			return Treeview_3033;
		case Treeview2EditPart.VISUAL_ID:
			return Treeview_3040;
		case ButtonEditPart.VISUAL_ID:
			return Button_3041;
		case LabelEditPart.VISUAL_ID:
			return Label_3042;
		case CheckButtonEditPart.VISUAL_ID:
			return CheckButton_3043;
		case EntryEditPart.VISUAL_ID:
			return Entry_3044;
		case RadioButtonEditPart.VISUAL_ID:
			return RadioButton_3045;
		case SpinBoxEditPart.VISUAL_ID:
			return SpinBox_3046;
		case ComboBoxEditPart.VISUAL_ID:
			return ComboBox_3047;
		case SeparatorEditPart.VISUAL_ID:
			return Separator_3048;
		case ColumnEditPart.VISUAL_ID:
			return Column_3049;
		case Button2EditPart.VISUAL_ID:
			return Button_3017;
		case Label2EditPart.VISUAL_ID:
			return Label_3018;
		case CheckButton2EditPart.VISUAL_ID:
			return CheckButton_3038;
		case Entry2EditPart.VISUAL_ID:
			return Entry_3039;
		case RadioButton2EditPart.VISUAL_ID:
			return RadioButton_3021;
		case SpinBox2EditPart.VISUAL_ID:
			return SpinBox_3026;
		case ComboBox2EditPart.VISUAL_ID:
			return ComboBox_3027;
		case Separator2EditPart.VISUAL_ID:
			return Separator_3029;
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
