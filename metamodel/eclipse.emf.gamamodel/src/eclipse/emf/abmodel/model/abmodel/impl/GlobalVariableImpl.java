/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.GlobalVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl#isInit <em>Init</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl#getGvarName <em>Gvar Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalVariableImpl#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalVariableImpl extends MinimalEObjectImpl.Container implements GlobalVariable {
	/**
	 * The default value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInit()
	 * @generated
	 * @ordered
	 */
	protected boolean init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGvarName() <em>Gvar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGvarName()
	 * @generated
	 * @ordered
	 */
	protected static final String GVAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGvarName() <em>Gvar Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGvarName()
	 * @generated
	 * @ordered
	 */
	protected String gvarName = GVAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected String initValue = INIT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.GLOBAL_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(boolean newInit) {
		boolean oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_VARIABLE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGvarName() {
		return gvarName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGvarName(String newGvarName) {
		String oldGvarName = gvarName;
		gvarName = newGvarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_VARIABLE__GVAR_NAME, oldGvarName, gvarName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValue(String newInitValue) {
		String oldInitValue = initValue;
		initValue = newInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_VARIABLE__INIT_VALUE, oldInitValue, initValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.GLOBAL_VARIABLE__INIT:
				return isInit();
			case AbmodelPackage.GLOBAL_VARIABLE__GVAR_NAME:
				return getGvarName();
			case AbmodelPackage.GLOBAL_VARIABLE__TYPE:
				return getType();
			case AbmodelPackage.GLOBAL_VARIABLE__INIT_VALUE:
				return getInitValue();
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
			case AbmodelPackage.GLOBAL_VARIABLE__INIT:
				setInit((Boolean)newValue);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__GVAR_NAME:
				setGvarName((String)newValue);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__INIT_VALUE:
				setInitValue((String)newValue);
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
			case AbmodelPackage.GLOBAL_VARIABLE__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__GVAR_NAME:
				setGvarName(GVAR_NAME_EDEFAULT);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbmodelPackage.GLOBAL_VARIABLE__INIT_VALUE:
				setInitValue(INIT_VALUE_EDEFAULT);
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
			case AbmodelPackage.GLOBAL_VARIABLE__INIT:
				return init != INIT_EDEFAULT;
			case AbmodelPackage.GLOBAL_VARIABLE__GVAR_NAME:
				return GVAR_NAME_EDEFAULT == null ? gvarName != null : !GVAR_NAME_EDEFAULT.equals(gvarName);
			case AbmodelPackage.GLOBAL_VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbmodelPackage.GLOBAL_VARIABLE__INIT_VALUE:
				return INIT_VALUE_EDEFAULT == null ? initValue != null : !INIT_VALUE_EDEFAULT.equals(initValue);
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
		result.append(" (init: ");
		result.append(init);
		result.append(", gvarName: ");
		result.append(gvarName);
		result.append(", type: ");
		result.append(type);
		result.append(", initValue: ");
		result.append(initValue);
		result.append(')');
		return result.toString();
	}

} //GlobalVariableImpl
