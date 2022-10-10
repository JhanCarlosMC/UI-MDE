/**
 */
package uidiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uidiagram.UidiagramFactory
 * @model kind="package"
 * @generated
 */
public interface UidiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uidiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uidiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uidiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidiagramPackage eINSTANCE = uidiagram.impl.UidiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelFactoryImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst UI Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_UI_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UI_DiagramImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUI_Diagram()
	 * @generated
	 */
	int UI_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>List User Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__LIST_USER_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.UserInterfaceImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__ID_MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_X = 4;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_Y = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGTH = 7;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = 8;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT = 9;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT_SIZE = 10;

	/**
	 * The feature id for the '<em><b>Lst Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LST_MODEL_ELEMENTS = 11;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ModelElementImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID_MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_X = 3;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_Y = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGTH = 6;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BACKGROUND_COLOR = 7;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT = 8;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TITLE_FONT_SIZE = 9;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GraphicalContainerImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__ID_MODEL_ELEMENT = MODEL_ELEMENT__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__COLOR = MODEL_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GraphicalIndividualImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalIndividual()
	 * @generated
	 */
	int GRAPHICAL_INDIVIDUAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT = MODEL_ELEMENT__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__COLOR = MODEL_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__HEIGTH = MODEL_ELEMENT__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT = MODEL_ELEMENT__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE = MODEL_ELEMENT__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Graphical Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.GroupImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = GRAPHICAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID_MODEL_ELEMENT = GRAPHICAL_CONTAINER__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLOR = GRAPHICAL_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT = GRAPHICAL_CONTAINER__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER__TITLE_FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.LabelImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.CheckBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TextInputImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.RadioButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.FrameImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.LabelFrameImpl <em>Label Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.LabelFrameImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getLabelFrame()
	 * @generated
	 */
	int LABEL_FRAME = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Label Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FRAME_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.MenuButtonImpl <em>Menu Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.MenuButtonImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getMenuButton()
	 * @generated
	 */
	int MENU_BUTTON = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Menu Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ScrollBarImpl <em>Scroll Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ScrollBarImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getScrollBar()
	 * @generated
	 */
	int SCROLL_BAR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Scroll Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCROLL_BAR_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.SpinBoxImpl <em>Spin Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.SpinBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getSpinBox()
	 * @generated
	 */
	int SPIN_BOX = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Spin Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPIN_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.ComboBoxImpl <em>Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.ComboBoxImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getComboBox()
	 * @generated
	 */
	int COMBO_BOX = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.NotebookImpl <em>Notebook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.NotebookImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getNotebook()
	 * @generated
	 */
	int NOTEBOOK = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Notebook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.SeparatorImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uidiagram.impl.TreeViewImpl <em>Tree View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uidiagram.impl.TreeViewImpl
	 * @see uidiagram.impl.UidiagramPackageImpl#getTreeView()
	 * @generated
	 */
	int TREE_VIEW = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Id Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__ID_MODEL_ELEMENT = GRAPHICAL_INDIVIDUAL__ID_MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__COLOR = GRAPHICAL_INDIVIDUAL__COLOR;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__TITLE_FONT = GRAPHICAL_INDIVIDUAL__TITLE_FONT;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW__TITLE_FONT_SIZE = GRAPHICAL_INDIVIDUAL__TITLE_FONT_SIZE;

	/**
	 * The number of structural features of the '<em>Tree View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_VIEW_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link uidiagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see uidiagram.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst UI Diagrams</em>'.
	 * @see uidiagram.ModelFactory#getLstUI_Diagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstUI_Diagrams();

	/**
	 * Returns the meta object for class '{@link uidiagram.UI_Diagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see uidiagram.UI_Diagram
	 * @generated
	 */
	EClass getUI_Diagram();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.UI_Diagram#getListUserInterface <em>List User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List User Interface</em>'.
	 * @see uidiagram.UI_Diagram#getListUserInterface()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_ListUserInterface();

	/**
	 * Returns the meta object for class '{@link uidiagram.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see uidiagram.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.UserInterface#getName()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uidiagram.UserInterface#getTitle()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Title();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getIdModelElement <em>Id Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Model Element</em>'.
	 * @see uidiagram.UserInterface#getIdModelElement()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_IdModelElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see uidiagram.UserInterface#getColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Color();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.UserInterface#getPositionX()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.UserInterface#getPositionY()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see uidiagram.UserInterface#getHeigth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.UserInterface#getBackgroundColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see uidiagram.UserInterface#getTitleFont()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.UserInterface#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see uidiagram.UserInterface#getTitleFontSize()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFontSize();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.UserInterface#getLstModelElements <em>Lst Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Model Elements</em>'.
	 * @see uidiagram.UserInterface#getLstModelElements()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LstModelElements();

	/**
	 * Returns the meta object for class '{@link uidiagram.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see uidiagram.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uidiagram.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getIdModelElement <em>Id Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Model Element</em>'.
	 * @see uidiagram.ModelElement#getIdModelElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_IdModelElement();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see uidiagram.ModelElement#getColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Color();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see uidiagram.ModelElement#getPositionX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see uidiagram.ModelElement#getPositionY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uidiagram.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see uidiagram.ModelElement#getHeigth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see uidiagram.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see uidiagram.ModelElement#getTitleFont()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link uidiagram.ModelElement#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see uidiagram.ModelElement#getTitleFontSize()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_TitleFontSize();

	/**
	 * Returns the meta object for class '{@link uidiagram.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see uidiagram.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uidiagram.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Model Elements</em>'.
	 * @see uidiagram.GraphicalContainer#getLstChildModelElements()
	 * @see #getGraphicalContainer()
	 * @generated
	 */
	EReference getGraphicalContainer_LstChildModelElements();

	/**
	 * Returns the meta object for class '{@link uidiagram.GraphicalIndividual <em>Graphical Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Individual</em>'.
	 * @see uidiagram.GraphicalIndividual
	 * @generated
	 */
	EClass getGraphicalIndividual();

	/**
	 * Returns the meta object for class '{@link uidiagram.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see uidiagram.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link uidiagram.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uidiagram.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see uidiagram.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link uidiagram.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see uidiagram.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see uidiagram.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for class '{@link uidiagram.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see uidiagram.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see uidiagram.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for class '{@link uidiagram.LabelFrame <em>Label Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Frame</em>'.
	 * @see uidiagram.LabelFrame
	 * @generated
	 */
	EClass getLabelFrame();

	/**
	 * Returns the meta object for class '{@link uidiagram.MenuButton <em>Menu Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu Button</em>'.
	 * @see uidiagram.MenuButton
	 * @generated
	 */
	EClass getMenuButton();

	/**
	 * Returns the meta object for class '{@link uidiagram.ScrollBar <em>Scroll Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scroll Bar</em>'.
	 * @see uidiagram.ScrollBar
	 * @generated
	 */
	EClass getScrollBar();

	/**
	 * Returns the meta object for class '{@link uidiagram.SpinBox <em>Spin Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spin Box</em>'.
	 * @see uidiagram.SpinBox
	 * @generated
	 */
	EClass getSpinBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Box</em>'.
	 * @see uidiagram.ComboBox
	 * @generated
	 */
	EClass getComboBox();

	/**
	 * Returns the meta object for class '{@link uidiagram.Notebook <em>Notebook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notebook</em>'.
	 * @see uidiagram.Notebook
	 * @generated
	 */
	EClass getNotebook();

	/**
	 * Returns the meta object for class '{@link uidiagram.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see uidiagram.Separator
	 * @generated
	 */
	EClass getSeparator();

	/**
	 * Returns the meta object for class '{@link uidiagram.TreeView <em>Tree View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree View</em>'.
	 * @see uidiagram.TreeView
	 * @generated
	 */
	EClass getTreeView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidiagramFactory getUidiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelFactoryImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst UI Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_UI_DIAGRAMS = eINSTANCE.getModelFactory_LstUI_Diagrams();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UI_DiagramImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUI_Diagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUI_Diagram();

		/**
		 * The meta object literal for the '<em><b>List User Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__LIST_USER_INTERFACE = eINSTANCE.getUI_Diagram_ListUserInterface();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.UserInterfaceImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__NAME = eINSTANCE.getUserInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE = eINSTANCE.getUserInterface_Title();

		/**
		 * The meta object literal for the '<em><b>Id Model Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__ID_MODEL_ELEMENT = eINSTANCE.getUserInterface_IdModelElement();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__COLOR = eINSTANCE.getUserInterface_Color();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_X = eINSTANCE.getUserInterface_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_Y = eINSTANCE.getUserInterface_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGTH = eINSTANCE.getUserInterface_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__BACKGROUND_COLOR = eINSTANCE.getUserInterface_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT = eINSTANCE.getUserInterface_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT_SIZE = eINSTANCE.getUserInterface_TitleFontSize();

		/**
		 * The meta object literal for the '<em><b>Lst Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LST_MODEL_ELEMENTS = eINSTANCE.getUserInterface_LstModelElements();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ModelElementImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id Model Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ID_MODEL_ELEMENT = eINSTANCE.getModelElement_IdModelElement();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__COLOR = eINSTANCE.getModelElement_Color();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_X = eINSTANCE.getModelElement_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_Y = eINSTANCE.getModelElement_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WIDTH = eINSTANCE.getModelElement_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGTH = eINSTANCE.getModelElement_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT = eINSTANCE.getModelElement_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__TITLE_FONT_SIZE = eINSTANCE.getModelElement_TitleFontSize();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GraphicalContainerImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EClass GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Lst Child Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = eINSTANCE.getGraphicalContainer_LstChildModelElements();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GraphicalIndividualImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGraphicalIndividual()
		 * @generated
		 */
		EClass GRAPHICAL_INDIVIDUAL = eINSTANCE.getGraphicalIndividual();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.GroupImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.LabelImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.CheckBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TextInputImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.RadioButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.FrameImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.LabelFrameImpl <em>Label Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.LabelFrameImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getLabelFrame()
		 * @generated
		 */
		EClass LABEL_FRAME = eINSTANCE.getLabelFrame();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.MenuButtonImpl <em>Menu Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.MenuButtonImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getMenuButton()
		 * @generated
		 */
		EClass MENU_BUTTON = eINSTANCE.getMenuButton();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ScrollBarImpl <em>Scroll Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ScrollBarImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getScrollBar()
		 * @generated
		 */
		EClass SCROLL_BAR = eINSTANCE.getScrollBar();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.SpinBoxImpl <em>Spin Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.SpinBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getSpinBox()
		 * @generated
		 */
		EClass SPIN_BOX = eINSTANCE.getSpinBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.ComboBoxImpl <em>Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.ComboBoxImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getComboBox()
		 * @generated
		 */
		EClass COMBO_BOX = eINSTANCE.getComboBox();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.NotebookImpl <em>Notebook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.NotebookImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getNotebook()
		 * @generated
		 */
		EClass NOTEBOOK = eINSTANCE.getNotebook();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.SeparatorImpl <em>Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.SeparatorImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getSeparator()
		 * @generated
		 */
		EClass SEPARATOR = eINSTANCE.getSeparator();

		/**
		 * The meta object literal for the '{@link uidiagram.impl.TreeViewImpl <em>Tree View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uidiagram.impl.TreeViewImpl
		 * @see uidiagram.impl.UidiagramPackageImpl#getTreeView()
		 * @generated
		 */
		EClass TREE_VIEW = eINSTANCE.getTreeView();

	}

} //UidiagramPackage
