/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Plan#getPlanName <em>Plan Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Plan#getIntention <em>Intention</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getPlan()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Plan extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Name</em>' attribute.
	 * @see #setPlanName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getPlan_PlanName()
	 * @model
	 * @generated
	 */
	String getPlanName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Plan#getPlanName <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Name</em>' attribute.
	 * @see #getPlanName()
	 * @generated
	 */
	void setPlanName(String value);

	/**
	 * Returns the value of the '<em><b>Intention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intention</em>' attribute.
	 * @see #setIntention(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getPlan_Intention()
	 * @model
	 * @generated
	 */
	String getIntention();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Plan#getIntention <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intention</em>' attribute.
	 * @see #getIntention()
	 * @generated
	 */
	void setIntention(String value);

} // Plan
