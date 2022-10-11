/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Output#getId <em>Id</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Output#getHasM <em>Has M</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Output#getContainsD <em>Contains D</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Output#getHasEF <em>Has EF</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Output#getHasI <em>Has I</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Output#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Has M</b></em>' reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Monitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has M</em>' reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput_HasM()
	 * @model required="true"
	 * @generated
	 */
	EList<Monitor> getHasM();

	/**
	 * Returns the value of the '<em><b>Contains D</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Display}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains D</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput_ContainsD()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Display> getContainsD();

	/**
	 * Returns the value of the '<em><b>Has EF</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.ExportFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has EF</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput_HasEF()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExportFile> getHasEF();

	/**
	 * Returns the value of the '<em><b>Has I</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.Inspector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has I</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getOutput_HasI()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Inspector> getHasI();

} // Output
