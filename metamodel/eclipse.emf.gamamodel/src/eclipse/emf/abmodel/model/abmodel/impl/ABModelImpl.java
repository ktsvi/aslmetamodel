/**
 */
package eclipse.emf.abmodel.model.abmodel.impl;

import eclipse.emf.abmodel.model.abmodel.ABModel;
import eclipse.emf.abmodel.model.abmodel.AbmodelPackage;
import eclipse.emf.abmodel.model.abmodel.AgentBlock;
import eclipse.emf.abmodel.model.abmodel.ExperimentBlock;
import eclipse.emf.abmodel.model.abmodel.GlobalBlock;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>AB Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getContainsG <em>Contains G</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getContainsS <em>Contains S</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getContainsE <em>Contains E</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link eclipse.emf.abmodel.model.abmodel.impl.ABModelImpl#getCreateOn <em>Create On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ABModelImpl extends MinimalEObjectImpl.Container implements ABModel {
	/**
	 * The cached value of the '{@link #getContainsG() <em>Contains G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsG()
	 * @generated
	 * @ordered
	 */
	protected GlobalBlock containsG;

	/**
	 * The cached value of the '{@link #getContainsS() <em>Contains S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsS()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentBlock> containsS;

	/**
	 * The cached value of the '{@link #getContainsE() <em>Contains E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsE()
	 * @generated
	 * @ordered
	 */
	protected EList<ExperimentBlock> containsE;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateOn() <em>Create On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATE_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateOn() <em>Create On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateOn()
	 * @generated
	 * @ordered
	 */
	protected Date createOn = CREATE_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ABModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbmodelPackage.Literals.AB_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBlock getContainsG() {
		return containsG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainsG(GlobalBlock newContainsG, NotificationChain msgs) {
		GlobalBlock oldContainsG = containsG;
		containsG = newContainsG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__CONTAINS_G, oldContainsG, newContainsG);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsG(GlobalBlock newContainsG) {
		if (newContainsG != containsG) {
			NotificationChain msgs = null;
			if (containsG != null)
				msgs = ((InternalEObject)containsG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbmodelPackage.AB_MODEL__CONTAINS_G, null, msgs);
			if (newContainsG != null)
				msgs = ((InternalEObject)newContainsG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbmodelPackage.AB_MODEL__CONTAINS_G, null, msgs);
			msgs = basicSetContainsG(newContainsG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__CONTAINS_G, newContainsG, newContainsG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentBlock> getContainsS() {
		if (containsS == null) {
			containsS = new EObjectContainmentEList<AgentBlock>(AgentBlock.class, this, AbmodelPackage.AB_MODEL__CONTAINS_S);
		}
		return containsS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExperimentBlock> getContainsE() {
		if (containsE == null) {
			containsE = new EObjectContainmentEList<ExperimentBlock>(ExperimentBlock.class, this, AbmodelPackage.AB_MODEL__CONTAINS_E);
		}
		return containsE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreateOn() {
		return createOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateOn(Date newCreateOn) {
		Date oldCreateOn = createOn;
		createOn = newCreateOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbmodelPackage.AB_MODEL__CREATE_ON, oldCreateOn, createOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbmodelPackage.AB_MODEL__CONTAINS_G:
				return basicSetContainsG(null, msgs);
			case AbmodelPackage.AB_MODEL__CONTAINS_S:
				return ((InternalEList<?>)getContainsS()).basicRemove(otherEnd, msgs);
			case AbmodelPackage.AB_MODEL__CONTAINS_E:
				return ((InternalEList<?>)getContainsE()).basicRemove(otherEnd, msgs);
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
			case AbmodelPackage.AB_MODEL__CONTAINS_G:
				return getContainsG();
			case AbmodelPackage.AB_MODEL__CONTAINS_S:
				return getContainsS();
			case AbmodelPackage.AB_MODEL__CONTAINS_E:
				return getContainsE();
			case AbmodelPackage.AB_MODEL__MODEL_NAME:
				return getModelName();
			case AbmodelPackage.AB_MODEL__DESCRIPTION:
				return getDescription();
			case AbmodelPackage.AB_MODEL__KEYWORDS:
				return getKeywords();
			case AbmodelPackage.AB_MODEL__AUTHOR:
				return getAuthor();
			case AbmodelPackage.AB_MODEL__CREATE_ON:
				return getCreateOn();
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
			case AbmodelPackage.AB_MODEL__CONTAINS_G:
				setContainsG((GlobalBlock)newValue);
				return;
			case AbmodelPackage.AB_MODEL__CONTAINS_S:
				getContainsS().clear();
				getContainsS().addAll((Collection<? extends AgentBlock>)newValue);
				return;
			case AbmodelPackage.AB_MODEL__CONTAINS_E:
				getContainsE().clear();
				getContainsE().addAll((Collection<? extends ExperimentBlock>)newValue);
				return;
			case AbmodelPackage.AB_MODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case AbmodelPackage.AB_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AbmodelPackage.AB_MODEL__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case AbmodelPackage.AB_MODEL__AUTHOR:
				setAuthor((String)newValue);
				return;
			case AbmodelPackage.AB_MODEL__CREATE_ON:
				setCreateOn((Date)newValue);
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
			case AbmodelPackage.AB_MODEL__CONTAINS_G:
				setContainsG((GlobalBlock)null);
				return;
			case AbmodelPackage.AB_MODEL__CONTAINS_S:
				getContainsS().clear();
				return;
			case AbmodelPackage.AB_MODEL__CONTAINS_E:
				getContainsE().clear();
				return;
			case AbmodelPackage.AB_MODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case AbmodelPackage.AB_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AbmodelPackage.AB_MODEL__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case AbmodelPackage.AB_MODEL__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case AbmodelPackage.AB_MODEL__CREATE_ON:
				setCreateOn(CREATE_ON_EDEFAULT);
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
			case AbmodelPackage.AB_MODEL__CONTAINS_G:
				return containsG != null;
			case AbmodelPackage.AB_MODEL__CONTAINS_S:
				return containsS != null && !containsS.isEmpty();
			case AbmodelPackage.AB_MODEL__CONTAINS_E:
				return containsE != null && !containsE.isEmpty();
			case AbmodelPackage.AB_MODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case AbmodelPackage.AB_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AbmodelPackage.AB_MODEL__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case AbmodelPackage.AB_MODEL__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case AbmodelPackage.AB_MODEL__CREATE_ON:
				return CREATE_ON_EDEFAULT == null ? createOn != null : !CREATE_ON_EDEFAULT.equals(createOn);
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
		result.append(" (modelName: ");
		result.append(modelName);
		result.append(", description: ");
		result.append(description);
		result.append(", keywords: ");
		result.append(keywords);
		result.append(", author: ");
		result.append(author);
		result.append(", createOn: ");
		result.append(createOn);
		result.append(')');
		return result.toString();
	}

} //ABModelImpl
