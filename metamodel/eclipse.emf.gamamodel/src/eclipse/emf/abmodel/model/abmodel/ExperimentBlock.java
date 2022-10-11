/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getHasPa <em>Has Pa</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getOutput <em>Output</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getType <em>Type</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getExpName <em>Exp Name</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExperimentBlock()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface ExperimentBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Pa</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Pa</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExperimentBlock_HasPa()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getHasPa();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExperimentBlock_Output()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Output> getOutput();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"gui"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExperimentBlock_Type()
	 * @model default="gui"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Exp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Name</em>' attribute.
	 * @see #setExpName(String)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getExperimentBlock_ExpName()
	 * @model
	 * @generated
	 */
	String getExpName();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.ExperimentBlock#getExpName <em>Exp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Name</em>' attribute.
	 * @see #getExpName()
	 * @generated
	 */
	void setExpName(String value);

} // ExperimentBlock
