/**
 */
package uidiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uidiagram.UI_Diagram#getListUserInterface <em>List User Interface</em>}</li>
 * </ul>
 *
 * @see uidiagram.UidiagramPackage#getUI_Diagram()
 * @model
 * @generated
 */
public interface UI_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>List User Interface</b></em>' containment reference list.
	 * The list contents are of type {@link uidiagram.UserInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List User Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List User Interface</em>' containment reference list.
	 * @see uidiagram.UidiagramPackage#getUI_Diagram_ListUserInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserInterface> getListUserInterface();

} // UI_Diagram
