/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.ExperimentBlock;
import eclipse.emf.abmodel.model.abmodel.Output;
import eclipse.emf.abmodel.model.abmodel.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Experiment Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl#getHasPa <em>Has Pa</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl#getType <em>Type</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ExperimentBlockImpl#getExpName <em>Exp Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentBlockImpl extends MinimalEObjectImpl.Container implements ExperimentBlock {
	/**
	 * The cached value of the '{@link #getHasPa() <em>Has Pa</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPa()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> hasPa;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> output;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "gui";

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
	 * The default value of the '{@link #getExpName() <em>Exp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpName() <em>Exp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpName()
	 * @generated
	 * @ordered
	 */
	protected String expName = EXP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.EXPERIMENT_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getHasPa() {
		if (hasPa == null) {
			hasPa = new EObjectContainmentEList<Parameter>(Parameter.class, this, AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA);
		}
		return hasPa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Output> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<Output>(Output.class, this, AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT);
		}
		return output;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.EXPERIMENT_BLOCK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpName() {
		return expName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpName(String newExpName) {
		String oldExpName = expName;
		expName = newExpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.EXPERIMENT_BLOCK__EXP_NAME, oldExpName, expName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA:
				return ((InternalEList<?>)getHasPa()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA:
				return getHasPa();
			case AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT:
				return getOutput();
			case AbmodelPackage.EXPERIMENT_BLOCK__TYPE:
				return getType();
			case AbmodelPackage.EXPERIMENT_BLOCK__EXP_NAME:
				return getExpName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA:
				getHasPa().clear();
				getHasPa().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Output>)newValue);
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__TYPE:
				setType((String)newValue);
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__EXP_NAME:
				setExpName((String)newValue);
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
			case AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA:
				getHasPa().clear();
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT:
				getOutput().clear();
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AbmodelPackage.EXPERIMENT_BLOCK__EXP_NAME:
				setExpName(EXP_NAME_EDEFAULT);
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
			case AbmodelPackage.EXPERIMENT_BLOCK__HAS_PA:
				return hasPa != null && !hasPa.isEmpty();
			case AbmodelPackage.EXPERIMENT_BLOCK__OUTPUT:
				return output != null && !output.isEmpty();
			case AbmodelPackage.EXPERIMENT_BLOCK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AbmodelPackage.EXPERIMENT_BLOCK__EXP_NAME:
				return EXP_NAME_EDEFAULT == null ? expName != null : !EXP_NAME_EDEFAULT.equals(expName);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", expName: ");
		result.append(expName);
		result.append(')');
		return result.toString();
	}

} //ExperimentBlockImpl
