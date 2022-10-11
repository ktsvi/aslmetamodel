/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#isInit <em>Init</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getGvarName <em>Gvar Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getType <em>Type</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalVariable()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface GlobalVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalVariable_Init()
	 * @model default="false"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

	/**
	 * Returns the value of the '<em><b>Gvar Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gvar Name</em>' attribute.
	 * @see #setGvarName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalVariable_GvarName()
	 * @model
	 * @generated
	 */
	String getGvarName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getGvarName <em>Gvar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gvar Name</em>' attribute.
	 * @see #getGvarName()
	 * @generated
	 */
	void setGvarName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' attribute.
	 * @see #setInitValue(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalVariable_InitValue()
	 * @model
	 * @generated
	 */
	String getInitValue();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalVariable#getInitValue <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' attribute.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(String value);

} // GlobalVariable
