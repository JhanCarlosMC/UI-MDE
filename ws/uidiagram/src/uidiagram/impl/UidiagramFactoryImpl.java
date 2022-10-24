/**
 */
package uidiagram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uidiagram.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagramFactoryImpl extends EFactoryImpl implements UidiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UidiagramFactory init() {
		try {
			UidiagramFactory theUidiagramFactory = (UidiagramFactory)EPackage.Registry.INSTANCE.getEFactory(UidiagramPackage.eNS_URI);
			if (theUidiagramFactory != null) {
				return theUidiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UidiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UidiagramPackage.MODEL_FACTORY: return createModelFactory();
			case UidiagramPackage.UI_DIAGRAM: return createUI_Diagram();
			case UidiagramPackage.USER_INTERFACE: return createUserInterface();
			case UidiagramPackage.MODEL_ELEMENT: return createModelElement();
			case UidiagramPackage.GRAPHICAL_CONTAINER: return createGraphicalContainer();
			case UidiagramPackage.GRAPHICAL_INDIVIDUAL: return createGraphicalIndividual();
			case UidiagramPackage.TREEVIEW: return createTreeview();
			case UidiagramPackage.BUTTON: return createButton();
			case UidiagramPackage.LABEL: return createLabel();
			case UidiagramPackage.CHECK_BUTTON: return createCheckButton();
			case UidiagramPackage.ENTRY: return createEntry();
			case UidiagramPackage.RADIO_BUTTON: return createRadioButton();
			case UidiagramPackage.SPIN_BOX: return createSpinBox();
			case UidiagramPackage.COMBO_BOX: return createComboBox();
			case UidiagramPackage.SEPARATOR: return createSeparator();
			case UidiagramPackage.COLUMN: return createColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactory() {
		ModelFactoryImpl modelFactory = new ModelFactoryImpl();
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI_Diagram createUI_Diagram() {
		UI_DiagramImpl uI_Diagram = new UI_DiagramImpl();
		return uI_Diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterface createUserInterface() {
		UserInterfaceImpl userInterface = new UserInterfaceImpl();
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainer() {
		GraphicalContainerImpl graphicalContainer = new GraphicalContainerImpl();
		return graphicalContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividual createGraphicalIndividual() {
		GraphicalIndividualImpl graphicalIndividual = new GraphicalIndividualImpl();
		return graphicalIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Treeview createTreeview() {
		TreeviewImpl treeview = new TreeviewImpl();
		return treeview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckButton createCheckButton() {
		CheckButtonImpl checkButton = new CheckButtonImpl();
		return checkButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadioButton createRadioButton() {
		RadioButtonImpl radioButton = new RadioButtonImpl();
		return radioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpinBox createSpinBox() {
		SpinBoxImpl spinBox = new SpinBoxImpl();
		return spinBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox createComboBox() {
		ComboBoxImpl comboBox = new ComboBoxImpl();
		return comboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramPackage getUidiagramPackage() {
		return (UidiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UidiagramPackage getPackage() {
		return UidiagramPackage.eINSTANCE;
	}

} //UidiagramFactoryImpl
