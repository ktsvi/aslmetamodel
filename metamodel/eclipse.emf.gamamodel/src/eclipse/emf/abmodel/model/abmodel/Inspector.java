/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Inspector#getInspectorName <em>Inspector Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Inspector#getAgentValue <em>Agent Value</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Inspector#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getInspector()
 * @model
 * @generated
 */
public interface Inspector extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspector Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspector Name</em>' attribute.
	 * @see #setInspectorName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getInspector_InspectorName()
	 * @model
	 * @generated
	 */
	String getInspectorName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getInspectorName <em>Inspector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspector Name</em>' attribute.
	 * @see #getInspectorName()
	 * @generated
	 */
	void setInspectorName(String value);

	/**
	 * Returns the value of the '<em><b>Agent Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Value</em>' attribute.
	 * @see #setAgentValue(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getInspector_AgentValue()
	 * @model
	 * @generated
	 */
	String getAgentValue();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getAgentValue <em>Agent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Value</em>' attribute.
	 * @see #getAgentValue()
	 * @generated
	 */
	void setAgentValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getInspector_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Inspector#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Inspector
