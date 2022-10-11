/**
 */
package eclipse.emf.abmodel.model.abmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsGl <em>Contains Gl</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getContainsSE <em>Contains SE</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getId <em>Id</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#isInit <em>Init</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalBlock()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface GlobalBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Gl</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Gl</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalBlock_ContainsGl()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GlobalVariable> getContainsGl();

	/**
	 * Returns the value of the '<em><b>Contains SE</b></em>' containment reference list.
	 * The list contents are of type {@link eclipse.emf.abmodel.model.abmodel.SpatialEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains SE</em>' containment reference list.
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalBlock_ContainsSE()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SpatialEntity> getContainsSE();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalBlock_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getGlobalBlock_Init()
	 * @model default="false"
	 * @generated
	 */
	boolean isInit();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.GlobalBlock#isInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #isInit()
	 * @generated
	 */
	void setInit(boolean value);

} // GlobalBlock
