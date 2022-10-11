/**
 */
package eclipse.emf.abmodel.model.abmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reflex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Reflex#isExistReflex <em>Exist Reflex</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.Reflex#isGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getReflex()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Reflex extends Plan {
	/**
	 * Returns the value of the '<em><b>Exist Reflex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exist Reflex</em>' attribute.
	 * @see #setExistReflex(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getReflex_ExistReflex()
	 * @model
	 * @generated
	 */
	boolean isExistReflex();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Reflex#isExistReflex <em>Exist Reflex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exist Reflex</em>' attribute.
	 * @see #isExistReflex()
	 * @generated
	 */
	void setExistReflex(boolean value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(boolean)
	 * @see eclipse.emf.abmodel.model.abmodel.AbmodelPackage#getReflex_Goal()
	 * @model
	 * @generated
	 */
	boolean isGoal();

	/**
	 * Sets the value of the '{@link eclipse.emf.abmodel.model.abmodel.Reflex#isGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #isGoal()
	 * @generated
	 */
	void setGoal(boolean value);

} // Reflex
