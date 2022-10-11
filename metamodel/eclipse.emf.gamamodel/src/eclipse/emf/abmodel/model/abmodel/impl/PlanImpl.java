/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Plan;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.PlanImpl#getPlanName <em>Plan Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.PlanImpl#getIntention <em>Intention</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanImpl extends MinimalEObjectImpl.Container implements Plan {
	/**
	 * The default value of the '{@link #getPlanName() <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanName() <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanName()
	 * @generated
	 * @ordered
	 */
	protected String planName = PLAN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntention() <em>Intention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntention()
	 * @generated
	 * @ordered
	 */
	protected String intention = INTENTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanName(String newPlanName) {
		String oldPlanName = planName;
		planName = newPlanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PLAN__PLAN_NAME, oldPlanName, planName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntention() {
		return intention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntention(String newIntention) {
		String oldIntention = intention;
		intention = newIntention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PLAN__INTENTION, oldIntention, intention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.PLAN__PLAN_NAME:
				return getPlanName();
			case AbmodelPackage.PLAN__INTENTION:
				return getIntention();
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
			case AbmodelPackage.PLAN__PLAN_NAME:
				setPlanName((String)newValue);
				return;
			case AbmodelPackage.PLAN__INTENTION:
				setIntention((String)newValue);
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
			case AbmodelPackage.PLAN__PLAN_NAME:
				setPlanName(PLAN_NAME_EDEFAULT);
				return;
			case AbmodelPackage.PLAN__INTENTION:
				setIntention(INTENTION_EDEFAULT);
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
			case AbmodelPackage.PLAN__PLAN_NAME:
				return PLAN_NAME_EDEFAULT == null ? planName != null : !PLAN_NAME_EDEFAULT.equals(planName);
			case AbmodelPackage.PLAN__INTENTION:
				return INTENTION_EDEFAULT == null ? intention != null : !INTENTION_EDEFAULT.equals(intention);
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
		result.append(" (planName: ");
		result.append(planName);
		result.append(", intention: ");
		result.append(intention);
		result.append(')');
		return result.toString();
	}

} //PlanImpl
