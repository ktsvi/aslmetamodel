/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Display;
import eclipse.emf.abmodel.model.abmodel.ExportFile;
import eclipse.emf.abmodel.model.abmodel.Inspector;
import eclipse.emf.abmodel.model.abmodel.Monitor;
import eclipse.emf.abmodel.model.abmodel.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl#getId <em>Id</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl#getHasM <em>Has M</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl#getContainsD <em>Contains D</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl#getHasEF <em>Has EF</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.OutputImpl#getHasI <em>Has I</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends MinimalEObjectImpl.Container implements Output {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasM() <em>Has M</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasM()
	 * @generated
	 * @ordered
	 */
	protected EList<Monitor> hasM;

	/**
	 * The cached value of the '{@link #getContainsD() <em>Contains D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsD()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> containsD;

	/**
	 * The cached value of the '{@link #getHasEF() <em>Has EF</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEF()
	 * @generated
	 * @ordered
	 */
	protected EList<ExportFile> hasEF;

	/**
	 * The cached value of the '{@link #getHasI() <em>Has I</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasI()
	 * @generated
	 * @ordered
	 */
	protected EList<Inspector> hasI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.OUTPUT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Monitor> getHasM() {
		if (hasM == null) {
			hasM = new EObjectResolvingEList<Monitor>(Monitor.class, this, AbmodelPackage.OUTPUT__HAS_M);
		}
		return hasM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Display> getContainsD() {
		if (containsD == null) {
			containsD = new EObjectContainmentEList<Display>(Display.class, this, AbmodelPackage.OUTPUT__CONTAINS_D);
		}
		return containsD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExportFile> getHasEF() {
		if (hasEF == null) {
			hasEF = new EObjectContainmentEList<ExportFile>(ExportFile.class, this, AbmodelPackage.OUTPUT__HAS_EF);
		}
		return hasEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inspector> getHasI() {
		if (hasI == null) {
			hasI = new EObjectContainmentEList<Inspector>(Inspector.class, this, AbmodelPackage.OUTPUT__HAS_I);
		}
		return hasI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbmodelPackage.OUTPUT__CONTAINS_D:
				return ((InternalEList<?>)getContainsD()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.OUTPUT__HAS_EF:
				return ((InternalEList<?>)getHasEF()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.OUTPUT__HAS_I:
				return ((InternalEList<?>)getHasI()).basicRemove(otherEnd, msgs);
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
			case AbmodelPackage.OUTPUT__ID:
				return getId();
			case AbmodelPackage.OUTPUT__HAS_M:
				return getHasM();
			case AbmodelPackage.OUTPUT__CONTAINS_D:
				return getContainsD();
			case AbmodelPackage.OUTPUT__HAS_EF:
				return getHasEF();
			case AbmodelPackage.OUTPUT__HAS_I:
				return getHasI();
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
			case AbmodelPackage.OUTPUT__ID:
				setId((Integer)newValue);
				return;
			case AbmodelPackage.OUTPUT__HAS_M:
				getHasM().clear();
				getHasM().addAll((Collection<? extends Monitor>)newValue);
				return;
			case AbmodelPackage.OUTPUT__CONTAINS_D:
				getContainsD().clear();
				getContainsD().addAll((Collection<? extends Display>)newValue);
				return;
			case AbmodelPackage.OUTPUT__HAS_EF:
				getHasEF().clear();
				getHasEF().addAll((Collection<? extends ExportFile>)newValue);
				return;
			case AbmodelPackage.OUTPUT__HAS_I:
				getHasI().clear();
				getHasI().addAll((Collection<? extends Inspector>)newValue);
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
			case AbmodelPackage.OUTPUT__ID:
				setId(ID_EDEFAULT);
				return;
			case AbmodelPackage.OUTPUT__HAS_M:
				getHasM().clear();
				return;
			case AbmodelPackage.OUTPUT__CONTAINS_D:
				getContainsD().clear();
				return;
			case AbmodelPackage.OUTPUT__HAS_EF:
				getHasEF().clear();
				return;
			case AbmodelPackage.OUTPUT__HAS_I:
				getHasI().clear();
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
			case AbmodelPackage.OUTPUT__ID:
				return id != ID_EDEFAULT;
			case AbmodelPackage.OUTPUT__HAS_M:
				return hasM != null && !hasM.isEmpty();
			case AbmodelPackage.OUTPUT__CONTAINS_D:
				return containsD != null && !containsD.isEmpty();
			case AbmodelPackage.OUTPUT__HAS_EF:
				return hasEF != null && !hasEF.isEmpty();
			case AbmodelPackage.OUTPUT__HAS_I:
				return hasI != null && !hasI.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //OutputImpl
