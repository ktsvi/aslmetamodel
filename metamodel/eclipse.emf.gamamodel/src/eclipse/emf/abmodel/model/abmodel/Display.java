/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayType <em>Display Type</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getDisplay()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface Display extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getDisplay_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Type</em>' attribute.
	 * @see #setDisplayType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getDisplay_DisplayType()
	 * @model
	 * @generated
	 */
	String getDisplayType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Display#getDisplayType <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Type</em>' attribute.
	 * @see #getDisplayType()
	 * @generated
	 */
	void setDisplayType(String value);

} // Display
