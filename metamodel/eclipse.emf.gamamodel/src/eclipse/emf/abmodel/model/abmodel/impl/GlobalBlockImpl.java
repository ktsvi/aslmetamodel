/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.GlobalBlock;
import eclipse.emf.abmodel.model.abmodel.GlobalVariable;
import eclipse.emf.abmodel.model.abmodel.SpatialEntity;

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
 * An implementation of the model object '<em><b>Global Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl#getContainsGl <em>Contains Gl</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl#getContainsSE <em>Contains SE</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.GlobalBlockImpl#isInit <em>Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalBlockImpl extends MinimalEObjectImpl.Container implements GlobalBlock {
	/**
	 * The cached value of the '{@link #getContainsGl() <em>Contains Gl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsGl()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVariable> containsGl;

	/**
	 * The cached value of the '{@link #getContainsSE() <em>Contains SE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSE()
	 * @generated
	 * @ordered
	 */
	protected EList<SpatialEntity> containsSE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.GLOBAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVariable> getContainsGl() {
		if (containsGl == null) {
			containsGl = new EObjectContainmentEList<GlobalVariable>(GlobalVariable.class, this, AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL);
		}
		return containsGl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpatialEntity> getContainsSE() {
		if (containsSE == null) {
			containsSE = new EObjectContainmentEList<SpatialEntity>(SpatialEntity.class, this, AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE);
		}
		return containsSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_BLOCK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.GLOBAL_BLOCK__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL:
				return ((InternalEList<?>)getContainsGl()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE:
				return ((InternalEList<?>)getContainsSE()).basicRemove(otherEnd, msgs);
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
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL:
				return getContainsGl();
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE:
				return getContainsSE();
			case AbmodelPackage.GLOBAL_BLOCK__ID:
				return getId();
			case AbmodelPackage.GLOBAL_BLOCK__INIT:
				return isInit();
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
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL:
				getContainsGl().clear();
				getContainsGl().addAll((Collection<? extends GlobalVariable>)newValue);
				return;
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE:
				getContainsSE().clear();
				getContainsSE().addAll((Collection<? extends SpatialEntity>)newValue);
				return;
			case AbmodelPackage.GLOBAL_BLOCK__ID:
				setId((Integer)newValue);
				return;
			case AbmodelPackage.GLOBAL_BLOCK__INIT:
				setInit((Boolean)newValue);
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
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL:
				getContainsGl().clear();
				return;
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE:
				getContainsSE().clear();
				return;
			case AbmodelPackage.GLOBAL_BLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case AbmodelPackage.GLOBAL_BLOCK__INIT:
				setInit(INIT_EDEFAULT);
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
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_GL:
				return containsGl != null && !containsGl.isEmpty();
			case AbmodelPackage.GLOBAL_BLOCK__CONTAINS_SE:
				return containsSE != null && !containsSE.isEmpty();
			case AbmodelPackage.GLOBAL_BLOCK__ID:
				return id != ID_EDEFAULT;
			case AbmodelPackage.GLOBAL_BLOCK__INIT:
				return init != INIT_EDEFAULT;
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
		result.append(", init: ");
		result.append(init);
		result.append(')');
		return result.toString();
	}

} //GlobalBlockImpl
