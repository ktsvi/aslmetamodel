/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Reflex;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reflex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl#isExistReflex <em>Exist Reflex</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ReflexImpl#isGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReflexImpl extends PlanImpl implements Reflex {
	/**
	 * The default value of the '{@link #isExistReflex() <em>Exist Reflex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistReflex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXIST_REFLEX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExistReflex() <em>Exist Reflex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExistReflex()
	 * @generated
	 * @ordered
	 */
	protected boolean existReflex = EXIST_REFLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GOAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGoal()
	 * @generated
	 * @ordered
	 */
	protected boolean goal = GOAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReflexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.REFLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExistReflex() {
		return existReflex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExistReflex(boolean newExistReflex) {
		boolean oldExistReflex = existReflex;
		existReflex = newExistReflex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.REFLEX__EXIST_REFLEX, oldExistReflex, existReflex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(boolean newGoal) {
		boolean oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.REFLEX__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.REFLEX__EXIST_REFLEX:
				return isExistReflex();
			case AbmodelPackage.REFLEX__GOAL:
				return isGoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbmodelPackage.REFLEX__EXIST_REFLEX:
				setExistReflex((Boolean)newValue);
				return;
			case AbmodelPackage.REFLEX__GOAL:
				setGoal((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AbmodelPackage.REFLEX__EXIST_REFLEX:
				setExistReflex(EXIST_REFLEX_EDEFAULT);
				return;
			case AbmodelPackage.REFLEX__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AbmodelPackage.REFLEX__EXIST_REFLEX:
				return existReflex != EXIST_REFLEX_EDEFAULT;
			case AbmodelPackage.REFLEX__GOAL:
				return goal != GOAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (existReflex: ");
		result.append(existReflex);
		result.append(", goal: ");
		result.append(goal);
		result.append(')');
		return result.toString();
	}

} //ReflexImpl
