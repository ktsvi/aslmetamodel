/**
 */
package eclipse.emf.abmodel.model.abmodel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AB Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsG <em>Contains G</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsS <em>Contains S</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsE <em>Contains E</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getDescription <em>Description</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getAuthor <em>Author</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ABModel#getCreateOn <em>Create On</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface ABModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains G</em>' containment reference.
	 * @see #setContainsG(GlobalBlock)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_ContainsG()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalBlock getContainsG();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getContainsG <em>Contains G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains G</em>' containment reference.
	 * @see #getContainsG()
	 * @generated
	 */
	void setContainsG(GlobalBlock value);

	/**
	 * Returns the value of the '<em><b>Contains S</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.AgentBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains S</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_ContainsS()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AgentBlock> getContainsS();

	/**
	 * Returns the value of the '<em><b>Contains E</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains E</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_ContainsE()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExperimentBlock> getContainsE();

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Create On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create On</em>' attribute.
	 * @see #setCreateOn(Date)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getABModel_CreateOn()
	 * @model
	 * @generated
	 */
	Date getCreateOn();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ABModel#getCreateOn <em>Create On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create On</em>' attribute.
	 * @see #getCreateOn()
	 * @generated
	 */
	void setCreateOn(Date value);

} // ABModel
