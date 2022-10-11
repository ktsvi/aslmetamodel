/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.Property;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl#getNameofvariable <em>Nameofvariable</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl#getAssociateValue <em>Associate Value</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.PropertyImpl#getDefaultType <em>Default Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getNameofvariable() <em>Nameofvariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameofvariable()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMEOFVARIABLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNameofvariable() <em>Nameofvariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameofvariable()
	 * @generated
	 * @ordered
	 */
	protected String nameofvariable = NAMEOFVARIABLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAssociateValue() <em>Associate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociateValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATE_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAssociateValue() <em>Associate Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociateValue()
	 * @generated
	 * @ordered
	 */
	protected String associateValue = ASSOCIATE_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected String defaultType = DEFAULT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameofvariable() {
		return nameofvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameofvariable(String newNameofvariable) {
		String oldNameofvariable = nameofvariable;
		nameofvariable = newNameofvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PROPERTY__NAMEOFVARIABLE, oldNameofvariable, nameofvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociateValue() {
		return associateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociateValue(String newAssociateValue) {
		String oldAssociateValue = associateValue;
		associateValue = newAssociateValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PROPERTY__ASSOCIATE_VALUE, oldAssociateValue, associateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultType() {
		return defaultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultType(String newDefaultType) {
		String oldDefaultType = defaultType;
		defaultType = newDefaultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.PROPERTY__DEFAULT_TYPE, oldDefaultType, defaultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbmodelPackage.PROPERTY__NAMEOFVARIABLE:
				return getNameofvariable();
			case AbmodelPackage.PROPERTY__ASSOCIATE_VALUE:
				return getAssociateValue();
			case AbmodelPackage.PROPERTY__DEFAULT_TYPE:
				return getDefaultType();
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
			case AbmodelPackage.PROPERTY__NAMEOFVARIABLE:
				setNameofvariable((String)newValue);
				return;
			case AbmodelPackage.PROPERTY__ASSOCIATE_VALUE:
				setAssociateValue((String)newValue);
				return;
			case AbmodelPackage.PROPERTY__DEFAULT_TYPE:
				setDefaultType((String)newValue);
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
			case AbmodelPackage.PROPERTY__NAMEOFVARIABLE:
				setNameofvariable(NAMEOFVARIABLE_EDEFAULT);
				return;
			case AbmodelPackage.PROPERTY__ASSOCIATE_VALUE:
				setAssociateValue(ASSOCIATE_VALUE_EDEFAULT);
				return;
			case AbmodelPackage.PROPERTY__DEFAULT_TYPE:
				setDefaultType(DEFAULT_TYPE_EDEFAULT);
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
			case AbmodelPackage.PROPERTY__NAMEOFVARIABLE:
				return NAMEOFVARIABLE_EDEFAULT == null ? nameofvariable != null : !NAMEOFVARIABLE_EDEFAULT.equals(nameofvariable);
			case AbmodelPackage.PROPERTY__ASSOCIATE_VALUE:
				return ASSOCIATE_VALUE_EDEFAULT == null ? associateValue != null : !ASSOCIATE_VALUE_EDEFAULT.equals(associateValue);
			case AbmodelPackage.PROPERTY__DEFAULT_TYPE:
				return DEFAULT_TYPE_EDEFAULT == null ? defaultType != null : !DEFAULT_TYPE_EDEFAULT.equals(defaultType);
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
		result.append(" (nameofvariable: ");
		result.append(nameofvariable);
		result.append(", associateValue: ");
		result.append(associateValue);
		result.append(", defaultType: ");
		result.append(defaultType);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
