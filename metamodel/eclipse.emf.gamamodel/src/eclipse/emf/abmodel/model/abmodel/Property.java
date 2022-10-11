/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Property#getNameofvariable <em>Nameofvariable</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Property#getAssociateValue <em>Associate Value</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Property#getDefaultType <em>Default Type</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {

	/**
	 * Returns the value of the '<em><b>Nameofvariable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nameofvariable</em>' attribute.
	 * @see #setNameofvariable(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getProperty_Nameofvariable()
	 * @model
	 * @generated
	 */
	String getNameofvariable();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Property#getNameofvariable <em>Nameofvariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nameofvariable</em>' attribute.
	 * @see #getNameofvariable()
	 * @generated
	 */
	void setNameofvariable(String value);

	/**
	 * Returns the value of the '<em><b>Associate Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate Value</em>' attribute.
	 * @see #setAssociateValue(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getProperty_AssociateValue()
	 * @model
	 * @generated
	 */
	String getAssociateValue();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Property#getAssociateValue <em>Associate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associate Value</em>' attribute.
	 * @see #getAssociateValue()
	 * @generated
	 */
	void setAssociateValue(String value);

	/**
	 * Returns the value of the '<em><b>Default Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Type</em>' attribute.
	 * @see #setDefaultType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getProperty_DefaultType()
	 * @model
	 * @generated
	 */
	String getDefaultType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Property#getDefaultType <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Type</em>' attribute.
	 * @see #getDefaultType()
	 * @generated
	 */
	void setDefaultType(String value);
} // Property
