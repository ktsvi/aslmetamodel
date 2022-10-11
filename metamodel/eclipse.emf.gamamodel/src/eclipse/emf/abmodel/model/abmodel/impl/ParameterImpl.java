/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl#getParamName <em>Param Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ParameterImpl#getTargetVariable <em>Target Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter {
	/**
	 * The default value of the '{@link #getParamName() <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamName() <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected String paramName = PARAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetVariable() <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetVariable() <em>Target Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVariable()
	 * @generated
	 * @ordered
	 */
	protected String targetVariable = TARGET_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamName() {
		return paramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName(String newParamName) {
		String oldParamName = paramName;
		paramName = newParamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PARAMETER__PARAM_NAME, oldParamName, paramName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetVariable() {
		return targetVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVariable(String newTargetVariable) {
		String oldTargetVariable = targetVariable;
		targetVariable = newTargetVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PARAMETER__TARGET_VARIABLE, oldTargetVariable, targetVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.PARAMETER__PARAM_NAME:
				return getParamName();
			case AbmodelPackage.PARAMETER__TARGET_VARIABLE:
				return getTargetVariable();
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
			case AbmodelPackage.PARAMETER__PARAM_NAME:
				setParamName((String)newValue);
				return;
			case AbmodelPackage.PARAMETER__TARGET_VARIABLE:
				setTargetVariable((String)newValue);
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
			case AbmodelPackage.PARAMETER__PARAM_NAME:
				setParamName(PARAM_NAME_EDEFAULT);
				return;
			case AbmodelPackage.PARAMETER__TARGET_VARIABLE:
				setTargetVariable(TARGET_VARIABLE_EDEFAULT);
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
			case AbmodelPackage.PARAMETER__PARAM_NAME:
				return PARAM_NAME_EDEFAULT == null ? paramName != null : !PARAM_NAME_EDEFAULT.equals(paramName);
			case AbmodelPackage.PARAMETER__TARGET_VARIABLE:
				return TARGET_VARIABLE_EDEFAULT == null ? targetVariable != null : !TARGET_VARIABLE_EDEFAULT.equals(targetVariable);
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
		result.append(" (paramName: ");
		result.append(paramName);
		result.append(", targetVariable: ");
		result.append(targetVariable);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
