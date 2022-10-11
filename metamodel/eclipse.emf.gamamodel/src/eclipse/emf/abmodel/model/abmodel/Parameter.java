/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Parameter#getParamName <em>Param Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Parameter#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getParameter()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name</em>' attribute.
	 * @see #setParamName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getParameter_ParamName()
	 * @model
	 * @generated
	 */
	String getParamName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Parameter#getParamName <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name</em>' attribute.
	 * @see #getParamName()
	 * @generated
	 */
	void setParamName(String value);

	/**
	 * Returns the value of the '<em><b>Target Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Variable</em>' attribute.
	 * @see #setTargetVariable(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getParameter_TargetVariable()
	 * @model
	 * @generated
	 */
	String getTargetVariable();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Parameter#getTargetVariable <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Variable</em>' attribute.
	 * @see #getTargetVariable()
	 * @generated
	 */
	void setTargetVariable(String value);

} // Parameter
