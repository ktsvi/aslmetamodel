/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Inspector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl#getInspectorName <em>Inspector Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl#getAgentValue <em>Agent Value</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.InspectorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectorImpl extends MinimalEObjectImpl.Container implements Inspector {
	/**
	 * The default value of the '{@link #getInspectorName() <em>Inspector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectorName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSPECTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInspectorName() <em>Inspector Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectorName()
	 * @generated
	 * @ordered
	 */
	protected String inspectorName = INSPECTOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentValue() <em>Agent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentValue()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentValue() <em>Agent Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentValue()
	 * @generated
	 * @ordered
	 */
	protected String agentValue = AGENT_VALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.INSPECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInspectorName() {
		return inspectorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInspectorName(String newInspectorName) {
		String oldInspectorName = inspectorName;
		inspectorName = newInspectorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.INSPECTOR__INSPECTOR_NAME, oldInspectorName, inspectorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentValue() {
		return agentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentValue(String newAgentValue) {
		String oldAgentValue = agentValue;
		agentValue = newAgentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.INSPECTOR__AGENT_VALUE, oldAgentValue, agentValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.INSPECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.INSPECTOR__INSPECTOR_NAME:
				return getInspectorName();
			case AbmodelPackage.INSPECTOR__AGENT_VALUE:
				return getAgentValue();
			case AbmodelPackage.INSPECTOR__TYPE:
				return getType();
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
			case AbmodelPackage.INSPECTOR__INSPECTOR_NAME:
				setInspectorName((String)newValue);
				return;
			case AbmodelPackage.INSPECTOR__AGENT_VALUE:
				setAgentValue((String)newValue);
				return;
			case AbmodelPackage.INSPECTOR__TYPE:
				setType((String)newValue);
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
			case AbmodelPackage.INSPECTOR__INSPECTOR_NAME:
				setInspectorName(INSPECTOR_NAME_EDEFAULT);
				return;
			case AbmodelPackage.INSPECTOR__AGENT_VALUE:
				setAgentValue(AGENT_VALUE_EDEFAULT);
				return;
			case AbmodelPackage.INSPECTOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case AbmodelPackage.INSPECTOR__INSPECTOR_NAME:
				return INSPECTOR_NAME_EDEFAULT == null ? inspectorName != null : !INSPECTOR_NAME_EDEFAULT.equals(inspectorName);
			case AbmodelPackage.INSPECTOR__AGENT_VALUE:
				return AGENT_VALUE_EDEFAULT == null ? agentValue != null : !AGENT_VALUE_EDEFAULT.equals(agentValue);
			case AbmodelPackage.INSPECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (inspectorName: ");
		result.append(inspectorName);
		result.append(", AgentValue: ");
		result.append(agentValue);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InspectorImpl
