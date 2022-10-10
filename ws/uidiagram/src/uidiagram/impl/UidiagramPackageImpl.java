/**
 */
package uidiagram.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uidiagram.Button;
import uidiagram.CheckBox;
import uidiagram.Column;
import uidiagram.ComboBox;
import uidiagram.Frame;
import uidiagram.GraphicalContainer;
import uidiagram.GraphicalIndividual;
import uidiagram.Group;
import uidiagram.Label;
import uidiagram.LabelFrame;
import uidiagram.MenuButton;
import uidiagram.ModelElement;
import uidiagram.ModelFactory;
import uidiagram.Notebook;
import uidiagram.RadioButton;
import uidiagram.ScrollBar;
import uidiagram.Separator;
import uidiagram.SpinBox;
import uidiagram.TextInput;
import uidiagram.TreeView;
import uidiagram.UI_Diagram;
import uidiagram.UidiagramFactory;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidiagramPackageImpl extends EPackageImpl implements UidiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uI_DiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicalIndividualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrollBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notebookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uidiagram.UidiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UidiagramPackageImpl() {
		super(eNS_URI, UidiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UidiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UidiagramPackage init() {
		if (isInited) return (UidiagramPackage)EPackage.Registry.INSTANCE.getEPackage(UidiagramPackage.eNS_URI);

		// Obtain or create and register package
		UidiagramPackageImpl theUidiagramPackage = (UidiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UidiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UidiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUidiagramPackage.createPackageContents();

		// Initialize created meta-data
		theUidiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUidiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UidiagramPackage.eNS_URI, theUidiagramPackage);
		return theUidiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_LstUI_Diagrams() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUI_Diagram() {
		return uI_DiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUI_Diagram_ListUserInterface() {
		return (EReference)uI_DiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInterface() {
		return userInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Name() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Title() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_IdModelElement() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Color() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_PositionX() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_PositionY() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Width() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Height() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_BackgroundColor() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_TitleFont() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_TitleFontSize() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_PathImage() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserInterface_Style() {
		return (EAttribute)userInterfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserInterface_LstModelElements() {
		return (EReference)userInterfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Name() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_IdModelElement() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Color() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_PositionX() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_PositionY() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Width() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Height() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_BackgroundColor() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_TitleFont() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_TitleFontSize() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_PathImage() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Style() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalContainer() {
		return graphicalContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphicalContainer_LstChildModelElements() {
		return (EReference)graphicalContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalIndividual() {
		return graphicalIndividualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextInput() {
		return textInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadioButton() {
		return radioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelFrame() {
		return labelFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuButton() {
		return menuButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrollBar() {
		return scrollBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinBox() {
		return spinBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComboBox() {
		return comboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotebook() {
		return notebookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeView() {
		return treeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidiagramFactory getUidiagramFactory() {
		return (UidiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__LST_UI_DIAGRAMS);

		uI_DiagramEClass = createEClass(UI_DIAGRAM);
		createEReference(uI_DiagramEClass, UI_DIAGRAM__LIST_USER_INTERFACE);

		userInterfaceEClass = createEClass(USER_INTERFACE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__NAME);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__ID_MODEL_ELEMENT);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__COLOR);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__POSITION_X);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__POSITION_Y);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__WIDTH);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__HEIGHT);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__BACKGROUND_COLOR);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE_FONT);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__TITLE_FONT_SIZE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__PATH_IMAGE);
		createEAttribute(userInterfaceEClass, USER_INTERFACE__STYLE);
		createEReference(userInterfaceEClass, USER_INTERFACE__LST_MODEL_ELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__ID_MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__COLOR);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__POSITION_X);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__POSITION_Y);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__WIDTH);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__HEIGHT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__BACKGROUND_COLOR);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TITLE_FONT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__TITLE_FONT_SIZE);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__PATH_IMAGE);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__STYLE);

		graphicalContainerEClass = createEClass(GRAPHICAL_CONTAINER);
		createEReference(graphicalContainerEClass, GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS);

		graphicalIndividualEClass = createEClass(GRAPHICAL_INDIVIDUAL);

		groupEClass = createEClass(GROUP);

		buttonEClass = createEClass(BUTTON);

		labelEClass = createEClass(LABEL);

		checkBoxEClass = createEClass(CHECK_BOX);

		textInputEClass = createEClass(TEXT_INPUT);

		radioButtonEClass = createEClass(RADIO_BUTTON);

		frameEClass = createEClass(FRAME);

		labelFrameEClass = createEClass(LABEL_FRAME);

		menuButtonEClass = createEClass(MENU_BUTTON);

		scrollBarEClass = createEClass(SCROLL_BAR);

		spinBoxEClass = createEClass(SPIN_BOX);

		comboBoxEClass = createEClass(COMBO_BOX);

		notebookEClass = createEClass(NOTEBOOK);

		separatorEClass = createEClass(SEPARATOR);

		treeViewEClass = createEClass(TREE_VIEW);

		columnEClass = createEClass(COLUMN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		graphicalContainerEClass.getESuperTypes().add(this.getModelElement());
		graphicalIndividualEClass.getESuperTypes().add(this.getModelElement());
		groupEClass.getESuperTypes().add(this.getGraphicalContainer());
		buttonEClass.getESuperTypes().add(this.getGraphicalIndividual());
		labelEClass.getESuperTypes().add(this.getGraphicalIndividual());
		checkBoxEClass.getESuperTypes().add(this.getGraphicalIndividual());
		textInputEClass.getESuperTypes().add(this.getGraphicalIndividual());
		radioButtonEClass.getESuperTypes().add(this.getGraphicalIndividual());
		frameEClass.getESuperTypes().add(this.getGraphicalIndividual());
		labelFrameEClass.getESuperTypes().add(this.getGraphicalIndividual());
		menuButtonEClass.getESuperTypes().add(this.getGraphicalIndividual());
		scrollBarEClass.getESuperTypes().add(this.getGraphicalIndividual());
		spinBoxEClass.getESuperTypes().add(this.getGraphicalIndividual());
		comboBoxEClass.getESuperTypes().add(this.getGraphicalIndividual());
		notebookEClass.getESuperTypes().add(this.getGraphicalIndividual());
		separatorEClass.getESuperTypes().add(this.getGraphicalIndividual());
		treeViewEClass.getESuperTypes().add(this.getGraphicalIndividual());
		columnEClass.getESuperTypes().add(this.getGraphicalIndividual());

		// Initialize classes and features; add operations and parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_LstUI_Diagrams(), this.getUI_Diagram(), null, "lstUI_Diagrams", null, 0, -1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uI_DiagramEClass, UI_Diagram.class, "UI_Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUI_Diagram_ListUserInterface(), this.getUserInterface(), null, "listUserInterface", null, 0, -1, UI_Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInterfaceEClass, UserInterface.class, "UserInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Title(), ecorePackage.getEString(), "title", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_IdModelElement(), ecorePackage.getEString(), "idModelElement", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Color(), ecorePackage.getEString(), "color", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_PositionX(), ecorePackage.getEInt(), "positionX", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_PositionY(), ecorePackage.getEInt(), "positionY", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Width(), ecorePackage.getEInt(), "width", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Height(), ecorePackage.getEInt(), "height", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_TitleFont(), ecorePackage.getEString(), "titleFont", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_TitleFontSize(), ecorePackage.getEString(), "titleFontSize", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_PathImage(), ecorePackage.getEString(), "pathImage", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserInterface_Style(), ecorePackage.getEString(), "style", null, 0, 1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserInterface_LstModelElements(), this.getModelElement(), null, "lstModelElements", null, 0, -1, UserInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_IdModelElement(), ecorePackage.getEString(), "idModelElement", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Color(), ecorePackage.getEString(), "color", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_PositionX(), ecorePackage.getEInt(), "positionX", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_PositionY(), ecorePackage.getEInt(), "positionY", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Width(), ecorePackage.getEInt(), "width", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Height(), ecorePackage.getEInt(), "height", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_TitleFont(), ecorePackage.getEString(), "titleFont", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_TitleFontSize(), ecorePackage.getEString(), "titleFontSize", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_PathImage(), ecorePackage.getEString(), "pathImage", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Style(), ecorePackage.getEString(), "style", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalContainerEClass, GraphicalContainer.class, "GraphicalContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphicalContainer_LstChildModelElements(), this.getModelElement(), null, "lstChildModelElements", null, 0, -1, GraphicalContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalIndividualEClass, GraphicalIndividual.class, "GraphicalIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textInputEClass, TextInput.class, "TextInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(radioButtonEClass, RadioButton.class, "RadioButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelFrameEClass, LabelFrame.class, "LabelFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(menuButtonEClass, MenuButton.class, "MenuButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scrollBarEClass, ScrollBar.class, "ScrollBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spinBoxEClass, SpinBox.class, "SpinBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(comboBoxEClass, ComboBox.class, "ComboBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notebookEClass, Notebook.class, "Notebook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(treeViewEClass, TreeView.class, "TreeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";	
		addAnnotation
		  (uI_DiagramEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (userInterfaceEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (buttonEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (labelEClass, 
		   source, 
		   new String[] {
			 "label", "name",
			 "figure", "rectangle"
		   });	
		addAnnotation
		  (checkBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (textInputEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (radioButtonEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (frameEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (labelFrameEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (menuButtonEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (scrollBarEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (spinBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (comboBoxEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (notebookEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (separatorEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (treeViewEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getUserInterface_LstModelElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGraphicalContainer_LstChildModelElements(), 
		   source, 
		   new String[] {
		   });
	}

} //UidiagramPackageImpl
