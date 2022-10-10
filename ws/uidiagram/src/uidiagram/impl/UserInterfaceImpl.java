/**
 */
package uidiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uidiagram.ModelElement;
import uidiagram.UidiagramPackage;
import uidiagram.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getIdModelElement <em>Id Model Element</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getColor <em>Color</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getPositionX <em>Position X</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getPositionY <em>Position Y</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getTitleFont <em>Title Font</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getTitleFontSize <em>Title Font Size</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getPathImage <em>Path Image</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link uidiagram.impl.UserInterfaceImpl#getLstModelElements <em>Lst Model Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserInterfaceImpl extends EObjectImpl implements UserInterface {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdModelElement() <em>Id Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdModelElement()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_MODEL_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdModelElement() <em>Id Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdModelElement()
	 * @generated
	 * @ordered
	 */
	protected String idModelElement = ID_MODEL_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionX() <em>Position X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionX()
	 * @generated
	 * @ordered
	 */
	protected int positionX = POSITION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPositionY() <em>Position Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionY()
	 * @generated
	 * @ordered
	 */
	protected int positionY = POSITION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFont() <em>Title Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFont()
	 * @generated
	 * @ordered
	 */
	protected String titleFont = TITLE_FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitleFontSize() <em>Title Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleFontSize()
	 * @generated
	 * @ordered
	 */
	protected String titleFontSize = TITLE_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathImage() <em>Path Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathImage()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathImage() <em>Path Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathImage()
	 * @generated
	 * @ordered
	 */
	protected String pathImage = PATH_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLstModelElements() <em>Lst Model Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> lstModelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidiagramPackage.Literals.USER_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdModelElement() {
		return idModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdModelElement(String newIdModelElement) {
		String oldIdModelElement = idModelElement;
		idModelElement = newIdModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__ID_MODEL_ELEMENT, oldIdModelElement, idModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionX() {
		return positionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionX(int newPositionX) {
		int oldPositionX = positionX;
		positionX = newPositionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__POSITION_X, oldPositionX, positionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPositionY() {
		return positionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionY(int newPositionY) {
		int oldPositionY = positionY;
		positionY = newPositionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__POSITION_Y, oldPositionY, positionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleFont() {
		return titleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFont(String newTitleFont) {
		String oldTitleFont = titleFont;
		titleFont = newTitleFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__TITLE_FONT, oldTitleFont, titleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitleFontSize() {
		return titleFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitleFontSize(String newTitleFontSize) {
		String oldTitleFontSize = titleFontSize;
		titleFontSize = newTitleFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE, oldTitleFontSize, titleFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathImage() {
		return pathImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathImage(String newPathImage) {
		String oldPathImage = pathImage;
		pathImage = newPathImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__PATH_IMAGE, oldPathImage, pathImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidiagramPackage.USER_INTERFACE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getLstModelElements() {
		if (lstModelElements == null) {
			lstModelElements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS);
		}
		return lstModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				return ((InternalEList<?>)getLstModelElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidiagramPackage.USER_INTERFACE__NAME:
				return getName();
			case UidiagramPackage.USER_INTERFACE__TITLE:
				return getTitle();
			case UidiagramPackage.USER_INTERFACE__ID_MODEL_ELEMENT:
				return getIdModelElement();
			case UidiagramPackage.USER_INTERFACE__COLOR:
				return getColor();
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				return getPositionX();
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				return getPositionY();
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				return getWidth();
			case UidiagramPackage.USER_INTERFACE__HEIGHT:
				return getHeight();
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT:
				return getTitleFont();
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE:
				return getTitleFontSize();
			case UidiagramPackage.USER_INTERFACE__PATH_IMAGE:
				return getPathImage();
			case UidiagramPackage.USER_INTERFACE__STYLE:
				return getStyle();
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				return getLstModelElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidiagramPackage.USER_INTERFACE__NAME:
				setName((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE:
				setTitle((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__ID_MODEL_ELEMENT:
				setIdModelElement((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__COLOR:
				setColor((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				setPositionX((Integer)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				setPositionY((Integer)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT:
				setTitleFont((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE:
				setTitleFontSize((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__PATH_IMAGE:
				setPathImage((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__STYLE:
				setStyle((String)newValue);
				return;
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				getLstModelElements().clear();
				getLstModelElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UidiagramPackage.USER_INTERFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__ID_MODEL_ELEMENT:
				setIdModelElement(ID_MODEL_ELEMENT_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				setPositionX(POSITION_X_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				setPositionY(POSITION_Y_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT:
				setTitleFont(TITLE_FONT_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE:
				setTitleFontSize(TITLE_FONT_SIZE_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__PATH_IMAGE:
				setPathImage(PATH_IMAGE_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				getLstModelElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UidiagramPackage.USER_INTERFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidiagramPackage.USER_INTERFACE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case UidiagramPackage.USER_INTERFACE__ID_MODEL_ELEMENT:
				return ID_MODEL_ELEMENT_EDEFAULT == null ? idModelElement != null : !ID_MODEL_ELEMENT_EDEFAULT.equals(idModelElement);
			case UidiagramPackage.USER_INTERFACE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case UidiagramPackage.USER_INTERFACE__POSITION_X:
				return positionX != POSITION_X_EDEFAULT;
			case UidiagramPackage.USER_INTERFACE__POSITION_Y:
				return positionY != POSITION_Y_EDEFAULT;
			case UidiagramPackage.USER_INTERFACE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case UidiagramPackage.USER_INTERFACE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case UidiagramPackage.USER_INTERFACE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT:
				return TITLE_FONT_EDEFAULT == null ? titleFont != null : !TITLE_FONT_EDEFAULT.equals(titleFont);
			case UidiagramPackage.USER_INTERFACE__TITLE_FONT_SIZE:
				return TITLE_FONT_SIZE_EDEFAULT == null ? titleFontSize != null : !TITLE_FONT_SIZE_EDEFAULT.equals(titleFontSize);
			case UidiagramPackage.USER_INTERFACE__PATH_IMAGE:
				return PATH_IMAGE_EDEFAULT == null ? pathImage != null : !PATH_IMAGE_EDEFAULT.equals(pathImage);
			case UidiagramPackage.USER_INTERFACE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case UidiagramPackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				return lstModelElements != null && !lstModelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", title: ");
		result.append(title);
		result.append(", idModelElement: ");
		result.append(idModelElement);
		result.append(", color: ");
		result.append(color);
		result.append(", positionX: ");
		result.append(positionX);
		result.append(", positionY: ");
		result.append(positionY);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", titleFont: ");
		result.append(titleFont);
		result.append(", titleFontSize: ");
		result.append(titleFontSize);
		result.append(", pathImage: ");
		result.append(pathImage);
		result.append(", style: ");
		result.append(style);
		result.append(')');
		return result.toString();
	}

} //UserInterfaceImpl
