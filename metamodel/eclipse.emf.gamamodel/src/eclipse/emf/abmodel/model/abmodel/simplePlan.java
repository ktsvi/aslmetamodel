/**
 */
package eclipse.emf.abmodel.model.abmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.simplePlan#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getsimplePlan()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface simplePlan extends Plan {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getsimplePlan_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.simplePlan#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

} // simplePlan
